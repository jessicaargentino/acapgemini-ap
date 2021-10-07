package modulo02.aula20.atv03;

public class Tela {
    public static void main(String[] args) {
        /*
         * CRIAÇÃO DE UM OBJETO ATRAVÉS DA INSTÂNCIA DA CLASSE CALCULADORA
         */
        Calculadora calculadora = new Calculadora();

        /* CHAMADA E IMPRESSÃO DE CADA MÉTODO DE SOMA */
        System.out.println("Soma de inteiros: " + calculadora.soma(5, 2));
        System.out.println("Soma de doubles: " + calculadora.soma(5.0, 2.0));
        System.out.println("Soma de floats: " + calculadora.soma(4.0f, 1.0f, 2.0f));
        System.out.println("Soma de longs: " + calculadora.soma(4L, 1L, 2L));
    }
}
