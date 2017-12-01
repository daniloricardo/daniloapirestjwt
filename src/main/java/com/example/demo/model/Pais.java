/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Esmael
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Pais.findAll", query = "SELECT p FROM Pais p")})
public class Pais implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private String idPais;
    private String nmPais;
    private String nmCompletoPais;
    private String cdBACEN;
    private String cdSigla;
    private String cdSiglaCompleta;
    private String cdArea;

    public Pais() {
    }

    public Pais(String idPais) {
        this.idPais = idPais;
    }

    public String getIdPais() {
        return idPais;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    public String getNmPais() {
        return nmPais;
    }

    public void setNmPais(String nmPais) {
        this.nmPais = nmPais;
    }

    public String getNmCompletoPais() {
        return nmCompletoPais;
    }

    public void setNmCompletoPais(String nmCompletoPais) {
        this.nmCompletoPais = nmCompletoPais;
    }

    public String getCdBACEN() {
        return cdBACEN;
    }

    public void setCdBACEN(String cdBACEN) {
        this.cdBACEN = cdBACEN;
    }

    public String getCdSigla() {
        return cdSigla;
    }

    public void setCdSigla(String cdSigla) {
        this.cdSigla = cdSigla;
    }

    public String getCdSiglaCompleta() {
        return cdSiglaCompleta;
    }

    public void setCdSiglaCompleta(String cdSiglaCompleta) {
        this.cdSiglaCompleta = cdSiglaCompleta;
    }

    public String getCdArea() {
        return cdArea;
    }

    public void setCdArea(String cdArea) {
        this.cdArea = cdArea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPais != null ? idPais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pais)) {
            return false;
        }
        Pais other = (Pais) object;
        if ((this.idPais == null && other.idPais != null) || (this.idPais != null && !this.idPais.equals(other.idPais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.nelsys.mobileeasy.commons.entity.dbo.Pais[ idPais=" + idPais + " ]";
    }
    
}
