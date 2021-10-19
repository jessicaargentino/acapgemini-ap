package modulo02.aula27;

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
         * Novo objeto de pessoas com mesmos dados/apontando para o mesmo espaço de
         * memória
         */
        People peopleTwo = people;

        /** Verificação de peopleTwo no Array */
        System.out.println(data.contains(peopleTwo));
    }
}
