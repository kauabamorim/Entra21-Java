package OrientacaoObjeto.Model.Excecao;

public class NomeInvalidoException extends RuntimeException {
    public NomeInvalidoException(String nome) {
        super("O nome " + nome + " é Invalido");
    }
}
