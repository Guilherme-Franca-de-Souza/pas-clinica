package clinica;

import java.util.List;
import java.util.Map;
import java.lang.reflect.Method;
import java.util.HashMap;

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
		
	public void CancelarConsulta(int id) {
		((Consulta) this.bd.select(Consulta.class, id)).CancelarConsulta();
	}
	
	public boolean VerificaSeClinicaAtendeEspecialidade(String especialidade) {
		Map<String, Double> especialidades = ((TabelaEspecialidades) bd.selectIndex(TabelaEspecialidades.class, 0)).getEspecialidades();
		for (String chave : especialidades.keySet()) {
			if (especialidade.equals(chave)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean VerificaSeClinicaAtendePlano(String planoNome) {
		List planos = bd.all(Plano.class);
        for (Object plano : planos) {
        	System.out.println(  ((Plano) plano).getNome() );
        	if (((Plano) plano).getNome().equals(planoNome)) {
        		return true;
        	}
        }
        return false;
	}
	
	public boolean GerarFatura(Consulta consulta) {
		return true;
	}
	
	public boolean VerificaSePlanoAtendeEspecialidade(Plano plano, String especialidade) {
		Map<String, Double> especialidades = plano.getTabela_especialidades().getEspecialidades();
		for (String chave : especialidades.keySet()) {
			if (especialidade.equals(chave)) {
				return true;
			}
		}
		return false;
	}
	
}
