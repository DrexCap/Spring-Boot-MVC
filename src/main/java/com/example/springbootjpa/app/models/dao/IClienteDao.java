package com.example.springbootjpa.app.models.dao;

import com.example.springbootjpa.app.models.entity.Cliente;

import java.util.List;

public interface IClienteDao {

    public List<Cliente> findAll();

    public void save(Cliente cliente);
}
