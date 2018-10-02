package unb.tecnicas.model;

public class Locadora extends  PessoaJuridica{

    private String presidente;

    private String vicePresidente;

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getVicePresidente() {
        return vicePresidente;
    }

    public void setVicePresidente(String vicePresidente) {
        this.vicePresidente = vicePresidente;
    }

    public Locadora clone() {
        return (Locadora) super.clone();
    }

    public void imprime() {
        super.imprime();
        System.out.print("\nPresidente: "+ presidente);
        System.out.print("\nVice-Presidente: "+ vicePresidente);
    }
}
