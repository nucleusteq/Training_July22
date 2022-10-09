package com.nucleusteq.helpdeskmanagement.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.nucleusteq.helpdeskmanagement.entity.Category;
import com.nucleusteq.helpdeskmanagement.entity.SubCategory;
import com.nucleusteq.helpdeskmanagement.entity.Ticket;
import com.nucleusteq.helpdeskmanagement.entity.TicketPriorityEnum;
import com.nucleusteq.helpdeskmanagement.entity.TicketStatusEnum;

@RunWith(SpringRunner.class)
public class TicketDTOTest {
    private static final TicketPriorityEnum HIGH = null;
    private static final TicketStatusEnum OPEN = null;
    Long id=1L;
    String categroy = "Hardware and software";
    String subCategory = "Hardware required";
    String description = "I want hardware for petsmart project";
    LocalDateTime creationDate = LocalDateTime.parse("2000-12-10");
    LocalDate resolveDate = LocalDate.parse("2020-15-10");
    LocalDate requiredDate = LocalDate.parse("2000-15-20");
    TicketPriorityEnum priority = HIGH;
    TicketStatusEnum status = OPEN;
    String assignTo = "Sakshi Katiyar";

    @Test
    public void TicketDTO() {
        TicketDTO ticketdto= new TicketDTO();
    }
}
