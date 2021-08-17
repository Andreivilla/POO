package negocio;

import dados.Imovel;

public class Imobiliaria {
    private String nome;
    private Imovel[] imoveis = new Imovel[20];
    private int qtdImoveis = 0;

    public void addImovel(Imovel add){
        this.imoveis[qtdImoveis] = add;
        qtdImoveis++;
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Nome: ").append(this.nome).append("\n");
        stringBuilder.append("Imoveis: \n");
        for(int i=0; i<qtdImoveis; i++){
            stringBuilder.append(this.imoveis[i].toString()).append("\n");
        }
        return stringBuilder.toString();
    }

    public Imovel[] filtrarPorArea(float x){
        Imovel[] imoveisMaioreX = new Imovel[this.contaArea(x)];
        int qtdMaiores = 0;
        for(int i=0; i<qtdImoveis; i++){
            if(x <= this.imoveis[i].areaTotal()) {
                imoveisMaioreX[qtdMaiores] = this.imoveis[i];
                qtdMaiores++;
            }
        }
        return this.ordenaMaiorValor(imoveisMaioreX);
    }
    private int contaArea(float x){
        int count = 0;
        for(int i=0; i<qtdImoveis; i++){
            if(this.imoveis[i].areaTotal() >= x){
                count++;
            }
        }
        return count;
    }
    private Imovel[] ordenaMaiorValor(Imovel[] ord){
        for(int i=0; i<ord.length; i++){
            for(int j=0; j<ord.length; j++){
                if(ord[i].getValor() > ord[j].getValor()){
                    Imovel aux = ord[j];
                    ord[j] = ord[i];
                    ord[i] = aux;
                }
            }
        }
        return ord;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public Imovel[] getImoveis() {
        return imoveis;
    }
    public int getQtdImoveis() {
        return qtdImoveis;
    }

    //setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setImoveis(Imovel[] imoveis) {
        this.imoveis = imoveis;
    }
    public void setQtdImoveis(int qtdImoveis) {
        this.qtdImoveis = qtdImoveis;
    }

}
