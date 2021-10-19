package modulo02.aula27;

public class Data {
    private Object[] data;
    private int currentPosition;
    private int capacity;

    /**
     * Construtor Inicializa a variável capacidade com tamanho 5 e atribui a
     * variável como tamanho do array de Object
     */
    public Data() {
        this.capacity = 5;
        this.data = new Object[this.capacity];
    }

    /**
     * Método que adiciona um objeto no Array de Objects
     * 
     * @param object objeto de uma Classe
     */
    public void add(Object object) {
        if (currentPosition < data.length) {
            data[currentPosition] = object;
            currentPosition++;
        } else {
            capacity += 5;
            Object[] dataNew = new Object[capacity];
            for (int n = 0; n < data.length; n++) {
                dataNew[n] = data[n];
            }
            data = dataNew;
        }
    }
}
