import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Consulta {
    Tratamento tratamento;
    Date dataConsulta;
    List<Exame> exames;

    static List<Consulta> consultas = new ArrayList<>();

    int registrarConsulta(Tratamento tratamento, Date dataConsulta, List<Exame> exames) {
        this.tratamento = tratamento;
        this.dataConsulta = dataConsulta;
        this.exames = exames;
        consultas.add(this);
        System.out.println("Consulta registrada com sucesso!");
        return 1; 
    }

    Consulta verificarConsulta(Date dataConsulta) {
        for (Consulta consulta : consultas) {
            if (consulta.dataConsulta.equals(dataConsulta)) {
                return consulta;
            }
        }
        return null;
    }

    String listarConsultas() {
        StringBuilder listaConsultas = new StringBuilder();
        for (Consulta consulta : consultas) {
            listaConsultas.append("Data da Consulta: ").append(consulta.dataConsulta).append("\n");
        }
        return listaConsultas.toString();
    }
}