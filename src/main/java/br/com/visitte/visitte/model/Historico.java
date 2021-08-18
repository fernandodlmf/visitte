package br.com.visitte.visitte.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Historico {

    @Column(name = "COD_HISTORICO")
    private long codHistorico;

    @Column(name = "COD_AGENTE")
    private long codAgente;

    @Column(name = "COD_ATIVIDADE")
    private long codAtividade;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "COD_PRODUTO")
    private long codProduto;

    @Column(name = "MOMENTO")
    private String momento;

    public Historico() {

    }

    public Historico(long codHistorico, long codAgente, long codAtividade, String descricao,
                     long codProduto, String momento) {
        this.codHistorico = codHistorico;
        this.codAgente = codAgente;
        this.codAtividade = codAtividade;
        this.descricao = descricao;
        this.codProduto = codProduto;
        this.momento = momento;
    }

    public long getCodHistorico() {
        return codHistorico;
    }

    public void setCodHistorico(long codHistorico) {
        this.codHistorico = codHistorico;
    }

    public long getCodAgente() {
        return codAgente;
    }

    public void setCodAgente(long codAgente) {
        this.codAgente = codAgente;
    }

    public long getCodAtividade() {
        return codAtividade;
    }

    public void setCodAtividade(long codAtividade) {
        this.codAtividade = codAtividade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(long codProduto) {
        this.codProduto = codProduto;
    }

    public String getMomento() {
        return momento;
    }

    public void setMomento(String momento) {
        this.momento = momento;
    }

    @Override
    public String toString() {
        return "Historico{" +
                "codHistorico=" + codHistorico +
                ", codAgente=" + codAgente +
                ", codAtividade=" + codAtividade +
                ", descricao='" + descricao + '\'' +
                ", codProduto=" + codProduto +
                ", momento='" + momento + '\'' +
                '}';
    }
}
