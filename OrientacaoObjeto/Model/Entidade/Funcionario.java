package OrientacaoObjeto.Model.Entidade;

import OrientacaoObjeto.Model.Enumeracao.Nivel;

public abstract class Funcionario extends Usuario{

    private double salario;

    private boolean isAtivo;
    private Nivel nivel;

    public Funcionario(String nome, int idade, int matricula) {
        super(nome, idade, matricula);
        setSalario(salario);
        setIsAtivo(true);
        setNivel(Nivel.JUNIOR);
    }

    public Nivel getNivel(){
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    } 

    public boolean getIsAtivo() {
        return isAtivo;
    }

    public void setIsAtivo(boolean isAtivo){
        this.isAtivo = isAtivo;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    // assinatura
    public abstract double calcularSalario(double quantidadeHoras);
    
                            // sobrecarga de metodo //

    // public abstract double calcularSalario();
    // public abstract double calcularSalario(int quantidadeHoras); -> Assinaturas Diferente //

}