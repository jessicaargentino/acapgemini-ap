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
        aluno.setCurso("Sistemas de Informação");
        aluno.setMatricula(129807);

        /* ATRIBUIÇÃO DE VALORES PARA COORDENADOR UTILIZANDO SETTER */
        coordenador.setCursoCoordenado("Sistemas de Informação");
        coordenador.setBonus("Aulas extras em Jogos Digitais");
    }

}