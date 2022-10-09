package com.nucleusteq.helpdeskmanagement.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TicketTest {


@Test
public void TicketTest1() {
    
//    
//    final TicketPriorityEnum LOW = null;
//    final TicketStatusEnum OPEN = null;
     Long id = 1L;
     String category= "Work from home";
     String subCategory= "Technical Issue";
     String description= "Net is not working";
     LocalDate creationDate= LocalDate.parse("2000-12-10");
     LocalDate resolveDate= LocalDate.parse("2000-11-11");
     LocalDate requiredDate= LocalDate.parse("2000-11-11");
     TicketPriorityEnum priority= TicketPriorityEnum.LOW;
     TicketStatusEnum status= TicketStatusEnum.OPEN;    
     
    
    Ticket ticket = new Ticket();
    ticket.setId(id);
    ticket.setCategory(null);
    ticket.setSubCategory(null);;
    ticket.setDescription(description);
    ticket.setCreationDate(null);
    ticket.setResolveDate(resolveDate);
    ticket.setRequiredDate(requiredDate);
    ticket.setPriority(null);
    ticket.setStatus(null);  
    
    assertEquals(id, ticket.getId());
    assertEquals(category, ticket.getCategory());
    assertEquals(subCategory, ticket.getSubCategory());
    assertEquals(description, ticket.getDescription());
    assertEquals(creationDate, ticket.getCreationDate());
    assertEquals(resolveDate, ticket.getResolveDate());
    assertEquals(requiredDate, ticket.getRequiredDate());
    assertEquals(priority, ticket.getPriority());
    assertEquals(status, ticket.getStatus());
}


@Test
public void testGettersAndSetters() {
    Ticket ticket = new Ticket();
    Long id = 1L;
    ticket.setId(id);
    assertEquals(id, ticket.getId());
}

@Test
public void testToString() {
    Ticket ticket = new Ticket();    
//    TicketPriorityEnum LOW = null;
//    TicketStatusEnum OPEN = null;
     Long id = 1L;
     String category= "Work from home";
     String subCategory= "Technical Issue";
     String description= "Net is not working";
     LocalDate creationDate= LocalDate.parse("2000-12-10");
     LocalDate resolveDate= LocalDate.parse("2000-11-11");
     LocalDate requiredDate= LocalDate.parse("2000-11-11");
     TicketPriorityEnum priority= TicketPriorityEnum.LOW;
     TicketStatusEnum status= TicketStatusEnum.OPEN;    
    
    
    Ticket ticket1 = buildTicketEntity(id, category, subCategory, description, creationDate, resolveDate, requiredDate, priority, status);
    Ticket ticket2 = buildTicketEntity(id, category, subCategory, description, creationDate, resolveDate, requiredDate, priority, status);
    
    String tostring = ticket2.toString();
    assertTrue(tostring.contains("id=" + id));
    assertEquals(ticket2, ticket2);
    assertEquals(true, ticket2.equals(ticket2));
    assertEquals(true, ticket2.equals(ticket2));
}

public Ticket buildTicketEntity(Long id, String category , String subCategory, String description,  LocalDate creationDate, LocalDate resolveDate, LocalDate requiredDate, TicketPriorityEnum priority, TicketStatusEnum status ){
    Ticket ticket = new Ticket();
    ticket.setId(id);
   ticket.setCategory(null);
   ticket.setSubCategory(null);
   ticket.setDescription(description);
   ticket.setCreationDate(null);
   ticket.setResolveDate(resolveDate);
   ticket.setRequiredDate(requiredDate);
   ticket.setPriority(priority);
   ticket.setStatus(status);
    return ticket;
}
}