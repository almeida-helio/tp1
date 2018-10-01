package unb.tecnicas.view.crud;

import unb.tecnicas.model.Pessoa;

import java.util.Scanner;

public final class PessoaView {

    public static void doQuestions(Pessoa pessoa) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o nome que deseja cadastrar: ");
        pessoa.setNome(s.nextLine());
        System.out.println("Informe o telefone que deseja cadastrar: ");
        pessoa.setTelefone(s.nextLine());
        System.out.println("Informe o email que deseja cadastrar: ");
        pessoa.setEmail(s.nextLine());
        System.out.println("Informe o endereco que deseja cadastrar: ");
        pessoa.setEndereco(s.nextLine());
    }

}
