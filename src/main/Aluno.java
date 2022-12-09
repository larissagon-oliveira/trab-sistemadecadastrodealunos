import java.util.UUID;

public class Aluno{
    //ATRIBUTOS
    private String nome;
    private String dataNasc;
    private String telefone;
    private String curso;
    private String cpf;
    private String id;
    
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

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getId() {return this.id;}

    public Object[] toObjArr() {
        return new Object[]{ this.id, this.nome, this.telefone, this.curso, this.dataNasc, this.cpf };
    }
    //CONSTRUTOR PADRÃO
    public Aluno(){

    }
    //CONSTRUTORES
    public Aluno(String nome, String telefone, String curso, String dataNasc, String cpf){
        UUID uuid = UUID. randomUUID();
        this.id = uuid.toString();
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.curso = curso;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    public Aluno(String id, String nome, String telefone, String curso, String dataNasc, String cpf){
        this.id = id;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.curso = curso;
        this.cpf = cpf;
        this.telefone = telefone;
    }
}
