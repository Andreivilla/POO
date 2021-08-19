package dados;

public class ObjetoPdf {
    private String diciplinaNome;
    private String semestreNome;
    private Float mediaExame;
    private float media;


    //getters

    public float getMedia() {
        return media;
    }

    public Float getMediaExame() {
        return mediaExame;
    }

    public String getDiciplinaNome() {
        return diciplinaNome;
    }

    public String getSemestreNome() {
        return semestreNome;
    }
    //setters

    public void setDiciplinaNome(String diciplinaNome) {
        this.diciplinaNome = diciplinaNome;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public void setMediaExame(Float mediaExame) {
        this.mediaExame = mediaExame;
    }

    public void setSemestreNome(String semestreNome) {
        this.semestreNome = semestreNome;
    }
}
