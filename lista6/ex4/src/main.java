import dados.CorLataria;
import dados.PotenciaMotor;
import dados.TipoVentilacao;
import dados.Veiculo;

public class main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo(40000);
        veiculo.calculaFatorMotor(PotenciaMotor.MOTOR18);
        veiculo.calculaValorCor(CorLataria.PRETO);
        veiculo.calculaValorVentilacao(TipoVentilacao.AR_CONDICIONADO);

        System.out.println("O preco finaldo veiculo é " + veiculo.calculaTotal());
    }
}
