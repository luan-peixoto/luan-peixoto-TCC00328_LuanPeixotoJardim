package uff.ic.lleme.tcc00328.s20202.exercicios.exercicio20.LuanPeixotoJardim;

public class Reserva {
    
    private String periodo;
    private String quarto_numero;
    private String reserva_numero;
    private String quarto_tipo;
    private int qtd_hospedes;
    private Cliente cliente;

    public Reserva(String _periodo, String _reserva_numero,
            String _quarto_tipo, int _qtd_hospedes, Cliente _cliente) {
        this.periodo = _periodo;
        this.reserva_numero = _reserva_numero;
        this.quarto_tipo = _quarto_tipo;
        this.qtd_hospedes = _qtd_hospedes;
        this.cliente = _cliente;
    }

    /**
     * @return the periodo
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    /**
     * @return the quarto_numero
     */
    public String getQuarto_numero() {
        return quarto_numero;
    }

    /**
     * @param quarto_numero the quarto_numero to set
     */
    public void setQuarto_numero(String quarto_numero) {
        this.quarto_numero = quarto_numero;
    }

    /**
     * @return the reserva_numero
     */
    public String getReserva_numero() {
        return reserva_numero;
    }

    /**
     * @param reserva_numero the reserva_numero to set
     */
    public void setReserva_numero(String reserva_numero) {
        this.reserva_numero = reserva_numero;
    }

    /**
     * @return the quarto_tipo
     */
    public String getQuarto_tipo() {
        return quarto_tipo;
    }

    /**
     * @param quarto_tipo the quarto_tipo to set
     */
    public void setQuarto_tipo(String quarto_tipo) {
        this.quarto_tipo = quarto_tipo;
    }

    /**
     * @return the qtd
     */
    public int getQtd_hospedes() {
        return qtd_hospedes;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd_hospedes(int qtd_hospedes) {
        this.qtd_hospedes = qtd_hospedes;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
   
}
