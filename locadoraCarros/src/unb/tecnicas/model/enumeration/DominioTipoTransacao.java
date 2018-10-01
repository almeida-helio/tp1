package unb.tecnicas.model.enumeration;

public enum DominioTipoTransacao {
    /**
     * Emprestimo
     */
    E,

    /**
     * Devolucao
     */
    D;

    public int getCodigo() {
        return this.ordinal();
    }

    public String getDescricao() {
        switch (this) {
            case E:
                return "Emprestimo";
            case D:
                return "Devolucao";
            default:
                return "";
        }
    }

    public static DominioTipoTransacao getInstance(String valor) {
        if ("E".equals(valor)) {
            return DominioTipoTransacao.E;
        } else if ("D".equals(valor)) {
            return DominioTipoTransacao.D;
        } else {
            return null;
        }
    }

}
