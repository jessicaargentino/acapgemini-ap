package modulo02.aula26;

public class Main {
    public static void main(String[] args) {
        /** Criação de dois objetos através das instâncias da classe Vehicle e Car */
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        /**
         * Criação de dois objetos de Object através da classe Vehicle e Car
         * respectivamente
         */
        Object objectOne = vehicle;
        Object objectTwo = car;
    }
}
