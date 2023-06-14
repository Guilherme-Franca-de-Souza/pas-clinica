package clinica;

public class Plano {
	
	private String nome;
	private TabelaProcedimentos tabela_procedimentos;
	private int cobertura;
	
	public Plano() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TabelaProcedimentos getTabela_procedimentos() {
		return tabela_procedimentos;
	}

	public void setTabela_procedimentos(TabelaProcedimentos tabela_procedimentos) {
		this.tabela_procedimentos = tabela_procedimentos;
	}

	public int getCobertura() {
		return cobertura;
	}

	public void setCobertura(int cobertura) {
		this.cobertura = cobertura;
	}

}
