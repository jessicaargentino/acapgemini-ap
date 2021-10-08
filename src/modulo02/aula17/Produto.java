package modulo02.aula17;

/* Crie uma classe produto com os atributos Código, Nome, Descrição e Valor.
* Todos os atributos da classe produtos devem ser privados. Construa os
* métodos get e set para cada um dos atributos. Crie uma classe Conta Corrente
* com os atributos Agência, Numero, Codigo do Cliente e Saldo. Todos os
* atributos da classe Conta Corrente devem ser privados. Construa os métodos
* get e set para cada um dos atributos da classe. Crie uma classe Tela
* Principal Loja que contenha um método main. Nesta classe, crie um objeto da
* Produto, realize a chamada a todos os métodos set e get, ao final da
* execução, imprima o valor de todos os atributos da classe.
* 
* Crie uma classe Tela Principal Banco que contenha um método main. Nesta
* classe, crie um objeto da Conta Corrente, realize a chamada a todos os
* métodos set e get, ao final da execução, imprima o valor de todos os
* atributos da classe. */

public class Produto {
    /* DECLARAÇÃO DOS ATRIBUTOS DA CLASSE */
    private int codigo;
    private String nome;
    private String descricao;
    private double valor;

    /* SETTERS E GETTERS */

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}