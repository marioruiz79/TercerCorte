package edu.uan.fis.jeesample.dto;

import java.io.Serializable;

public class Detallefactura implements Serializable {

    private Integer detalleId=0;
    private Integer facturaId=0;
    private Integer productId=0;
    private Integer cantidad=0;
   

    public Integer getDetalleId() {
        return detalleId;
    }

    public void setDetalleId(Integer detalleId) {
        this.detalleId = detalleId;
    }
    
    public Integer getFacturaId() {
        return facturaId;
    }

    public void setFacturaId(Integer facturaId) {
        this.facturaId = facturaId;
    }
    
     public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Detallefactura == false)
            return false;
        Detallefactura that = (Detallefactura) o;
        return that.detalleId.equals(this.detalleId);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.detalleId != null ? this.detalleId.hashCode() : 0);
        hash = 79 * hash + (this.facturaId != null ? this.facturaId.hashCode() : 0);
        hash = 79 * hash + (this.productId != null ? this.productId.hashCode() : 0);
        hash = 79 * hash + (this.cantidad != null ? this.cantidad.hashCode() : 0);
        
        return hash;
    }
}


