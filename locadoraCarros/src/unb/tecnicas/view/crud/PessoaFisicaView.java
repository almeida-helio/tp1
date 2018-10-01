package unb.tecnicas.view.crud;

import unb.tecnicas.model.PessoaFisica;
import unb.tecnicas.model.enumeration.DominioSexo;

import java.util.Scanner;

public class PessoaFisicaView {

    public static void doQuestions(PessoaFisica pessoaFisica) {
        Scanner s = new Scanner(System.in);
        PessoaView.doQuestions(pessoaFisica);
        System.out.println("Informe o sexo da pessoa (M/F/O): ");
        pessoaFisica.setSexo(DominioSexo.getInstance(s.nextLine().toUpperCase()));
        System.out.println("Informe a idade que deseja cadastrar: ");
        pessoaFisica.setIdade(s.nextInt());
        System.out.println("Informe o cpf que deseja cadastrar: ");
        pessoaFisica.setCpf(s.nextLine());
        System.out.println("Informe o rg que deseja cadastrar: ");
        pessoaFisica.setRg(s.nextLine());
    }
}
