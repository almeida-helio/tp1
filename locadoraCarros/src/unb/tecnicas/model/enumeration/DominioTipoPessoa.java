package unb.tecnicas.model.enumeration;

public enum DominioTipoPessoa {
    /**
     * Fisica
     */
    F,

    /**
     * Juridica
     */
    J;

    public int getCodigo() {
        return this.ordinal();
    }

    public String getDescricao() {
        switch (this) {
            case F:
                return "Fisica";
            case J:
                return "Juridica";
            default:
                return "";
        }
    }

    public static DominioTipoPessoa getInstance(String valor) {
        if ("F".equals(valor)) {
            return DominioTipoPessoa.F;
        } else if ("J".equals(valor)) {
            return DominioTipoPessoa.J;
        } else {
            return null;
        }
    }

}
