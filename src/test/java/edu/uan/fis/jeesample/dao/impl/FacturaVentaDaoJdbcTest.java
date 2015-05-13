package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dto.FacturaVenta;
import java.util.List;
import junit.framework.TestCase;

public class FacturaVentaDaoJdbcTest extends TestCase {
    
    public FacturaVentaDaoJdbcTest(String testName) {
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
        FacturaVenta facturaventa = new FacturaVenta();
        facturaventa.setFacturaId(1);
        facturaventa.setEmpleadoId(1);
        facturaventa.setClienteId(1);
        facturaventa.setTotal(9999);
        FacturaVentaDaoJdbc instance = new FacturaVentaDaoJdbc();
        FacturaVenta expResult = facturaventa;
        FacturaVenta result = instance.create(facturaventa);
        assertEquals(expResult, result);
    }

    public void testUpdate() {
        System.out.println("update");
        FacturaVenta facturaventa = new FacturaVenta();
        facturaventa.setFacturaId(1);
        facturaventa.setTotal(9991);      
        FacturaVentaDaoJdbc instance = new FacturaVentaDaoJdbc();
        FacturaVenta expResult = facturaventa;
        FacturaVenta result = instance.update(facturaventa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   public void testDelete() {
     System.out.println("delete");
       FacturaVenta facturaventa = new FacturaVenta();
       facturaventa.setFacturaId(1);
       FacturaVentaDaoJdbc instance = new FacturaVentaDaoJdbc();
      instance.delete(facturaventa);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindById() {
        System.out.println("findById");
        Integer facturaId = 1;
        FacturaVentaDaoJdbc instance = new FacturaVentaDaoJdbc();
        FacturaVenta expResult = null;
        FacturaVenta result = instance.findById(facturaId);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindAll() {
        System.out.println("findAll");
        FacturaVentaDaoJdbc instance = new FacturaVentaDaoJdbc();
        List expResult = null;
        List result = instance.findAll();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
