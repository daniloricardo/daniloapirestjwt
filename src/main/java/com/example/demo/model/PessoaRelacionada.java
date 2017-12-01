/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Esmael
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "PessoaRelacionada.findAll", query = "SELECT p FROM PessoaRelacionada p")})
public class PessoaRelacionada implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PessoaRelacionadaPK pessoaRelacionadaPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double alComissaoPedido;
    private Double alComissaoFaturamento;
    private Double alComissaoDuplicata;
    private Character stComissao;
    private Character tpComissao;
    private Character stPessoaRelacionadaPrincipal;
    private Double alParticipacaoSocio;
    private String idCaracteristicaPessoa;
    private Double vlFrete;
    @Lob
    private byte[] versaoRegistro;
    private Character stCartaCreditoPessoa;
    private Character stCCreditoPessoaRelacionada;

    public PessoaRelacionada() {
    }

    public PessoaRelacionada(PessoaRelacionadaPK pessoaRelacionadaPK) {
        this.pessoaRelacionadaPK = pessoaRelacionadaPK;
    }

    public PessoaRelacionada(String idPessoa, String idCategoriaPessoa, String idPessoaRelacionada, String idCategoriaPessoaRelacionada) {
        this.pessoaRelacionadaPK = new PessoaRelacionadaPK(idPessoa, idCategoriaPessoa, idPessoaRelacionada, idCategoriaPessoaRelacionada);
    }

    public PessoaRelacionadaPK getPessoaRelacionadaPK() {
        return pessoaRelacionadaPK;
    }

    public void setPessoaRelacionadaPK(PessoaRelacionadaPK pessoaRelacionadaPK) {
        this.pessoaRelacionadaPK = pessoaRelacionadaPK;
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

    public Character getStComissao() {
        return stComissao;
    }

    public void setStComissao(Character stComissao) {
        this.stComissao = stComissao;
    }

    public Character getTpComissao() {
        return tpComissao;
    }

    public void setTpComissao(Character tpComissao) {
        this.tpComissao = tpComissao;
    }

    public Character getStPessoaRelacionadaPrincipal() {
        return stPessoaRelacionadaPrincipal;
    }

    public void setStPessoaRelacionadaPrincipal(Character stPessoaRelacionadaPrincipal) {
        this.stPessoaRelacionadaPrincipal = stPessoaRelacionadaPrincipal;
    }

    public Double getAlParticipacaoSocio() {
        return alParticipacaoSocio;
    }

    public void setAlParticipacaoSocio(Double alParticipacaoSocio) {
        this.alParticipacaoSocio = alParticipacaoSocio;
    }

    public String getIdCaracteristicaPessoa() {
        return idCaracteristicaPessoa;
    }

    public void setIdCaracteristicaPessoa(String idCaracteristicaPessoa) {
        this.idCaracteristicaPessoa = idCaracteristicaPessoa;
    }

    public Double getVlFrete() {
        return vlFrete;
    }

    public void setVlFrete(Double vlFrete) {
        this.vlFrete = vlFrete;
    }

    public byte[] getVersaoRegistro() {
        return versaoRegistro;
    }

    public void setVersaoRegistro(byte[] versaoRegistro) {
        this.versaoRegistro = versaoRegistro;
    }

    public Character getStCartaCreditoPessoa() {
        return stCartaCreditoPessoa;
    }

    public void setStCartaCreditoPessoa(Character stCartaCreditoPessoa) {
        this.stCartaCreditoPessoa = stCartaCreditoPessoa;
    }

    public Character getStCCreditoPessoaRelacionada() {
        return stCCreditoPessoaRelacionada;
    }

    public void setStCCreditoPessoaRelacionada(Character stCCreditoPessoaRelacionada) {
        this.stCCreditoPessoaRelacionada = stCCreditoPessoaRelacionada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pessoaRelacionadaPK != null ? pessoaRelacionadaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoaRelacionada)) {
            return false;
        }
        PessoaRelacionada other = (PessoaRelacionada) object;
        if ((this.pessoaRelacionadaPK == null && other.pessoaRelacionadaPK != null) || (this.pessoaRelacionadaPK != null && !this.pessoaRelacionadaPK.equals(other.pessoaRelacionadaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.nelsys.mobileeasy.commons.entity.dbo.PessoaRelacionada[ pessoaRelacionadaPK=" + pessoaRelacionadaPK + " ]";
    }
    
}
