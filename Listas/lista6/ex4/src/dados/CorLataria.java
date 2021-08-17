package dados;

import interfaces.Cor;

public enum CorLataria {
    BRANCO(new Cor() {
        @Override
        public double calculaVAlor() {
            return 0;
        }
    }),
    PRETO(new Cor() {
        @Override
        public double calculaVAlor() {
            return 850;
        }
    }),
    PRATA(new Cor() {
        @Override
        public double calculaVAlor() {
            return 1100;
        }
    }),
    VERMELHO(new Cor() {
        @Override
        public double calculaVAlor() {
            return 1250;
        }
    }),
    AZUL(new Cor() {
        @Override
        public double calculaVAlor() {
            return 1150;
        }
    });

    private Cor cor;

    CorLataria(Cor cor) {
        this.cor = cor;
    }
    public Cor getCor(){
        return this.cor;
    }
}
