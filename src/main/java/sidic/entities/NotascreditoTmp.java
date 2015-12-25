/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sidic.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author david
 */
@Entity
@Table(name = "notascredito_tmp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NotascreditoTmp.findAll", query = "SELECT n FROM NotascreditoTmp n"),
    @NamedQuery(name = "NotascreditoTmp.findByNrorecibocaja", query = "SELECT n FROM NotascreditoTmp n WHERE n.notascreditoTmpPK.nrorecibocaja = :nrorecibocaja"),
    @NamedQuery(name = "NotascreditoTmp.findByCliente", query = "SELECT n FROM NotascreditoTmp n WHERE n.notascreditoTmpPK.cliente = :cliente"),
    @NamedQuery(name = "NotascreditoTmp.findByFactura", query = "SELECT n FROM NotascreditoTmp n WHERE n.notascreditoTmpPK.factura = :factura"),
    @NamedQuery(name = "NotascreditoTmp.findByArticulo", query = "SELECT n FROM NotascreditoTmp n WHERE n.notascreditoTmpPK.articulo = :articulo"),
    @NamedQuery(name = "NotascreditoTmp.findByNombre", query = "SELECT n FROM NotascreditoTmp n WHERE n.nombre = :nombre"),
    @NamedQuery(name = "NotascreditoTmp.findByReferencia", query = "SELECT n FROM NotascreditoTmp n WHERE n.referencia = :referencia"),
    @NamedQuery(name = "NotascreditoTmp.findByModelo", query = "SELECT n FROM NotascreditoTmp n WHERE n.modelo = :modelo"),
    @NamedQuery(name = "NotascreditoTmp.findByMarca", query = "SELECT n FROM NotascreditoTmp n WHERE n.marca = :marca"),
    @NamedQuery(name = "NotascreditoTmp.findByCantidad", query = "SELECT n FROM NotascreditoTmp n WHERE n.cantidad = :cantidad"),
    @NamedQuery(name = "NotascreditoTmp.findByValorunitario", query = "SELECT n FROM NotascreditoTmp n WHERE n.valorunitario = :valorunitario"),
    @NamedQuery(name = "NotascreditoTmp.findByPorcdscto", query = "SELECT n FROM NotascreditoTmp n WHERE n.porcdscto = :porcdscto"),
    @NamedQuery(name = "NotascreditoTmp.findByPorciva", query = "SELECT n FROM NotascreditoTmp n WHERE n.porciva = :porciva"),
    @NamedQuery(name = "NotascreditoTmp.findByValortotal", query = "SELECT n FROM NotascreditoTmp n WHERE n.valortotal = :valortotal"),
    @NamedQuery(name = "NotascreditoTmp.findByUsuario", query = "SELECT n FROM NotascreditoTmp n WHERE n.notascreditoTmpPK.usuario = :usuario"),
    @NamedQuery(name = "NotascreditoTmp.findByNc", query = "SELECT n FROM NotascreditoTmp n WHERE n.notascreditoTmpPK.nc = :nc"),
    @NamedQuery(name = "NotascreditoTmp.findByDescripcion", query = "SELECT n FROM NotascreditoTmp n WHERE n.descripcion = :descripcion"),
    @NamedQuery(name = "NotascreditoTmp.findBySecuencia", query = "SELECT n FROM NotascreditoTmp n WHERE n.notascreditoTmpPK.secuencia = :secuencia")})
public class NotascreditoTmp implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected NotascreditoTmpPK notascreditoTmpPK;
    @Column(length = 200)
    private String nombre;
    @Column(length = 200)
    private String referencia;
    @Column(length = 200)
    private String modelo;
    @Column(length = 200)
    private String marca;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 22)
    private Double cantidad;
    @Column(precision = 22)
    private Double valorunitario;
    @Column(precision = 22)
    private Double porcdscto;
    @Column(precision = 22)
    private Double porciva;
    @Column(precision = 22)
    private Double valortotal;
    @Column(length = 250)
    private String descripcion;

    public NotascreditoTmp() {
    }

    public NotascreditoTmp(NotascreditoTmpPK notascreditoTmpPK) {
        this.notascreditoTmpPK = notascreditoTmpPK;
    }

    public NotascreditoTmp(double nrorecibocaja, double cliente, double factura, double articulo, String usuario, double nc, int secuencia) {
        this.notascreditoTmpPK = new NotascreditoTmpPK(nrorecibocaja, cliente, factura, articulo, usuario, nc, secuencia);
    }

    public NotascreditoTmpPK getNotascreditoTmpPK() {
        return notascreditoTmpPK;
    }

    public void setNotascreditoTmpPK(NotascreditoTmpPK notascreditoTmpPK) {
        this.notascreditoTmpPK = notascreditoTmpPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(Double valorunitario) {
        this.valorunitario = valorunitario;
    }

    public Double getPorcdscto() {
        return porcdscto;
    }

    public void setPorcdscto(Double porcdscto) {
        this.porcdscto = porcdscto;
    }

    public Double getPorciva() {
        return porciva;
    }

    public void setPorciva(Double porciva) {
        this.porciva = porciva;
    }

    public Double getValortotal() {
        return valortotal;
    }

    public void setValortotal(Double valortotal) {
        this.valortotal = valortotal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notascreditoTmpPK != null ? notascreditoTmpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotascreditoTmp)) {
            return false;
        }
        NotascreditoTmp other = (NotascreditoTmp) object;
        if ((this.notascreditoTmpPK == null && other.notascreditoTmpPK != null) || (this.notascreditoTmpPK != null && !this.notascreditoTmpPK.equals(other.notascreditoTmpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sidic.entities.NotascreditoTmp[ notascreditoTmpPK=" + notascreditoTmpPK + " ]";
    }
    
}
