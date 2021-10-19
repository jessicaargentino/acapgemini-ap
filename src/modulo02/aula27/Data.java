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

    /**
     * Método que retorna a quantidade de elementos que o Array possuí
     * 
     * @return quantidade de elementos do Array
     */
    public int size() {
        return currentPosition + 1;
    }

    /**
     * Método que remove um objeto do Array
     * 
     * @param object objeto de uma Classe
     */
    public void remove(Object object) {
        for (int n = 0; n < data.length; n++) {
            if (data[n].equals(object)) {
                rearrange(n);
                currentPosition--;
            }
        }
    }

    /**
     * Método que reposiciona os elementos do Array uma posição a frente da posição
     * que foi excluída
     * 
     * @param position posição deletada do Array
     */
    public void rearrange(int position) {
        for (int n = position; n < data.length; n++) {
            this.data[n] = this.data[n + 1];
        }
    }

    /**
     * Método que percorre as posições ocupadas do Array e verifica se determinado
     * objeto está na mesma. Se estiver, retorna true, se não, false.
     * 
     * @param object objeto de uma Classe
     * @return true se possuir, false se não possuir
     */
    public boolean contains(Object object) {
        for (int n = 0; n < currentPosition; n++) {
            if (data[n].equals(object)) {
                return true;
            }
        }
        return false;
    }
}
