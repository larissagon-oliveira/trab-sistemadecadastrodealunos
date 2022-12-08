
public class Aluno{
    //ATRIBUTOS
    private String nome;
    private long dataNasc;
    private long telefone;
    private String curso;
    private long cpf;
    private int id;
    
    //METODOS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public long getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(long dataNasc) {
        this.dataNasc = dataNasc;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }


    public void setId(int id) {
        this.id = id;
    }

    
    //CONSTRUTOR PADRÃO
    public Aluno(){
        
    }
    //CONSTRUTORES
    public Aluno(String nome, long telefone, String curso, long dataNasc, long cpf){
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.curso = curso;
        this.cpf = cpf;
        this.telefone = telefone;

    }
}
