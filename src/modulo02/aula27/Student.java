package modulo02.aula27;

public class Student extends People {
    public int registration;
    public String group;
    public String course;

    /**
     * Sobreescrita do método equals para comparar os atributos específicos do
     * objeto
     * 
     * @param obj objeto de uma classe
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            if (this.registration == student.registration && this.group.equals(student.group)
                    && this.course.equals(student.course)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMatrícula: " + this.registration + "\nTurma: " + this.group + "\nCurso: "
                + this.course;
    }
}
