package reto7;

public class TramoSinAsfalto extends Tramo {

    private String tipoMaterial;
    private float espesorMaterial;
    private final int ANCHO = 6;
    private final float ESPESOR = 0.25f;

    public TramoSinAsfalto() {
    }

    public TramoSinAsfalto(String tipoMaterial, float espesorMaterial, int xInicial, int yInicial, int xFinal, int yFinal) {
        super(xInicial, yInicial, xFinal, yFinal);
        this.tipoMaterial = tipoMaterial;
        this.espesorMaterial = espesorMaterial;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public float getEspesorMaterial() {
        return espesorMaterial;
    }

    public void setEspesorMaterial(float espesorMaterial) {
        this.espesorMaterial = espesorMaterial;
    }
    
    public float distanciaEntrePuntos(int xInicial,int yInicial,int xFinal,int yFinal){
        //raiz cuadrada (x2-x1)a la d + (y2-y1)a la 2
        float distancia = (float) Math.sqrt(Math.pow((xFinal - xInicial ), 2) + Math.pow((yFinal - xFinal), 2));
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
