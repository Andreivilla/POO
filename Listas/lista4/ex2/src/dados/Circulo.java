package dados;

public class Circulo extends FormaGeometrica{
    public void setRaio(int valor){
        super.setMedida1(valor);
    }
    @Override
    public int calcularPerimetro() {
        return (int) (Math.PI * 2 * getMedida1());
    }
    @Override
    public int calcularArea(){
        return (int) (Math.PI * Math.pow(getMedida1(), 2));
    }
    @Override
    public String toString() {
        String str = "";
        str += "Raio: " + getMedida1();
        str += "\nArea: " + calcularPerimetro();
        str += "\nPerimetro: " + calcularPerimetro();
        return str;
    }
}
