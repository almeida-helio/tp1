package unb.tecnicas.carga;

import unb.tecnicas.model.Cliente;
import unb.tecnicas.model.enumeration.DominioSexo;
import unb.tecnicas.model.enumeration.DominioTipoPessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class ClienteCarga {

    private static final String[] nomeMasculinos = {"Cebolinha", "Cascao", "Franjinha", "Titi", "Do Contra",
            "Papa-Capim", "Chico-Bento", "Nho Lau", "Teveluisao", "Ze da Roca"};

    private static final String[] nomeFemininos = {"Monica", "Magali", "Maria Cascuda", "Aninha", "Carminha Frufru"
            , "Tina", "Dorinha", "Marina", "Denise", "Rosinha"};

    private static final String[] caracteristicas = {"Baixinha", " ", "Cabelo Espetado", "Nao Toma Banho",
            "Ninguem entende", "Da Roca", "Viciado em Tv", "Cientista", "Dentuco", "Nativo Brasileiro"};


    private static final String[] endereco = {"Campinho", "Laboratorio do Franjinha", "Clube dos Meninos",
            "Morro da Coruja", "Riberão"};

    private static final String[] email = {"turmaDaMonica@monica.com", "turmaDoCebolinha@onion.com",
            "turmaDoCascao@notShower.com", "turmaDoChico@rustico.sistematico.com", "turmaDoContra@favoravel.com"};

    private static final String[] telefone = {"707070707", "123456789", "989878783", "002233445", "556102114"};

    private static final String[] cpf = {"26728482890", "37983311702", "68758531831", "46447986576", "16417834867"};

    public static List<Cliente> gerarClientes() {
        List<Cliente> clienteList = new ArrayList<>();
        for(int i = 0; i < 20; i++) {
            clienteList.add(gerarCliente(i));
        }
        return clienteList;
    }

    public static Cliente gerarCliente(int id) {
        Cliente cliente = new Cliente();
        Random r = new Random();
        cliente.setId(id + 1);
        gerarNomeSexo(cliente);
        cliente.setEndereco("Bairro do Limoeiro " + endereco[r.nextInt(endereco.length - 1)]);
        cliente.setCpf(cpf[r.nextInt(cpf.length - 1)]);
        cliente.setEmail(email[r.nextInt(email.length - 1)]);
        cliente.setTelefone(telefone[r.nextInt(telefone.length -1)]);
        cliente.setIdade(r.nextInt(10) + 10);
        cliente.setTipoPessoa(DominioTipoPessoa.F);
        return cliente;
    }

    private static void gerarNomeSexo(Cliente cliente) {
        Random r = new Random();
        Random c = new Random();
        if (cliente.getId() <= 9) {
            cliente.setSexo(DominioSexo.M);
            cliente.setNome(nomeMasculinos[r.nextInt(nomeMasculinos.length - 1)] +
                    " " + caracteristicas[c.nextInt(caracteristicas.length - 1)]);
            return;
        }
        cliente.setSexo(DominioSexo.F);
        cliente.setNome(nomeFemininos[r.nextInt(nomeFemininos.length - 1)] +
                " " + caracteristicas[c.nextInt(caracteristicas.length - 1)]);
    }


}
