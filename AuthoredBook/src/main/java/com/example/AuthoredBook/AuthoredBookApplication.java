package com.example.AuthoredBook;

import com.example.AuthoredBook.Entity.*;
import com.example.AuthoredBook.Entity.Transactional.Bank;
import com.example.AuthoredBook.Entity.Transactional.BankService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import java.util.*;

@SpringBootApplication
public class AuthoredBookApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AuthoredBookApplication.class, args);
		AuthorService authorService = applicationContext.getBean(AuthorService.class);

		Set<Author> authorList = new HashSet<>();

		authorList.add(new Author(1, "Vinay Parida",
				       new Address(13, "Noida", "UP"),
					   new HashSet<>(Arrays.asList(new Subject(1, "Spring Boot"),
							   						 new Subject(2, "Spring MVC"),
							   					 	 new Subject(3, "Spring Security")))
				)	);

		authorService.createAuthor(authorList);

		authorService.findAuthor();


		BankService bankService = applicationContext.getBean(BankService.class);
		bankService.createBankAccount(new Bank(1,500));
		bankService.createBankAccount(new Bank(2,600));

		bankService.transfer(300);


	}

}
