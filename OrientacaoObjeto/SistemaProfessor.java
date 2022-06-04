package OrientacaoObjeto;

import OrientacaoObjeto.Model.Professor;
import OrientacaoObjeto.Model.Turma;

public class SistemaProfessor {
    public static void main(String[] args) {
        
        Professor allan = new Professor("Allan", 23, 53689564, "Ciencias da computacao");

        Turma java = new Turma("Java", 86592, allan);
        Turma js = new Turma("Javascript", 86592, allan);
        
        System.out.println("Aula: " + js.getNome() + " Codigo: " + js.getCodigo());
        System.out.println("Aula: " + java.getNome() + " Codigo: " + java.getCodigo());
        
        allan.boaTarde();
    }
}
