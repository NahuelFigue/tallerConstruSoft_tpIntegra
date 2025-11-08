package com.taller.compras.servicio;

import com.taller.compras.modelo.Producto;
import com.taller.compras.repositorio.ProductoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio {

    private final ProductoRepositorio productoRepositorio;

    public ProductoServicio(ProductoRepositorio productoRepositorio) {
        this.productoRepositorio = productoRepositorio;
    }

    public List<Producto> obtenerTodosLosProductos() {
        return productoRepositorio.findAll();
    }
}