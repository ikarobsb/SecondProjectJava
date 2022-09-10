package entidades;

public class Contato {
    // atributos
    private String email;
    private String fixo;
    private String movel;
    
    // Getters e Setters
    public String getEmail() {
        return email;
    }
    public String getFixo() {
        return fixo;
    }
    public String getMovel() {
        return movel;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFixo(String fixo) {
        this.fixo = fixo;
    }
    public void setMovel(String movel) {
        this.movel = movel;
    }

    // Não faremos o construtor pois não é obrigatório passar nenhum parâmetro para criar um contato.   
}
