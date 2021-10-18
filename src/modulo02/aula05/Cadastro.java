package modulo02.aula05;

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
 * validações o sistema deve imprimir o dados cadastrados.
 * 
 * Atividade realizada com Margareth Gomes.
 * 
 */
public class Cadastro {
    public static String nome, sobrenome, senioridade, nomeLinguagem, descricao, nomeAplicacao;
    public static int idade, aplicacao;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("***** CADASTRO DE APLICAÇÕES *****");
            System.out.println("\nOlá! Seja bem vindo(a) ao cadastro de aplicações!\n");
            System.out.println("Escolha sua opção: ");
            System.out.println("1 - Cadastrar dev");
            System.out.println("2 - Cadastrar linguagem");
            System.out.println("3 - Listar cadastro dev e linguagem");
            System.out.println("4 - Sair");
            System.out.print("Opção escolhida: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarDev();
                    break;
                case 2:
                    cadastrarLinguagem();
                    break;
                case 3:
                    listarLinguagemDev();
                    break;
                case 4:
                    System.out.println("\nObrigada por utilizar nosso cadastro!");
                    break;
                default:
                    System.out.println("\nOpção inválida, tente novamente!\n");
                    break;
            }
        } while (opcao != 4);
    }

    /** Método que realiza o cadastro de um desenvolvedor */
    public static void cadastrarDev() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n***** CADASTRO DE DEV *****");

        do {
            System.out.print("Digite seu nome: ");
            nome = entrada.nextLine();
        } while (validaNome(nome) == false);

        do {
            System.out.print("Digite seu sobrenome: ");
            sobrenome = entrada.nextLine();
        } while (validaNome(sobrenome) == false);

        System.out.print("Digite sua senioridade: ");
        senioridade = entrada.nextLine();

        do {
            System.out.print("Digite sua idade: ");
            idade = entrada.nextInt();
        } while (validaIdade(idade) == false);

        System.out.printf("\n%s, seu cadastro foi realizado com sucesso!\n\n", nome);
    }

    /**
     * Método que valida se o nome digitado pelo usuário possui mais de 3
     * caracteres.
     * 
     * @param nome nome digitado pelo usuário
     * @return true se possuir mais de 3 caracteres, false se não possuir
     */
    public static boolean validaNome(String nome) {
        boolean valida = true;

        if (nome.length() < 3) {
            System.out.println("A palavra deve conter no mínimo 3 caracteres, tente novamente!");
            valida = false;
        } else {
            valida = true;
        }
        return valida;
    }

    /**
     * Método que valida se a idade digitada pelo usuário é maior que zero.
     * 
     * @param idade idade digitada pelo usuário
     * @return true se for maior que zero, false se não for
     */
    public static boolean validaIdade(int idade) {
        boolean valida = true;

        if (idade <= 0) {
            System.out.println("A idade deve ser maior que zero, tente novamente!");
            valida = false;
        } else {
            valida = true;
        }
        return valida;
    }

    /** Método que realiza o cadastro de uma linguagem */
    public static void cadastrarLinguagem() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n***** CADASTRO DE LINGUAGEM *****");

        do {
            System.out.print("Digite o nome da linguagem: ");
            nomeLinguagem = entrada.nextLine();
        } while (validaNome(nomeLinguagem) == false);

        System.out.print("Digite a descrição: ");
        descricao = entrada.nextLine();

        do {
            System.out.println("Digite a aplicação: ");
            System.out.println("1 - Front-end");
            System.out.println("2 - Back-end");
            System.out.println("3 - Mobile");
            System.out.print("Sua escolha: ");
            aplicacao = entrada.nextInt();
        } while (validaAplicacao(aplicacao) == false);

        System.out.printf("\nO cadastro da linguagem %s foi realizado com sucesso!\n\n", nomeLinguagem);
    }

    /**
     * Método que realiza a validação da aplicação digitada pelo usuário.
     * 
     * @param aplicacao número da aplicação digitado pelo usuário
     * @return se for 1, 2 e 3, retorna true, se não, retorna false. Além disso,
     *         atribui um nome para cada aplicação de acordo com o número.
     */
    public static boolean validaAplicacao(int aplicacao) {
        boolean valida = true;

        switch (aplicacao) {
            case 1:
                nomeAplicacao = "Front-end";
                break;
            case 2:
                nomeAplicacao = "Back-end";
                break;
            case 3:
                nomeAplicacao = "Mobile";
                break;
            default:
                System.out.println("\nOpção inválida, tente novamente!\n");
                valida = false;
                break;
        }
        return valida;
    }

    /** Método que realiza a impressão do cadastro */
    public static void listarLinguagemDev() {

        System.out.println("\n***** FICHA DE CADASTRO *****");
        System.out.printf("Nome do(a) dev: %s %s\n", nome, sobrenome);
        System.out.println("Senioridade: " + senioridade);
        System.out.printf("Idade: %s anos\n", idade);
        System.out.println("Linguagem: " + nomeLinguagem);
        System.out.println("Descrição linguagem: " + descricao);
        System.out.println("Aplicação: " + nomeLinguagem);
        System.out.println();
    }
}
