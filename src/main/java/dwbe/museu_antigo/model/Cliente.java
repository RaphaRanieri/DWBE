package dwbe.museu_antigo.model;

import java.sql.Date;

public class Cliente extends Pessoa {
    private Date data_cadastro;
    private String escolaridade;
    private String profissao;
    private String observacoes;

    public Cliente(int id, long cpf, String nome, Date data_nascimento, String email, long telefone, Date data_cadastro, String escolaridade, String profissao, String observacoes) {
        super(id, cpf, nome, data_nascimento, email, telefone);
        this.data_cadastro = data_cadastro;
        this.escolaridade = escolaridade;
        this.profissao = profissao;
        this.observacoes = observacoes;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + "Cliente{" +
                "data_cadastro=" + data_cadastro +
                ", escolaridade='" + escolaridade + '\'' +
                ", profissao='" + profissao + '\'' +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }
}
