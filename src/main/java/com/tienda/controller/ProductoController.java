package com.tienda.controller;

import com.tienda.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;
    @GetMapping("/listado")
    public String listado (Model model){
        var productos = productoService.getProductos(false);
        model.addAttribute("productos" , productos);
        model.addAttribute("totalProductos" , productos.size());

       return "/producto/listado"; 
    }
}
