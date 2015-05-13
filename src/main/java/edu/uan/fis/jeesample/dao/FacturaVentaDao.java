package edu.uan.fis.jeesample.dao;

import edu.uan.fis.jeesample.dto.FacturaVenta;
import java.util.List;

public interface FacturaVentaDao {

    /**
     * Creates a new 
     * @param facturaveta
     * @return 
     */
    FacturaVenta create(FacturaVenta facturaventa);

    /**
     * Updates an existing 
     * @param facturaventa
     * @return 
     */
    FacturaVenta update(FacturaVenta facturaventa);

    /**
     * Deletes 
     * @param facturaventa 
     */
    void delete(FacturaVenta facturaventa);

    /**
     * Find a  by id
     * @param facturaId
     * @return 
     */
    FacturaVenta findById(Integer facturaId);

    /**
     * Returns all the products in the database
     * @return 
     */
    List<FacturaVenta> findAll();
}
