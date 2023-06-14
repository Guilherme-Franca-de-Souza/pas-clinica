package clinica;

import java.util.Map;

public class TabelaProcedimentos {
	private Map<Procedimento, Double> procedimentos;
	
	public TabelaProcedimentos() {
		
	}

	public Map<Procedimento, Double> getProcedimentos() {
		return procedimentos;
	}

	public void setProcedimentos(Map<Procedimento, Double> procedimentos) {
		this.procedimentos = procedimentos;
	}
}
