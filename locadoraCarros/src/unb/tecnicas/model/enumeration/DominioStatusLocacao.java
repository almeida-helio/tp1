package unb.tecnicas.model.enumeration;

public enum DominioStatusLocacao {

    /**
     * Emprestado
     */
    E,

    /**
     * Indisponivel
     */
    I,

    /**
     * Disponivel
     */
    D;

    public int getCodigo() {
        return this.ordinal();
    }

    public String getDescricao() {
        switch (this) {
            case E:
                return "Emprestado";
            case D:
                return "Disponivel";
            case I:
                return "Indisponivel";
            default:
                return "";
        }
    }

    public static DominioStatusLocacao getInstance(String valor) {
        if ("E".equals(valor)) {
            return DominioStatusLocacao.E;
        } else if ("D".equals(valor)) {
            return DominioStatusLocacao.D;
        } else if ("I".equals(valor)) {
            return DominioStatusLocacao.I;
        } else {
            return null;
        }
    }

}