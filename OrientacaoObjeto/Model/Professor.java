package OrientacaoObjeto.Model;

public class Professor extends  Usuario{

    // atributo
    private String formacao;

    public Professor(String nome, int idade, int matricula, String formacao) {
        super(nome, idade, matricula);

        setFormacao(formacao);
    }

    public String getFormacao(){
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    // metodo
    public void boaTarde() {

        if (getNome() == "Allan") {
            
            System.out.println("\nBoa tarde " + getNome() + "!!!");
        }
    }

    @Override // SobreEscrita de codigo
    public double calcularSalario(double quantidadeHoras) {
        return quantidadeHoras * 15; // 15 = valor por hora do professor(ficticio)
    }
}

