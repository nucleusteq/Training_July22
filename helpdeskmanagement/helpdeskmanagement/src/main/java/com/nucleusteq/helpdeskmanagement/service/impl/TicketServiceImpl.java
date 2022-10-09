package com.nucleusteq.helpdeskmanagement.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nucleusteq.helpdeskmanagement.dto.TicketDTO;
import com.nucleusteq.helpdeskmanagement.dto.UserDTO;
import com.nucleusteq.helpdeskmanagement.entity.Category;
import com.nucleusteq.helpdeskmanagement.entity.SubCategory;
import com.nucleusteq.helpdeskmanagement.entity.Ticket;
import com.nucleusteq.helpdeskmanagement.entity.TicketPriorityEnum;
import com.nucleusteq.helpdeskmanagement.entity.TicketStatusEnum;
import com.nucleusteq.helpdeskmanagement.entity.User;
import com.nucleusteq.helpdeskmanagement.exception.ValidationException;
import com.nucleusteq.helpdeskmanagement.mapper.TicketMapper;
import com.nucleusteq.helpdeskmanagement.repository.CategoryRepository;
import com.nucleusteq.helpdeskmanagement.repository.SubCategoryRepository;
import com.nucleusteq.helpdeskmanagement.repository.TicketRepository;
import com.nucleusteq.helpdeskmanagement.repository.UserRepository;
import com.nucleusteq.helpdeskmanagement.service.TicketService;

/**
 * @author nucleusteq.
 */
@Service
public final class TicketServiceImpl implements TicketService {

    /**
     * ticketRepository.
     */
    @Autowired
    private TicketRepository ticketRepository;

    /**
     * userRepository.
     */
    @Autowired
    private UserRepository userRepository;

    /**
     * ticketMapper.
     */
    @Autowired
    private TicketMapper ticketMapper;

    /**
     * categoryRepository.
     */
    @Autowired
    private CategoryRepository categoryRepository;

    /**
     * subCategoryRepository.
     */
    @Autowired
    private SubCategoryRepository subCategoryRepository;

    /**
     * raiseTicket.
     */
    @Override
    public void raiseTicket(final TicketDTO ticketDto) {
//        Ticket ticket = new Ticket();
//        ticket.setCreationDate(LocalDateTime.now());
//        ticket.setCategory(ticketDto.getCategory());
//        ticket.setSubCategory(ticketDto.getSubCategory());
//        ticket.setDescription(ticketDto.getDescription());
//        ticket.setResolveDate(ticketDto.getResolveDate());
//        ticket.setRequiredDate(ticketDto.getRequiredDate());
//        ticket.setPriority(ticket.getPriority());
//        ticket.setStatus(ticketDto.getStatus());

        Ticket ticket = ticketMapper.ticketDTOToTicket(ticketDto);

        if (ticketDto.getCategory() != null) {
            Category category = categoryRepository.findById(ticketDto.getCategory().getId())
                    .orElseThrow(() -> new ValidationException("Category not found"));
            ticket.setCategory(category);
        }

        if (ticketDto.getSubCategory() != null) {
            SubCategory subCategory = subCategoryRepository.findById(ticketDto.getSubCategory().getId())
                    .orElseThrow(() -> new ValidationException("Sub Category not found"));
            ticket.setSubCategory(subCategory);
        }

        if (ticketDto.getRaisedBy() == null || ticketDto.getRaisedBy().getId() == null) {
            throw new ValidationException("Raised by cannot be empty.");
        } else {
            User raisedBy = userRepository.findById(ticketDto.getRaisedBy().getId())
                    .orElseThrow(() -> new ValidationException("User not found"));
            ticket.setRaisedBy(raisedBy);
        }

        ticket.setCreationDate(LocalDateTime.now());

        ticketRepository.save(ticket);
    }

    /**
     * get all tickets.
     */
    @Override
    public List<TicketDTO> getAll(final Long userId, final TicketPriorityEnum ticketPriority,
            final TicketStatusEnum ticketStatus, final Long assignTo) {
        List<Ticket> ticketList;
        if (userId != null) {
            ticketList = ticketRepository.findByUserId(userId);
        } else if (ticketPriority != null) {
            ticketList = ticketRepository.findByPriority(ticketPriority);
        } else if (ticketStatus != null) {
            ticketList = ticketRepository.findByStatus(ticketStatus);

        } else if (assignTo != null) {
            ticketList = ticketRepository.findByAssignTo(assignTo);
        } else {
            ticketList = ticketRepository.findAll();
        }
        return ticketList.stream().map(ticketMapper::ticketToTicketDTO).collect(Collectors.toList());
    }

    /**
     * TicketDTO.
     */
    @Override
    public TicketDTO findById(final Long id) {
        return ticketRepository.findById(id).map(ticketMapper::ticketToTicketDTO)
                .orElseThrow(() -> new ValidationException("Ticket not found."));
    }

    /**
     * TicketDTO.
     */
    @Override
    public void updateTicket(final TicketDTO ticketDTO) {
        Ticket ticket = ticketRepository.findById(ticketDTO.getId())
                .orElseThrow(() -> new ValidationException("Ticket not found"));
        ticket.setPriority(ticketDTO.getPriority());
        ticket.setStatus(ticketDTO.getStatus());
        if (Optional.ofNullable(ticketDTO.getAssignTo()).map(UserDTO::getEmail).orElse(null) != null) {
            User user = userRepository.findByEmail(ticketDTO.getAssignTo().getEmail())
                    .orElseThrow(() -> new ValidationException("Invalid User"));
            ticket.setAssignTo(user);
        }
        if (Objects.equals(ticketDTO.getStatus(), TicketStatusEnum.RESOLVED)) {
            ticket.setResolveDate(LocalDate.now());
        }
        ticketRepository.save(ticket);
    }

    /**
     * reopen ticket.
     */
    @Override
    public void reOpenTicket(final Long ticketId) {
        Ticket ticket = ticketRepository.findById(ticketId)
                .orElseThrow(() -> new ValidationException("Ticket not found"));
        ticket.setStatus(TicketStatusEnum.OPEN);

        ticketRepository.save(ticket);
    }

}
