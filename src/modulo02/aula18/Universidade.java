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
        coordenador.setNome("Pure");
        coordenador.setSobrenome("Vessel");
        coordenador.setMatricula(980862);
        coordenador.setCursoCoordenado("Sistemas de Informação");
        coordenador.setBonus("Aulas extras em Jogos Digitais");
        coordenador.setSalario(3500.00);
        coordenador.setDepartamento("Instituto de TI");

        /* ATRIBUIÇÃO DE VALORES PARA FUNCIONARIO UTILIZANDO SETTER */
        funcionario.setNome("Luke");
        funcionario.setSobrenome("Skywalker");
        funcionario.setMatricula(182276);
        funcionario.setSalario(5000.00);
        funcionario.setDepartamento("Instituto da Força");

        /* IMPRESSÃO DO CABEÇALHO */
        System.out.println("***** CAPVERSIDADE *****");
    }

}
