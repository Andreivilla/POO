package dados;

import interfaces.Ventilacao;

public enum TipoVentilacao {
    AR_CONDICIONADO(new Ventilacao() {
        @Override
        public double calculaValorVEntilacao() {
            return 0;
        }
    }),
    NORMAL(new Ventilacao() {
        @Override
        public double calculaValorVEntilacao() {
            return 1700;
        }
    });

    private Ventilacao ventilacao;

    TipoVentilacao(Ventilacao ventilacao) {
        this.ventilacao = ventilacao;
    }

    public Ventilacao getVentilacao() {
        return ventilacao;
    }
}
