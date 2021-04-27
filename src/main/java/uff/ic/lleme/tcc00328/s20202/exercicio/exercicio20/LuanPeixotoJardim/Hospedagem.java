package uff.ic.lleme.tcc00328.s20202.exercicio.exercicio20.LuanPeixotoJardim;

public class Hospedagem {
    
    private String periodo;
    private String quarto;
    private String quarto_tipo;
    private int qtd_hospedes;
    private Cliente cliente;
    private String endereco;
    private String nacionalidade;
    private String origem;
    private String destino;
    
    public Hospedagem(String _endereco, String 
                    _nacionalidade, String _origem, String _destino) {
        this.nacionalidade = _nacionalidade;
        this.origem = _origem;
        this.destino = _destino;
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
     * @return the quarto
     */
    public String getQuarto() {
        return quarto;
    }

    /**
     * @param quarto the quarto to set
     */
    public void setQuarto(String quarto) {
        this.quarto = quarto;
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
     * @return the qtd_hospedes
     */
    public int getQtd_hospedes() {
        return qtd_hospedes;
    }

    /**
     * @param qtd_hospedes the qtd_hospedes to set
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

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the nacionalidade
     */
    public String getNacionalidade() {
        return nacionalidade;
    }

    /**
     * @param nacionalidade the nacionalidade to set
     */
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    /**
     * @return the origem
     */
    public String getOrigem() {
        return origem;
    }

    /**
     * @param origem the origem to set
     */
    public void setOrigem(String origem) {
        this.origem = origem;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }
}
