/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Esmael
 */
@Embeddable
public class PessoaEnderecoPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
	@Column(name = "IdPessoa")
    private String idPessoa;
    @Basic(optional = false)
    private String cdEndereco;

    public PessoaEnderecoPK() {
    }

    public PessoaEnderecoPK(String idPessoa, String cdEndereco) {
        this.idPessoa = idPessoa;
        this.cdEndereco = cdEndereco;
    }

    public String getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(String idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getCdEndereco() {
        return cdEndereco;
    }

    public void setCdEndereco(String cdEndereco) {
        this.cdEndereco = cdEndereco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPessoa != null ? idPessoa.hashCode() : 0);
        hash += (cdEndereco != null ? cdEndereco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoaEnderecoPK)) {
            return false;
        }
        PessoaEnderecoPK other = (PessoaEnderecoPK) object;
        if ((this.idPessoa == null && other.idPessoa != null) || (this.idPessoa != null && !this.idPessoa.equals(other.idPessoa))) {
            return false;
        }
        if ((this.cdEndereco == null && other.cdEndereco != null) || (this.cdEndereco != null && !this.cdEndereco.equals(other.cdEndereco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.nelsys.mobileeasy.commons.entity.dbo.PessoaEnderecoPK[ idPessoa=" + idPessoa + ", cdEndereco=" + cdEndereco + " ]";
    }
    
}
