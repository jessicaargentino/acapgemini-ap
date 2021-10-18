package modulo02.aula26.ap02;

public class Computer {
    public String brand;
    public String memoryRam;
    public String hardDisk;

    @Override
    public String toString() {
        return "\nMarca: " + this.brand + "\nMemória RAM: " + this.memoryRam + "\nDisco rígido: " + this.hardDisk;
    }
}
