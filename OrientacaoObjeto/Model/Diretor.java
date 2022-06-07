package OrientacaoObjeto.Model;

public class Diretor extends Funcionario{

    public Diretor(String nome, int idade, int matricula) {
        super(nome, idade, matricula);
    }

    @Override
    public double calcularSalario(double quantidadeHoras) {
        return quantidadeHoras * 30;
    }
}
