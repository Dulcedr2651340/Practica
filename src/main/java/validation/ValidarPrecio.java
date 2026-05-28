package validation;

import com.Validation.Validador;

public class ValidarPrecio implements Validador<Double>{

    @Override
    public boolean validar(Double valor){

        return valor > 0;
    }
    
}
