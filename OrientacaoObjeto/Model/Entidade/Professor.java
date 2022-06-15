package OrientacaoObjeto.Model.Entidade;

public class Professor extends  Funcionario{

    // atributo
    private String formacao;

    public Professor(String nome, int idade, int matricula, String formacao) {
        super(nome, idade, matricula);

        setFormacao(formacao);
    }

    public boolean equals(Object obj) {
        
        // receita de bolo

        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Professor professor = (Professor) obj;

        return this.getNome().equals(professor.getNome()) 
            && this.getIdade() == professor.getIdade()
                && this.getMatricula() == professor.getMatricula();
    }

    public String getFormacao(){
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override // SobreEscrita de codigo
    public double calcularSalario(double quantidadeHoras) {
        return quantidadeHoras * 15; // 15 = valor por hora do professor(ficticio)
    }
}


