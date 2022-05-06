public class Impressao {

    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;
    private TamanhoImpressao tamanhoImpressao;
    private int paginasPretoBranco;

    public Impressao(TamanhoImpressao tamanhoImpressao, int paginasTotais, int paginasColoridas, boolean ehFrenteVerso) {
        this.tamanhoImpressao = tamanhoImpressao;
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
        this.paginasPretoBranco = paginasTotais - paginasColoridas;
    }

    public int getPaginasTotais() {
        return paginasTotais;
    }

    public int getPaginasColoridas() {
        return paginasColoridas;
    }

    public boolean isEhFrenteVerso() {
        return ehFrenteVerso;
    }

    public double getValorColoridasFrenteVerso() {
        return valorColoridasFrenteVerso;
    }

    public double getValorPretoBrancoFrenteVerso() {
        return valorPretoBrancoFrenteVerso;
    }

    public double getValorColoridasFrenteApenas() {
        return valorColoridasFrenteApenas;
    }

    public double getValorPretoBrancoFrenteApenas() {
        return valorPretoBrancoFrenteApenas;
    }

    public TamanhoImpressao getTamanhoImpressao() {
        return tamanhoImpressao;
    }

    public int getPaginasPretoBranco() {
        return paginasPretoBranco;
    }

    public double calcularTotal() {
        double total = 0;

        if (ehFrenteVerso) {
            if (tamanhoImpressao.equals(TamanhoImpressao.A2)) {
                valorPretoBrancoFrenteVerso = 0.28;
                valorColoridasFrenteVerso = 0.18;
                total += paginasColoridas * valorColoridasFrenteVerso;
                total += paginasPretoBranco * valorPretoBrancoFrenteVerso;
            }
            if (tamanhoImpressao.equals(TamanhoImpressao.A3)) {
                valorPretoBrancoFrenteVerso = 0.25;
                valorColoridasFrenteVerso = 0.15;
                total += paginasColoridas * valorColoridasFrenteVerso;
                total += paginasPretoBranco * valorPretoBrancoFrenteVerso;
            }
            if (tamanhoImpressao.equals(TamanhoImpressao.A4)) {
                valorPretoBrancoFrenteVerso = 0.20;
                valorColoridasFrenteVerso = 0.10;
                total += paginasColoridas * valorColoridasFrenteVerso;
                total += paginasPretoBranco * valorPretoBrancoFrenteVerso;
            }
        } else {
            if (tamanhoImpressao.equals(TamanhoImpressao.A2)) {
                valorPretoBrancoFrenteApenas = 0.32;
                valorColoridasFrenteApenas = 0.22;
                total += paginasPretoBranco * valorPretoBrancoFrenteApenas;
                total += paginasColoridas * valorColoridasFrenteApenas;
            }
            if (tamanhoImpressao.equals(TamanhoImpressao.A3)) {
                valorPretoBrancoFrenteApenas = 0.30;
                valorColoridasFrenteApenas = 0.20;
                total += paginasPretoBranco * valorPretoBrancoFrenteApenas;
                total += paginasColoridas * valorColoridasFrenteApenas;
            }
            if (tamanhoImpressao.equals(TamanhoImpressao.A4)) {
                valorPretoBrancoFrenteApenas = 0.25;
                valorColoridasFrenteApenas = 0.15;
                total += paginasPretoBranco * valorPretoBrancoFrenteApenas;
                total += paginasColoridas * valorColoridasFrenteApenas;
            }
        }
        return total;
    }

    @Override
    public String toString() {

        String frenteVerso;
        if (ehFrenteVerso == true) {
            frenteVerso = "frente e verso";
        } else {
            frenteVerso = "frente apenas";
        }
        return String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f",
                getPaginasTotais(), getPaginasColoridas(),
                getPaginasTotais() - getPaginasColoridas(),
                frenteVerso, calcularTotal());
    }
}
