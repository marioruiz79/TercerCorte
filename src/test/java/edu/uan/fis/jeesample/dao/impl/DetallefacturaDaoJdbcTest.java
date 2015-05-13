package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dto.Detallefactura;
import java.util.List;
import junit.framework.TestCase;

public class DetallefacturaDaoJdbcTest extends TestCase {
    
    public DetallefacturaDaoJdbcTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testCreate() {
        System.out.println("create");
        Detallefactura detallefactura = new Detallefactura();
        detallefactura.setDetalleId(1);
        detallefactura.setFacturaId(1);
        detallefactura.setProductId(1);
        detallefactura.setCantidad(100);
        DetallefacturaDaoJdbc instance = new DetallefacturaDaoJdbc();
        Detallefactura expResult = detallefactura;
        Detallefactura result = instance.create(detallefactura);
        assertEquals(expResult, result);
    }

    public void testUpdate() {
        System.out.println("update");
        Detallefactura detallefactura = new Detallefactura();
        detallefactura.setDetalleId(1);
        detallefactura.setCantidad(199);      
        DetallefacturaDaoJdbc instance = new DetallefacturaDaoJdbc();
        Detallefactura expResult = detallefactura;
        Detallefactura result = instance.update(detallefactura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   public void testDelete() {
        System.out.println("delete");
        Detallefactura detallefactura = new Detallefactura();
        detallefactura.setDetalleId(1);
       DetallefacturaDaoJdbc instance = new DetallefacturaDaoJdbc();
       instance.delete(detallefactura);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindById() {
        System.out.println("findById");
        Integer detalleId = 1;
        DetallefacturaDaoJdbc instance = new DetallefacturaDaoJdbc();
        Detallefactura expResult = null;
        Detallefactura result = instance.findById(detalleId);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindAll() {
        System.out.println("findAll");
        DetallefacturaDaoJdbc instance = new DetallefacturaDaoJdbc();
        List expResult = null;
        List result = instance.findAll();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
