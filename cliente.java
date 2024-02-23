import java.util.ArrayList;
import java.util.List;

class Cliente {
    String nomeCliente;
    String enderecoCliente;
    String telefoneCliente;
    String emailCliente;
    List<Animal> animais; 

    int registrarCliente(String nome, String endereco, String telefone, String email) {
        this.nomeCliente = nome;
        this.enderecoCliente = endereco;
        this.telefoneCliente = telefone;
        this.emailCliente = email;
        this.animais = new ArrayList<>();
        System.out.println("Cliente registrado com sucesso!");
        return 1; 
    }

    int registrarAnimal(Animal animal) {
        this.animais.add(animal);
        return 1; 
    }

    String consultarCliente() {
        return "Nome: " + this.nomeCliente + ", Endereço: " + this.enderecoCliente + ", Telefone: " + this.telefoneCliente + ", Email: " + this.emailCliente;
    }
}
