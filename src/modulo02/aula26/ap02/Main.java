package modulo02.aula26.ap02;

/**
 * Crie uma classe computador com atributos públicos: marca, memoria ram,
 * processador e disco rigido. Crie uma classe notebook que herda de computador
 * com os atributos públicos: bateria, velocidade wifi e versão bluetooth. Crie
 * uma classe desktop que herda de computador com os atributos públicos: tamanho
 * gabinete, monitor externo e fonte. Crie uma sobrescrita do método toString
 * nas três classes para imprimir todos os dados. Crie uma classe Main com um
 * método main. Crie um objeto da classe Computador, um da classe Notebook, um
 * da classe Desktop e atribua valores para as propriedade de cada objeto. Crie
 * um objeto da classe Object através da instância da classe Computador. Crie um
 * objeto da classe Object através da instância da classe Notebook. Crie um
 * objeto da classe Object através da instância da classe Desktop. Converta o
 * primeiro objeto da Object novamente para um novo objeto da classe Computador.
 * Converta o segundo objeto da Object novamente para um novo objeto da classe
 * Notebook. Converta o terceiro objeto da Object novamente para um novo objeto
 * da classe Desktop. Imprima todos dos dados do objeto de Computador convertido
 * através do toString. Imprima todos dos dados do objeto de Notebook convertido
 * através do toString. Imprima todos dos dados do objeto de Desktop convertido
 * através do toString.
 */
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

        /**
         * Criação de três objetos da classe Object apontando pro mesmo local de memória
         * que os objetos computer, notebook e desktop
         */
        Object objectOne = computer;
        Object objectTwo = notebook;
        Object objectThree = desktop;

        /**
         * Conversão explícita dos objetos de object para Computer, Notebook e Desktop
         */
        Computer computerOne = (Computer) objectOne;
        Notebook notebookOne = (Notebook) objectTwo;
        Desktop desktopOne = (Desktop) objectThree;

        /** Impressão dos dados dos objetos */
        System.out.println("***** COMPUTADOR *****" + computerOne);
        System.out.println("\n***** NOTEBOOK *****" + notebookOne);
        System.out.println("\n***** DESKTOP *****" + desktopOne);
    }
}
