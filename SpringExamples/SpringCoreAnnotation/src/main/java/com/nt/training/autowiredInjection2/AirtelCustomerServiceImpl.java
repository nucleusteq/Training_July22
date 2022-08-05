package com.nt.training.autowiredInjection2;

import org.springframework.stereotype.Service;

@Service("airtelCustomerServiceImpl")
public class AirtelCustomerServiceImpl implements CustomerService {

	public void getCustomerList() {
		System.out.println("Airtel getCustomerList");
		
	}

	public void addCustomer() {
		System.out.println("Airtel addCustomer");
		
	}

}
