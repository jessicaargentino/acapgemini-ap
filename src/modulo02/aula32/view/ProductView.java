package modulo02.aula32.view;

import modulo02.aula32.controller.ProductController;

public class ProductView {
    public static void main(String[] args) {
        System.out.println("****** CADASTRO DE PRODUTOS ******\n");
        menu();
    }

    /** Método que imprime um menu com as opções do programa */
    public static void menu() {
        System.out.println("1 - Adicionar um produto");
        System.out.println("2 - Alterar um produto");
        System.out.println("3 - Deletar um produto");
        System.out.println("4 - Listar produtos");
    }
}
