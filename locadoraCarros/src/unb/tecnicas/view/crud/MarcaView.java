package unb.tecnicas.view.crud;

import unb.tecnicas.controller.impl.MarcaControllerImpl;
import unb.tecnicas.model.Marca;

import java.util.List;
import java.util.Scanner;

public final class MarcaView extends CrudView{

    private MarcaControllerImpl marcaController = new MarcaControllerImpl();

    public MarcaView() {
        super("marca");
    }

    @Override
    public void cadastrar() {
        Marca marca = new Marca();
        doQuestions(marca);
        marcaController.create(marca);
    }

    @Override
    public void deletar() {
        Scanner s = new Scanner(System.in);
        listar();
        System.out.println("Informe o id da marca que deseja deletar: ");
        marcaController.delete(s.nextInt());
    }

    @Override
    public void atualizar() {
        Scanner s = new Scanner(System.in);
        listar();
        System.out.println("Informe o id da marca que deseja atualizar: ");
        Marca marca = marcaController.findOne(s.nextInt());
        doQuestions(marca);
        marcaController.update(marca);
    }

    @Override
    public void listar() {
        List<Marca> marcaList = marcaController.findAll();
        marcaList.forEach( m -> {
            System.out.println();
            m.imprime();
        });
    }

    @Override
    public void doQuestions(Object object) {
        Marca marca = (Marca)object;
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o nome da marca: ");
        marca.setNome(s.nextLine());
    }


}
