package dwbe.museu_antigo.model;

import java.sql.Date;

public class Funcionario extends Pessoa {
    private int id;
    private String cargo;
    private Date data_admissao;
    private Date data_demissao;
    private double salario;
    private Setor setor;

    public Funcionario(int id, long cpf, String nome, Date data_nascimento, String email, long telefone, String cargo, Date data_admissao, Date data_demissao, double salario, Setor setor) {
        super(id, cpf, nome, data_nascimento, email, telefone);
        this.cargo = cargo;
        this.data_admissao = data_admissao;
        this.data_demissao = data_demissao;
        this.salario = salario;
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getData_admissao() {
        return data_admissao;
    }

    public void setData_admissao(Date data_admissao) {
        this.data_admissao = data_admissao;
    }

    public Date getData_demissao() {
        return data_demissao;
    }

    public void setData_demissao(Date data_demissao) {
        this.data_demissao = data_demissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + "Funcionario{" +
                "id=" + id +
                ", cargo='" + cargo + '\'' +
                ", data_admissao=" + data_admissao +
                ", data_demissao=" + data_demissao +
                ", salario=" + salario +
                ", setor=" + setor +
                '}';
    }
}
