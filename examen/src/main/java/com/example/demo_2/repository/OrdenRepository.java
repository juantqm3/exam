package com.example.demo_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo_2.entity.Orden;

@Repository
public interface OrdenRepository extends JpaRepository<Orden, Long>{

}
