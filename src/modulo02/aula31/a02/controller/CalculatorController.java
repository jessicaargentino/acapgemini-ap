package modulo02.aula31.a02.controller;

import modulo02.aula31.a02.model.Calculator;

public class CalculatorController {
    /**
     * Método que realiza a soma entre dois números inteiros
     * 
     * @param calculator instância de Calculator para acessar os gets dos números
     * @return resultado da soma dos dois números
     */
    public static int sum(Calculator calculator) {
        return (calculator.getNumberOne() + calculator.getNumberTwo());
    }

    /**
     * Método que realiza a subtração entre dois números inteiros
     * 
     * @param calculator instância de Calculator para acessar os gets dos números
     * @return resultado da subtração dos dois números
     */
    public static int subtraction(Calculator calculator) {
        return (calculator.getNumberOne() - calculator.getNumberTwo());
    }

    /**
     * Método que realiza a multiplicação entre dois números inteiros
     * 
     * @param calculator instância de Calculator para acessar os gets dos números
     * @return resultado da multiplicação dos dois números
     */
    public static int multiplication(Calculator calculator) {
        return (calculator.getNumberOne() * calculator.getNumberTwo());
    }

    /**
     * Método que realiza a divisão entre dois números inteiros
     * 
     * @param calculator instância de Calculator para acessar os gets dos números
     * @return resultado da divisão dos dois números
     */
    public static int division(Calculator calculator) {
        return (calculator.getNumberOne() / calculator.getNumberTwo());
    }
}
