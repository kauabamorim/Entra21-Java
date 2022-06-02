package OrientacaoObjeto;

public class SistemaProfessor {
    public static void main(String[] args) {
        
        Professor allan = new Professor("Allan", 23, 53689564, "Ciencias da computacao");

        Turma java = new Turma("Java", 86592, allan);
        Turma js = new Turma("Java", 86592, allan);
        
        System.out.println("Professor: " + allan.getNome());
        System.out.println("Idade: " + allan.getIdade() + " anos");
        System.out.println("Matricula: " + allan.getMatricula());
        System.out.println("Formado em: " + allan.getFormacao());

        allan.cadastroProfessor();
    }
}
