package dados;

public class Trapezio extends FormaGeometrica{
    private int altura;
    public void setBaseMenor(int valor){
        setMedida1(valor);
    }
    public void setBaseMaior(int valor){
        setMedida2(valor);
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getAltura() {
        return altura;
    }
    @Override
    public int calcularArea(){
        return (getMedida2() - getMedida1() * getAltura())/2;
    }
    @Override
    public int calcularPerimetro(){
        return (int) ((int) 4*Math.pow((getMedida2() - getMedida1())/2,0.5));
    }
    @Override
    public String toString(){
        String str = "";
        str += "Base menor: " + getMedida1();
        str += "\nBase maior: " + getMedida2();
        str += "\nPerimetro: " + calcularPerimetro();
        str += "\nArea: "+ calcularArea();
        return str;
    }
}
