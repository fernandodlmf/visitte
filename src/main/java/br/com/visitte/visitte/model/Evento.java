package br.com.visitte.visitte.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Evento {

    @Column(name = "COD_EVENTO")
    private long codEvento;

    @Column(name = "NOME_EVENTO")
    private String nomeEvento;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "EXECUTADO")
    private boolean executado;

    @Column(name = "MOMENTO")
    private String momento;

    @Column(name = "MOMENTO_EXECUCAO")
    private String momentoExecucao;

    @Column(name = "PARAMETROS")
    private String parametros;

    @Column(name = "COD_PEDIDO")
    private long codPedido;

    @Column(name = "QTD_TENTATIVAS")
    private int qtdTentativas;

    public Evento() {

    }

    public Evento(long codEvento, String nomeEvento, String descricao, boolean executado,
                  String momento, String momentoExecucao, String parametros, long codPedido, int qtdTentativas) {
        this.codEvento = codEvento;
        this.nomeEvento = nomeEvento;
        this.descricao = descricao;
        this.executado = executado;
        this.momento = momento;
        this.momentoExecucao = momentoExecucao;
        this.parametros = parametros;
        this.codPedido = codPedido;
        this.qtdTentativas = qtdTentativas;
    }

    public long getCodEvento() {
        return codEvento;
    }

    public void setCodEvento(long codEvento) {
        this.codEvento = codEvento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isExecutado() {
        return executado;
    }

    public void setExecutado(boolean executado) {
        this.executado = executado;
    }

    public String getMomento() {
        return momento;
    }

    public void setMomento(String momento) {
        this.momento = momento;
    }

    public String getMomentoExecucao() {
        return momentoExecucao;
    }

    public void setMomentoExecucao(String momentoExecucao) {
        this.momentoExecucao = momentoExecucao;
    }

    public String getParametros() {
        return parametros;
    }

    public void setParametros(String parametros) {
        this.parametros = parametros;
    }

    public long getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(long codPedido) {
        this.codPedido = codPedido;
    }

    public int getQtdTentativas() {
        return qtdTentativas;
    }

    public void setQtdTentativas(int qtdTentativas) {
        this.qtdTentativas = qtdTentativas;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "codEvento=" + codEvento +
                ", nomeEvento='" + nomeEvento + '\'' +
                ", descricao='" + descricao + '\'' +
                ", executado=" + executado +
                ", momento='" + momento + '\'' +
                ", momentoExecucao='" + momentoExecucao + '\'' +
                ", parametros='" + parametros + '\'' +
                ", codPedido=" + codPedido +
                ", qtdTentativas=" + qtdTentativas +
                '}';
    }
}
