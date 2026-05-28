package validation;

public interface Validador<T> {
    
    boolean validar(T valor);
}
