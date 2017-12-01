/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Esmael
 */
@Entity
@Table(name = "Pessoa_Representante")
@NamedQueries({
    @NamedQuery(name = "PessoaRepresentante.findAll", query = "SELECT p FROM PessoaRepresentante p")})
public class PessoaRepresentante implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PessoaRepresentantePK pessoaRepresentantePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double alComissaoPedido;
    private Double alComissaoFaturamento;
    private Double alComissaoDuplicata;

    public PessoaRepresentante() {
    }

    public PessoaRepresentante(PessoaRepresentantePK pessoaRepresentantePK) {
        this.pessoaRepresentantePK = pessoaRepresentantePK;
    }

    public PessoaRepresentante(String idPessoa, String idPessoaRepresentante) {
        this.pessoaRepresentantePK = new PessoaRepresentantePK(idPessoa, idPessoaRepresentante);
    }

    public PessoaRepresentantePK getPessoaRepresentantePK() {
        return pessoaRepresentantePK;
    }

    public void setPessoaRepresentantePK(PessoaRepresentantePK pessoaRepresentantePK) {
        this.pessoaRepresentantePK = pessoaRepresentantePK;
    }

    public Double getAlComissaoPedido() {
        return alComissaoPedido;
    }

    public void setAlComissaoPedido(Double alComissaoPedido) {
        this.alComissaoPedido = alComissaoPedido;
    }

    public Double getAlComissaoFaturamento() {
        return alComissaoFaturamento;
    }

    public void setAlComissaoFaturamento(Double alComissaoFaturamento) {
        this.alComissaoFaturamento = alComissaoFaturamento;
    }

    public Double getAlComissaoDuplicata() {
        return alComissaoDuplicata;
    }

    public void setAlComissaoDuplicata(Double alComissaoDuplicata) {
        this.alComissaoDuplicata = alComissaoDuplicata;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pessoaRepresentantePK != null ? pessoaRepresentantePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoaRepresentante)) {
            return false;
        }
        PessoaRepresentante other = (PessoaRepresentante) object;
        if ((this.pessoaRepresentantePK == null && other.pessoaRepresentantePK != null) || (this.pessoaRepresentantePK != null && !this.pessoaRepresentantePK.equals(other.pessoaRepresentantePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.nelsys.mobileeasy.commons.entity.dbo.PessoaRepresentante[ pessoaRepresentantePK=" + pessoaRepresentantePK + " ]";
    }
    
}
