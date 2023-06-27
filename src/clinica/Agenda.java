package clinica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Agenda {
    private Map<String, List<Consulta>> consultas;
    private BancoDeDados bd = BancoDeDados.getInstance();
    
    private static Agenda instancia = new Agenda();

    public Agenda() {
        this.consultas = new HashMap<>();
    }
    
    public static Agenda getInstance() {
        return instancia;
    }
    
    public boolean verificiarDisponibilidade(String dia, String intervalo, Medico medico) {
    	List<Consulta> consultasDia = consultas.get(dia);
 
    	if (!consultas.containsKey(dia)) {
            consultas.put(dia, new ArrayList<>());
            return true;
        }
    	
        for (Consulta consulta : consultasDia) {
            if (consulta.getIntervalo().equals(intervalo) && consulta.getMedico().equals(medico)) {
                return false;
            }
        }
        return true;
    }

    public void marcarConsulta(String dia, Consulta consulta) {
        if (!consultas.containsKey(dia)) {
            consultas.put(dia, new ArrayList<>());
        }
        List<Consulta> consultasDia = consultas.get(dia);
        consultasDia.add(consulta);
    }
}
