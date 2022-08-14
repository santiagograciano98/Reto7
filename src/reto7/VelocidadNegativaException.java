package reto7;

public class VelocidadNegativaException extends Exception{
    
    public VelocidadNegativaException(){
        super("El limite de velocidad no puede ser negativo");
    }
    
}
