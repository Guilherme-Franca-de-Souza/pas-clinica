package clinica;

public class Seeder {
	
	public Seeder() {
		
	}
	
	public void seed() {
		BancoDeDados db = BancoDeDados.getInstance();
		
		// Cria as tabelas
		db.createTable(Medico.class); 
		db.createTable(Clinica.class); // Tem -> TabelaProcedimentos
		db.createTable(Consultorio.class);
		db.createTable(Especialidade.class);
		db.createTable(Procedimento.class);
		db.createTable(Paciente.class); // Tem -> Resonsável, Fatura
		db.createTable(Plano.class); // Tem -> TabelaProcedimentos
		
		//Preenche as tabelas
		db.insert(new Medico( "Dr. Arlindo"));
		db.insert(new Medico( "Dr. Bonifácio"));
		db.insert(new Medico( "Dr. Carlos"));
		db.insert(new Medico( "Dr. Drauzio"));
		db.insert(new Medico( "Dr. Emanuel"));

		db.insert(new Consultorio( 1));
		db.insert(new Consultorio( 2));
		db.insert(new Consultorio( 3));
		db.insert(new Consultorio( 4));
		db.insert(new Consultorio( 5));
		
	}

}
