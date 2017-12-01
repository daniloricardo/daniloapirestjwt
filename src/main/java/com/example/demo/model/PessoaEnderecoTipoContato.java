/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Esmael
 */
@Entity
@Table(name = "PessoaEndereco_TipoContato")
@NamedQueries({
    @NamedQuery(name = "PessoaEnderecoTipoContato.findAll", query = "SELECT p FROM PessoaEnderecoTipoContato p")})
public class PessoaEnderecoTipoContato implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PessoaEnderecoTipoContatoPK pessoaEnderecoTipoContatoPK;
    @Basic(optional = false)
    @Column(name = "IdPessoa")
    private String idPessoa;
    @Basic(optional = false)
    private String cdEndereco;
    private String dsContato;
    @Lob
    private String dsObservacao;
    @Lob
    private byte[] versaoRegistro;

    public PessoaEnderecoTipoContato() {
    }

    public PessoaEnderecoTipoContato(PessoaEnderecoTipoContatoPK pessoaEnderecoTipoContatoPK) {
        this.pessoaEnderecoTipoContatoPK = pessoaEnderecoTipoContatoPK;
    }

    public PessoaEnderecoTipoContato(PessoaEnderecoTipoContatoPK pessoaEnderecoTipoContatoPK, String idPessoa, String cdEndereco) {
        this.pessoaEnderecoTipoContatoPK = pessoaEnderecoTipoContatoPK;
        this.idPessoa = idPessoa;
        this.cdEndereco = cdEndereco;
    }

    public PessoaEnderecoTipoContato(String idPessoaEnderecoContato, String idTipoContato) {
        this.pessoaEnderecoTipoContatoPK = new PessoaEnderecoTipoContatoPK(idPessoaEnderecoContato, idTipoContato);
    }

    public PessoaEnderecoTipoContatoPK getPessoaEnderecoTipoContatoPK() {
        return pessoaEnderecoTipoContatoPK;
    }

    public void setPessoaEnderecoTipoContatoPK(PessoaEnderecoTipoContatoPK pessoaEnderecoTipoContatoPK) {
        this.pessoaEnderecoTipoContatoPK = pessoaEnderecoTipoContatoPK;
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

    public String getDsContato() {
        return dsContato;
    }

    public void setDsContato(String dsContato) {
        this.dsContato = dsContato;
    }

    public String getDsObservacao() {
        return dsObservacao;
    }

    public void setDsObservacao(String dsObservacao) {
        this.dsObservacao = dsObservacao;
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
        hash += (pessoaEnderecoTipoContatoPK != null ? pessoaEnderecoTipoContatoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoaEnderecoTipoContato)) {
            return false;
        }
        PessoaEnderecoTipoContato other = (PessoaEnderecoTipoContato) object;
        if ((this.pessoaEnderecoTipoContatoPK == null && other.pessoaEnderecoTipoContatoPK != null) || (this.pessoaEnderecoTipoContatoPK != null && !this.pessoaEnderecoTipoContatoPK.equals(other.pessoaEnderecoTipoContatoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.nelsys.mobileeasy.commons.entity.dbo.PessoaEnderecoTipoContato[ pessoaEnderecoTipoContatoPK=" + pessoaEnderecoTipoContatoPK + " ]";
    }
    
}
