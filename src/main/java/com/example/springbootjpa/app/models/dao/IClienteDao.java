package com.example.springbootjpa.app.models.dao;

import com.example.springbootjpa.app.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {


}
