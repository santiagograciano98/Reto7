package reto7;

public abstract class Tramo {
    
    public abstract float longitud();
    public abstract float area();
    public abstract float volumen();
    
    protected int xInicial;
    protected int yInicial;
    protected int xFinal;
    protected int yFinal;

    public Tramo() {
    }
    

    public Tramo(int xInicial, int yInicial, int xFinal, int yFinal) {
        this.xInicial = xInicial;
        this.yInicial = yInicial;
        this.xFinal = xFinal;
        this.yFinal = yFinal;
    }

    public int getxInicial() {
        return xInicial;
    }

    public void setxInicial(int xInicial) {
        this.xInicial = xInicial;
    }

    public int getyInicial() {
        return yInicial;
    }

    public void setyInicial(int yInicial) {
        this.yInicial = yInicial;
    }

    public int getxFinal() {
        return xFinal;
    }

    public void setxFinal(int xFinal) {
        this.xFinal = xFinal;
    }

    public int getyFinal() {
        return yFinal;
    }

    public void setyFinal(int yFinal) {
        this.yFinal = yFinal;
    }
    
}
