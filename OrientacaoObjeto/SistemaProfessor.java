public class SistemaProfessor {
    public static void main(String[] args) {
        
        Turma java = new Turma("Java", 86592);
        Professor allan = new Professor("Allan", 23, 53689564, "Ciencias da computacao");
        
        System.out.println("Professor: " + allan.getNome());
        System.out.println("Idade: " + allan.getIdade() + " anos");
        System.out.println("Matricula: " + allan.getMatricula());
        System.out.println("Formado em: " + allan.getFormacao());

        allan.cadastroProfessor();
    }
}
