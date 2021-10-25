package modulo02.aula31;

public class Calculator {
    /**
     * Método que realiza a soma entre dois números inteiros
     * 
     * @param numberOne 1º número informado
     * @param numberTwo 2º número informado
     * @return resultado da soma dos dois números
     */
    public static int sum(int numberOne, int numberTwo) {
        return (numberOne + numberTwo);
    }

    /**
     * Método que realiza a subtração entre dois números inteiros
     * 
     * @param numberOne 1º número informado
     * @param numberTwo 2º número informado
     * @return resultado da subtração dos dois números
     */
    public static int subtraction(int numberOne, int numberTwo) {
        return (numberOne - numberTwo);
    }

    /**
     * Método que realiza a multiplicação entre dois números inteiros
     * 
     * @param numberOne 1º número informado
     * @param numberTwo 2º número informado
     * @return resultado da multiplicação dos dois números
     */
    public static int multiplication(int numberOne, int numberTwo) {
        return (numberOne * numberTwo);
    }

    /**
     * Método que realiza a divisão entre dois números inteiros
     * 
     * @param numberOne 1º número informado
     * @param numberTwo 2º número informado
     * @return resultado da divisão dos dois números
     */
    public static int division(int numberOne, int numberTwo) {
        return (numberOne / numberTwo);
    }
}