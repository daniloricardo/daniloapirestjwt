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
public class PessoaEnderecoTipoContatoPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Basic(optional = false)
    @Column(name = "IdPessoaEndereco_Contato")
    private String idPessoaEnderecoContato;
    @Basic(optional = false)
    private String idTipoContato;

    public PessoaEnderecoTipoContatoPK() {
    }

    public PessoaEnderecoTipoContatoPK(String idPessoaEnderecoContato, String idTipoContato) {
        this.idPessoaEnderecoContato = idPessoaEnderecoContato;
        this.idTipoContato = idTipoContato;
    }

    public String getIdPessoaEnderecoContato() {
        return idPessoaEnderecoContato;
    }

    public void setIdPessoaEnderecoContato(String idPessoaEnderecoContato) {
        this.idPessoaEnderecoContato = idPessoaEnderecoContato;
    }

    public String getIdTipoContato() {
        return idTipoContato;
    }

    public void setIdTipoContato(String idTipoContato) {
        this.idTipoContato = idTipoContato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPessoaEnderecoContato != null ? idPessoaEnderecoContato.hashCode() : 0);
        hash += (idTipoContato != null ? idTipoContato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoaEnderecoTipoContatoPK)) {
            return false;
        }
        PessoaEnderecoTipoContatoPK other = (PessoaEnderecoTipoContatoPK) object;
        if ((this.idPessoaEnderecoContato == null && other.idPessoaEnderecoContato != null) || (this.idPessoaEnderecoContato != null && !this.idPessoaEnderecoContato.equals(other.idPessoaEnderecoContato))) {
            return false;
        }
        if ((this.idTipoContato == null && other.idTipoContato != null) || (this.idTipoContato != null && !this.idTipoContato.equals(other.idTipoContato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.nelsys.mobileeasy.commons.entity.dbo.PessoaEnderecoTipoContatoPK[ idPessoaEnderecoContato=" + idPessoaEnderecoContato + ", idTipoContato=" + idTipoContato + " ]";
    }
    
}
