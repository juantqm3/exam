package com.example.demo_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo_2.entity.Almacen;


@Repository
public interface AlmacenRepository extends JpaRepository<Almacen, Long>{

}
