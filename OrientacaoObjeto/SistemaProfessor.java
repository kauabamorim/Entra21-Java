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
        System.out.println(professores.size());

        Professor professor = new Professor("Allan", 15, 2314, "Ciencias");
        professores.add(professor);

        System.out.println(professores.size());

        for (Professor professor1 : professores) {
            System.out.println(professor1.getNome());
        }
    }
}
