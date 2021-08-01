public class Arquivo {
    private String nome;
    private String extensao;

    public Arquivo(String nome){
        this.nome = nome;
        try {
            //Nao pode possuir quebras de linhas;
            if(nome.contains("\n")) {
                throw new NomeInvalidoException("Possui quebra de linhas");
            }
            //Nao pode possuir colchetes ou parenteses;
            if(nome.contains("(") || nome.contains(")") || nome.contains("[") || nome.contains("]")){
                throw new NomeInvalidoException("Possui colchetes ou parenteses");
            }
            //Nem pode possuir aspas simples ou duplas;
            if(nome.contains("\"") || nome.contains("'")){
                throw new NomeInvalidoException("Possui aspas simples ou duplas");
            }
            //Deve possuir no mınimo 10 caracteres e no maximo 256.
            if(nome.length() < 10 || nome.length() > 256){
                throw new NomeInvalidoException("Possui mais que 256 ou menos que 10 caracteres");
            }
        }catch (NomeInvalidoException e){
            e.printStackTrace();
        }
    }

    //getters
    public String getNome() {
        return nome;
    }
    public String getExtensao() {
        return extensao;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setExtensao(String extensao) {
        this.extensao = extensao;
    }
}
