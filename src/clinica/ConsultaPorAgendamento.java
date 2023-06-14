package clinica;

public class ConsultaPorAgendamento extends Consulta{

	public ConsultaPorAgendamento(int id, String dia, String intervalo, Medico medico) {
		super(id, dia, intervalo, medico);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void CancelarConsulta() {
		System.out.println("Cancelando consulta por agendamento");
	}

}
