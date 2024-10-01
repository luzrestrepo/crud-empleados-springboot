package com.example.project3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project3.models.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{
    
}
