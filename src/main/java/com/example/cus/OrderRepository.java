package com.example.cus;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {


    @Query("SELECT COUNT(cusId) FROM Order t WHERE t.cusId=:cusId")
    public int findByEmailId(@Param("cusId") String cusId);
}
