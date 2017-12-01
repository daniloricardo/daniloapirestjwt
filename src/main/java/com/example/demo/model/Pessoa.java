/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author Esmael
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Pessoa.findAll", query = "SELECT p FROM Pessoa p")})
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    private String idPessoa;
    private String cdChamada;
    private String tpPessoa;
    @Column(name = "CdCPF_CGC")
    private String cdCPFCGC;
    private String nmPessoa;
    private String nmCurto;
    private String nmSoundex;
    @Lob
    private byte[] versaoRegistro;

    //Compatibilidade com código Alterdata Importer existente
    @OneToMany
	@JoinColumn(name = "IdPessoa", referencedColumnName = "IdPessoa")
	private List<PessoaEnderecoTipoContato> tiposContatos;

	@OneToMany
	@JoinColumn(name = "IdPessoa", referencedColumnName = "IdPessoa")
	private List<PessoaEndereco> enderecos;

    public Pessoa() {
    }

    public Pessoa(String idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(String idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getCdChamada() {
        return cdChamada;
    }

    public void setCdChamada(String cdChamada) {
        this.cdChamada = cdChamada;
    }

    public String getTpPessoa() {
        return tpPessoa;
    }

    public void setTpPessoa(String tpPessoa) {
        this.tpPessoa = tpPessoa;
    }

    public String getCdCPFCGC() {
        return cdCPFCGC;
    }

    public void setCdCPFCGC(String cdCPFCGC) {
        this.cdCPFCGC = cdCPFCGC;
    }

    public String getNmPessoa() {
        return nmPessoa;
    }

    public void setNmPessoa(String nmPessoa) {
        this.nmPessoa = nmPessoa;
    }

    public String getNmCurto() {
        return nmCurto;
    }

    public void setNmCurto(String nmCurto) {
        this.nmCurto = nmCurto;
    }

    public String getNmSoundex() {
        return nmSoundex;
    }

    public void setNmSoundex(String nmSoundex) {
        this.nmSoundex = nmSoundex;
    }

    public byte[] getVersaoRegistro() {
        return versaoRegistro;
    }

    public void setVersaoRegistro(byte[] versaoRegistro) {
        this.versaoRegistro = versaoRegistro;
    }
    
    public List<PessoaEnderecoTipoContato> getTiposContatos() {
		return tiposContatos;
	}

	public void setTiposContatos(List<PessoaEnderecoTipoContato> tiposContatos) {
		this.tiposContatos = tiposContatos;
	}

	public List<PessoaEndereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<PessoaEndereco> enderecos) {
		this.enderecos = enderecos;
	}
	
	public PessoaEndereco getEnderecoPrincipal() {
		return enderecos.get(0);
	}

	public String getContatoNf() {
		
		for(PessoaEnderecoTipoContato tp : tiposContatos)
			if(tp.getPessoaEnderecoTipoContatoPK().getIdTipoContato().equals("0000000007"))
				return tp.getDsContato();
		
		
		return null;
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
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.idPessoa == null && other.idPessoa != null) || (this.idPessoa != null && !this.idPessoa.equals(other.idPessoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.nelsys.mobileeasy.commons.entity.dbo.Pessoa[ idPessoa=" + idPessoa + " ]";
    }
    
}
