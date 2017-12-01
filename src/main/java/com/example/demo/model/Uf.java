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
    @NamedQuery(name = "Uf.findAll", query = "SELECT u FROM Uf u")})
public class Uf implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private String idUF;
    private String nmUF;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double alICMSInterna;
    private Character tpEdicao;
    private String idPais;
    private String cdIBGE;
    private Character tpEmissaoNFEletronica;

    public Uf() {
    }

    public Uf(String idUF) {
        this.idUF = idUF;
    }

    public String getIdUF() {
        return idUF;
    }

    public void setIdUF(String idUF) {
        this.idUF = idUF;
    }

    public String getNmUF() {
        return nmUF;
    }

    public void setNmUF(String nmUF) {
        this.nmUF = nmUF;
    }

    public Double getAlICMSInterna() {
        return alICMSInterna;
    }

    public void setAlICMSInterna(Double alICMSInterna) {
        this.alICMSInterna = alICMSInterna;
    }

    public Character getTpEdicao() {
        return tpEdicao;
    }

    public void setTpEdicao(Character tpEdicao) {
        this.tpEdicao = tpEdicao;
    }

    public String getIdPais() {
        return idPais;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    public String getCdIBGE() {
        return cdIBGE;
    }

    public void setCdIBGE(String cdIBGE) {
        this.cdIBGE = cdIBGE;
    }

    public Character getTpEmissaoNFEletronica() {
        return tpEmissaoNFEletronica;
    }

    public void setTpEmissaoNFEletronica(Character tpEmissaoNFEletronica) {
        this.tpEmissaoNFEletronica = tpEmissaoNFEletronica;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUF != null ? idUF.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Uf)) {
            return false;
        }
        Uf other = (Uf) object;
        if ((this.idUF == null && other.idUF != null) || (this.idUF != null && !this.idUF.equals(other.idUF))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.nelsys.mobileeasy.commons.entity.dbo.Uf[ idUF=" + idUF + " ]";
    }
    
}
