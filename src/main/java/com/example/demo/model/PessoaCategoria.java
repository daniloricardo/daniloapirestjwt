/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Esmael
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "PessoaCategoria.findAll", query = "SELECT p FROM PessoaCategoria p")})
public class PessoaCategoria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private String idPessoaCategoria;
    private String idPessoa;
    private String idCategoria;
    private String idPessoaRelacionada;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCadastro;
    private Character stAtivo;
    private String cdChamadaExterno;
    private String idUsuarioCadastro;
    @Basic(optional = false)
    @Lob
    private byte[] versaoRegistro;

    public PessoaCategoria() {
    }

    public PessoaCategoria(String idPessoaCategoria) {
        this.idPessoaCategoria = idPessoaCategoria;
    }

    public PessoaCategoria(String idPessoaCategoria, byte[] versaoRegistro) {
        this.idPessoaCategoria = idPessoaCategoria;
        this.versaoRegistro = versaoRegistro;
    }

    public String getIdPessoaCategoria() {
        return idPessoaCategoria;
    }

    public void setIdPessoaCategoria(String idPessoaCategoria) {
        this.idPessoaCategoria = idPessoaCategoria;
    }

    public String getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(String idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getIdPessoaRelacionada() {
        return idPessoaRelacionada;
    }

    public void setIdPessoaRelacionada(String idPessoaRelacionada) {
        this.idPessoaRelacionada = idPessoaRelacionada;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public Character getStAtivo() {
        return stAtivo;
    }

    public void setStAtivo(Character stAtivo) {
        this.stAtivo = stAtivo;
    }

    public String getCdChamadaExterno() {
        return cdChamadaExterno;
    }

    public void setCdChamadaExterno(String cdChamadaExterno) {
        this.cdChamadaExterno = cdChamadaExterno;
    }

    public String getIdUsuarioCadastro() {
        return idUsuarioCadastro;
    }

    public void setIdUsuarioCadastro(String idUsuarioCadastro) {
        this.idUsuarioCadastro = idUsuarioCadastro;
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
        hash += (idPessoaCategoria != null ? idPessoaCategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoaCategoria)) {
            return false;
        }
        PessoaCategoria other = (PessoaCategoria) object;
        if ((this.idPessoaCategoria == null && other.idPessoaCategoria != null) || (this.idPessoaCategoria != null && !this.idPessoaCategoria.equals(other.idPessoaCategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.nelsys.mobileeasy.commons.entity.dbo.PessoaCategoria[ idPessoaCategoria=" + idPessoaCategoria + " ]";
    }
    
}
