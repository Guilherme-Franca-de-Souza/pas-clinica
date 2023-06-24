package clinica;

import java.util.ArrayList;

public class Clinica {
	
	private ArrayList<Medico> medicos = new ArrayList<Medico>();
	private ArrayList<Consultorio> consultorios = new ArrayList<Consultorio>();
	private TabelaEspecialidades tabela_especialidades;
	
	public Clinica() {
		
	}
	
	public ArrayList<Medico> getMedicos() {
		return medicos;
	}

	public void setMedicos(ArrayList<Medico> medicos) {
		this.medicos = medicos;
	}

	public ArrayList<Consultorio> getConsultorios() {
		return consultorios;
	}

	public void setConsultorios(ArrayList<Consultorio> consultorios) {
		this.consultorios = consultorios;
	}

	public TabelaEspecialidades getTabela_especialidades() {
		return tabela_especialidades;
	}

	public void setTabela_especialidades(TabelaEspecialidades tabela_especialidades) {
		this.tabela_especialidades = tabela_especialidades;
	}
	
	public void RealizarAtendimento(Paciente paciente) {
		System.out.println("clinica realizando atendimento do paciente" + paciente.getNome());
	}
	
	public void FazerAgendamento(Paciente paciente, Consultorio consultorio, String especialidade) {
		System.out.println("clinica gerando agendamento para o paciente" + paciente.getNome());
	}
	

}
