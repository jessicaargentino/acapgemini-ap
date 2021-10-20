package modulo02.aula27;

public class Data {
    private Object[] data;
    private int currentPosition;

    /**
     * Construtor Inicializa a variável capacidade com tamanho 5 e atribui a
     * variável como tamanho do array de Object
     */
    public Data() {
        this.data = new Object[5];
    }

    /**
     * Método que adiciona um objeto no Array de Objects
     * 
     * @param object objeto de uma Classe
     */
    public void add(Object object) {
        if (this.currentPosition < this.data.length) {
            this.data[currentPosition] = object;
            currentPosition++;
        } else {
            resize();
        }
    }

    /**
     * Método que redimensiona o tamanho do Array para o dobro da capacidade atual
     */
    private void resize() {
        int capacity = this.data.length + 2;
        Object[] newData = new Object[capacity];
        for (int n = 0; n < this.data.length; n++) {
            newData[n] = this.data[n];
        }
        this.data = newData;
    }

    /**
     * Método que retorna a quantidade de elementos que o Array possuí
     * 
     * @return quantidade de elementos do Array
     */
    public int size() {
        return this.currentPosition;
    }

    /**
     * Método que remove um objeto do Array
     * 
     * @param object objeto de uma Classe
     */
    public void remove(Object object) {
        for (int n = 0; n < this.currentPosition; n++) {
            if (this.data[n].equals(object)) {
                currentPosition--;
                rearrange(n);
            }
        }
    }

    /**
     * Método que reposiciona os elementos do Array uma posição a frente da posição
     * que foi excluída
     * 
     * @param position posição deletada do Array
     */
    private void rearrange(int position) {
        for (int n = position; n < this.data.length - 1; n++) {
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
        for (int n = 0; n < this.currentPosition; n++) {
            if (this.data[n].equals(object)) {
                return true;
            }
        }
        return false;
    }

    public void imprimir() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
