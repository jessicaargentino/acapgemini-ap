package modulo02.aula26.ap02;

public class Main {
    public static void main(String[] args) {
        /**
         * Criação de três objetos através das instâncias das classes Computer, Desktop
         * e Notebook
         */
        Computer computer = new Computer();
        Notebook notebook = new Notebook();
        Desktop desktop = new Desktop();

        /** Atribuição de valores */
        computer.brand = "Dell";
        computer.memoryRam = "16,0 GB";
        computer.hardDisk = "500GB 7,200 RPM SATA";

        notebook.brand = "Dell";
        notebook.memoryRam = "16,0 GB";
        notebook.hardDisk = "500GB 7,200 RPM SATA";
        notebook.batery = "10.8 V (11.1 V) | 4400 mAh";
        notebook.wifiSpeed = "100 mb";
        notebook.bluetoothVersion = 4.0;

        desktop.brand = "Dell";
        desktop.memoryRam = "16,0 GB";
        desktop.hardDisk = "500GB 7,200 RPM SATA";
        desktop.computerCase = "Ride Mode Glass 06";
        desktop.externalMonitor = "Monitor LED 24 polegadas";
        desktop.powerSuply = "Fortrek 200w";
    }
}
