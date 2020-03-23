package com.andre.servicio.app.products.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.andre.servicio.app.products.models.dao.IProductoService;
import com.andre.servicio.app.products.models.entity.Producto;

@RestController
public class ProductoController {
	
	@Autowired
    private IProductoService productoService;
    
    @GetMapping("/listar")
    public List<Producto> listar(){
        
        return productoService.findAll();
        
    }

    @GetMapping("/listar/{id}")
    public Producto detalle(@PathVariable Long id) {
        return productoService.findById(id);
    }


}
