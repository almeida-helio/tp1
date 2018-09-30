package unb.tecnicas.model.enumeration;

public enum DominioSexo {

    /**
     * Masculino
     */
    M,

    /**
     * Feminino
     */
    F,

    /**
     * Outro
     */
    O;

    public int getCodigo() {
        return this.ordinal();
    }

    public String getDescricao() {
        switch (this) {
            case M:
                return "Masculino";
            case F:
                return "Feminino";
            case O:
                return "Outro";
            default:
                return "";
        }
    }

    public static DominioSexo getInstance(String valor) {
        if ("M".equals(valor)) {
            return DominioSexo.M;
        } else if ("F".equals(valor)) {
            return DominioSexo.F;
        } else if ("O".equals(valor)) {
            return DominioSexo.O;
        } else {
            return null;
        }
    }

}