package clinica;

import java.util.List;

public class Medico {
	private int id;
	private String nome;
	private int crm;
	private Consultorio consultorio;
	private List<String> especialidades;
	
	public Medico (String nome, List<String> especialidades) {
		Id gerador = Id.getInstance();
        this.id = gerador.gerarId("Medico");
		this.nome = nome;
		this.especialidades = especialidades;
	}
	
	
	
	public int getId() {
		return id;
	}


	public List<String> getEspecialidades() {
		return especialidades;
	}



	public void setEspecialidades(List<String> especialidades) {
		this.especialidades = especialidades;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome, List<String> especialidades) {
		this.nome = nome;
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public Consultorio getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(Consultorio consultorio) {
		this.consultorio = consultorio;
	}

	public List<String> getEspecialidade() {
		return this.especialidades;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidades.add(especialidade);
	}
}
