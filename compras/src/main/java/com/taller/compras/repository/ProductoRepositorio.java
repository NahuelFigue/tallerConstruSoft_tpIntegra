package com.taller.compras.repository;

import com.taller.compras.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Long> {
    // JpaRepository ya nos da todos los métodos CRUD básicos
}
