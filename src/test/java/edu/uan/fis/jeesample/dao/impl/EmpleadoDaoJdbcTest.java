package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dto.Empleado;
import java.util.List;
import junit.framework.TestCase;

public class EmpleadoDaoJdbcTest extends TestCase {
    
    public EmpleadoDaoJdbcTest(String testName) {
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
        Empleado empleado = new Empleado();
        empleado.setEmpleadoId(1);
        empleado.setName("Mario Ruiz");
        EmpleadoDaoJdbc instance = new EmpleadoDaoJdbc();
        Empleado expResult = empleado;
        Empleado result = instance.create(empleado);
        assertEquals(expResult, result);
    }

    public void testUpdate() {
        System.out.println("update");
        Empleado empleado = new Empleado();
        empleado.setName("Richard Cascante");  
        empleado.setEmpleadoId(1);                   
        EmpleadoDaoJdbc instance = new EmpleadoDaoJdbc();
        Empleado expResult = empleado;
        Empleado result = instance.update(empleado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   public void testDelete() {
        System.out.println("delete");
       Empleado empleado = new Empleado();
        empleado.setEmpleadoId(1);
       EmpleadoDaoJdbc instance = new EmpleadoDaoJdbc();
       instance.delete(empleado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindById() {
        System.out.println("findById");
        Integer empleadoId = 1;
        EmpleadoDaoJdbc instance = new EmpleadoDaoJdbc();
        Empleado expResult = null;
        Empleado result = instance.findById(empleadoId);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public void testFindAll() {
        System.out.println("findAll");
        EmpleadoDaoJdbc instance = new EmpleadoDaoJdbc();
        List expResult = null;
        List result = instance.findAll();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
