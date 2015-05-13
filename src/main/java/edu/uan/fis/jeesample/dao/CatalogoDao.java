package edu.uan.fis.jeesample.dao;

import edu.uan.fis.jeesample.dto.Catalogo;
import java.util.List;

public interface CatalogoDao {

    /**
     * Creates a new catalogo. 
     * @param catalogo
     * @return 
     */
    Catalogo create(Catalogo catalogo);

    /**
     * Updates an existing catalogo. Catalogo id can't be modified.
     * @param catalogo
     * @return 
     */
    Catalogo update(Catalogo catalogo);

    /**
     * Deletes an existing catalogo
     * @param catalogo 
     */
    void delete(Catalogo catalogo);

    /**
     * Find a catalogo by id
     * @param catalogoId
     * @return 
     */
    Catalogo findById(Integer catalogoId);

    /**
     * Returns all the catalogos in the database
     * @return 
     */
    List<Catalogo> findAll();
}
