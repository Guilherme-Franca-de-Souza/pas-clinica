package clinica;

public class ClinicaFacade {
	
	private BancoDeDados bd;
	
	private Paciente paciente;
	
	private Agenda agenda;
	
	public ClinicaFacade() {
		this.agenda = Agenda.getInstance();
		this.bd = BancoDeDados.getInstance();
		
	}
	
	public void RegistrarPaciente(String nome) {
		this.paciente = new Paciente(nome);
		this.bd.insert(paciente);
	}
	
	public void MudaNomePaciente(String nomeAtual, String novoNome) {
		((Paciente) this.bd.select(Paciente.class, nomeAtual)).setNome(novoNome); ;
	}
	
	public void CancelarConsulta(int id) {
		((Consulta) this.bd.select(Consulta.class, id)).CancelarConsulta();
	}

	public void AgendarConsulta(int id, Procedimento procedimento, String modo, String dia, String intervalo, Medico medico) {
			if (verificarPlanoSaude(paciente, procedimento)) {
				System.out.println("Agendamento do paciente: " + ((Paciente) this.bd.select(Paciente.class, id)).getNome());
				this.agenda.marcarConsulta(modo, dia, intervalo, medico);
			} else {
				System.out.println("Plano de saúde não aceito para o procedimento solicitado.");
			}
	}
		
	private boolean verificarPlanoSaude(Paciente paciente, Procedimento procedimento) {
		return true; 
	}
}
