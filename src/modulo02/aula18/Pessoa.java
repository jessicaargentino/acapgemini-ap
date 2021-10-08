package modulo02.aula18;

/* Crie uma classe Pessoa com as propriedades nome, sobrenome e matrícula. Crie
* uma classe Funcionário com as propriedades salário e departamento. Crie uma
* classe Coordenador com as propriedades Curso Coordenado e bônus. Crie uma
* classe Aluno com as propriedades curso e turma. Altere a classe Funcionario
* para que ela herde da classe Pessoa. Altere a classe Coordenador para que ela
* herde da classe Funcionário. Altere a classe Aluno para que ela herde da
* classe Pessoa. Os atributos de todas as classes devem ser privados.
* Construa os métodos get e set para cada um dos atributos das classes.
* 
* Crie uma classe Universidade, adicione um método main, crie um objeto de
* Funcionario, um objeto de Coordenador e um objeto de Aluno. Utilize os
* métodos set dos objetos de Funcionario, Coordenador e Aluno para inserir
* valores. Imprima todos os dados dos objetos, utilizando seu metodos get, ao
* final da execução. */

/* CLASSE PAI*/
public class Pessoa {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private String nome;
    private String sobrenome;
    private int matricula;

    /* GETTERS E SETTERS */
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

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }
}