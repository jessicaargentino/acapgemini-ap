package modulo02.aula26.ap02;

public class Desktop extends Computer {
    public String computerCase;
    public String externalMonitor;
    public String powerSuply;

    @Override
    public String toString() {
        return "\nGabinete: " + this.computerCase + "\nMonitor externo: " + this.externalMonitor + "\nFonte: "
                + this.powerSuply;
    }
}
