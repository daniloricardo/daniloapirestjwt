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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Esmael
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @OneToOne
	@PrimaryKeyJoinColumn
	private Pessoa pessoa;
    @Id
    @Basic(optional = false)
    private String idPessoaCliente;
    private String idOperacao;
    private String idPrazo;
    private String idPessoaTransportador;
    private String idPessoaTransportadorRedesp;
    private String idPreco;
    private String idMensagem;
    private String idPessoaFinanceiro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double alDesconto;
    private String idPessoaConvenio;
    private String idOperacaoOE;
    private String tpContaCorrente;
    private Double vlFatorDesconto;
    private String idOperacaoNFFechamento;
    private String idOperacaoOEFechamento;
    private Double alARLCalculo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtPrestacaoConta;
    private String idNaturezaLancamento;
    private String tpPreVendaPadrao;
    

    public Cliente() {
    }

    public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Cliente(String idPessoaCliente) {
        this.idPessoaCliente = idPessoaCliente;
    }

    public String getIdPessoaCliente() {
        return idPessoaCliente;
    }

    public void setIdPessoaCliente(String idPessoaCliente) {
        this.idPessoaCliente = idPessoaCliente;
    }

    public String getIdOperacao() {
        return idOperacao;
    }

    public void setIdOperacao(String idOperacao) {
        this.idOperacao = idOperacao;
    }

    public String getIdPrazo() {
        return idPrazo;
    }

    public void setIdPrazo(String idPrazo) {
        this.idPrazo = idPrazo;
    }

    public String getIdPessoaTransportador() {
        return idPessoaTransportador;
    }

    public void setIdPessoaTransportador(String idPessoaTransportador) {
        this.idPessoaTransportador = idPessoaTransportador;
    }

    public String getIdPessoaTransportadorRedesp() {
        return idPessoaTransportadorRedesp;
    }

    public void setIdPessoaTransportadorRedesp(String idPessoaTransportadorRedesp) {
        this.idPessoaTransportadorRedesp = idPessoaTransportadorRedesp;
    }

    public String getIdPreco() {
        return idPreco;
    }

    public void setIdPreco(String idPreco) {
        this.idPreco = idPreco;
    }

    public String getIdMensagem() {
        return idMensagem;
    }

    public void setIdMensagem(String idMensagem) {
        this.idMensagem = idMensagem;
    }

    public String getIdPessoaFinanceiro() {
        return idPessoaFinanceiro;
    }

    public void setIdPessoaFinanceiro(String idPessoaFinanceiro) {
        this.idPessoaFinanceiro = idPessoaFinanceiro;
    }

    public Double getAlDesconto() {
        return alDesconto;
    }

    public void setAlDesconto(Double alDesconto) {
        this.alDesconto = alDesconto;
    }

    public String getIdPessoaConvenio() {
        return idPessoaConvenio;
    }

    public void setIdPessoaConvenio(String idPessoaConvenio) {
        this.idPessoaConvenio = idPessoaConvenio;
    }

    public String getIdOperacaoOE() {
        return idOperacaoOE;
    }

    public void setIdOperacaoOE(String idOperacaoOE) {
        this.idOperacaoOE = idOperacaoOE;
    }

    public String getTpContaCorrente() {
        return tpContaCorrente;
    }

    public void setTpContaCorrente(String tpContaCorrente) {
        this.tpContaCorrente = tpContaCorrente;
    }

    public Double getVlFatorDesconto() {
        return vlFatorDesconto;
    }

    public void setVlFatorDesconto(Double vlFatorDesconto) {
        this.vlFatorDesconto = vlFatorDesconto;
    }

    public String getIdOperacaoNFFechamento() {
        return idOperacaoNFFechamento;
    }

    public void setIdOperacaoNFFechamento(String idOperacaoNFFechamento) {
        this.idOperacaoNFFechamento = idOperacaoNFFechamento;
    }

    public String getIdOperacaoOEFechamento() {
        return idOperacaoOEFechamento;
    }

    public void setIdOperacaoOEFechamento(String idOperacaoOEFechamento) {
        this.idOperacaoOEFechamento = idOperacaoOEFechamento;
    }

    public Double getAlARLCalculo() {
        return alARLCalculo;
    }

    public void setAlARLCalculo(Double alARLCalculo) {
        this.alARLCalculo = alARLCalculo;
    }

    public Date getDtPrestacaoConta() {
        return dtPrestacaoConta;
    }

    public void setDtPrestacaoConta(Date dtPrestacaoConta) {
        this.dtPrestacaoConta = dtPrestacaoConta;
    }

    public String getIdNaturezaLancamento() {
        return idNaturezaLancamento;
    }

    public void setIdNaturezaLancamento(String idNaturezaLancamento) {
        this.idNaturezaLancamento = idNaturezaLancamento;
    }

    public String getTpPreVendaPadrao() {
        return tpPreVendaPadrao;
    }

    public void setTpPreVendaPadrao(String tpPreVendaPadrao) {
        this.tpPreVendaPadrao = tpPreVendaPadrao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPessoaCliente != null ? idPessoaCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idPessoaCliente == null && other.idPessoaCliente != null) || (this.idPessoaCliente != null && !this.idPessoaCliente.equals(other.idPessoaCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.nelsys.mobileeasy.commons.entity.dbo.Cliente[ idPessoaCliente=" + idPessoaCliente + " ]";
    }
    
}
