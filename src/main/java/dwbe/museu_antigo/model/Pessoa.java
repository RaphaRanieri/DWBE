package dwbe.museu_antigo.model;

import java.util.Date;

public class Pessoa {
    private int id;
    private long cpf;
    private String nome;
    private Date data_nascimento;
    private String email;
    private long telefone;

    public Pessoa(int id, long cpf, String nome, Date data_nascimento, String email, long telefone) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.email = email;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", data_nascimento=" + data_nascimento +
                ", email='" + email + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
