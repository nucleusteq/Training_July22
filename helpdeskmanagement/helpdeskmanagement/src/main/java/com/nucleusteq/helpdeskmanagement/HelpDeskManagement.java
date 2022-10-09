
package com.nucleusteq.helpdeskmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author main class.
 */
@SpringBootApplication
public class HelpDeskManagement {
    /**
    *help desk management.
    */
    protected HelpDeskManagement() {
    }

    /**
     * @param args =main.
     */

    public static void main(final String[] args) {
        SpringApplication.run(HelpDeskManagement.class, args);
    }
}
