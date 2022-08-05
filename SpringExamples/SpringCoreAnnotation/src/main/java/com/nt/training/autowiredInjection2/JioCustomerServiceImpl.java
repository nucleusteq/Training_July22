package com.nt.training.autowiredInjection2;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("jioCustomerServiceImpl")
public class JioCustomerServiceImpl implements CustomerService {

	public void getCustomerList() {
		System.out.println("JIO getCustomerList");
		
	}

	public void addCustomer() {
		System.out.println("JIO addCustomer");
		
	}

}
