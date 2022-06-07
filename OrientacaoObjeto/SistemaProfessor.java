package OrientacaoObjeto;

import OrientacaoObjeto.Model.Diretor;
import OrientacaoObjeto.Model.Professor;

public class SistemaProfessor {
    public static void main(String[] args) {
        
        Diretor xang = new Diretor("xang", 17, 15568498);
        Professor allan = new Professor("Allan", 23, 8635695, "Ciencias da Computacao");
        
        System.out.println("Salario Professor " + allan.getNome() + ": " + allan.calcularSalario(89f));
        System.out.println("Salario Diretor: " + xang.calcularSalario(60f));
    }
}
