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
public class PessoaRelacionadaPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    private String idPessoa;
    @Basic(optional = false)
    private String idCategoriaPessoa;
    @Basic(optional = false)
    private String idPessoaRelacionada;
    @Basic(optional = false)
    private String idCategoriaPessoaRelacionada;

    public PessoaRelacionadaPK() {
    }

    public PessoaRelacionadaPK(String idPessoa, String idCategoriaPessoa, String idPessoaRelacionada, String idCategoriaPessoaRelacionada) {
        this.idPessoa = idPessoa;
        this.idCategoriaPessoa = idCategoriaPessoa;
        this.idPessoaRelacionada = idPessoaRelacionada;
        this.idCategoriaPessoaRelacionada = idCategoriaPessoaRelacionada;
    }

    public String getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(String idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getIdCategoriaPessoa() {
        return idCategoriaPessoa;
    }

    public void setIdCategoriaPessoa(String idCategoriaPessoa) {
        this.idCategoriaPessoa = idCategoriaPessoa;
    }

    public String getIdPessoaRelacionada() {
        return idPessoaRelacionada;
    }

    public void setIdPessoaRelacionada(String idPessoaRelacionada) {
        this.idPessoaRelacionada = idPessoaRelacionada;
    }

    public String getIdCategoriaPessoaRelacionada() {
        return idCategoriaPessoaRelacionada;
    }

    public void setIdCategoriaPessoaRelacionada(String idCategoriaPessoaRelacionada) {
        this.idCategoriaPessoaRelacionada = idCategoriaPessoaRelacionada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPessoa != null ? idPessoa.hashCode() : 0);
        hash += (idCategoriaPessoa != null ? idCategoriaPessoa.hashCode() : 0);
        hash += (idPessoaRelacionada != null ? idPessoaRelacionada.hashCode() : 0);
        hash += (idCategoriaPessoaRelacionada != null ? idCategoriaPessoaRelacionada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoaRelacionadaPK)) {
            return false;
        }
        PessoaRelacionadaPK other = (PessoaRelacionadaPK) object;
        if ((this.idPessoa == null && other.idPessoa != null) || (this.idPessoa != null && !this.idPessoa.equals(other.idPessoa))) {
            return false;
        }
        if ((this.idCategoriaPessoa == null && other.idCategoriaPessoa != null) || (this.idCategoriaPessoa != null && !this.idCategoriaPessoa.equals(other.idCategoriaPessoa))) {
            return false;
        }
        if ((this.idPessoaRelacionada == null && other.idPessoaRelacionada != null) || (this.idPessoaRelacionada != null && !this.idPessoaRelacionada.equals(other.idPessoaRelacionada))) {
            return false;
        }
        if ((this.idCategoriaPessoaRelacionada == null && other.idCategoriaPessoaRelacionada != null) || (this.idCategoriaPessoaRelacionada != null && !this.idCategoriaPessoaRelacionada.equals(other.idCategoriaPessoaRelacionada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.nelsys.mobileeasy.commons.entity.dbo.PessoaRelacionadaPK[ idPessoa=" + idPessoa + ", idCategoriaPessoa=" + idCategoriaPessoa + ", idPessoaRelacionada=" + idPessoaRelacionada + ", idCategoriaPessoaRelacionada=" + idCategoriaPessoaRelacionada + " ]";
    }
    
}
