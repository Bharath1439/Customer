package com.example.cus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository orderRepository;


    Order order=new Order();



    public void createUser(CustomerEntity customerEntity){
        CustomerEntity cusEntityInDB= customerRepository.findByEmailId(customerEntity.getEmailId());
        if(cusEntityInDB==null) {
            customerEntity.setCategory("regular");
            customerRepository.save(customerEntity);
        }
    }
    public int numberofOrders(String email){
        int count = orderRepository.findByEmailId(email);
        return count;
    }
    public boolean createOrder( Order order){
        System.out.println(order.toString());
        CustomerEntity customerEntity= customerRepository.findByEmailId(order.getCusId());
       System.out.println(customerEntity);
       if(customerEntity==null)
           return false;
        int count=0;
        try {
            if ("regular".equals(customerEntity.getCategory()) ||
                    "gold".equals(customerEntity.getCategory())) {
                count = orderRepository.findByEmailId(customerEntity.getEmailId());

                if (count >= 10 && count < 20) {
                    customerEntity.setCategory("gold");
                    order.setPrice(order.getPrice() * 0.9);
                } else if (count >= 20) {
                    customerEntity.setCategory("platinum");

                }
            }
            if ("platinum".equals(customerEntity.getCategory())) {
                order.setPrice(order.getPrice() * 0.8);
            }
            orderRepository.save(order);
            customerRepository.save(customerEntity);
        }catch (Exception e){
            return false;
        }
       return true;
    }
}
