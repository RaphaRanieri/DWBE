package dwbe.museu_antigo.model;

import java.util.Date;

public class Peca {
    private int id;
    private String nome;
    private String descricao;
    private Date data_chegada;
    private Date data_ultima_manutencao;
    private Setor setor;

    public Peca(int id, String nome, String descricao, Date data_chegada, Date data_ultima_manutencao, Setor setor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.data_chegada = data_chegada;
        this.data_ultima_manutencao = data_ultima_manutencao;
        this.setor = setor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_chegada() {
        return data_chegada;
    }

    public void setData_chegada(Date data_chegada) {
        this.data_chegada = data_chegada;
    }

    public Date getData_ultima_manutencao() {
        return data_ultima_manutencao;
    }

    public void setData_ultima_manutencao(Date data_ultima_manutencao) {
        this.data_ultima_manutencao = data_ultima_manutencao;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Peca{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data_chegada=" + data_chegada +
                ", data_ultima_manutencao=" + data_ultima_manutencao +
                ", setor=" + setor +
                '}';
    }
}
