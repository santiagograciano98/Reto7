package reto7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            Carretera miCarretera = new Carretera();
            Tramo tramo = new TramoConAsfalto("ARGOS", 40, true, 0, 0, 8, 0);
            System.out.println("La longitud del tramo 1 es: " + tramo.longitud());
            System.out.println("El area del tramo 1 es: " + tramo.area());
            System.out.println("El volumen del tramo 1 es: " + tramo.volumen());
            System.out.println("------------------------------------------------------");

            Tramo tramo2 = new TramoConAsfalto("ARGOS", 20, true, 8, 0, 16, 0);
            System.out.println("La longitud del tramo 2 es: " + tramo2.longitud());
            System.out.println("El area del tramo 2 es: " + tramo2.area());
            System.out.println("El volumen del tramo 2 es: " + tramo2.volumen());
            System.out.println("------------------------------------------------------");

            Tramo tramo3 = new TramoSinAsfalto("Piedra", 2.5f, 16, 0, 20, -12);
            System.out.println("La longitud del tramo 3 es: " + tramo3.longitud());
            System.out.println("El area del tramo 3 es: " + tramo3.area());
            System.out.println("El volumen del tramo 3 es: " + tramo3.volumen());
            System.out.println("------------------------------------------------------");

            Tramo tramo4 = new TramoConAsfalto("ARGOS", 50, false, 20, -12, 25, -15);
            System.out.println("La longitud del tramo 4 es: " + tramo4.longitud());
            System.out.println("El area del tramo 4 es: " + tramo4.area());
            System.out.println("El volumen del tramo 4 es: " + tramo4.volumen());
            System.out.println("------------------------------------------------------");

            Tramo tramo5 = new TramoSinAsfalto("Arena", 4.5f, 25, -15, 25, -30);
            System.out.println("La longitud del tramo 5 es: " + tramo5.longitud());
            System.out.println("El area del tramo 5 es: " + tramo5.area());
            System.out.println("El volumen del tramo 5 es: " + tramo5.volumen());
            System.out.println("------------------------------------------------------");

            Tramo tramo6 = new TramoSinAsfalto("Balastro", 3.0f, 25, -30, 18, -32);
            System.out.println("La longitud del tramo 6 es: " + tramo6.longitud());
            System.out.println("El area del tramo 6 es: " + tramo6.area());
            System.out.println("El volumen del tramo 6 es: " + tramo6.volumen());
            System.out.println("------------------------------------------------------");

            Tramo tramo7 = new TramoConAsfalto("ARGOS", 70, true, 18, -32, 8, -20);
            System.out.println("La longitud del tramo 7 es: " + tramo7.longitud());
            System.out.println("El area del tramo 7 es: " + tramo7.area());
            System.out.println("El volumen del tramo 7 es: " + tramo7.volumen());
            System.out.println("------------------------------------------------------");

            /*tramo con coordenadas iniciales no conectadas con el anterior lo cual 
             *hace que todos los tramos no esten conectados
            */
            /*
            Tramo tramo8 = new TramoConAsfalto("ARGOS", 70, true, 20, -28, 8, -20);
            System.out.println("La longitud del tramo 7 es: " + tramo8.longitud());
            System.out.println("El area del tramo 7 es: " + tramo8.area());
            System.out.println("El volumen del tramo 7 es: " + tramo8.volumen());
            System.out.println("------------------------------------------------------");
            */

            
            List<Tramo> carretera = new ArrayList<>();
            carretera.add(tramo);
            carretera.add(tramo2);
            carretera.add(tramo3);
            carretera.add(tramo4);
            carretera.add(tramo5);
            carretera.add(tramo6);
            carretera.add(tramo7);
            //carretera.add(tramo8);
            miCarretera.setListaTramos(carretera);

            float totalPerimetro = miCarretera.longitudTotal(carretera);
            System.out.println("El perimetro total de la carretera es: " + totalPerimetro);
            float totalArea = miCarretera.areaTotal(carretera);
            System.out.println("El area total de la carretera es: " + totalArea);
            float volumenTotal = miCarretera.volumenTotal(carretera);
            System.out.println("El volumen total de material a utilizar en la carretera es: " + volumenTotal);
            float volumenTotalEnAsfalto = miCarretera.volumenTotalEnAsfalto(carretera);
            System.out.println("El volumen total de asfalto a utilizar en la carretera es: " + volumenTotalEnAsfalto);
            float volumenTotalSinAsfalto = miCarretera.volumenTotalSinAsfalto(carretera);
            System.out.println("El volumen total a utilizar en tramos sin asfalto es: " + volumenTotalSinAsfalto);
            System.out.println("");
            
            if (miCarretera.tramosConectados(carretera)) {
                System.out.println("Todos los tramos de la carretera estan conectados");
            } else {
                System.out.println("Los tramos de la carretera no estan conectados");
            }
        } catch (VelocidadNegativaException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
