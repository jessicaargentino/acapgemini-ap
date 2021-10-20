package modulo02.aula27;

/**
 * Crie uma classe Pessoa com os atributos públicos: nome, sobrenome e idade .
 * Crie uma classe Aluno que herda de pessoa e que possua os atributos públicos:
 * matricula, turma e curso. Crie uma sobrescrita do método equals nas duas
 * classes para comparar os dados especificos de cada uma. Crie uma sobrescrita
 * do método toString nas duas classes para imprimir todos os dados. Crie uma
 * classe Dados com um atributo privado do tipo array de Object. Crie uma
 * inicialização do array para 5 posições dentro do do método construtor da
 * classe. Crie um método para adicionar elementos ao array e que permita
 * receber tanto objetos da classe pessoa quanto objetos da classe Aluno. Caso o
 * array já tenha todas as posições ocupadas, deve ser adicionado mais 5
 * posições ao array. Crie um método para mostrar quantos elementos já foram
 * adicionados ao array. Crie um método para remover um elemento do array. Crie
 * um método para verificar se um determinado objeto já foi salvo no array. Crie
 * uma classe Main com um método main, neste método, crie um objeto da classe
 * Pessoa, um da classe Aluno e atribua valores para as propriedade de cada
 * objeto. Crie um objeto da classe Dados e chame o metodo para adicionar os
 * objetos de Pessoa e Aluno ao array. Crie um novo objeto para Pessoa e atribua
 * os mesmos dados da pessoa criada anteriormente. Verifique se o segundo objeto
 * de pessoa já está salvo no array, utilizando o método da classe Dados. Remova
 * o aluno do array, utilizando o método da classe Dados.
 */
public class Main {
    public static void main(String[] args) {
        /** Objetos das classes People, Student e Data */
        People people = new People();
        Student student = new Student();
        Data data = new Data();

        /** Atribuição de valores */
        people.name = "Laura";
        people.lastName = "Palmer";
        people.age = 17;

        student.name = "Laura";
        student.lastName = "Palmer";
        student.age = 17;
        student.registration = 908653;
        student.group = "Turma D";
        student.course = "Sistemas de informação";

        /** Adição de people e student no Array */
        data.add(people);
        data.add(student);

        /**
         * Novo objeto de pessoas e atribuição dos mesmos valores
         */
        People peopleTwo = new People();
        peopleTwo.name = "Laura";
        peopleTwo.lastName = "Palmer";
        peopleTwo.age = 17;

        /** Verificação de peopleTwo no Array */
        System.out.println(data.contains(peopleTwo));

        /** Remoção do aluno do Array */
        data.remove(student);
        System.out.println(data.contains(student));
    }
}
