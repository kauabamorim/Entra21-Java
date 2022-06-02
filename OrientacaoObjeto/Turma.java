public class Turma {
    private String nome;
    private int codigo;
    private int quantidadeAlunos;
    private Aluno[] alunos;   

    public Turma (String nome, int codigo) {
        setNome(nome);
        setCodigo(codigo);
        quantidadeAlunos = 0;
        alunos = new Aluno[quantidadeAlunos];
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Aluno[] getAlunos() {
        return alunos;
    }

    public boolean inserirAluno(Aluno aluno) {
        if (!(quantidadeAlunos <= alunos.length)) {
            return false;
        }

        alunos[quantidadeAlunos] = aluno;
        quantidadeAlunos++;

        return true;
    }
    public boolean removerAluno(Aluno aluno) {

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].getMatricula() == aluno.getMatricula()) {
                alunos[i] = null;
                return true;
            }
        }
        return false;
    }
}

