package OrientacaoObjeto.Model.Entidade;

import OrientacaoObjeto.Model.Excecao.IdadeInvalida;
import OrientacaoObjeto.Model.Excecao.NomeInvalidoException;

public class Usuario {

    private String nome;
    private int idade;
    private int matricula;


    public Usuario(String nome, int idade, int matricula) throws NomeInvalidoException, IdadeInvalida{
        setNome(nome);
        setIdade(idade);
        setMatricula(matricula);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws NomeInvalidoException{
        if (nome.length() <= 3) {
            // throw - lancar 
            throw new NomeInvalidoException(nome);
        }

        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0 || idade > 110) {
            throw new IdadeInvalida(idade);
        }
        this.idade = idade;
    }
    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
