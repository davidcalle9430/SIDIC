/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidic.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author david
 */

@Entity
@Table(name = "lineas")
@XmlRootElement
public class Lineas implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(nullable = false, precision = 22)
    private Long linea;
    @Column(precision = 22)
    private Double rango1;
    @Column(precision = 22)
    private Double rango2;
    @Column(length = 1)
    private String estado;
    @Column(length = 100)
    private String descripcion;
    @Column(length = 1)
    private String permiterefespecial;
    @OneToMany(mappedBy = "linea")
    private List<Clientes> clientesList;

    public Lineas() {
    }

    public Lineas(Long linea) {
        this.linea = linea;
    }

    public Long getLinea() {
        return linea;
    }

    public void setLinea(Long linea) {
        this.linea = linea;
    }

    public Double getRango1() {
        return rango1;
    }

    public void setRango1(Double rango1) {
        this.rango1 = rango1;
    }

    public Double getRango2() {
        return rango2;
    }

    public void setRango2(Double rango2) {
        this.rango2 = rango2;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPermiterefespecial() {
        return permiterefespecial;
    }

    public void setPermiterefespecial(String permiterefespecial) {
        this.permiterefespecial = permiterefespecial;
    }

    @XmlTransient
    public List<Clientes> getClientesList() {
        return clientesList;
    }

    public void setClientesList(List<Clientes> clientesList) {
        this.clientesList = clientesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (linea != null ? linea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lineas)) {
            return false;
        }
        Lineas other = (Lineas) object;
        if ((this.linea == null && other.linea != null) || (this.linea != null && !this.linea.equals(other.linea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sidic.entities.Lineas[ linea=" + linea + " ]";
    }
    
}
