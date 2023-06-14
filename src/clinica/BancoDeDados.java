package clinica;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
	private List<Paciente> pacientes;
	private List<Consulta> consultas;
	
	private static BancoDeDados instancia = new BancoDeDados();
	
	public BancoDeDados() {
		this.pacientes = new ArrayList<Paciente>();
		this.consultas = new ArrayList<Consulta>();
	}
	
	public static BancoDeDados getInstance() {
        return instancia;
    }

	public void addConsulta(Consulta c) {
		this.consultas.add(c);
	}
	
	public Consulta selectConsulta(int id) {
		for (Consulta c : this.consultas) {
			if (c.getId() == id)
				return c;
		}
		return null;
	}
	
	public void addPaciente(Paciente p) {
		this.pacientes.add(p);
	}

	public Paciente selectPaciente(int id) {
		for (Paciente p : this.pacientes) {
			if (p.getId() == id)
				return p;
		}
		return null;
	}

}