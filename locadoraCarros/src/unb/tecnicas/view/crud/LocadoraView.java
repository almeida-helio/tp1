package unb.tecnicas.view.crud;

import unb.tecnicas.controller.impl.LocadoraControllerImpl;
import unb.tecnicas.model.Locadora;

import java.util.List;
import java.util.Scanner;

public class LocadoraView extends CrudView {

    private LocadoraControllerImpl locadoraController = new LocadoraControllerImpl();


    public LocadoraView() {
        super("locadora");
    }

    @Override
    public void cadastrar() {
        Locadora locadora = new Locadora();
        doQuestions(locadora);
        locadoraController.create(locadora);
    }

    @Override
    public void deletar() {
        System.out.println("Ainda nao e possivel deletar uma locadora");
    }

    @Override
    public void atualizar() {
        Scanner s = new Scanner(System.in);
        listar();
        System.out.println("Informe o id da locadora que deseja atualizar: ");
        Locadora locadora = locadoraController.findOne(s.nextInt());
        doQuestions(locadora);
        locadoraController.update(locadora);
    }

    @Override
    public void listar() {
        List<Locadora> locadoraList = locadoraController.findAll();
        locadoraList.forEach( l -> {
            System.out.println();
            l.imprime();
        });
    }

    @Override
    public void doQuestions(Object object) {
        Locadora locadora = (Locadora) object;
        PessoaJuridicaView.doQuestions(locadora);
    }
}
