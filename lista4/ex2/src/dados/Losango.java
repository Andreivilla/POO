package dados;

public class Losango extends FormaGeometrica{
    public void setD(int valor){
        setMedida1(valor);
    }
    public void setd(int valor){
        setMedida2(valor);
    }
    @Override
    public int calcularArea(){
        return getMedida2()*getMedida1()/2;
    }
    @Override
    public int calcularPerimetro(){
        return (int) (4*Math.pow(Math.pow(getMedida1(),2)/4 + Math.pow(getMedida2(),2)/4 ,0.5));
    }

    @Override
    public String toString() {
        String str = "";
        str += "Diagonal maior: " + getMedida2();
        str += "\nDiagonal menor: " + getMedida1();
        str += "\nArea: " + calcularArea();
        str += "\nPerietro: " + calcularPerimetro();
        return str;
    }
}
