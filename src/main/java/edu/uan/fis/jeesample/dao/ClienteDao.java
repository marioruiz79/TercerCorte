package edu.uan.fis.jeesample.dao;

import edu.uan.fis.jeesample.dto.Cliente;
import java.util.List;

public interface ClienteDao {

    /**
     * Creates a new cliente. 
     * @param cliente
     * @return 
     */
    Cliente create(Cliente cliente);

    /**
     * Updates an existing cliente. Cliente id can't be modified.
     * @param cliente
     * @return 
     */
    Cliente update(Cliente cliente);

    /**
     * Deletes an existing cliente
     * @param cliente 
     */
    void delete(Cliente cliente);

    /**
     * Find a cliente by id
     * @param clienteId
     * @return 
     */
    Cliente findById(Integer clienteId);

    /**
     * Returns all the clientes in the database
     * @return 
     */
    List<Cliente> findAll();
}
