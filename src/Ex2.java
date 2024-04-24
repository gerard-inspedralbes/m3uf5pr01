/*
2. Crear una classe de nom Figura on el constructor rebi un número sencer
amb el nombre de costats de la figura i la longitud de cada costat.
Com el nombre de valors dels costats és variable, utilitzeu el pas de paràmetres
de mida indefinida.
            public Figura(int numCostats, int ...longitud)
Si el nombre de costats es inferior a 3 o si el nombre de costats
no correspon amb el nombre de longituds passades es generarà una excepció
i no es crearà l'objecte. La classe Figura ha de contenir un mètode perímetre
que retorni el perímetre de la figura.
 */

public class Ex2 {

    Figura f;
    {
        try {
            f = new Figura(3,1,2,3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
