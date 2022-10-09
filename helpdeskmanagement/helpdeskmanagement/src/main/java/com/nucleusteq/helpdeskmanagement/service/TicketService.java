package com.nucleusteq.helpdeskmanagement.service;

import java.util.List;

import com.nucleusteq.helpdeskmanagement.dto.TicketDTO;
import com.nucleusteq.helpdeskmanagement.entity.TicketPriorityEnum;
import com.nucleusteq.helpdeskmanagement.entity.TicketStatusEnum;

/**
 * @author interface TicketSerivice.
 *
 */
public interface TicketService {

    /**
     * @param ticketDto ticketDTO.
     */
    void raiseTicket(TicketDTO ticketDto);

    /**
     * @param userId         user id.
     * @param ticketPriority ticket priority.
     * @param ticketStatus   ticket status.
     * @param assignTo       assign to.
     * @return TicketDTO.
     */
    List<TicketDTO> getAll(final Long userId, final TicketPriorityEnum ticketPriority,
            final TicketStatusEnum ticketStatus, final Long assignTo);

    /**
     * @param id id.
     * @return id.
     */
    TicketDTO findById(Long id);

    /**
     * @param ticketDTO ticketDto.
     */
    void updateTicket(final TicketDTO ticketDTO);

    /**
     * @param ticketId ticketId.
     */
    void reOpenTicket(final Long ticketId);

}
