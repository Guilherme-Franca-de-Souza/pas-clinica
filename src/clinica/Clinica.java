package clinica;

import java.util.ArrayList;

public class Clinica {
	
	private ArrayList<Medico> medicos = new ArrayList<Medico>();
	private ArrayList<Consultorio> consultorios = new ArrayList<Consultorio>();
	private TabelaProcedimentos tabela_procedimentos;
	
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

	public TabelaProcedimentos getTabela_procedimentos() {
		return tabela_procedimentos;
	}

	public void setTabela_procedimentos(TabelaProcedimentos tabela_procedimentos) {
		this.tabela_procedimentos = tabela_procedimentos;
	}
	
	public void RealizarAtendimento(Paciente paciente) {
		System.out.println("clinica realizando atendimento do paciente" + paciente.getNome());
	}
	
	public void FazerAgendamento(Paciente paciente, Consultorio consultorio, Procedimento procedimento) {
		System.out.println("clinica gerando agendamento para o paciente" + paciente.getNome());
	}
	

}
