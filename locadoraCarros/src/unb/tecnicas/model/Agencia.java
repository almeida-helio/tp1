package unb.tecnicas.model;

public class Agencia extends PessoaJuridica{

    private Locadora locadora;

    private String gerente;

    public Locadora getLocadora() {
        return locadora;
    }

    public void setLocadora(Locadora locadora) {
        this.locadora = locadora;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public void imprime() {
        System.out.print("\n");
        super.imprime();
        System.out.print("\ngerente: " + gerente);
        System.out.print("\nLocadora {");
        locadora.imprime();
        System.out.print("}\n");
    }

    public void imprimeResumo() {
        System.out.print("\nid: " + getId());
        System.out.print("\nnome: " + getNome());
    }


    public Agencia clone() {
        return (Agencia) super.clone();
    }

}
