import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Tratamento {
    Date dataInicialTratamento;
    Date dataFinalTratamento;
    Animal animal;

    static List<Tratamento> tratamentos = new ArrayList<>();

    int registrarTratamento(Date dataInicial, Date dataFinal, Animal animal) {
        this.dataInicialTratamento = dataInicial;
        this.dataFinalTratamento = dataFinal;
        this.animal = animal;
        tratamentos.add(this);
        System.out.println("Tratamento registrado com sucesso!");
        return 1; 
    }

    String consultarTratamento(Date dataInicial) {
        for (Tratamento tratamento : tratamentos) {
            if (tratamento.dataInicialTratamento.equals(dataInicial)) {
                return "Data Inicial: " + tratamento.dataInicialTratamento + ", Data Final: " + tratamento.dataFinalTratamento;
            }
        }
        return "Tratamento não encontrado";
    }

    String listarTratamentos() {
        StringBuilder listaTratamentos = new StringBuilder();
        for (Tratamento tratamento : tratamentos) {
            listaTratamentos.append("Data Inicial: ").append(tratamento.dataInicialTratamento).append(", Data Final: ").append(tratamento.dataFinalTratamento).append("\n");
        }
        return listaTratamentos.toString();
    }
}