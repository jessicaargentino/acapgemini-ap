package modulo02.aula26.ap02;

public class Notebook extends Computer {
    public String batery;
    public String wifiSpeed;
    public double bluetoothVersion;

    @Override
    public String toString() {
        return super.toString() + "\nBateria: " + this.batery + "\nVelocidade wifi: " + this.wifiSpeed + "\nVersão bluetooth: "
                + this.bluetoothVersion;
    }
}
