package modulo02.aula32.view;

import java.util.ArrayList;
import java.util.Scanner;

import modulo02.aula32.controller.ProductController;
import modulo02.aula32.model.Product;

/**
 * Crie um sistema para cadastro de produtos. Deve possuir um menu para o
 * usuário escolher uma das operações de CRUD. O sistema deve possuir um
 * tratamento de exceção para evitar erros. O sistema deve ser construído
 * utilizando o padrão MVC. Dever ser utilizado o conceito de herança,
 * composição, sobrescritura de métodos, metodo construtor e generics.
 */
public class ProductView {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductController productController = new ProductController();
        int option;
        do {
            System.out.println("****** CAPSTOQUE ******\n");
            menu();
            System.out.println();
            option = readNumber("Escolha uma opção: ", input);
            actionMenu(option, productController, input);
        } while (returnMenu(input));
    }

    /** Método que imprime um menu com as opções do programa */
    public static void menu() {
        System.out.println("1 - Adicionar um produto");
        System.out.println("2 - Alterar um produto");
        System.out.println("3 - Deletar um produto");
        System.out.println("4 - Listar produtos");
    }

    /**
     * Método que direciona as chamadas dos métodos de acordo com a opção escolhida
     * pelo usuário
     * 
     * @param option            opção escolhida pelo usuário
     * @param productController variável de manipulação do ArrayList
     * @param input             entrada de dados do usuário
     */
    public static void actionMenu(int option, ProductController productController, Scanner input) {
        switch (option) {
        case 1:
            System.out.println("\n****** CADASTRO DE PRODUTOS ******");
            create(productController, input);
            break;

        case 2:
            System.out.println("\n****** ATUALIZAÇÃO DE PRODUTOS ******");
            update(productController, input);
            break;

        case 3:
            System.out.println("\n****** EXCLUSÃO DE PRODUTOS ******");
            delete(productController, input);
            break;

        case 4:
            System.out.println("\n****** LISTA DE PRODUTOS ******");
            read(productController);
            break;
        default:
            System.out.println("\nOpção inválida, volte ao menu e tente novamente!");
            break;
        }
    }

    /**
     * Método que recebe uma mensagem e realiza a leitura de um número
     * 
     * @param message mensagem informada na chamada
     * @param input   entrada de dados do usuário
     * @return número digitado pelo usuário
     */
    public static int readNumber(String message, Scanner input) {
        int number = 0;
        boolean validNumber;
        do {
            try {
                System.out.print(message);
                number = Integer.parseInt(input.nextLine());
                validNumber = true;
            } catch (NumberFormatException e) {
                System.out.println("\nCaractere inválido, tente novamente!\n");
                validNumber = false;
            }
        } while (!validNumber);
        return number;
    }

    /**
     * Método que realiza a criação de um novo objeto da classe Product e através do
     * productController o adiciona ao ArrayList
     * 
     * @param productController variável de manipulação do ArrayList
     * @param input             entrada de dados do usuário
     */
    public static void create(ProductController productController, Scanner input) {
        Product product = new Product();
        boolean validInput;

        System.out.print("\nNome: ");
        product.setName(input.nextLine());
        System.out.print("Marca: ");
        product.setBrand(input.nextLine());
        System.out.print("Categoria: ");
        product.getCategory().setCategory(input.nextLine());
        System.out.print("Descrição categoria: ");
        product.getCategory().setDescription(input.nextLine());
        product.setQuantity(readNumber("Quantidade: ", input));

        do {
            try {
                System.out.print("Preço: R$");
                product.setPrice(Double.parseDouble(input.nextLine()));
                productController.create(product);
                validInput = true;
                System.out.println("\nProduto cadastrado com sucesso!");
            } catch (NumberFormatException e) {
                System.out.println("\nCaractere inválido, tente novamente!\n");
                validInput = false;
            }
        } while (!validInput);
    }

    /**
     * Método que chama a verificação de id para retornar >= 0 para id existente ou
     * -1 para id não existente, através disso, realiza a alteração de um objeto se
     * o id for >= 0, se não, não altera o objeto
     * 
     * @param productController variável de manipulação do ArrayList
     * @param input             entrada de dados do usuário
     */
    public static void update(ProductController productController, Scanner input) {
        boolean validInput;
        int id = 0, index = 0;

        do {
            try {
                System.out.print("\nID do produto a ser excluído: ");
                id = Integer.parseInt(input.nextLine());
                validInput = true;
                index = productController.indexOf(id);
            } catch (NumberFormatException e) {
                System.out.println("\nCaractere inválido, tente novamente!");
                validInput = false;
            }
        } while (!validInput);

        if (index >= 0) {
            Product product = productController.read().get(index);
            System.out.print("\nNome: ");
            product.setName(input.nextLine());
            System.out.print("Marca: ");
            product.setBrand(input.nextLine());
            System.out.print("Categoria: ");
            product.getCategory().setCategory(input.nextLine());
            System.out.print("Descrição categoria: ");
            product.getCategory().setDescription(input.nextLine());
            product.setQuantity(readNumber("Quantidade: ", input));

            do {
                try {
                    System.out.print("Preço: R$");
                    product.setPrice(Double.parseDouble(input.nextLine()));
                    productController.update(product);
                    System.out.println("\nProduto atualizado com sucesso!");
                } catch (NumberFormatException e) {
                    System.out.println("\nCaractere inválido, tente novamente!");
                    validInput = false;
                }
            } while (!validInput);

        } else {
            System.out.println("\nID não encontrado, não foi possível atualizar o produto!");
        }
    }

    /**
     * Busca produto pelo id e exclui caso exista um produto com este id.
     * 
     * @param productController variável de manipulação do ArrayList
     * @param input             entrada de dados do usuário
     */
    public static void delete(ProductController productController, Scanner input) {
        boolean validInput;
        int id = 0, index = 0;

        do {
            try {
                System.out.print("\nID do produto a ser excluído: ");
                id = Integer.parseInt(input.nextLine());
                validInput = true;
                index = productController.indexOf(id);
            } catch (NumberFormatException e) {
                System.out.println("\nCaractere inválido, tente novamente!");
                validInput = false;
            }
        } while (!validInput);

        if (index >= 0) {
            Product product = productController.read().get(index);
            productController.delete(product);
            System.out.println("\nProduto excluído com sucesso!");
        } else {
            System.out.println("\nID não encontrado, não foi possível excluir o produto!");
        }
    }

    /**
     * Método que através do foreach percorre o ArrayList e imprime os objetos
     * existentes no mesmo
     * 
     * @param productController variável de manipulação do ArrayList
     */
    public static void read(ProductController productController) {
        ArrayList<Product> product = productController.read();
        for (Product p : product) {
            System.out.println(p);
        }
    }

    /**
     * Método que de acordo com a escolha do usuário retorna ao menu inicial
     * 
     * @param input entrada do usuário
     * @return true para retornar ao menu ou false para não retornar ao menu
     */
    private static boolean returnMenu(Scanner input) {
        int option = 0;
        boolean turnBack = true;
        do {
            try {
                System.out.println("\nDeseja voltar ao menu?\n1 - Sim\n2 - Não");
                System.out.print("\nSua opção: ");
                option = Integer.parseInt(input.nextLine());
                System.out.println();

                if (option == 1) {
                    turnBack = true;
                } else if (option == 2) {
                    System.out.println("Obrigada por utilizar o Capstoque!\n");
                    turnBack = false;
                } else {
                    System.out.println("Opção inválida, tente novamente!");
                    turnBack = false;
                }

            } catch (NumberFormatException e) {
                System.out.println("\nCaractere inválido, tente novamente!");
            }
        } while (option != 1 && option != 2);
        return turnBack;
    }
}
