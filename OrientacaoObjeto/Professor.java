package OrientacaoObjeto;

public class Professor {

    // atributo
    private String nome;
    private int idade;
    private int matricula;
    private String formacao;

    public Professor(String nome, int idade, int matricula, String formacao) {
        setNome(nome);
        setIdade(idade);
        setMatricula(matricula);
        setFormacao(formacao);
    }

    // pegar
    public String getNome(){
        return nome;
    }

    // definir
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getFormacao(){
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    // metodo
    public void cadastroProfessor() {
        System.out.println("\nProfessor cadastrado!!");
    }
}

