package reto7;

public class TramoConAsfalto extends Tramo{
    
    private String proveedorAsfalto;
    private int velocidadMaxima;
    private boolean adelantar;
    private final int ANCHO = 8;
    private final float ESPESOR = 0.25f;

    public TramoConAsfalto() {
    }

    public TramoConAsfalto(String proveedorAsfalto, int velocidadMaxima, boolean adelantar, int xInicial, int yInicial, int xFinal, int yFinal) throws VelocidadNegativaException{
        super(xInicial, yInicial, xFinal, yFinal);
        this.proveedorAsfalto = proveedorAsfalto;
        if(velocidadMaxima >= 0){
            this.velocidadMaxima = velocidadMaxima;
        }else {
            throw new VelocidadNegativaException();
        }
        this.adelantar = adelantar;
    }

    public String getProveedorAsfalto() {
        return proveedorAsfalto;
    }

    public void setProveedorAsfalto(String proveedorAsfalto) {
        this.proveedorAsfalto = proveedorAsfalto;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) throws VelocidadNegativaException{
        if(velocidadMaxima >= 0){
            this.velocidadMaxima = velocidadMaxima;
        }else {
            throw new VelocidadNegativaException();
        }
    }

    public boolean isAdelantar() {
        return adelantar;
    }

    public void setAdelantar(boolean adelantar) {
        this.adelantar = adelantar;
    }
    
    public float distanciaEntrePuntos(int xFinal,int xInicial,int yFinal,int yInicial){
        float distancia = (float) Math.sqrt(Math.pow((xFinal - xInicial ), 2) + Math.pow((yFinal - yInicial), 2));
        return distancia;
    }
    
    @Override
    public float longitud() {
        float longitudRectangulo = (this.ANCHO * 2) + (2 * distanciaEntrePuntos(this.xFinal,this.xInicial,this.yFinal,this.yInicial));
        return longitudRectangulo;
    }

    @Override
    public float area() {
        float areaRectangulo = this.ANCHO * distanciaEntrePuntos(this.xFinal,this.xInicial,this.yFinal,this.yInicial);
        return areaRectangulo;
    }

    @Override
    public float volumen() {
        float volRectangulo = area() * ESPESOR;
        return volRectangulo;
    }
    
}
