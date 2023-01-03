package com.example.cus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerContoller {

    @Autowired
    CustomerService customerService;

    @PostMapping("/createCustomer")
    public ResponseEntity<String> generateOrder(@RequestBody CustomerEntity customerEntity) {
        customerService.createUser(customerEntity);
        return new ResponseEntity<>("Customer created successfully", HttpStatus.CREATED);
    }

    @PostMapping("/createorder")
    public ResponseEntity<String> generateOrder(@RequestBody Order order) {
        int numberOfOrders=customerService.numberofOrders(order.getCusId());
        if(numberOfOrders==9){
            System.out.println("You have placed 9 orders with us. Buy one more stuff and you will be\n" +
                    "promoted to Gold customer and enjoy 10% discounts!");
        }
        if(numberOfOrders==19){
            System.out.println("You have placed 19 orders with us. Buy one more stuff and you will be\n" +
                    "promoted to platinum customer and enjoy 20% discounts!");
        }
        return customerService.createOrder(order) ?
                new ResponseEntity<>("Your order placed successfully", HttpStatus.CREATED) :
                new ResponseEntity<>("Technical Issue", HttpStatus.CONFLICT);
    }

}




