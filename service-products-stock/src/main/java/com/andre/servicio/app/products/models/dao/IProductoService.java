package com.andre.servicio.app.products.models.dao;

import java.util.List;

import com.andre.servicio.app.products.models.entity.Producto;

public interface IProductoService {

	public List<Producto> findAll();
    public Producto findById(Long id);


}
