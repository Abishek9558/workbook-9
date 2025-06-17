package com.pluralsight.NorthwindTradersSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NorthwindTradersSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorthwindTradersSpringBootApplication.class, args);
	}

}




//package com.pluralsight.NorthwindTradersSpringBoot;
//
////import com.pluralsight.NorthwindTradersSpringBoot.dao.CustomerDAO;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
////import org.springframework.context.ApplicationContext;
//
//@SpringBootApplication
//public static void main(String[] args) {
//	SpringApplication.run(NorthwindTradersSpringBootApplication.class, args);
//}
//
//}//annotation
////public class NorthwindTradersSpringBootApplication {
////
////	private static CustomerDAO customerDAO;
////
//////	DI - Dependency Injection
//////	IoC - Inversion of Control
////
////	public static void main(String[] args) {
////		ApplicationContext context = SpringApplication.run(NorthwindTradersSpringBootApplication.class, args);
////
//////		customerDAO = context.getBean(SimpleCustomerDAO.class);
//////		customerDAO.getAll().stream().forEach(System.out::println);
////		CustomerUI ui = context.getBean(CustomerUI.class);
////		ui.run();
////	}
////
////}