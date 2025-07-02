// Importa a classe Scanner para ler o que o usuário digita
import java.util.Scanner;

// Aqui começa a definição da classe
public class OlaMundo {

    // Método principal: é onde o programa começa
    public static void main(String[ ] args) {

        // Cria um objeto Scanner para capturar o que o usuário digitar
        Scanner entrada = new Scanner(System.in);

        // Exibe uma mensagem pedindo o nome do usuário
        System.out.print("Digite seu nome: ");

        // Lê o nome digitado e armazena na variável 'nome'
        String nome = entrada.nextLine();

        // Exibe uma saudação personalizada no console
        System.out.println("Olá, " + nome + "! Bem-vindo ao mundo do Java.");

        // Fecha o scanner para liberar memória
        entrada.close();