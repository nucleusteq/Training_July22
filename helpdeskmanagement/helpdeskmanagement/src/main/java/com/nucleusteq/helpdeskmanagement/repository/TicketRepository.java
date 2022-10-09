package com.nucleusteq.helpdeskmanagement.repository;

import com.nucleusteq.helpdeskmanagement.entity.Ticket;
import com.nucleusteq.helpdeskmanagement.entity.TicketPriorityEnum;
import com.nucleusteq.helpdeskmanagement.entity.TicketStatusEnum;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author interface ticketrepository.
 *
 */
public interface TicketRepository extends JpaRepository<Ticket, Long> {

    /**
     * @param userId user Id.
     * @return Ticket.
     */
    @Query("SELECT t FROM Ticket t WHERE t.raisedBy.id = :userId")
    List<Ticket> findByUserId(@Param("userId") Long userId);

    /**
     * @param priority priority.
     * @return Ticket.
     */
    @Query("SELECT t FROM Ticket t WHERE t.priority = :priority")
    List<Ticket> findByPriority(@Param("priority") TicketPriorityEnum priority);

    /**
     * @param status status.
     * @return Ticket.
     */
    @Query("SELECT t FROM Ticket t WHERE t.status = :status")
    List<Ticket> findByStatus(@Param("status") TicketStatusEnum status);

    /**
     * @param assignTo assignTo.
     * @return Ticket.
     */
    @Query("SELECT t FROM Ticket t WHERE t.assignTo.id = :assignTo")
    List<Ticket> findByAssignTo(@Param("assignTo") Long assignTo);

    /**
     * @param assignTo assignTo.
     * @param priority priority.
     * @return Ticket.
     */
    @Query("SELECT t  from Ticket t WHERE t.assignTo.id = :assignTo and t.priority = :priority")
    List<Ticket> findByAssignTo(@Param("assignTo") Long assignTo, @Param("priority") Long priority);

}
