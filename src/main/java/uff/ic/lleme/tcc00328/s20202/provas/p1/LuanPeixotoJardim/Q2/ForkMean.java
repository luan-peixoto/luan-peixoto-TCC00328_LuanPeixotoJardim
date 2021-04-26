package uff.ic.lleme.tcc00328.s20202.provas.p1.LuanPeixotoJardim.Q2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class ForkMean extends RecursiveAction {
    
    private Valor valor;
    private int inicio = 0;
    private int fim = 0;
    private List<Double> valores = new ArrayList<>();
    protected static int tamanhoJob = 100000;

    public ForkMean(List<Double> valores, Valor _valor) {
        this.valor = _valor;
        this.valores = valores;
        this.inicio = 0;
        this.fim = valores.size();
    }

    private ForkMean(List<Double> valores, Valor _valor, int inicio, int fim) {
        this.valor = _valor;
        this.valores = valores;
        this.inicio = inicio;
        this.fim = fim;
    }

    protected void computeDirectly() {
        for (int i = inicio; i < fim; i++) {
            this.valor.setTotal(this.valores.get(i));
            this.valor.setN(1);
        }
    }

    @Override
    protected void compute() {
        if (fim - inicio < tamanhoJob)
            computeDirectly();
        else {
            int meio = (inicio + fim) / 2;
            invokeAll(new ForkMean(valores, valor, inicio, meio),
                    new ForkMean(valores, valor, meio, fim));
        }
    }
}