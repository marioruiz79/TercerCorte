 

package edu.uan.fis.jeesample.dto;

import java.io.Serializable;

public class FacturaVenta implements Serializable {

    private Integer facturaId=0;
    private Integer empleadoId=0;
    private Integer clienteId=0;
    private Integer total=0;
   

    public Integer getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Integer facturaId) {
        this.facturaId = facturaId;
    }
    
    public Integer getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(Integer empleadoId) {
        this.empleadoId = empleadoId;
    }
    
     public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof FacturaVenta == false)
            return false;
        FacturaVenta that = (FacturaVenta) o;
        return that.facturaId.equals(this.facturaId);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.facturaId != null ? this.facturaId.hashCode() : 0);
        hash = 79 * hash + (this.empleadoId != null ? this.empleadoId.hashCode() : 0);
        hash = 79 * hash + (this.clienteId != null ? this.clienteId.hashCode() : 0);
        hash = 79 * hash + (this.total != null ? this.total.hashCode() : 0);
        
        return hash;
    }
}
