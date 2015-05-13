package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dto.Cliente;
import java.util.List;
import junit.framework.TestCase;

public class ClienteDaoJdbcTest extends TestCase {
    
    public ClienteDaoJdbcTest(String testName) {
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
        Cliente cliente = new Cliente();
        cliente.setClienteId(1);
        cliente.setName("Angelica Calderon");
        ClienteDaoJdbc instance = new ClienteDaoJdbc();
        Cliente expResult = cliente;
        Cliente result = instance.create(cliente);
        assertEquals(expResult, result);
    }

    public void testUpdate() {
        System.out.println("update");
        Cliente cliente = new Cliente();
        cliente.setName("Vivi Cortes");  
        cliente.setClienteId(1);                   
        ClienteDaoJdbc instance = new ClienteDaoJdbc();
        Cliente expResult = cliente;
        Cliente result = instance.update(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testDelete() {
      System.out.println("delete");
        Cliente cliente = new Cliente();
        cliente.setClienteId(1);
       ClienteDaoJdbc instance = new ClienteDaoJdbc();
       instance.delete(cliente);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindById() {
        System.out.println("findById");
        Integer clienteId = 1;
        ClienteDaoJdbc instance = new ClienteDaoJdbc();
        Cliente expResult = null;
        Cliente result = instance.findById(clienteId);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindAll() {
        System.out.println("findAll");
        ClienteDaoJdbc instance = new ClienteDaoJdbc();
        List expResult = null;
        List result = instance.findAll();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
