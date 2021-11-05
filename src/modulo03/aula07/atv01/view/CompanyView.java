package modulo03.aula07.atv01.view;

import modulo03.aula07.atv01.controller.CompanyController;
import modulo03.aula07.atv01.model.Company;

/**
 * Crie um sistema para cadastro de Empresas. A empresa deve possuir três
 * atributos públicos: nome, cnpj e ramo de atividade. Utilize o padrão DAO para
 * criar uma estrutura de armazenamento de dados em um arquivo do tipo CSV. A
 * estrutura de armazenamento deve apenas salvar e ler os dados. Os dados devem
 * ser convertidos de Objeto para String ao salvar. Os dados devem ser
 * convertidos de String para Objeto ao ler. Utilize os métodos de leitura e
 * escrita em uma classe View.
 */
public class CompanyView {
    public static void main(String[] args) {
        /** Criação de um objeto da classe Company e atribuição de valores */
        CompanyController companyController = new CompanyController();
        Company company = new Company();
        company.name = "Capgemini";
        company.cpnj = "65.599.953/0005-97";
        company.branch = "Tecnologia";

        /** Chamada dos métodos de escrita e leitura */
        companyController.createFile("C:\\dados\\dados.csv", company);
        System.out.print("***** COMPANY *****");
        companyController.readFile("C:\\dados\\dados.csv");
    }
}
