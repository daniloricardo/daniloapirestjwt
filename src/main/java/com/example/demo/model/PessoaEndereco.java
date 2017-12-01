/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Esmael
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "PessoaEndereco.findAll", query = "SELECT p FROM PessoaEndereco p")})
public class PessoaEndereco implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PessoaEnderecoPK pessoaEnderecoPK;
    private String stEnderecoPrincipal;
    private String stEnderecoEntrega;
    private String stEnderecoCobranca;
    private String stEnderecoResidencial;
    private String stEnderecoComercial;
    private String stEnderecoCorrespondencia;
    private String cdSUFRAMA;
    private String nrInscricaoEstadual;
    private String nmLogradouro;
    private String nrLogradouro;
    private String dsComplemento;
    private String nrInscricaoMunicipal;
    private String tpLogradouro;
    private String cdCEP;
    //private String idBairro;
    @Column(name = "CdCPF_CGC")
    private String cdCPFCGC;
    //private String idCidade;
    //private String idUF;
    private String nmPessoa;
    @Lob
    private String dsObservacao;
    private String stAtivo;
    private String stCalculoSUFRAMA;
    //private String idPais;
    @Lob
    private byte[] versaoRegistro;
    private String stTeste;
    private Short nrSequencia;

    //Compatibilidade com código Alterdata Importer existente
    @ManyToOne(optional = false)
	@JoinColumn(name = "IdBairro")
	private Bairro bairro;

	@ManyToOne(optional = false)
	@JoinColumn(name = "IdCidade")
	private Cidade cidade;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "IdUF")
	private Uf uf;

	@ManyToOne
	@JoinColumn(name="IdPais", referencedColumnName="IdPais")
	private  Pais pais;

    public PessoaEndereco() {
    }

    public PessoaEndereco(PessoaEnderecoPK pessoaEnderecoPK) {
        this.pessoaEnderecoPK = pessoaEnderecoPK;
    }

    public PessoaEndereco(String idPessoa, String cdEndereco) {
        this.pessoaEnderecoPK = new PessoaEnderecoPK(idPessoa, cdEndereco);
    }

    public PessoaEnderecoPK getPessoaEnderecoPK() {
        return pessoaEnderecoPK;
    }

    public void setPessoaEnderecoPK(PessoaEnderecoPK pessoaEnderecoPK) {
        this.pessoaEnderecoPK = pessoaEnderecoPK;
    }

    public String getStEnderecoPrincipal() {
        return stEnderecoPrincipal;
    }

    public void setStEnderecoPrincipal(String stEnderecoPrincipal) {
        this.stEnderecoPrincipal = stEnderecoPrincipal;
    }

    public String getStEnderecoEntrega() {
        return stEnderecoEntrega;
    }

    public void setStEnderecoEntrega(String stEnderecoEntrega) {
        this.stEnderecoEntrega = stEnderecoEntrega;
    }

    public String getStEnderecoCobranca() {
        return stEnderecoCobranca;
    }

    public void setStEnderecoCobranca(String stEnderecoCobranca) {
        this.stEnderecoCobranca = stEnderecoCobranca;
    }

    public String getStEnderecoResidencial() {
        return stEnderecoResidencial;
    }

    public void setStEnderecoResidencial(String stEnderecoResidencial) {
        this.stEnderecoResidencial = stEnderecoResidencial;
    }

    public String getStEnderecoComercial() {
        return stEnderecoComercial;
    }

    public void setStEnderecoComercial(String stEnderecoComercial) {
        this.stEnderecoComercial = stEnderecoComercial;
    }

    public String getStEnderecoCorrespondencia() {
        return stEnderecoCorrespondencia;
    }

    public void setStEnderecoCorrespondencia(String stEnderecoCorrespondencia) {
        this.stEnderecoCorrespondencia = stEnderecoCorrespondencia;
    }

    public String getCdSUFRAMA() {
        return cdSUFRAMA;
    }

    public void setCdSUFRAMA(String cdSUFRAMA) {
        this.cdSUFRAMA = cdSUFRAMA;
    }

    public String getNrInscricaoEstadual() {
        return nrInscricaoEstadual;
    }

    public void setNrInscricaoEstadual(String nrInscricaoEstadual) {
        this.nrInscricaoEstadual = nrInscricaoEstadual;
    }

    public String getNmLogradouro() {
        return nmLogradouro;
    }

    public void setNmLogradouro(String nmLogradouro) {
        this.nmLogradouro = nmLogradouro;
    }

    public String getNrLogradouro() {
        return nrLogradouro;
    }

    public void setNrLogradouro(String nrLogradouro) {
        this.nrLogradouro = nrLogradouro;
    }

    public String getDsComplemento() {
        return dsComplemento;
    }

    public void setDsComplemento(String dsComplemento) {
        this.dsComplemento = dsComplemento;
    }

    public String getNrInscricaoMunicipal() {
        return nrInscricaoMunicipal;
    }

    public void setNrInscricaoMunicipal(String nrInscricaoMunicipal) {
        this.nrInscricaoMunicipal = nrInscricaoMunicipal;
    }

    public String getTpLogradouro() {
        return tpLogradouro;
    }

    public void setTpLogradouro(String tpLogradouro) {
        this.tpLogradouro = tpLogradouro;
    }

    public String getCdCEP() {
        return cdCEP;
    }

    public void setCdCEP(String cdCEP) {
        this.cdCEP = cdCEP;
    }

   /* public String getIdBairro() {
        return idBairro;
    }

    public void setIdBairro(String idBairro) {
        this.idBairro = idBairro;
    }*/

    public String getCdCPFCGC() {
        return cdCPFCGC;
    }

    public void setCdCPFCGC(String cdCPFCGC) {
        this.cdCPFCGC = cdCPFCGC;
    }

   /* public String getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(String idCidade) {
        this.idCidade = idCidade;
    }*/

   /* public String getIdUF() {
        return idUF;
    }

    public void setIdUF(String idUF) {
        this.idUF = idUF;
    }*/

    public String getNmPessoa() {
        return nmPessoa;
    }

    public void setNmPessoa(String nmPessoa) {
        this.nmPessoa = nmPessoa;
    }

    public String getDsObservacao() {
        return dsObservacao;
    }

    public void setDsObservacao(String dsObservacao) {
        this.dsObservacao = dsObservacao;
    }

    public String getStAtivo() {
        return stAtivo;
    }

    public void setStAtivo(String stAtivo) {
        this.stAtivo = stAtivo;
    }

    public String getStCalculoSUFRAMA() {
        return stCalculoSUFRAMA;
    }

    public void setStCalculoSUFRAMA(String stCalculoSUFRAMA) {
        this.stCalculoSUFRAMA = stCalculoSUFRAMA;
    }

   /* public String getIdPais() {
        return idPais;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }*/

    public byte[] getVersaoRegistro() {
        return versaoRegistro;
    }

    public void setVersaoRegistro(byte[] versaoRegistro) {
        this.versaoRegistro = versaoRegistro;
    }

    public String getStTeste() {
        return stTeste;
    }

    public void setStTeste(String stTeste) {
        this.stTeste = stTeste;
    }

    public Short getNrSequencia() {
        return nrSequencia;
    }

    public void setNrSequencia(Short nrSequencia) {
        this.nrSequencia = nrSequencia;
    }

    public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Uf getUf() {
		return uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (pessoaEnderecoPK != null ? pessoaEnderecoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoaEndereco)) {
            return false;
        }
        PessoaEndereco other = (PessoaEndereco) object;
        if ((this.pessoaEnderecoPK == null && other.pessoaEnderecoPK != null) || (this.pessoaEnderecoPK != null && !this.pessoaEnderecoPK.equals(other.pessoaEnderecoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.nelsys.mobileeasy.commons.entity.dbo.PessoaEndereco[ pessoaEnderecoPK=" + pessoaEnderecoPK + " ]";
    }
    
}
