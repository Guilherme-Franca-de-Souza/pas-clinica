package clinica;

public class Teste {
	
	public static void main(String[] args) {
		
		ClinicaFacade clinicaFacade = new ClinicaFacade();
        
        Procedimento procedimento1 = new Procedimento("A");
        Procedimento procedimento2 = new Procedimento("B");
        Medico medico1 = new Medico("Dr. José");
        Medico medico2 = new Medico("Dr. João");
                
        clinicaFacade.RegistrarPaciente(11, "Antero");
        clinicaFacade.RegistrarPaciente(12, "Bruno");
        clinicaFacade.RegistrarPaciente(13, "Carlos");
        clinicaFacade.RegistrarPaciente(14, "Denilson");
        
        clinicaFacade.AgendarConsulta(11, procedimento1, "agendamento","08/06/2023", "09:00 - 10:00", medico1);
        clinicaFacade.AgendarConsulta(12, procedimento2, "demanda","08/06/2023", "09:00 - 10:00", medico2);
        clinicaFacade.AgendarConsulta(13, procedimento1, "demanda","08/06/2023", "10:00 - 11:00", medico1);
        clinicaFacade.AgendarConsulta(14, procedimento1, "agendamento","08/06/2023", "10:00 - 11:00", medico1);
        
        clinicaFacade.CancelarConsulta(3);
        clinicaFacade.CancelarConsulta(1);
        

    }

}
