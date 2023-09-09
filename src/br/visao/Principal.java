package br.visao;

import java.sql.Date;
import java.text.SimpleDateFormat;
import br.modelo.Cliente;
import br.modelo.Funcionario;
import br.modelo.Setor;
import br.modelo.Peca;
import br.modelo.Visitacao;

public class Principal {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Cliente cli1 = new Cliente(
                1,
                96206516008L,
                "Fulano",
                new Date( sdf.parse("1983-01-10").getTime() ),
                "fulano@cicla.no",
                3232321234L,
                new Date( sdf.parse("2023-06-05").getTime() ),
                "segundo grau",
                "desempregado",
                "cliente carente e enjoado"
        );
        cli1.setProfissao("espiao");
        System.out.println(cli1);
    }
}