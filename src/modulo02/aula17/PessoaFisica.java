package modulo02.aula17;

/* Crie uma classe Pessoa Física com os atributos código, nome, sobrenome,
* idade, rg e cpf. Todos os atributos da classe Pessoa Física devem ser
* privados. Construa os métodos get e set para cada um dos atributos da
* classe. Crie uma classe Cadastro de Pessoas que contenha um método main.
* Nesta classe, crie um array de Pessoa com 5 posições. Crie 5 objetos da
* classe pessoa, chame os método set para atribuir valores diferente para cada
* pessoa e salve cada objeto em uma posição do array. Imprima todos os dados
* das 5 pessoas utilizando o laço de repetição foreach.*/

public class PessoaFisica {
    /* DECLARAÇÃO DOS ATRIBUTOS DA CLASSE */
    private int codigo;
    private String nome;
    private String sobrenome;
    private int idade;
    private String rg;
    private String cpf;

    /* GETTERS E SETTERS */
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

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
