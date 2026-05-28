package validation;

public class ValidarEntero
implements Validador<Integer>{

    @Override
    public boolean validar(Integer valor){

        return valor > 0;
    }
}