package com.example.demo_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo_2.entity.Tipoorden;

@Repository
public interface TipoordenRepository extends JpaRepository<Tipoorden, Long>{

}
