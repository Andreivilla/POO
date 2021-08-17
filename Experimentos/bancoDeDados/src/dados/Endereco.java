package dados;

public class Endereco {
    private int id;
    private String rua;
    private int numero;
    private String cidade;
    private int idPessoa;

    public Endereco(int id, String rua, int numero, String cidade) {
        setCidade(cidade);
        setId(id);
        setNumero(numero);
        setRua(rua);
    }

    //getters
    public int getId() {
        return id;
    }
    public int getIdPessoa() {
        return idPessoa;
    }
    public int getNumero() {
        return numero;
    }
    public String getCidade() {
        return cidade;
    }
    public String getRua() {
        return rua;
    }

    //setters
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
}
