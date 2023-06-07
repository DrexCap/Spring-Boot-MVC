package com.example.springbootjpa.app.models.dao;

import com.example.springbootjpa.app.models.entity.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository("clienteDaoJPA")
public class ClienteDaoImpl implements IClienteDao {

    @PersistenceContext // De forma automática inyecta el EntityManager según la configuración de la unidad de persistencia que contiene el proveedor JPA
    private EntityManager em; //Se encarga de manejar las clases de entidades, todas las operaciones a la BD, son consultas de JPA

    @SuppressWarnings("unchecked")
    @Transactional(readOnly=true) // Envuelve el método en una transacción
    @Override
    public List<Cliente> findAll() {
        return em.createQuery("from Cliente").getResultList();
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        em.persist(cliente);
    }


}
