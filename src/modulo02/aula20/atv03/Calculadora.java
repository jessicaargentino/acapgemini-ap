package modulo02.aula20.atv03;

/* Crie uma classe Calculadora. Adicione a classe Calculadora um método soma
* que recebe dois parâmetros e inteiros e retorna um inteiro com o resultado.
* Adicione a classe Calculadora um método soma que recebe dois parâmetros
* double e retorna um double com o resultado. Adicione a classe Calculadora
* um método soma que recebe três parâmetros float e retorna um float com o
* resultado. Adicione a classe Calculadora um método soma que recebe três
* parâmetros long e retorna um long com o resultado. Crie uma classe Tela com
* um método main, crie um objeto da classe Calculadora, chame cada método
* criado e imprima seus resultados. */

public class Calculadora {
    /* MÉTODO QUE RECEBE DOIS VALORES INTEIROS E RETORNA A SOMA ENTRE ELES */
    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    /* MÉTODO QUE RECEBE DOIS VALORES DOUBLE E RETORNA A SOMA ENTRE ELES */
    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    /* MÉTODO QUE RECEBE TRÊS VALORES FLOAT E RETORNA A SOMA ENTRE ELES */
    public float soma(float num1, float num2, float num3) {
        return num1 + num2 + num3;
    }

    /* MÉTODO QUE RECEBE TRÊS VALORES LONG E RETORNA A SOMA ENTRE ELES */
    public long soma(long num1, long num2, long num3) {
        return num1 + num2 + num3;
    }
}