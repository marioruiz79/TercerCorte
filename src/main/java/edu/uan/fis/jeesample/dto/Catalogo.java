package edu.uan.fis.jeesample.dto;

import java.io.Serializable;

public class Catalogo implements Serializable {
    
    private Integer catalogoId=0;
    private String name;
    
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCatalogoId() {
        return catalogoId;
    }

    public void setCatalogoId(Integer catalogoId) {
        this.catalogoId = catalogoId;
    }
    
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Catalogo == false)
            return false;
        Catalogo that = (Catalogo) o;
        return that.catalogoId.equals(this.catalogoId);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 79 * hash + (this.catalogoId != null ? this.catalogoId.hashCode() : 0);
  
        return hash;
    }
}
