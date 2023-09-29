package dwbe.museu_antigo.view;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import dwbe.museu_antigo.model.Cliente;
import dwbe.museu_antigo.model.Funcionario;
import dwbe.museu_antigo.model.Setor;
import dwbe.museu_antigo.model.Peca;
import dwbe.museu_antigo.model.Visitacao;
import java.sql.Date;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class MuseuAntigoApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MuseuAntigoApplication.class, args);

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
				"cliente"
		);
		cli1.setProfissao("espiao");
		System.out.println(cli1);
	}

}
