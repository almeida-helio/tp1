package unb.tecnicas.carga;

import unb.tecnicas.model.Agencia;
import unb.tecnicas.model.Cliente;
import unb.tecnicas.model.Locadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class AgenciaCarga {

    private static final String[] nomes = {
            "Alpha", "Beta", "Gamma", "Omega", "Phi", "Psy", "Delta", "Theta", "Lambda", "Epsilon"
    };


    private static final String[] endereco = {"Campinho", "Laboratorio do Franjinha", "Clube dos Meninos",
            "Morro da Coruja", "Riberão"};

    private static final String[] email = {"turmaDaMonica@monica.com", "turmaDoCebolinha@onion.com",
            "turmaDoCascao@notShower.com", "turmaDoChico@rustico.sistematico.com", "turmaDoContra@favoravel.com"};

    private static final String[] telefone = {"707070707", "123456789", "989878783", "002233445", "556102114"};

    private static final String[] cnpj = {"93522912000104", "88315549000116", "64634828000184",
            "29783458000146", "04480578000143"};

    public static List<Agencia> gerarAgencias(Locadora locadora) {
        List<Agencia> agenciaList = new ArrayList<>();
        for(int i = 0; i <= 5; i++) {
            agenciaList.add(gerarAgencia(i, locadora));
        }
        return agenciaList;
    }

    public static Agencia gerarAgencia(int id, Locadora locadora) {
        Agencia agencia = new Agencia();
        Random r = new Random();
        agencia.setId(id + 1);
        agencia.setNome(nomes[r.nextInt(nomes.length - 1)]);
        agencia.setEndereco("Bairro do Limoeiro " + endereco[r.nextInt(endereco.length - 1)]);
        agencia.setCnpj(cnpj[r.nextInt(cnpj.length - 1)]);
        agencia.setEmail(email[r.nextInt(email.length - 1)]);
        agencia.setTelefone(telefone[r.nextInt(telefone.length -1)]);
        agencia.setRazaoSocial("Mauricios & Mauricios");
        agencia.setGerente(ClienteCarga.gerarCliente(0).getNome());
        agencia.setLocadora(locadora);
        return agencia;
    }


}
