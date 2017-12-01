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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Esmael
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Cidade.findAll", query = "SELECT c FROM Cidade c")})
public class Cidade implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private String idCidade;
    private String cdChamada;
    private String nmCidade;
    private String idUF;
    private String cdIBGE;
    @Basic(optional = false)
    @Lob
    private byte[] versaoRegistro;

    public Cidade() {
    }

    public Cidade(String idCidade) {
        this.idCidade = idCidade;
    }

    public Cidade(String idCidade, byte[] versaoRegistro) {
        this.idCidade = idCidade;
        this.versaoRegistro = versaoRegistro;
    }

    public String getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(String idCidade) {
        this.idCidade = idCidade;
    }

    public String getCdChamada() {
        return cdChamada;
    }

    public void setCdChamada(String cdChamada) {
        this.cdChamada = cdChamada;
    }

    public String getNmCidade() {
        return nmCidade;
    }

    public void setNmCidade(String nmCidade) {
        this.nmCidade = nmCidade;
    }

    public String getIdUF() {
        return idUF;
    }

    public void setIdUF(String idUF) {
        this.idUF = idUF;
    }

    public String getCdIBGE() {
        return cdIBGE;
    }

    public void setCdIBGE(String cdIBGE) {
        this.cdIBGE = cdIBGE;
    }

    public byte[] getVersaoRegistro() {
        return versaoRegistro;
    }

    public void setVersaoRegistro(byte[] versaoRegistro) {
        this.versaoRegistro = versaoRegistro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCidade != null ? idCidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cidade)) {
            return false;
        }
        Cidade other = (Cidade) object;
        if ((this.idCidade == null && other.idCidade != null) || (this.idCidade != null && !this.idCidade.equals(other.idCidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.nelsys.mobileeasy.commons.entity.dbo.Cidade[ idCidade=" + idCidade + " ]";
    }
    
}
