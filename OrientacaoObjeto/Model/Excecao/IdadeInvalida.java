package OrientacaoObjeto.Model.Excecao;

public class IdadeInvalida extends RuntimeException{
    public IdadeInvalida(int idade) {
        super("Idade Invalida");
    }
}
