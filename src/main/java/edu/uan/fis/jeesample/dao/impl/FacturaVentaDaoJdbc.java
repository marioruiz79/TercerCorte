   
package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dao.FacturaVentaDao;
import edu.uan.fis.jeesample.dto.FacturaVenta;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Product DAO implementation using JDBC
 */
public class FacturaVentaDaoJdbc implements FacturaVentaDao {
    
    public FacturaVenta create(FacturaVenta facturaventa) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/jeesample","root","root");
            // 3. Creates the product in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO facturaventa VALUES(" + facturaventa.getFacturaId() + "," + facturaventa.getEmpleadoId() + "," + facturaventa.getClienteId() + "," + facturaventa.getTotal() + ")");
        } catch (SQLException ex) {
            Logger.getLogger(FacturaVentaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacturaVentaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaVentaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaVentaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return facturaventa;
    }
    
    public FacturaVenta update(FacturaVenta facturaventa) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/jeesample","root","root");
            // 3. Creates the product in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE facturaventa set TOTAL=" + facturaventa.getTotal() + " where facturaId = "+facturaventa.getFacturaId()  );
        } catch (SQLException ex) {
            Logger.getLogger(FacturaVentaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacturaVentaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaVentaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaVentaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return facturaventa;
    }
    
    public void delete(FacturaVenta facturaventa) {
        // Sample code
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/jeesample","root","root");
            // 3. Creates the product in the database
            stmt = conn.createStatement();
            stmt.executeUpdate("DELETE FROM facturaventa where facturaId = "+facturaventa.getFacturaId()  );
        } catch (SQLException ex) {
            Logger.getLogger(FacturaVentaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacturaVentaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaVentaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaVentaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public FacturaVenta findById(Integer facturaId) {
        // Sample code
        FacturaVenta facturaventa = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/jeesample","root","root");
            // 3. Creates the product in the database
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT FACTURAID, EMPLEADOID, CLIENTEID, TOTAL FROM facturaventa where FACTURAID = "+ facturaId);
            if(rs.next()){
                facturaventa = new FacturaVenta();
                facturaventa.setFacturaId(rs.getInt("FACTURAID"));
                facturaventa.setEmpleadoId(rs.getInt("EMPLEADOID"));
                facturaventa.setClienteId(rs.getInt("CLIENTEID"));
                facturaventa.setTotal(rs.getInt("TOTAL"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FacturaVentaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacturaVentaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaVentaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaVentaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return facturaventa;
    }
    
    public List<FacturaVenta> findAll() {
         // Sample code
        List<FacturaVenta> facturaventaList = new ArrayList<FacturaVenta>();
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/jeesample","root","root");
            // 3. Creates the product in the database
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT FACTURAID, EMPLEADOID, CLIENTEID, TOTAL FROM facturaventa");
            while(rs.next()){
                FacturaVenta facturaventa = new FacturaVenta();
                facturaventa.setFacturaId(rs.getInt("FACTURAID"));
                facturaventa.setEmpleadoId(rs.getInt("EMPLEADOID"));
                facturaventa.setClienteId(rs.getInt("CLIENTEID"));
                facturaventa.setTotal(rs.getInt("TOTAL"));
                facturaventaList.add(facturaventa);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(FacturaVentaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FacturaVentaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaVentaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FacturaVentaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return facturaventaList;
    }
}



