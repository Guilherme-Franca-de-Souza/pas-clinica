package clinica;

import java.util.Arrays;

public class Seeder {
	
	public Seeder() {
		
	}
	
	public void seed() {
		BancoDeDados db = BancoDeDados.getInstance();
		
		// Cria as tabelas
		db.createTable(Medico.class); 
		db.createTable(Clinica.class); // Tem -> TabelaProcedimentos
		db.createTable(Consultorio.class);
		db.createTable(Paciente.class); // Tem -> Resonsável, Fatura
		db.createTable(Plano.class); // Tem -> TabelaProcedimentos
		db.createTable(TabelaEspecialidades.class);
		
		
		
		TabelaEspecialidades te = new TabelaEspecialidades();
		te.insertEspecialidade("Cardiologia", 450.00);
		te.insertEspecialidade("Ortopedia", 199.50);
		te.insertEspecialidade("Oftalmologia", 270.90);
		te.insertEspecialidade("Dermatologia", 360.90);
		db.insert(te);
		
		//Preenche as tabelas
		db.insert(new Medico( "Dr. Arlindo", Arrays.asList("Cardiologista")));
		db.insert(new Medico( "Dr. Bonifácio", Arrays.asList("Ortopedista")));
		db.insert(new Medico( "Dr. Carlos", Arrays.asList("Oftalmologia", "Dermatologia")));
		

		db.insert(new Consultorio(1));
		db.insert(new Consultorio(2));
		db.insert(new Consultorio(3));
		
		Plano bradesco = new Plano("Bradesco", 50);
		TabelaEspecialidades teb = new TabelaEspecialidades();
		teb.insertEspecialidade("Cardiologia", 250.00);
		teb.insertEspecialidade("Ortopedia", 99.50);
		teb.insertEspecialidade("Oftalmologia", 70.90);
		teb.insertEspecialidade("Dermatologia", 160.90);
		bradesco.setTabela_especialidades(teb);
		
		Plano unimed = new Plano("Unimed", 100);
		TabelaEspecialidades teu = new TabelaEspecialidades();
		teu.insertEspecialidade("Cardiologia", 450.00);
		teu.insertEspecialidade("Ortopedia", 199.50);
		teu.insertEspecialidade("Oftalmologia", 270.90);
		teu.insertEspecialidade("Dermatologia", 360.90);
		unimed.setTabela_especialidades(teu);
		
		Plano amil = new Plano("Amil", 0);
		TabelaEspecialidades tea = new TabelaEspecialidades();
		tea.insertEspecialidade("Cardiologia", 550.00);
		tea.insertEspecialidade("Ortopedia", 299.50);
		tea.insertEspecialidade("Oftalmologia", 370.90);
		tea.insertEspecialidade("Dermatologia", 460.90);
		amil.setTabela_especialidades(tea);
		
		Plano notredame = new Plano("Notredame", 66);
		TabelaEspecialidades ten = new TabelaEspecialidades();
		ten.insertEspecialidade("Cardiologia", 450.00);
		ten.insertEspecialidade("Ortopedia", 199.50);
		ten.insertEspecialidade("Oftalmologia", 270.90);
		ten.insertEspecialidade("Dermatologia", 360.90);
		notredame.setTabela_especialidades(ten);
		
		// db.insert(new Plano("Bradesco"));
		
		// db.insert(new Plano("Unimed"));
		
		//db.insert(new Plano("Amil"));
		
		//db.insert(new Plano("Notredame"));
		
	}

}
