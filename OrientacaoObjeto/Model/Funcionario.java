package OrientacaoObjeto.Model;

public abstract class Funcionario extends Usuario{

    public Funcionario(String nome, int idade, int matricula) {
        super(nome, idade, matricula);
    }

    // assinatura
    public abstract double calcularSalario(double quantidadeHoras);
    
                            // sobrecarga de metodo //

    // public abstract double calcularSalario();
    // public abstract double calcularSalario(int quantidadeHoras); -> Assinaturas Diferente //

}