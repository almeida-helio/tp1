package unb.tecnicas.view.crud;

import unb.tecnicas.model.PessoaJuridica;

import java.util.Scanner;

public class PessoaJuridicaView {

    public static void doQuestions(PessoaJuridica pessoaJuridica) {
        Scanner s = new Scanner(System.in);
        PessoaView.doQuestions(pessoaJuridica);
        System.out.println("Informe a razao social: ");
        pessoaJuridica.setRazaoSocial(s.nextLine());
        System.out.println("Informe o cnpj: ");
        pessoaJuridica.setCnpj(s.nextLine());
    }
}
