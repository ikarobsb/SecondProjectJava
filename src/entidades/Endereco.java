package entidades;

public class Endereco {
    // atributos
    private String logradouro;
    private String nome;
    private String numero;
    private String cep;
    private String cidade;
    private String uf;
    private String bairro;

    // construtor - é utilizado para tornar obrigatório um parâmetro ou inicializar variáveis.
    // Criaremos três construtores, um em que só se passe o CEP, outro em que não se passa nada e um terceiro em que se passa tudo.
    
    // construtor 1
    public Endereco(String cep) {
        setCep(cep);
    }

    // construtor 2
    public Endereco(){
        // nada
    }

    // construtor 3
    public Endereco(String logradouro, String nome, String numero, String cep, String cidade, String uf,
            String bairro) {
        this.setLogradouro(logradouro);
        setNumero(numero);
        this.setCep(cep);
        setCidade(cidade);
        this.setUf(uf);
        setBairro(bairro);
    }

    // getters
    public String getLogradouro() {
        return logradouro;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getBairro() {
        return bairro;
    }

    // setters
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    // toString
    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + logradouro + '\'' +
                ", nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }    
}