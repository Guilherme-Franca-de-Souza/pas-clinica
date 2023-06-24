package clinica;

public class Plano {
	
	private String nome;
	private TabelaEspecialidades tabela_especialidades;
	private int cobertura;
	
	public Plano(String nome, int cobertura) {
		this.nome = nome;
		this.cobertura = cobertura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TabelaEspecialidades getTabela_especialidades() {
		return tabela_especialidades;
	}

	public void setTabela_especialidades(TabelaEspecialidades tabela_especialidades) {
		this.tabela_especialidades = tabela_especialidades;
	}

	public int getCobertura() {
		return cobertura;
	}

	public void setCobertura(int cobertura) {
		this.cobertura = cobertura;
	}

}
