package modulo02.aula26;

public class Car {
    public int numberOfDoors;
    public String capacityOfTrunk;

    @Override
    public String toString() {
        return "\nNúmero de portas: " + this.numberOfDoors + "\nCapacidade porta-malas: " + this.capacityOfTrunk;
    }
}
