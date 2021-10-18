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

        /** Impressão dos atributos dos objetos convertidos */
        System.out.println("***** VEÍCULO *****");
        System.out.println("Marca: " + vehicleOne.brand);
        System.out.println("Modelo: " + vehicleOne.model);
        System.out.println("Placa: " + vehicleOne.plate);

        System.out.println("\n***** CARRO *****");
        System.out.println("Número de portas: " + carOne.numberOfDoors);
        System.out.println("Capacidade do porta-mala: " + carOne.capacityOfTrunk);
    }
}
