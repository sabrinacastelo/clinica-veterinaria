import java.util.ArrayList;
import java.util.List;

class Animal {
    Cliente cliente; 
    Especie especie; 

    String nomeAnimal;
    int idadeAnimal;

    static List<Animal> animais = new ArrayList<>();

    int registrarAnimal(Cliente cliente, Especie especie, String nome, int idade) {
        this.cliente = cliente;
        this.especie = especie;
        this.nomeAnimal = nome;
        this.idadeAnimal = idade;
        animais.add(this);
        System.out.println("Animal registrado com sucesso!");
        return 1; 
    }

    String listarAnimais() {
        StringBuilder listaAnimais = new StringBuilder();
        for (Animal animal : animais) {
            listaAnimais.append("Nome: ").append(animal.nomeAnimal).append(", Idade: ").append(animal.idadeAnimal).append("\n");
        }
        return listaAnimais.toString();
    }

    String consultarAnimal(String nome) {
        for (Animal animal : animais) {
            if (animal.nomeAnimal.equals(nome)) {
                return "Nome: " + animal.nomeAnimal + ", Idade: " + animal.idadeAnimal;
            }
        }
        return "Animal não encontrado";
    }
}