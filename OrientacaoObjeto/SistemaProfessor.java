package OrientacaoObjeto;

import OrientacaoObjeto.Model.Entidade.Diretor;
import OrientacaoObjeto.Model.Entidade.Funcionario;
import OrientacaoObjeto.Model.Entidade.Professor;

public class SistemaProfessor {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[1];

        funcionarios[0] = new Professor("Allan", 23, 8635695, "Ciencias da Computacao");

        Diretor xang = new Diretor("xang", 17, 15568498);

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome());
        }
        System.out.println("Salario Diretor: " + xang.calcularSalario(60f));
    }
}
