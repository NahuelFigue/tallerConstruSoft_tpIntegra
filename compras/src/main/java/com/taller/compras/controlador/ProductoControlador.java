package com.taller.compras.controlador;

import com.taller.compras.servicio.ProductoServicio;
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
