package modulo02.aula17;

public class CadastroPessoa {
    public static void main(String[] args) {
        /* CRIANDO UM ARRAY DE OBJETOS PESSOAFISICA */
        PessoaFisica[] pessoa = new PessoaFisica[5];

        /* CRIANDO CINCO INSTÂNCIAS DA CLASSE PESSOAFISICA (OBJETO) */
        PessoaFisica pessoa1 = new PessoaFisica();
        PessoaFisica pessoa2 = new PessoaFisica();
        PessoaFisica pessoa3 = new PessoaFisica();
        PessoaFisica pessoa4 = new PessoaFisica();
        PessoaFisica pessoa5 = new PessoaFisica();

        /* ATRIBUIÇÃO DE VALORES PARA CADA PESSOA UTILIZANDO OS SETTERS */
        pessoa1.setCodigo(12345);
        pessoa1.setNome("Laura");
        pessoa1.setSobrenome("Palmer");
        pessoa1.setIdade(17);
        pessoa1.setRg("00.000.000");
        pessoa1.setCpf("000.000.000-00");

        pessoa2.setCodigo(93473);
        pessoa2.setNome("Luke");
        pessoa2.setSobrenome("Skywalker");
        pessoa2.setIdade(53);
        pessoa2.setRg("11.111.111");
        pessoa2.setCpf("111.111.111-11");

        pessoa3.setCodigo(82947);
        pessoa3.setNome("Chihiro");
        pessoa3.setSobrenome("Ogino");
        pessoa3.setIdade(10);
        pessoa3.setRg("22.222.222");
        pessoa3.setCpf("222.222.222-22");

        pessoa4.setCodigo(90983);
        pessoa4.setNome("Wirt");
        pessoa4.setSobrenome("Jefferson");
        pessoa4.setIdade(17);
        pessoa4.setRg("33.333.333");
        pessoa4.setCpf("333.333.333-33");

        pessoa5.setCodigo(28374);
        pessoa5.setNome("Pure");
        pessoa5.setSobrenome("Vessel");
        pessoa5.setIdade(24);
        pessoa5.setRg("44.444.444");
        pessoa5.setCpf("444.444.444-44");

        /* ATRIBUINDO CADA PESSOA A UMA POSIÇÃO DO VETOR DE PESSOAS */
        pessoa[0] = pessoa1;
        pessoa[1] = pessoa2;
        pessoa[2] = pessoa3;
        pessoa[3] = pessoa4;
        pessoa[4] = pessoa5;
    }

}
