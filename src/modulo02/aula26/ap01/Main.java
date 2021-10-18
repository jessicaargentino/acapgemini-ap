package modulo02.aula26.ap01;

/**
 * Crie uma classe veiculo com atributos públicos: marca, modelo e placa. Crie
 * uma classe carro com os atributos públicos: número de portas e capacidade do
 * porta-malas. Crie uma classe Main com um método main. Crie um objeto de
 * classe Veículo e uma de classe Carro e atribua valores para as propriedade de
 * cada objeto. Crie um objeto da classe Object através da instância da classe
 * Veículo. Crie um objeto da classe Object através da instância da classe
 * Carro. Converta o primeiro objeto da Object novamente para um novo objeto da
 * classe Veículo. Converta o segundo objeto da Object novamente para um novo
 * objeto da classe Carro. Imprima todos dos dados do objeto de Veículo
 * convertido. Imprima todos dos dados do objeto de Carro convertido.
 */

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
