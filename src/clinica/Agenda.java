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

    public boolean marcarConsulta(String modo, String dia, String intervalo, Medico medico) {
        if (!consultas.containsKey(dia)) {
            consultas.put(dia, new ArrayList<>());
        }

        List<Consulta> consultasDia = consultas.get(dia);
        for (Consulta consulta : consultasDia) {
            if (consulta.getIntervalo().equals(intervalo) && consulta.getMedico().equals(medico)) {
                System.out.println("Já existe uma consulta marcada com o mesmo médico neste intervalo de tempo. \n");
                return false;
            }
        }
        Consulta consulta = ConsultaFactory.getInstance().criarConsulta(modo, dia, intervalo, medico);
        consultasDia.add(consulta);
        this.bd.addConsulta(consulta);
        System.out.println("Consulta agendada com sucesso. \n");
        return true;
    }
}
