   
package edu.uan.fis.jeesample.dao.impl;

import edu.uan.fis.jeesample.dao.DetallefacturaDao;
import edu.uan.fis.jeesample.dto.Detallefactura;
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
public class DetallefacturaDaoJdbc implements DetallefacturaDao {
    
    public Detallefactura create(Detallefactura detallefactura) {
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
            stmt.executeUpdate("INSERT INTO detallefactura VALUES(" + detallefactura.getDetalleId() + "," + detallefactura.getFacturaId() + "," + detallefactura.getProductId() + "," + detallefactura.getCantidad() + ")");
        } catch (SQLException ex) {
            Logger.getLogger(DetallefacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DetallefacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(DetallefacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DetallefacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return detallefactura;
    }
    
    public Detallefactura update(Detallefactura detallefactura) {
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
            stmt.executeUpdate("UPDATE detallefactura set CANTIDAD=" + detallefactura.getCantidad() + " where detalleId = "+detallefactura.getDetalleId()  );
        } catch (SQLException ex) {
            Logger.getLogger(DetallefacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DetallefacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(DetallefacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DetallefacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return detallefactura;
    }
    
    public void delete(Detallefactura detallefactura) {
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
            stmt.executeUpdate("DELETE FROM detallefactura where detalleId = "+detallefactura.getDetalleId()  );
        } catch (SQLException ex) {
            Logger.getLogger(DetallefacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DetallefacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(DetallefacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DetallefacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Detallefactura findById(Integer detalleId) {
        // Sample code
        Detallefactura detallefactura = null;
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/jeesample","root","root");
            // 3. Creates the product in the database
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT DETALLEID, FACTURAID, PRODUCTID, CANTIDAD FROM detallefactura where DETALLEID = "+ detalleId);
            if(rs.next()){
                detallefactura = new Detallefactura();
                detallefactura.setDetalleId(rs.getInt("DETALLEID"));
                detallefactura.setFacturaId(rs.getInt("FACTURAID"));
                detallefactura.setProductId(rs.getInt("PRODUCTID"));
                detallefactura.setCantidad(rs.getInt("CANTIDAD"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetallefacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DetallefacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(DetallefacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DetallefacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return detallefactura;
    }
    
    public List<Detallefactura> findAll() {
         // Sample code
        List<Detallefactura> detallefacturaList = new ArrayList<Detallefactura>();
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. Register the JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            // 2. Get the connection for the URL jdbc:mysql://address:port/dbname?user=username&password=userpassword
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/jeesample","root","root");
            // 3. Creates the product in the database
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT DETALLEID, FACTURAID, PRODUCTID, CANTIDAD FROM detallefactura");
            while(rs.next()){
                Detallefactura detallefactura = new Detallefactura();
                detallefactura.setDetalleId(rs.getInt("DETALLEID"));
                detallefactura.setFacturaId(rs.getInt("FACTURAID"));
                detallefactura.setProductId(rs.getInt("PRODUCTID"));
                detallefactura.setCantidad(rs.getInt("CANTIDAD"));
                detallefacturaList.add(detallefactura);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetallefacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DetallefacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(DetallefacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DetallefacturaDaoJdbc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return detallefacturaList;
    }
}



