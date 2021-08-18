package br.com.visitte.visitte.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Cracha {

    
    @Column(name = "COD_CRACHA")
    private long id;
    @Column(name = "NOME_COMPLETO")
    private String nomeCompleto;
    @Column(name = "TELEFONE")
    private String telefone;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "RG")
    private String rg;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "ATIVO")
    private String ativo;
    @Column(name = "PESSOA_A_VISITAR")
    private String pessoaAVisitar;
    @Column(name = "EMPRESA_A_VISITAR")
    private String empresaAVisitar;
    @Column(name = "COD_EMPRESA_PERTENCENTE")
    private String codEmpresaPertencente;
    @Column(name = "COD_EMPRESA_A_VISITAR")
    private String codEmpresaAVisitar;
    @Column(name = "EMPRESA_PERTENCENTE")
    private String empresaPertencente;

    public Cracha() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getPessoaAVisitar() {
        return pessoaAVisitar;
    }

    public void setPessoaAVisitar(String pessoaAVisitar) {
        this.pessoaAVisitar = pessoaAVisitar;
    }

    public String getEmpresaAVisitar() {
        return empresaAVisitar;
    }

    public void setEmpresaAVisitar(String empresaAVisitar) {
        this.empresaAVisitar = empresaAVisitar;
    }

    public String getCodEmpresaPertencente() {
        return codEmpresaPertencente;
    }

    public void setCodEmpresaPertencente(String codEmpresaPertencente) {
        this.codEmpresaPertencente = codEmpresaPertencente;
    }

    public String getCodEmpresaAVisitar() {
        return codEmpresaAVisitar;
    }

    public void setCodEmpresaAVisitar(String codEmpresaAVisitar) {
        this.codEmpresaAVisitar = codEmpresaAVisitar;
    }

    public String getEmpresaPertencente() {
        return empresaPertencente;
    }

    public void setEmpresaPertencente(String empresaPertencente) {
        this.empresaPertencente = empresaPertencente;
    }

    @Override
    public String toString() {
        return "Cracha{" +
                "id=" + id +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", rg='" + rg + '\'' +
                ", cpf='" + cpf + '\'' +
                ", ativo='" + ativo + '\'' +
                ", pessoaAVisitar='" + pessoaAVisitar + '\'' +
                ", empresaAVisitar='" + empresaAVisitar + '\'' +
                ", codEmpresaPertencente='" + codEmpresaPertencente + '\'' +
                ", codEmpresaAVisitar='" + codEmpresaAVisitar + '\'' +
                ", empresaPertencente='" + empresaPertencente + '\'' +
                '}';
    }
}
