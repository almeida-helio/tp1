package unb.tecnicas.view.crud;

import unb.tecnicas.controller.impl.CarroControllerImpl;
import unb.tecnicas.controller.impl.MarcaControllerImpl;
import unb.tecnicas.model.Carro;
import unb.tecnicas.model.enumeration.DominioStatusLocacao;

import java.util.List;
import java.util.Scanner;

public class CarroView extends CrudView {

    private CarroControllerImpl carroController = new CarroControllerImpl();

    private MarcaView marcaView = new MarcaView();

    private MarcaControllerImpl marcaController = new MarcaControllerImpl();

    public CarroView() {
        super("carro");
    }

    @Override
    public void cadastrar() {
        Carro carro = new Carro();
        doQuestions(carro);
        carroController.create(carro);
    }

    @Override
    public void deletar() {
        Scanner s = new Scanner(System.in);
        listar();
        System.out.println("Informe o id da carro que deseja deletar: ");
        carroController.delete(s.nextInt());
    }

    @Override
    public void atualizar() {
        Scanner s = new Scanner(System.in);
        listar();
        System.out.println("Informe o id da carro que deseja atualizar: ");
        Carro carro = carroController.findOne(s.nextInt());
        doQuestions(carro);
        carroController.update(carro);
    }

    @Override
    public void listar() {
        List<Carro> carroList = carroController.findAll();
        carroList.forEach( c -> {
            System.out.println();
            c.imprime();
        });
    }
    @Override
    public void doQuestions(Object object) {
        Carro carro = (Carro) object;
        getManufacturerData(carro);
        getPhysicalData(carro);
        getLogicalData(carro);
        carro.setStatusLocacao(DominioStatusLocacao.D);
    }

    private void getManufacturerData (Carro carro) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o modelo do carro: ");
        carro.setModelo(s.nextLine());
        System.out.println("\n\n");
        marcaView.listar();
        System.out.println("\n\n");
        System.out.println("Informe o id da marca: ");
        carro.setMarca(marcaController.findOne(s.nextInt()));
    }

    private void getPhysicalData(Carro carro) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o numero de portas do carro: ");
        carro.setNumeroPortas(s.nextInt());
        System.out.println("Informe o numero de bancos que o carro possui : ");
        carro.setNumeroBancos(s.nextInt());
        System.out.println("Informe o numero de quilometros rodados pelo carro : ");
        carro.setQuilometrosRodados(s.nextDouble());
    }

    private void getLogicalData(Carro carro) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe o renavam do carro: ");
        carro.setRenavam(s.nextLine());
        System.out.println("Informe a placa do carro : ");
        carro.setPlaca(s.nextLine());
    }
}
