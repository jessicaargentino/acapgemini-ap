package modulo02.aula18;

public class Universidade {
    public static void main(String[] args) {
        /*
         * CRIAÇÃO DE TRÊS OBJETOS ATRAVÉS DA INSTÂNCIA DAS CLASSES ALUNO, COORDENADOR E
         * FUNCIONARIO
         */
        Aluno aluno = new Aluno();
        Coordenador coordenador = new Coordenador();
        Funcionario funcionario = new Funcionario();

        /* ATRIBUIÇÃO DE VALORES PARA ALUNO UTILIZANDO SETTER */
        aluno.setNome("Laura");
        aluno.setSobrenome("Palmer");
        aluno.setCurso("Sistemas de Informação");
        aluno.setMatricula(129807);
        aluno.setTurma("Turma D");

        /* ATRIBUIÇÃO DE VALORES PARA COORDENADOR UTILIZANDO SETTER */
        coordenador.setCursoCoordenado("Sistemas de Informação");
        coordenador.setBonus("Aulas extras em Jogos Digitais");

        /* ATRIBUIÇÃO DE VALORES PARA FUNCIONARIO UTILIZANDO SETTER */
        funcionario.setSalario(3500.00);
        funcionario.setDepartamento("Instituto de TI");

        /* IMPRESSÃO DO CABEÇALHO */
        System.out.println("***** CAPVERSIDADE *****");
    }

}
