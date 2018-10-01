package unb.tecnicas.view.crud;

import unb.tecnicas.controller.impl.ClienteControllerImpl;
import unb.tecnicas.model.Cliente;

import java.util.List;
import java.util.Scanner;

public class ClienteView extends CrudView{

    private static final ClienteControllerImpl clienteController = new ClienteControllerImpl();

    public ClienteView() {
        super("cliente");
    }

    @Override
    public void cadastrar() {
        Cliente cliente = new Cliente();
        doQuestions(cliente);
        clienteController.create(cliente);
    }

    @Override
    public void deletar() {
        Scanner s = new Scanner(System.in);
        listar();
        System.out.println("Informe o id da cliente que deseja deletar: ");
        clienteController.delete(s.nextInt());
    }

    @Override
    public void atualizar() {
        Scanner s = new Scanner(System.in);
        listar();
        System.out.println("Informe o id do cliente que deseja atualizar: ");
        Cliente cliente = clienteController.findOne(s.nextInt());
        doQuestions(cliente);
        clienteController.update(cliente);
    }

    @Override
    public void listar() {
        List<Cliente> clienteList = clienteController.findAll();
        clienteList.forEach( c -> {
            System.out.println();
            c.imprime();
        });
    }

    @Override
    public void doQuestions(Object object) {
        Cliente cliente = (Cliente)object;
        PessoaFisicaView.doQuestions(cliente);
    }
}
