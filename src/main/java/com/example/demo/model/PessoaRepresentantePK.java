/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Embeddable;

/**
 *
 * @author Esmael
 */
@Embeddable
public class PessoaRepresentantePK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    private String idPessoa;
    @Basic(optional = false)
    private String idPessoaRepresentante;

    public PessoaRepresentantePK() {
    }

    public PessoaRepresentantePK(String idPessoa, String idPessoaRepresentante) {
        this.idPessoa = idPessoa;
        this.idPessoaRepresentante = idPessoaRepresentante;
    }

    public String getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(String idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getIdPessoaRepresentante() {
        return idPessoaRepresentante;
    }

    public void setIdPessoaRepresentante(String idPessoaRepresentante) {
        this.idPessoaRepresentante = idPessoaRepresentante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPessoa != null ? idPessoa.hashCode() : 0);
        hash += (idPessoaRepresentante != null ? idPessoaRepresentante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoaRepresentantePK)) {
            return false;
        }
        PessoaRepresentantePK other = (PessoaRepresentantePK) object;
        if ((this.idPessoa == null && other.idPessoa != null) || (this.idPessoa != null && !this.idPessoa.equals(other.idPessoa))) {
            return false;
        }
        if ((this.idPessoaRepresentante == null && other.idPessoaRepresentante != null) || (this.idPessoaRepresentante != null && !this.idPessoaRepresentante.equals(other.idPessoaRepresentante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.nelsys.mobileeasy.commons.entity.dbo.PessoaRepresentantePK[ idPessoa=" + idPessoa + ", idPessoaRepresentante=" + idPessoaRepresentante + " ]";
    }
    
}
