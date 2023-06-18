package clinica;

public class Consultorio {
	
	private int numero;
	private Agenda agenda;
	
	public Consultorio (int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

}
