package reto7;

import java.util.List;

public class Carretera {

    private List listaTramos;

    public Carretera() {
    }

    public Carretera(List listaTramos) {
        this.listaTramos = listaTramos;
    }

    public List getListaTramos() {
        return listaTramos;
    }

    public void setListaTramos(List listaTramos) {
        this.listaTramos = listaTramos;
    }

    public float longitudTotal(List<Tramo> tramos) {
        float longitudTotal = 0;
        for (Tramo tramo : tramos) {
            longitudTotal += tramo.longitud();
        }
        return longitudTotal;
    }

    public float areaTotal(List<Tramo> tramos) {
        float areaTotal = 0;
        for (Tramo tramo : tramos) {
            areaTotal += tramo.area();
        }
        return areaTotal;
    }

    public float volumenTotal(List<Tramo> tramos) {
        float volTotal = 0;
        for (Tramo tramo : tramos) {
            volTotal += tramo.volumen();
        }
        return volTotal;
    }

    public float volumenTotalEnAsfalto(List<Tramo> tramos) {
        float volTotalEnAsfalto = 0;
        for (Tramo tramo : tramos) {
            String nombreClase = tramo.getClass().getSimpleName();
            if (nombreClase.equals("TramoConAsfalto")) {
                volTotalEnAsfalto += tramo.volumen();
            }

        }
        return volTotalEnAsfalto;
    }

    public float volumenTotalSinAsfalto(List<Tramo> tramos) {
        float volTotalSinAsfalto = 0;
        for (Tramo tramo : tramos) {
            String nombreClase = tramo.getClass().getSimpleName();
            if (nombreClase.equals("TramoSinAsfalto")) {
                volTotalSinAsfalto += tramo.volumen();
            }

        }
        return volTotalSinAsfalto;
    }

    public boolean tramosConectados(List<Tramo> tramos) {
        int xFinalAuxiliar = 0;
        int yFinalAuxiliar = 0;

        for (int i = 0; i < tramos.size(); i++) {
            if (i > 0) {
                if (xFinalAuxiliar != tramos.get(i).getxInicial() || yFinalAuxiliar != tramos.get(i).getyInicial()) {
                    return false;
                }
            }
            xFinalAuxiliar = tramos.get(i).getxFinal();
            yFinalAuxiliar = tramos.get(i).getyFinal();

        }
        return true;
    }
}
