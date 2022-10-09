package com.nucleusteq.helpdeskmanagement.mapper;

import com.nucleusteq.helpdeskmanagement.dto.SubCategoryDTO;
import com.nucleusteq.helpdeskmanagement.dto.TicketDTO;
import com.nucleusteq.helpdeskmanagement.dto.UserDTO;
import com.nucleusteq.helpdeskmanagement.entity.SubCategory;
import com.nucleusteq.helpdeskmanagement.entity.Ticket;
import com.nucleusteq.helpdeskmanagement.entity.TicketPriorityEnum;
import com.nucleusteq.helpdeskmanagement.entity.TicketStatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @author class ticket mapper.
 *
 */
@Component
public final class TicketMapper {

    /**
     * categroyMapper.
     */
    @Autowired
    private CategoryMapper categoryMapper;


    /**
     * @param ticket ticket.
     * @return ticketDTO.
     */
    public TicketDTO ticketToTicketDTO(final Ticket ticket) {
        TicketDTO ticketDTO = new TicketDTO();
        if (ticket.getCategory() != null) {
            ticketDTO.setCategory(categoryMapper.categoryToCategoryDTO(ticket.getCategory()));
        }

        ticketDTO.setDescription(ticket.getDescription());
        ticketDTO.setPriority(Optional.ofNullable(ticket.getPriority()).orElse(TicketPriorityEnum.LOW));
        ticketDTO.setStatus(Optional.ofNullable(ticket.getStatus()).orElse(TicketStatusEnum.OPEN));
        ticketDTO.setId(ticket.getId());
        ticketDTO.setCreationDate(ticket.getCreationDate());
        ticketDTO.setRequiredDate(ticket.getRequiredDate());
        if (ticket.getSubCategory() != null) {
            ticketDTO.setSubCategory(new SubCategoryDTO(ticket.getSubCategory().getId(), ticket.getSubCategory().getCategoryName(), null));
        }
        ticketDTO.setResolveDate(ticket.getResolveDate());
        if (ticket.getAssignTo() != null) {
            UserDTO userDTO = new UserDTO();
            userDTO.setEmail(ticket.getAssignTo().getEmail());
            userDTO.setId(ticket.getAssignTo().getId());
            userDTO.setFirstName(ticket.getAssignTo().getFirstName());
            userDTO.setLastName(ticket.getAssignTo().getLastName());
            ticketDTO.setAssignTo(userDTO);
        }
        if (ticket.getRaisedBy() != null) {
            UserDTO raisedBy = new UserDTO();
            raisedBy.setEmail(ticket.getRaisedBy().getEmail());
            raisedBy.setId(ticket.getRaisedBy().getId());
            raisedBy.setFirstName(ticket.getRaisedBy().getFirstName());
            raisedBy.setLastName(ticket.getRaisedBy().getLastName());
            ticketDTO.setRaisedBy(raisedBy);
        }
        return ticketDTO;
    }

    /**
     * @param ticketDTO ticket dto.
     * @return ticket.
     */
    public Ticket ticketDTOToTicket(final TicketDTO ticketDTO) {
        Ticket ticket = new Ticket();
        if (ticketDTO.getSubCategory() != null) {
            ticket.setCategory(categoryMapper.categoryDtoToCategory(ticketDTO.getCategory()));
        }
        ticket.setDescription(ticketDTO.getDescription());
        ticket.setPriority(ticketDTO.getPriority());
        ticket.setStatus(ticketDTO.getStatus());
        ticket.setCreationDate(ticketDTO.getCreationDate());
        ticket.setRequiredDate(ticketDTO.getRequiredDate());
        if (ticketDTO.getSubCategory() != null) {
            ticket.setSubCategory(new SubCategory());
        }
        ticket.setResolveDate(ticketDTO.getResolveDate());
        return ticket;
    }

}
