package clinica;

public class Teste {
	
	public static void main(String[] args) {
		
		
		// TODO: LISTAR MÉDICOS DISPONÍVEIS PARA O PROCEDIMENTO ESCOLHIDO PELO PACIENTE
		
		BancoDeDados database = BancoDeDados.getInstance();
		
		database.createTable(Medico.class);
		database.createTable(Paciente.class);
		
		ClinicaFacade cFacade = new ClinicaFacade();
		
		cFacade.RegistrarPaciente("Jose");
		cFacade.MudaNomePaciente("Jose", "Joao"); 
		
		Object result = database.select(Paciente.class, "Joao"); // Chamada do método que retorna o objeto ou null

		if (result != null) {
	    	Paciente medicoCast = (Paciente) result;
	        String nome = medicoCast.getNome();
	        System.out.println(nome);
		} else {
		    System.out.println("falhou");
		}
		
		
		
		database.insert(new Medico("Dr. José"));
		
		
		database.createTable(Clinica.class);
		Clinica clinica = new Clinica();
		database.insert(clinica);
		
		
		Medico medico2 = (Medico) database.select(Medico.class, 0);
		System.out.println(medico2.getNome());

		
		
		result = database.select(Medico.class, "Dr. José"); // Chamada do método que retorna o objeto ou null

		if (result != null) {
	    	Medico medicoCast = (Medico) result;
	        String nome = medicoCast.getNome();
	        System.out.println(nome);
		} else {
		    System.out.println("falhou");
		}
		
		//Clinica clinica2 = (Clinica) database.getElementByName(Clinica.class, "Dr. José");
		//System.out.println(clinica2);
		
		
		//BancoDeDados.getInstance();
		
		//BancoDeDados bancoDeDados = BancoDeDados.getInstance();
		
		//Medico medico1 = new Medico("Dr. José");
		//Class<?> type = medico1.getClass();

        // Insert two elements into the lists
        //bancoDeDados.insertElementByType(Medico.class, medico1);
        //bancoDeDados.insertElementByType(Thetype2.class, new Thetype2(2, "B"));

        // Get the elements from the lists
        //Medico thetype1 = (Medico) bancoDeDados.getElementByTypeAndId(Medico.class, 0);
        //Thetype2 thetype2 = (Thetype2) bancoDeDados.getElementByTypeAndId(Thetype2.class, 1);

        // Print the elements
        //System.out.println(thetype1);
        //System.out.println(thetype2);
		
		
		//Medico medico1 = new Medico("Dr. José");
		//String string = "Hello, world!";
		//Class<?> type = medico1.getClass();
		//System.out.println(type);
		
		//ClinicaFacade clinicaFacade = new ClinicaFacade();
        
        //Procedimento procedimento1 = new Procedimento("A");
        //Procedimento procedimento2 = new Procedimento("B");
        //Medico medico1 = new Medico("Dr. José");
        //Medico medico2 = new Medico("Dr. João");
                
        //clinicaFacade.RegistrarPaciente(11, "Antero");
        //clinicaFacade.RegistrarPaciente(12, "Bruno");
        //clinicaFacade.RegistrarPaciente(13, "Carlos");
        //clinicaFacade.RegistrarPaciente(14, "Denilson");
        
        //clinicaFacade.AgendarConsulta(11, procedimento1, "agendamento","08/06/2023", "09:00 - 10:00", medico1);
        //clinicaFacade.AgendarConsulta(12, procedimento2, "demanda","08/06/2023", "09:00 - 10:00", medico2);
        //clinicaFacade.AgendarConsulta(13, procedimento1, "demanda","08/06/2023", "10:00 - 11:00", medico1);
        //clinicaFacade.AgendarConsulta(14, procedimento1, "agendamento","08/06/2023", "10:00 - 11:00", medico1);
        
        //clinicaFacade.CancelarConsulta(3);
        //clinicaFacade.CancelarConsulta(1);
        
    }

}
