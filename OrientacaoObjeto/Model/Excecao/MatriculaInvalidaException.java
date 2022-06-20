package OrientacaoObjeto.Model.Excecao;

public class MatriculaInvalidaException extends RuntimeException{
    public MatriculaInvalidaException(int matricula) {
        super("A matricula " + matricula + " é invalida");
    }
}
