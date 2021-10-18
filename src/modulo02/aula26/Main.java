package modulo02.aula26;

public class Main {
    public static void main(String[] args) {
        /** Criação de dois objetos através das instâncias da classe Vehicle e Car */
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        /** Atribuição de valores */
        vehicle.brand = "General Motors";
        vehicle.model = "Chevrolet Opala";
        vehicle.plate = "OPK1987";

        car.numberOfDoors = 4;
        car.capacityOfTrunk = "20kg";

        /**
         * Criação de dois objetos da classe Object apontando pro mesmo local de memória
         * que os objetos vehicle e car
         */
        Object objectOne = vehicle;
        Object objectTwo = car;

        /** Conversão explícita dos objetos de object para Vehicle e Car */
        Vehicle vehicleOne = (Vehicle) objectOne;
        Car carOne = (Car) objectTwo;

        /** Impressão dos objetos convertidos */
        printObject(vehicleOne);
        printObject(carOne);
    }

    /**
     * Método que recebe um objeto por parâmetro e imprime seus atributos
     * 
     * @param o objeto de uma classe
     */
    public static void printObject(Object o) {
        System.out.println(o.toString());
    }
}
