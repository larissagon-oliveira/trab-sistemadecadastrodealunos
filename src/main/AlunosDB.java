import java.util.Arrays;

public class AlunosDB {
    private Aluno[] alunos;
    public AlunosDB(){
        this.alunos = new Aluno[0];
    }

    public Aluno[] getAlunos() {
        return this.alunos;
    }

    public Aluno getAluno(String id){
        for(Aluno aluno : this.alunos){
            if( aluno.getId().equals(id) ){
                System.out.println("Aluno encontrado");
                return aluno;
            }
        }
        System.out.println("Aluno com ID informado nao foi encontrado");
        return new Aluno();
    }

    private int getAlunoIndex(String id) {
        for (int i = 0; i < this.alunos.length; i++) {
            if (this.alunos[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void updateAluno(Aluno novoDado){
        for(int i = 0; i < this.alunos.length; i++){
            if(this.alunos[i].getId().equals(novoDado.getId())){
                this.alunos[i] = novoDado;
                return;
            }
        }
    }

    public Object[][] getAlunosObj(){

        Object[][] rData = new Object[this.alunos.length][this.alunos.length];

        for(int i = 0; i < this.alunos.length; i++){
            rData[i] = this.alunos[i].toObjArr();
        }

        return rData;
    }

    public void dropAluno(String id){
        Aluno[] alunosTmp = Arrays.copyOf(this.alunos, this.alunos.length -1);
        int indexAluno = getAlunoIndex(id);

        if (indexAluno >= -1) {
            System.arraycopy(this.alunos, 0, alunosTmp, 0, indexAluno);
            System.arraycopy(this.alunos, indexAluno + 1,  alunosTmp, indexAluno, this.alunos.length - indexAluno - 1);
        }
        this.alunos = alunosTmp;
    }

    public void addAluno(Aluno aluno){
        Aluno[] alunosTmp;
        if(this.alunos.length  == 0){
            alunosTmp = new Aluno[1];
            alunosTmp[0] = aluno;
        }else{
            alunosTmp = Arrays.copyOf(alunos, alunos.length + 1);
            alunosTmp[alunosTmp.length - 1] = aluno;
        }
        this.alunos = alunosTmp;
    }

    public int getSize(){
        return this.alunos.length;
    }
}
