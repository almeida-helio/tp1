package unb.tecnicas.model.enumeration;

public enum DominioStatusTransacao {
    /**
     * Iniciada
     */
    I,
    /**
     * Pendente
     */
    P,


    /**
    * Recusada
    */
    R,

    /**
     * Concluida
     */
    C;

    public int getCodigo() {
        return this.ordinal();
    }

    public String getDescricao() {
        switch (this) {
            case I:
                return "Iniciada";
            case P:
                return "Pendente";
            case C:
                return "Concluida";
            case R:
                return "Recusada";
            default:
                return "";
        }
    }

    public static DominioStatusTransacao getInstance(String valor) {
        switch (valor) {
            case "I":
                return DominioStatusTransacao.I;
            case "P":
                return DominioStatusTransacao.P;
            case "C":
                return DominioStatusTransacao.C;
            case "R":
                return DominioStatusTransacao.R;
            default:
                return null;

        }
    }

}
