package clinica;

public class ClinicaFacade {
	
	private BancoDeDados bd;
	
	private Paciente paciente;
	
	private Agenda agenda;
	
	public ClinicaFacade() {
		this.agenda = Agenda.getInstance();
		this.bd = BancoDeDados.getInstance();
		
	}
	
	public void RegistrarPaciente(int id, String nome) {
		this.paciente = new Paciente(id, nome);
		this.bd.addPaciente(paciente);
	}
	
	public void CancelarConsulta(int id) {
		this.bd.selectConsulta(id).CancelarConsulta();
	}

	public void AgendarConsulta(int id, Procedimento procedimento, String modo, String dia, String intervalo, Medico medico) {
			if (verificarPlanoSaude(paciente, procedimento)) {
				System.out.println("Agendamento do paciente: " + this.bd.selectPaciente(id).getNome());
				this.agenda.marcarConsulta(modo, dia, intervalo, medico);
			} else {
				System.out.println("Plano de saúde não aceito para o procedimento solicitado.");
			}
	}
		
	private boolean verificarPlanoSaude(Paciente paciente, Procedimento procedimento) {
		return true; 
	}
}
