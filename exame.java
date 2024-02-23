import java.util.ArrayList;
import java.util.List;

class Exame {
    Animal animal;
    String descricaoExame;

    static List<Exame> exames = new ArrayList<>();

    int registrarExame(Animal animal, String descricao) {
        this.animal = animal;
        this.descricaoExame = descricao;
        exames.add(this);
        System.out.println("Exame registrado com sucesso!");
        return 1; 
    }

    Exame consultarExame(String descricao) {
        for (Exame exame : exames) {
            if (exame.descricaoExame.equals(descricao)) {
                return exame;
            }
        }
        return null;
    }

    String listarExames() {
        StringBuilder listaExames = new StringBuilder();
        for (Exame exame : exames) {
            listaExames.append("Descrição: ").append(exame.descricaoExame).append("\n");
        }
        return listaExames.toString();
    }
}