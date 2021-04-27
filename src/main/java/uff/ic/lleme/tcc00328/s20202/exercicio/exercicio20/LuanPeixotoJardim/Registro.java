package uff.ic.lleme.tcc00328.s20202.exercicio.exercicio20.LuanPeixotoJardim;

public class Registro {
    
    private Quarto[] quartos;
    private Reserva[] reservas = new Reserva[10];
    private Hospedagem[] hospedagens = new Hospedagem[10];
    
    public Registro() {
        this.quartos = new Quarto[10];
        this.reservas = new Reserva[10];
        this.hospedagens = new Hospedagem[10];
    }

    /**
     * @return the quartos
     */
    public Quarto[] getQuartos() {
        return quartos;
    }

    /**
     * @param quartos the quartos to set
     */
    public void setQuartos(Quarto[] quartos) {
        this.quartos = quartos;
    }

    /**
     * @return the reservas
     */
    public Reserva[] getReservas() {
        return reservas;
    }

    /**
     * @param reservas the reservas to set
     */
    public void setReservas(Reserva[] reservas) {
        this.reservas = reservas;
    }

    /**
     * @return the hospedagens
     */
    public Hospedagem[] getHospedagens() {
        return hospedagens;
    }

    /**
     * @param hospedagens the hospedagens to set
     */
    public void setHospedagens(Hospedagem[] hospedagens) {
        this.hospedagens = hospedagens;
    }
    
}
