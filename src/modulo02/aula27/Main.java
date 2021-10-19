package modulo02.aula27;

public class Main {
    public static void main(String[] args) {
        /** Objetos das classes People e Student */
        People people = new People();
        Student student = new Student();

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
    }
}
