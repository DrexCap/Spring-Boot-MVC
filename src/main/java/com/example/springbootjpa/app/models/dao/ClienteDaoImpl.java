//package com.example.springbootjpa.app.models.dao;
//
//import com.example.springbootjpa.app.models.entity.Cliente;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.List;
//
//@Repository("clienteDaoJPA") // Da una mejor interpretación de los Errores del EntityManager
//public class ClienteDaoImpl implements IClienteDao {
//
//    // El @PersistenceContext contiene la unidad de persistencia
//    @PersistenceContext // De forma automática inyecta el EntityManager según la configuración de la unidad de persistencia que contiene el proveedor JPA
//    private EntityManager em; //Se encarga de manejar las clases de entidades, realiza todas las operaciones a la BD en objetos, son consultas de JPA
//
//    @SuppressWarnings("unchecked") // Suprimir un mensaje de advertencia
//    @Transactional(readOnly=true) // Envuelve el método en una transacción, en este caso de tipo lectura, porque es una consulta
//    @Override
//    public List<Cliente> findAll() {
//        return em.createQuery("from Cliente").getResultList();
//    }
//
//    @Override
//    @Transactional
//    public void save(Cliente cliente) {
//        if (cliente.getId() != null && cliente.getId() > 0) {
//           em.merge(cliente);
//        } else {
//            em.persist(cliente);
//        }
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public Cliente findOne(Long id) {
//        return em.find(Cliente.class, id);
//    }
//
//    @Override
//    @Transactional
//    public void delete(Long id) {
//        em.remove(findOne(id));
//    }
//}
