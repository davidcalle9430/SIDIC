/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidic.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author david
 */
@Entity
@Table(name = "t_arreglo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TArreglo.findAll", query = "SELECT t FROM TArreglo t"),
    @NamedQuery(name = "TArreglo.findByCodigo", query = "SELECT t FROM TArreglo t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "TArreglo.findByCostprom", query = "SELECT t FROM TArreglo t WHERE t.costprom = :costprom"),
    @NamedQuery(name = "TArreglo.findByCostpromim", query = "SELECT t FROM TArreglo t WHERE t.costpromim = :costpromim")})
public class TArreglo implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Double codigo;
    @Column(name = "COSTPROM")
    private Double costprom;
    @Column(name = "COSTPROMIM")
    private Double costpromim;

    public TArreglo() {
    }

    public TArreglo(Double codigo) {
        this.codigo = codigo;
    }

    public Double getCodigo() {
        return codigo;
    }

    public void setCodigo(Double codigo) {
        this.codigo = codigo;
    }

    public Double getCostprom() {
        return costprom;
    }

    public void setCostprom(Double costprom) {
        this.costprom = costprom;
    }

    public Double getCostpromim() {
        return costpromim;
    }

    public void setCostpromim(Double costpromim) {
        this.costpromim = costpromim;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TArreglo)) {
            return false;
        }
        TArreglo other = (TArreglo) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sidic.entities.TArreglo[ codigo=" + codigo + " ]";
    }
    
}