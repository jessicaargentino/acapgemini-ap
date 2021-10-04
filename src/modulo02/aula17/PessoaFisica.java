package modulo02.aula17;

public class PessoaFisica {
    /* DECLARAÇÃO DOS ATRIBUTOS DA CLASSE */
    private int codigo;
    private String nome;
    private String sobrenome;
    private short idade;
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

    public void setIdade(short idade) {
        this.idade = idade;
    }

    public short getIdade() {
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
