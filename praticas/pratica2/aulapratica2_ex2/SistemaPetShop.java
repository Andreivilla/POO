package aulapratica2_ex2;

import java.util.Scanner;

public class SistemaPetShop {
    Veterinario[] veterinarios = new Veterinario[50];
    int qunatidadeVeterinario = 0;

    void cadastrarVeterinario(){
        Scanner scanner = new Scanner(System.in);
        this.qunatidadeVeterinario++;
        this.veterinarios[this.qunatidadeVeterinario].setNome(scanner.nextLine());
        this.veterinarios[this.qunatidadeVeterinario].setSalario(Double.parseDouble(scanner.nextLine()));
    }

    void mostrarVeterinarios(){
        for(int i=0; i<this.veterinarios.length; i++) {
            System.out.println("Veterinarios ID: " + i);
            System.out.println("Nome: " + veterinarios[i].getNome());
        }
    }

    void cadastrarEnderecoVeterinario(){
        Scanner scanner = new Scanner(System.in);
        mostrarVeterinarios();
        int id = Integer.parseInt(scanner.nextLine());
        Endereco endereco = new Endereco();
        System.out.print("Bairro");
        endereco.setBairro(scanner.nextLine());
        System.out.print("CEP");
        endereco.setCep(scanner.nextLine());
        System.out.print("Cidade");
        endereco.setCidade(scanner.nextLine());
        System.out.print("Numero");
        endereco.setNumero(Integer.parseInt(scanner.nextLine()));
        System.out.print("Rua");
        endereco.setRua(scanner.nextLine());
        this.veterinarios[id].setEndereco(endereco);
    }
    void cadastrarAnimal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastrar animal em um veterinario");
        System.out.print("ID veterinario");
        int id = Integer.parseInt(scanner.nextLine());
        this.veterinarios[id].setQualtidadeanimais(this.veterinarios[id].getQualtidadeanimais()+1);
        Animal[] animais = this.veterinarios[id].getAnimais();
        System.out.print("Nome: ");
        animais[this.veterinarios[id].getQualtidadeanimais()].setNome(scanner.nextLine());
        System.out.print("Especie: ");
        animais[this.veterinarios[id].getQualtidadeanimais()].setEspecie(scanner.nextLine());
        System.out.print("Descrição: ");
        animais[this.veterinarios[id].getQualtidadeanimais()].setDescricao(scanner.nextLine());
    }
    void mostrarAnimais(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mostrar animais do veterinario");
        int id = Integer.parseInt(scanner.nextLine());

        Animal[] animais = this.veterinarios[id].getAnimais();

        for(int i=0; i<animais.length; i++){
            System.out.print("Animal ID: " + i);
            System.out.println("Nome: " + animais[i].getNome());
            System.out.println("Especie: " + animais[i].getEspecie());
            System.out.println("Descrição: " + animais[i].getDescricao());
        }
    }
}