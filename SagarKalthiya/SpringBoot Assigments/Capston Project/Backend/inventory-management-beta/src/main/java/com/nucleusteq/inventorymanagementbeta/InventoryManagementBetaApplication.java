package com.nucleusteq.inventorymanagementbeta;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author NucleusTeq Device.
 */
@SpringBootApplication
public class InventoryManagementBetaApplication {
     /**
     * class constructor.
     */
    protected InventoryManagementBetaApplication() {
    }

     /**
     * @param args :used to take inpute at runtime
     */
    public static void main(final String[] args) {
         SpringApplication.run(InventoryManagementBetaApplication.class, args);
    }
}
