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
    @NamedQuery(name = "PessoaComplementar.findAll", query = "SELECT p FROM PessoaComplementar p")})
public class PessoaComplementar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private String idPessoa;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtNascimento;
    private String dsRamoAtividade;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtInicioAtividade;
    private String nrCarteiraIdentidade;
    private String nmOrgaoExpedidor;
    private Character tpSexo;
    private String idUFNaturalidade;
    private String dsNacionalidade;
    @Lob
    private String dsObservacao;
    private String dsProfissao;
    private String nmPai;
    private String nmMae;
    private Character tpEstadoCivil;
    private String nrCTPS;
    private String nrRegJuntaComercial;
    private String nrRegCivil;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vlCapitalRegistrado;
    private Double vlCapitalAtual;
    private Double vlCapitalGiro;
    private Double vlEstoque;
    private Double vlFaturamentoAnual;
    private Integer nrFuncionarios;
    private String dsOutrosDocumentos;
    private String idAgencia;
    private String nrConta;
    private String idBanco;
    private String nrAgencia;
    private Double vlLimiteCredito;
    private String nrPIS;
    private Character tpEstabelecimento;
    private Character stTributosContribuicoes;
    private Integer nrDiasPrazoMedio;
    private Integer nrSequencia;
    private Integer cdEmpresa;
    private Character tpClassificacaoABC;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtClassificacaoABC;
    private Integer nrRanking;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtRecebimento;
    private String dsInteresse;
    private String dsCidadeInteresse;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUltimaAlteracao;
    private String idAgenciaCobranca;
    private String idBancoCobranca;
    private Double vlLimiteCreditoParcela;
    private Double alIRRF;
    private Character stPrestadoraServico;
    private Character stTributosContribQualquerValor;
    private Character stCobraTaxaBancaria;
    private Character stMicroEmpresa;
    private String dsCidadeInteresse2;
    private String dsInteresse2;
    private Character stLucroReal;
    private String idNatLancamentoAliqConvenio;
    private String idNatLancamentoTACEmpresa;
    private String idNatLancamentoTACConvenio;
    private String dsCampoGenerico;
    private Character stEnvioBoletoAutomatico;
    private Character stEnvioDocumentCenter;
    private Character stAdministracaoFederal;
    private String idCidadeNaturalidade;
    private String nrOrgaoClasse;
    @Basic(optional = false)
    @Lob
    private byte[] versaoRegistro;
    private Character tpRegimeEspecialTributacao;
    private String idImagem;
    private String idCNAE;

    public PessoaComplementar() {
    }

    public PessoaComplementar(String idPessoa) {
        this.idPessoa = idPessoa;
    }

    public PessoaComplementar(String idPessoa, byte[] versaoRegistro) {
        this.idPessoa = idPessoa;
        this.versaoRegistro = versaoRegistro;
    }

    public String getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(String idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getDsRamoAtividade() {
        return dsRamoAtividade;
    }

    public void setDsRamoAtividade(String dsRamoAtividade) {
        this.dsRamoAtividade = dsRamoAtividade;
    }

    public Date getDtInicioAtividade() {
        return dtInicioAtividade;
    }

    public void setDtInicioAtividade(Date dtInicioAtividade) {
        this.dtInicioAtividade = dtInicioAtividade;
    }

    public String getNrCarteiraIdentidade() {
        return nrCarteiraIdentidade;
    }

    public void setNrCarteiraIdentidade(String nrCarteiraIdentidade) {
        this.nrCarteiraIdentidade = nrCarteiraIdentidade;
    }

    public String getNmOrgaoExpedidor() {
        return nmOrgaoExpedidor;
    }

    public void setNmOrgaoExpedidor(String nmOrgaoExpedidor) {
        this.nmOrgaoExpedidor = nmOrgaoExpedidor;
    }

    public Character getTpSexo() {
        return tpSexo;
    }

    public void setTpSexo(Character tpSexo) {
        this.tpSexo = tpSexo;
    }

    public String getIdUFNaturalidade() {
        return idUFNaturalidade;
    }

    public void setIdUFNaturalidade(String idUFNaturalidade) {
        this.idUFNaturalidade = idUFNaturalidade;
    }

    public String getDsNacionalidade() {
        return dsNacionalidade;
    }

    public void setDsNacionalidade(String dsNacionalidade) {
        this.dsNacionalidade = dsNacionalidade;
    }

    public String getDsObservacao() {
        return dsObservacao;
    }

    public void setDsObservacao(String dsObservacao) {
        this.dsObservacao = dsObservacao;
    }

    public String getDsProfissao() {
        return dsProfissao;
    }

    public void setDsProfissao(String dsProfissao) {
        this.dsProfissao = dsProfissao;
    }

    public String getNmPai() {
        return nmPai;
    }

    public void setNmPai(String nmPai) {
        this.nmPai = nmPai;
    }

    public String getNmMae() {
        return nmMae;
    }

    public void setNmMae(String nmMae) {
        this.nmMae = nmMae;
    }

    public Character getTpEstadoCivil() {
        return tpEstadoCivil;
    }

    public void setTpEstadoCivil(Character tpEstadoCivil) {
        this.tpEstadoCivil = tpEstadoCivil;
    }

    public String getNrCTPS() {
        return nrCTPS;
    }

    public void setNrCTPS(String nrCTPS) {
        this.nrCTPS = nrCTPS;
    }

    public String getNrRegJuntaComercial() {
        return nrRegJuntaComercial;
    }

    public void setNrRegJuntaComercial(String nrRegJuntaComercial) {
        this.nrRegJuntaComercial = nrRegJuntaComercial;
    }

    public String getNrRegCivil() {
        return nrRegCivil;
    }

    public void setNrRegCivil(String nrRegCivil) {
        this.nrRegCivil = nrRegCivil;
    }

    public Double getVlCapitalRegistrado() {
        return vlCapitalRegistrado;
    }

    public void setVlCapitalRegistrado(Double vlCapitalRegistrado) {
        this.vlCapitalRegistrado = vlCapitalRegistrado;
    }

    public Double getVlCapitalAtual() {
        return vlCapitalAtual;
    }

    public void setVlCapitalAtual(Double vlCapitalAtual) {
        this.vlCapitalAtual = vlCapitalAtual;
    }

    public Double getVlCapitalGiro() {
        return vlCapitalGiro;
    }

    public void setVlCapitalGiro(Double vlCapitalGiro) {
        this.vlCapitalGiro = vlCapitalGiro;
    }

    public Double getVlEstoque() {
        return vlEstoque;
    }

    public void setVlEstoque(Double vlEstoque) {
        this.vlEstoque = vlEstoque;
    }

    public Double getVlFaturamentoAnual() {
        return vlFaturamentoAnual;
    }

    public void setVlFaturamentoAnual(Double vlFaturamentoAnual) {
        this.vlFaturamentoAnual = vlFaturamentoAnual;
    }

    public Integer getNrFuncionarios() {
        return nrFuncionarios;
    }

    public void setNrFuncionarios(Integer nrFuncionarios) {
        this.nrFuncionarios = nrFuncionarios;
    }

    public String getDsOutrosDocumentos() {
        return dsOutrosDocumentos;
    }

    public void setDsOutrosDocumentos(String dsOutrosDocumentos) {
        this.dsOutrosDocumentos = dsOutrosDocumentos;
    }

    public String getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(String idAgencia) {
        this.idAgencia = idAgencia;
    }

    public String getNrConta() {
        return nrConta;
    }

    public void setNrConta(String nrConta) {
        this.nrConta = nrConta;
    }

    public String getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(String idBanco) {
        this.idBanco = idBanco;
    }

    public String getNrAgencia() {
        return nrAgencia;
    }

    public void setNrAgencia(String nrAgencia) {
        this.nrAgencia = nrAgencia;
    }

    public Double getVlLimiteCredito() {
        return vlLimiteCredito;
    }

    public void setVlLimiteCredito(Double vlLimiteCredito) {
        this.vlLimiteCredito = vlLimiteCredito;
    }

    public String getNrPIS() {
        return nrPIS;
    }

    public void setNrPIS(String nrPIS) {
        this.nrPIS = nrPIS;
    }

    public Character getTpEstabelecimento() {
        return tpEstabelecimento;
    }

    public void setTpEstabelecimento(Character tpEstabelecimento) {
        this.tpEstabelecimento = tpEstabelecimento;
    }

    public Character getStTributosContribuicoes() {
        return stTributosContribuicoes;
    }

    public void setStTributosContribuicoes(Character stTributosContribuicoes) {
        this.stTributosContribuicoes = stTributosContribuicoes;
    }

    public Integer getNrDiasPrazoMedio() {
        return nrDiasPrazoMedio;
    }

    public void setNrDiasPrazoMedio(Integer nrDiasPrazoMedio) {
        this.nrDiasPrazoMedio = nrDiasPrazoMedio;
    }

    public Integer getNrSequencia() {
        return nrSequencia;
    }

    public void setNrSequencia(Integer nrSequencia) {
        this.nrSequencia = nrSequencia;
    }

    public Integer getCdEmpresa() {
        return cdEmpresa;
    }

    public void setCdEmpresa(Integer cdEmpresa) {
        this.cdEmpresa = cdEmpresa;
    }

    public Character getTpClassificacaoABC() {
        return tpClassificacaoABC;
    }

    public void setTpClassificacaoABC(Character tpClassificacaoABC) {
        this.tpClassificacaoABC = tpClassificacaoABC;
    }

    public Date getDtClassificacaoABC() {
        return dtClassificacaoABC;
    }

    public void setDtClassificacaoABC(Date dtClassificacaoABC) {
        this.dtClassificacaoABC = dtClassificacaoABC;
    }

    public Integer getNrRanking() {
        return nrRanking;
    }

    public void setNrRanking(Integer nrRanking) {
        this.nrRanking = nrRanking;
    }

    public Date getDtRecebimento() {
        return dtRecebimento;
    }

    public void setDtRecebimento(Date dtRecebimento) {
        this.dtRecebimento = dtRecebimento;
    }

    public String getDsInteresse() {
        return dsInteresse;
    }

    public void setDsInteresse(String dsInteresse) {
        this.dsInteresse = dsInteresse;
    }

    public String getDsCidadeInteresse() {
        return dsCidadeInteresse;
    }

    public void setDsCidadeInteresse(String dsCidadeInteresse) {
        this.dsCidadeInteresse = dsCidadeInteresse;
    }

    public Date getDtUltimaAlteracao() {
        return dtUltimaAlteracao;
    }

    public void setDtUltimaAlteracao(Date dtUltimaAlteracao) {
        this.dtUltimaAlteracao = dtUltimaAlteracao;
    }

    public String getIdAgenciaCobranca() {
        return idAgenciaCobranca;
    }

    public void setIdAgenciaCobranca(String idAgenciaCobranca) {
        this.idAgenciaCobranca = idAgenciaCobranca;
    }

    public String getIdBancoCobranca() {
        return idBancoCobranca;
    }

    public void setIdBancoCobranca(String idBancoCobranca) {
        this.idBancoCobranca = idBancoCobranca;
    }

    public Double getVlLimiteCreditoParcela() {
        return vlLimiteCreditoParcela;
    }

    public void setVlLimiteCreditoParcela(Double vlLimiteCreditoParcela) {
        this.vlLimiteCreditoParcela = vlLimiteCreditoParcela;
    }

    public Double getAlIRRF() {
        return alIRRF;
    }

    public void setAlIRRF(Double alIRRF) {
        this.alIRRF = alIRRF;
    }

    public Character getStPrestadoraServico() {
        return stPrestadoraServico;
    }

    public void setStPrestadoraServico(Character stPrestadoraServico) {
        this.stPrestadoraServico = stPrestadoraServico;
    }

    public Character getStTributosContribQualquerValor() {
        return stTributosContribQualquerValor;
    }

    public void setStTributosContribQualquerValor(Character stTributosContribQualquerValor) {
        this.stTributosContribQualquerValor = stTributosContribQualquerValor;
    }

    public Character getStCobraTaxaBancaria() {
        return stCobraTaxaBancaria;
    }

    public void setStCobraTaxaBancaria(Character stCobraTaxaBancaria) {
        this.stCobraTaxaBancaria = stCobraTaxaBancaria;
    }

    public Character getStMicroEmpresa() {
        return stMicroEmpresa;
    }

    public void setStMicroEmpresa(Character stMicroEmpresa) {
        this.stMicroEmpresa = stMicroEmpresa;
    }

    public String getDsCidadeInteresse2() {
        return dsCidadeInteresse2;
    }

    public void setDsCidadeInteresse2(String dsCidadeInteresse2) {
        this.dsCidadeInteresse2 = dsCidadeInteresse2;
    }

    public String getDsInteresse2() {
        return dsInteresse2;
    }

    public void setDsInteresse2(String dsInteresse2) {
        this.dsInteresse2 = dsInteresse2;
    }

    public Character getStLucroReal() {
        return stLucroReal;
    }

    public void setStLucroReal(Character stLucroReal) {
        this.stLucroReal = stLucroReal;
    }

    public String getIdNatLancamentoAliqConvenio() {
        return idNatLancamentoAliqConvenio;
    }

    public void setIdNatLancamentoAliqConvenio(String idNatLancamentoAliqConvenio) {
        this.idNatLancamentoAliqConvenio = idNatLancamentoAliqConvenio;
    }

    public String getIdNatLancamentoTACEmpresa() {
        return idNatLancamentoTACEmpresa;
    }

    public void setIdNatLancamentoTACEmpresa(String idNatLancamentoTACEmpresa) {
        this.idNatLancamentoTACEmpresa = idNatLancamentoTACEmpresa;
    }

    public String getIdNatLancamentoTACConvenio() {
        return idNatLancamentoTACConvenio;
    }

    public void setIdNatLancamentoTACConvenio(String idNatLancamentoTACConvenio) {
        this.idNatLancamentoTACConvenio = idNatLancamentoTACConvenio;
    }

    public String getDsCampoGenerico() {
        return dsCampoGenerico;
    }

    public void setDsCampoGenerico(String dsCampoGenerico) {
        this.dsCampoGenerico = dsCampoGenerico;
    }

    public Character getStEnvioBoletoAutomatico() {
        return stEnvioBoletoAutomatico;
    }

    public void setStEnvioBoletoAutomatico(Character stEnvioBoletoAutomatico) {
        this.stEnvioBoletoAutomatico = stEnvioBoletoAutomatico;
    }

    public Character getStEnvioDocumentCenter() {
        return stEnvioDocumentCenter;
    }

    public void setStEnvioDocumentCenter(Character stEnvioDocumentCenter) {
        this.stEnvioDocumentCenter = stEnvioDocumentCenter;
    }

    public Character getStAdministracaoFederal() {
        return stAdministracaoFederal;
    }

    public void setStAdministracaoFederal(Character stAdministracaoFederal) {
        this.stAdministracaoFederal = stAdministracaoFederal;
    }

    public String getIdCidadeNaturalidade() {
        return idCidadeNaturalidade;
    }

    public void setIdCidadeNaturalidade(String idCidadeNaturalidade) {
        this.idCidadeNaturalidade = idCidadeNaturalidade;
    }

    public String getNrOrgaoClasse() {
        return nrOrgaoClasse;
    }

    public void setNrOrgaoClasse(String nrOrgaoClasse) {
        this.nrOrgaoClasse = nrOrgaoClasse;
    }

    public byte[] getVersaoRegistro() {
        return versaoRegistro;
    }

    public void setVersaoRegistro(byte[] versaoRegistro) {
        this.versaoRegistro = versaoRegistro;
    }

    public Character getTpRegimeEspecialTributacao() {
        return tpRegimeEspecialTributacao;
    }

    public void setTpRegimeEspecialTributacao(Character tpRegimeEspecialTributacao) {
        this.tpRegimeEspecialTributacao = tpRegimeEspecialTributacao;
    }

    public String getIdImagem() {
        return idImagem;
    }

    public void setIdImagem(String idImagem) {
        this.idImagem = idImagem;
    }

    public String getIdCNAE() {
        return idCNAE;
    }

    public void setIdCNAE(String idCNAE) {
        this.idCNAE = idCNAE;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPessoa != null ? idPessoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PessoaComplementar)) {
            return false;
        }
        PessoaComplementar other = (PessoaComplementar) object;
        if ((this.idPessoa == null && other.idPessoa != null) || (this.idPessoa != null && !this.idPessoa.equals(other.idPessoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.nelsys.mobileeasy.commons.entity.dbo.PessoaComplementar[ idPessoa=" + idPessoa + " ]";
    }
    
}
