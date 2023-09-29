package dwbe.museu_antigo.model;

public class Setor {
    private int id;
    private String tema;
    private int num_sala;
    private int qtde_pecas;
    private Funcionario responsavel;

    public Setor(int id, String tema, int num_sala, int qtde_pecas, Funcionario responsavel) {
        this.id = id;
        this.tema = tema;
        this.num_sala = num_sala;
        this.qtde_pecas = qtde_pecas;
        this.responsavel = responsavel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getNum_sala() {
        return num_sala;
    }

    public void setNum_sala(int num_sala) {
        this.num_sala = num_sala;
    }

    public int getQtde_pecas() {
        return qtde_pecas;
    }

    public void setQtde_pecas(int qtde_pecas) {
        this.qtde_pecas = qtde_pecas;
    }

    public Funcionario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Funcionario responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return "Setor{" +
                "id=" + id +
                ", tema='" + tema + '\'' +
                ", num_sala=" + num_sala +
                ", qtde_pecas=" + qtde_pecas +
                ", responsavel=" + responsavel +
                '}';
    }
}
