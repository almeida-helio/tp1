package unb.tecnicas.model.enumeration;

public enum DominioTipoLocacao {

    /**
     * Diaria
     */
    D,

    /**
     * Por Periodo
     */
    P;


    public int getCodigo() {
        return this.ordinal();
    }

    public String getDescricao() {
        switch (this) {
            case D:
                return "Diaria";
            case P:
                return "Por periodo";
            default:
                return "";
        }
    }

    public static DominioTipoLocacao getInstance(String valor) {
        if ("D".equals(valor)) {
            return DominioTipoLocacao.D;
        } else if ("P".equals(valor)) {
            return DominioTipoLocacao.P;
        } else {
            return null;
        }
    }
}
