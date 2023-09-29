package dwbe.museu_antigo.model;

import java.util.Date;

public class Visitacao {
    private int id;
    private Date data_agendada;
    private int nota_satisfacao;
    private Funcionario guia;
    private Cliente visitante;

    public Visitacao(int id, Date data_agendada, int nota_satisfacao, Funcionario guia, Cliente visitante) {
        this.id = id;
        this.data_agendada = data_agendada;
        this.nota_satisfacao = nota_satisfacao;
        this.guia = guia;
        this.visitante = visitante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData_agendada() {
        return data_agendada;
    }

    public void setData_agendada(Date data_agendada) {
        this.data_agendada = data_agendada;
    }

    public int getNota_satisfacao() {
        return nota_satisfacao;
    }

    public void setNota_satisfacao(int nota_satisfacao) {
        this.nota_satisfacao = nota_satisfacao;
    }

    public Funcionario getGuia() {
        return guia;
    }

    public void setGuia(Funcionario guia) {
        this.guia = guia;
    }

    public Cliente getVisitante() {
        return visitante;
    }

    public void setVisitante(Cliente visitante) {
        this.visitante = visitante;
    }

    @Override
    public String toString() {
        return "Visitacao{" +
                "id=" + id +
                ", data_agendada=" + data_agendada +
                ", nota_satisfacao=" + nota_satisfacao +
                ", guia=" + guia +
                ", visitante=" + visitante +
                '}';
    }
}
