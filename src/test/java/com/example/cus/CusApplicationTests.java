package com.example.cus;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CusApplicationTests {

	@Autowired
   CustomerRepository customerRepository;
	@Autowired
	OrderRepository orderRepository;


	@Test
	public void SaveCustomer() {
    CustomerEntity customerEntity=new CustomerEntity(1,"bharath","vaddibharath2000@gmail.com");
		customerRepository.save(customerEntity);
		CustomerEntity customerEntity1=new CustomerEntity(1,"villan","villan@gmail.com");
		customerRepository.save(customerEntity1);
		System.out.print(customerEntity1.getCategory());

	}
	@Test
	public void GetByMail(){
		CustomerEntity customerEntity=customerRepository.findByEmailId("vaddibharath2000@gmail.com");
		System.out.print(customerEntity);
	}
	@Test
	public void saveorder(){
		Order order=new Order(5000,"vaddibharath2000@gmail.com");
		orderRepository.save(order);
		Order order1=new Order(5000,"vaddibharath2000@gmail.com");
		orderRepository.save(order1);
		Order order2=new Order(5000,"vaddibharath2000@gmail.com");
		orderRepository.save(order2);
		Order order3=new Order(5000,"vaddibharath2000@gmail.com");
		orderRepository.save(order3);
		Order order4=new Order(5000,"vaddibharath2000@gmail.com");
		orderRepository.save(order4);
		Order order5=new Order(5000,"vaddibharath2000@gmail.com");
		orderRepository.save(order5);
		Order order6=new Order(5000,"vaddibharath2000@gmail.com");
		orderRepository.save(order6);
		Order order7=new Order(5000,"vaddibharath2000@gmail.com");
		orderRepository.save(order7);
		Order order8=new Order(5000,"vaddibharath2000@gmail.com");
		orderRepository.save(order8);
		Order order9=new Order(5000,"vaddibharath2000@gmail.com");
		orderRepository.save(order9);
		Order order10=new Order(5000,"vaddibharath2000@gmail.com");
		orderRepository.save(order10);
	}
	@Test
	public void gettotalOrders(){
		int totalOrders=orderRepository.findByEmailId("vaddibharath2000@gmail.com");
		System.out.print(totalOrders);
	}


}
