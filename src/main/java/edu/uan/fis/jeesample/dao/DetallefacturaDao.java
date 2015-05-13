package edu.uan.fis.jeesample.dao;

import edu.uan.fis.jeesample.dto.Detallefactura;
import java.util.List;

public interface DetallefacturaDao {

    /**
     * Creates a new detallefactura. 
     * @param detallefactura
     * @return 
     */
    Detallefactura create(Detallefactura detallefactura);

    /**
     * Updates an existing detallefactura. Detallefactura id can't be modified.
     * @param detallefactura
     * @return 
     */
    Detallefactura update(Detallefactura detallefactura);

    /**
     * Deletes an existing detallefactura
     * @param detallefactura 
     */
    void delete(Detallefactura detallefactura);

    /**
     * Find a detallefactura by id
     * @param detalleId
     * @return 
     */
    Detallefactura findById(Integer detalleId);

    /**
     * Returns all the detallefacturas in the database
     * @return 
     */
    List<Detallefactura> findAll();
}
