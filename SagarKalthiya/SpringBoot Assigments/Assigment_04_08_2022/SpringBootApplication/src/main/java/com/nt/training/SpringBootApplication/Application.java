package com.nt.training.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

//	@Autowired
//	private JdbcTemplate jdbcTemplete;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		String sql = "INSERT INTO studenttable (firstName,lastName,rollNumber) VALUES (?,?,?)";
//		int result = jdbcTemplete.update(sql, "sql","first","001");
//		if(result >0) {
//			System.out.println("Student is avilabe with this roll number"+result);
//		}
//		
//	}

}
