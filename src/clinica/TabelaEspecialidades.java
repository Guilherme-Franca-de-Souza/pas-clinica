package clinica;


import java.util.Map;

public class TabelaEspecialidades {
	
	private Map<String, Double> especialidades;
	
	public TabelaEspecialidades() {
		
	}

	public Map<String, Double> getEspecialidades() {
		return especialidades;
	}

	public void insertEspecialidade(String especialidade, Double valorEspecialidade) {
		this.especialidades.put(especialidade, valorEspecialidade);
	}

}
