package com.nucleusteq.helpdeskmanagement.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nucleusteq.helpdeskmanagement.dto.TicketDTO;
import com.nucleusteq.helpdeskmanagement.entity.TicketPriorityEnum;
import com.nucleusteq.helpdeskmanagement.entity.TicketStatusEnum;
import com.nucleusteq.helpdeskmanagement.service.TicketService;

/**
 * @author ticket controller.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/ticket")
public final class TicketController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * ticket service.
     */
    @Autowired
    private TicketService ticketService;

    /**
     * @param ticketDto ticketDTO.
     */
    @PostMapping("/raise-ticket")
    public void raiseTicket(@RequestBody final TicketDTO ticketDto) {
        logger.info("/ticket/raise-ticket");
        ticketService.raiseTicket(ticketDto);
    }

    /**
     * @return ticketService.
     */
    @GetMapping("/getall")
    public ResponseEntity<List<TicketDTO>> getAll(@RequestParam(value = "userId", required = false) Long userId, @RequestParam(value = "ticketPriority", required = false) TicketPriorityEnum ticketPriority, @RequestParam(value = "ticketStatus", required = false) TicketStatusEnum  ticketStatus , @RequestParam(value = "assignTo", required = false) Long assignTo  ) {
        return ResponseEntity.ok(ticketService.getAll(userId, ticketPriority, ticketStatus, assignTo));
    }

    /**
     * @param id id.
     * @return ResponseEntity.
     */
    @GetMapping("/getbyid/{id}")
    public ResponseEntity<TicketDTO> getById(final @PathVariable("id") Long id) {
        return ResponseEntity.ok(ticketService.findById(id));
    }

    /**
     * @param ticketDTO ticketDto.
     * @return ResponseEntity.
     */
    @PutMapping("/update")
    public ResponseEntity<String> updateTicket(final @RequestBody TicketDTO ticketDTO) {
        ticketService.updateTicket(ticketDTO);
        return ResponseEntity.ok("Ticket Updated Successfully");
    }

    /**
     * @param id id.
     * @return responseEntity.
     */
    @GetMapping("/reopen/{id}")
    public ResponseEntity<String> reOpenTicket(final @PathVariable("id") Long id) {
        ticketService.reOpenTicket(id);
        return ResponseEntity.ok("Ticket Re-opened");
    }
    
}
