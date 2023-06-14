package clinica;

public abstract class Consulta {
	
	private int id;
	private Fatura fatura;
	private Paciente paciente;
	private Consultorio consultorio;
	private Medico medico;
	private String dia;
	private String intervalo;
	
	public Consulta(int id, String dia, String intervalo, Medico medico) {
		this.id = id;
		this.dia = dia;
		this.intervalo = intervalo;
		this.medico = medico;
	}
	
	public abstract void CancelarConsulta();
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Fatura getFatura() {
		return fatura;
	}
	
	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Consultorio getConsultorio() {
		return consultorio;
	}
	public void setConsultorio(Consultorio consultorio) {
		this.consultorio = consultorio;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getIntervalo() {
		return intervalo;
	}
	public void setIntervalo(String intervalo) {
		this.intervalo = intervalo;
	}
}
