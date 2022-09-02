package com.nucleusteq.inventorymanagementbeta.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestInventoryManagmentController {
	@Test
	public void msgTest() {
		InventoryManagementController inventoryManagementController = new InventoryManagementController();
		assertEquals("hello", inventoryManagementController.testMethod("hello"));
	}
}
