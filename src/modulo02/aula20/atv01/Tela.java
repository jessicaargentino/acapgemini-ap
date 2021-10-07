package modulo02.aula20.atv01;

public class Tela {
    public static void main(String[] args) {
        /*
         * CRIAÇÃO DE DOIS OBJETOS ATRAVÉS DA INSTÂNCIA DA CLASSE ALUNO
         */
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        /*
         * ATRIBUIÇÃO DE VALORES UTILIZANDO OS SETTERS DE CADA OBJETO E IMPRESSÃO
         * UTILIZANDO O TOSTRING
         */
        aluno1.setNomeCompleto("Laura Palmer");
        aluno1.setIdade(17);
        aluno1.setMatricula(123789);
        System.out.println(aluno1);

        aluno2.setNomeCompleto("Luke Skywalker");
        aluno2.setIdade(53);
        aluno2.setMatricula(890573);
        System.out.println(aluno2);
    }
}
