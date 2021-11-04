package modulo03.aula07.atv01;

public class CompanyView {
    public static void main(String[] args) {
        /** Criação de um objeto da classe Company e atribuição de valores */
        Company company = new Company();
        company.name = "Capgemini";
        company.cpnj = "65.599.953/0005-97";
        company.branch = "Tecnologia";

        /** Chamada dos métodos de escrita e leitura */
        company.createFile("C:\\dados\\dados.csv");
        System.out.print("***** COMPANY *****");
        company.readFile("C:\\dados\\dados.csv");
    }
}
