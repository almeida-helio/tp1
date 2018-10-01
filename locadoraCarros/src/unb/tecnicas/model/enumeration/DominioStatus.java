package unb.tecnicas.model.enumeration;

public enum DominioStatus {

    /**
     * Diaria
     */
    A,

    /**
     * Por Periodo
     */
    I;


    public int getCodigo() {
        return this.ordinal();
    }

    public String getDescricao() {
        switch (this) {
            case A:
                return "Ativo";
            case I:
                return "Inativo";
            default:
                return "";
        }
    }

    public static DominioStatus getInstance(String valor) {
        if ("A".equals(valor)) {
            return DominioStatus.A;
        } else if ("I".equals(valor)) {
            return DominioStatus.I;
        } else {
            return null;
        }
    }
}
