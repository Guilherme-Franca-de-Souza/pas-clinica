package clinica;

public class Responsavel {
	
	private int id;
	private String nome;
	private int RG;
	private Paciente paciente;
	
	public Responsavel () {
		Id gerador = Id.getInstance();
        this.id = gerador.gerarId("");	
	}
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRG() {
		return RG;
	}

	public void setRG(int rG) {
		RG = rG;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}



}
