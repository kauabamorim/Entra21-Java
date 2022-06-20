package OrientacaoObjeto;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.List;

import OrientacaoObjeto.Model.Entidade.Diretor;
import OrientacaoObjeto.Model.Entidade.Funcionario;
import OrientacaoObjeto.Model.Entidade.Professor;

public class SistemaProfessor {
    public static void main(String[] args) {

        List<Professor> professores = new ArrayList<Professor>();

        Professor allan = new Professor("Allan", 25, 2314, "Ciencias");
        professores.add(allan);

        Professor  carlos = new Professor("Carlos", 18, 2324546, "Math");
        professores.add(carlos);

        for (Professor professor : professores) {
            System.out.println("Nome: " + professor.getNome() + "\nMatricula: " + professor.getMatricula());
        }
    }
}
