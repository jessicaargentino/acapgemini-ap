package modulo02.aula32.view;

import java.util.ArrayList;
import java.util.Scanner;

import modulo02.aula32.controller.ProductController;
import modulo02.aula32.model.Product;

public class ProductView {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        System.out.println("****** CADASTRO DE PRODUTOS ******\n");
        menu();
        option = readNumber("\nEscolha uma opção: ", input);
    }

    /** Método que imprime um menu com as opções do programa */
    public static void menu() {
        System.out.println("1 - Adicionar um produto");
        System.out.println("2 - Alterar um produto");
        System.out.println("3 - Deletar um produto");
        System.out.println("4 - Listar produtos");
    }

    /**
     * Método que recebe uma mensagem e realiza a leitura de um número
     * 
     * @param message
     * @param input
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
                System.out.println("\nCaractere inválido, tente novamente!");
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
        System.out.print("\nname: ");
        product.setName(input.nextLine());
        System.out.print("Categoria: ");
        System.out.print("Descrição categoria: ");
        System.out.print("Quantidade: ");
        product.setQuantity(Integer.parseInt(input.nextLine()));
        System.out.print("Preço: R$");
        product.setPrice(Double.parseDouble(input.nextLine()));
        productController.create(product);
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
}
