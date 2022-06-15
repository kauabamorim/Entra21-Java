package OrientacaoObjeto.Model.Entidade;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private int codigo;
    private Professor professor;
    private List<Aluno> alunos;

    public Turma (String nome, int codigo, Professor professor) {
        setNome(nome);
        setCodigo(codigo);
        alunos = new ArrayList<Aluno>();
    }

    public List<Aluno> getAluno(){
        return alunos;
    }

    public Professor getProfessor(){
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
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

    public boolean inserirAluno(Aluno aluno) {
        return alunos.add(aluno);
    }

    public boolean removerAluno(Aluno aluno) {
        return  alunos.remove(aluno);

    }
}

