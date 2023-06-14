package clinica;

public class ConsultaFactory {
	private static ConsultaFactory instance = new ConsultaFactory();
	private Consulta consulta;
	private int count = 1;
	
	private ConsultaFactory() {
	}
	
	public static ConsultaFactory getInstance() {
		return instance;
	}
	
	public Consulta criarConsulta(String modo, String dia, String intervalo, Medico medico) {
		if (modo.equals("demanda"))
			this.consulta = new ConsultaPorDemanda(this.count, dia, intervalo, medico);	
		else if (modo.equals("agendamento"))
			this.consulta = new ConsultaPorAgendamento(this.count, dia, intervalo, medico);
		
		this.count++;
		return this.consulta;
	}
}
