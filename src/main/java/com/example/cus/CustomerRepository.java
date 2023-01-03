package com.example.cus;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity,Integer> {
     CustomerEntity findByEmailId(String emailId);

}
