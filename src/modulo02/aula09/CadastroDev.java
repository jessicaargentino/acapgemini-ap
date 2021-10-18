package modulo02.aula09;

import java.util.Scanner;

/**
 * Crie um programa em linguagem Java que atenda aos seguintes requisitos: O
 * programa deve realizar o cadastro de um dev e uma linguagem. O programa deve
 * ter um cabeçalho com o nome do programa. O programa deve exibir um menu com
 * as opções cadastrar dev, cadastrar linguagem e sair. Deve ser utilizado a
 * estrutura SWITCH-CASE para decidir sobre a opção escolhida pelo usuário. O
 * cadastro de dev deve solicitar o nome, sobrenome, senioridade e idade. O nome
 * e sobrenome devem conter no mínimo 3 caracteres. A idade deve ser maior que
 * 0. O cadastro de linguagens deve solicitar o nome, descrição e a aplicação. O
 * nome deve conter no mínimo 3 caracteres. A aplicação deve ser apenas
 * Frontend, Backend ou Mobile. Deve ser utilizado a estrutura DO-WHILE durante
 * a validação dos dados para solicitar o dado novamente caso ele seja inválido.
 * O programa deve validar os dados assim que informado pelo usuário, caso o
 * dado não atenda as regras de negócio, deve informar o usuário com uma
 * mensagem de erro e solicitar que digite novamente. Após o cadastro e as
 * validações o sistema deve imprimir o dados cadastrados. Deve ser utilizado o
 * conceito de métodos para o desenvolvimento desta atividade, lembre-se de
 * utilizar o principio da responsábilidade única, onde um método deve realizar
 * apenas uma atividade, possuir um objetivo claro e bem definido.
 * 
 * Atividade realizada em dupla com Graziela Beckhauser.
 */

public class CadastroDev {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        cabecalho();
        imprimeMenu();

        opcao = lerNumero("Escolha sua opção: ");
        escolhaMenu(opcao);
    }

    /** Método que imprime uma mensagem de cabeçalho */
    static void cabecalho() {
        System.out.println("====== Cadastros ======");
    }

    /** Método que imprime um menu com opções */
    static void imprimeMenu() {
        System.out.println("1 - Cadastrar Desevolvedor");
        System.out.println("2 - Cadastrar Linguagem");
        System.out.println("3 - Sair");
    }

    /**
     * Método que realiza a entrada de dados (um número) digitado pelo usuário.
     * 
     * @param mensagem mensagem que será exibida antes da entrada de dados
     * @return número digitado pelo usuário
     */
    static int lerNumero(String mensagem) {
        System.out.print(mensagem);
        int numero = Integer.parseInt(sc.nextLine());
        return numero;
    }

    /**
     * Método que realiza os direcionamentos de acordo com a escolha do usuário
     * 
     * @param opcao opção escolhida pelo usuário
     */
    static void escolhaMenu(int opcao) {
        switch (opcao) {
            case 1:
                cadastraDev();
                break;
            case 2:
                cadastraLinguagem();
                break;

            case 3:
                System.out.println("Saindo...");
                System.out.println("Obrigada por utilizar nosso cadastro!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }

    /** Método que realiza o cadastro de um desenvolvedor */
    static void cadastraDev() {
        String nome, sobrenome, senioridade;
        short idade;

        System.out.println("\n====== Cadastro de Desenvolvedor ======\n");
        do {
            System.out.print("Digite seu nome: ");
            nome = sc.nextLine();
        } while (!validaNome(nome));

        do {
            System.out.print("Digite seu sobrenome: ");
            sobrenome = sc.nextLine();
        } while (!validaNome(sobrenome));

        System.out.print("Digite sua senioridade: ");
        senioridade = sc.nextLine();

        do {
            System.out.print("Digite sua idade: ");
            idade = Short.parseShort(sc.nextLine());
        } while (!validaIdade(idade));

        imprimeCadastroDev(nome, sobrenome, senioridade, idade);
    }

    /** Método que realiza o cadastro de uma linguagem */
    static void cadastraLinguagem() {
        String nomeLinguagem, descricao;
        int aplicacao;

        System.out.println("\n====== Cadastro de Linguagem ======\n");
        do {
            System.out.print("Digite o nome da linguagem: ");
            nomeLinguagem = sc.nextLine();
        } while (!validaNome(nomeLinguagem));

        System.out.print("Digite a descrição da linguagem: ");
        descricao = sc.nextLine();

        do {
            System.out.println("Digite o número da aplicação desejada, sendo:");
            System.out.println(" 1 - Frontend");
            System.out.println(" 2 - Backend");
            System.out.println(" 3 - Mobile");
            aplicacao = sc.nextInt();
        } while (!validaAplicacao(aplicacao));

        imprimeCadastroLinguagem(nomeLinguagem, descricao, aplicacao);
    }

    /**
     * Método que valida se o nome possui mais de 3 caracteres.
     * 
     * @param nome nome digitado pelo usuário
     * @return true se o nome possuir mais de 3 caracteres, false se não possuir
     */
    static boolean validaNome(String nome) {
        boolean ehValido = true;

        if (nome.length() < 3) {
            System.out.println("O nome deve conter no mínimo 3 caracteres. Tente novamente!");
            ehValido = false;
        }
        return ehValido;
    }

    /**
     * Método que valida se a idade é maior que zero.
     * 
     * @param idade idade digitada pelo usuário
     * @return true se a idade for maior que zero, false se não for
     */
    static boolean validaIdade(short idade) {
        boolean ehValido = true;

        if (idade <= 0) {
            System.out.println("A idade deve ser maior que 0. Tente novamente!");
            ehValido = false;
        }
        return ehValido;
    }

    /**
     * Método que valida se a aplicação é 1, 2 ou 3.
     * 
     * @param aplic número da aplicação digitado pelo usuário
     * @return true se for 1, 2 ou 3, false se não for
     */
    static boolean validaAplicacao(int aplic) {
        boolean ehValido = true;

        if (aplic < 1 || aplic > 3) {
            System.out.println("Aplicação inválida! Tente novamente.");
            ehValido = false;
        }
        return ehValido;

    }

    /**
     * Método que imprime o cadastro de devs realizado.
     * 
     * @param nome        nome digitado pelo usuário
     * @param sobrenome   sobrenome digitado pelo usuário
     * @param senioridade senioridade digitada pelo usuário
     * @param idade       idade digitada pelo usuário
     */
    static void imprimeCadastroDev(String nome, String sobrenome, String senioridade, short idade) {
        System.out.println("\n====== Ficha de cadastro ======\n");
        System.out.printf("Nome dev: %s %s\n", nome, sobrenome);
        System.out.printf("Senioridade: %s\n", senioridade);
        System.out.printf("Idade: %d anos\n", idade);
    }

    /**
     * Método que imprime o cadastro de linguagens realizado.
     * 
     * @param nome      nome da linguagem digitado pelo usuário
     * @param descricao descrição da linguagem digitada pelo usuário
     * @param aplicacao aplicacao da linguagem digitada pelo usuário
     */
    static void imprimeCadastroLinguagem(String nome, String descricao, int aplicacao) {
        System.out.println("\n====== Ficha de cadastro ======\n");
        System.out.printf("Nome linguagem: %s\n", nome);
        System.out.printf("Descrição: %s\n", descricao);

        if (aplicacao == 1) {
            System.out.println("Aplicação: Front-end");
        } else if (aplicacao == 2) {
            System.out.println("Aplicação: Back-end");
        } else if (aplicacao == 3) {
            System.out.println("Aplicação: Mobile");
        }
    }
}
