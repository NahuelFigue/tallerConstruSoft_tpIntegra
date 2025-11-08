package com.taller.compras.controller;

import com.taller.compras.service.ProductoServicio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoControlador {

    private final ProductoServicio productoServicio;

    public ProductoControlador(ProductoServicio productoServicio) {
        this.productoServicio = productoServicio;
    }

    @GetMapping("/productos")
    public String listarProductos(Model modelo) {
        modelo.addAttribute("productos", productoServicio.obtenerTodosLosProductos());
        return "productos";
    }
}
