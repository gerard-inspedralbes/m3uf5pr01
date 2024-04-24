public class Figura {
    private int numCostats;
    private int[] longitud;

    public Figura(int numCostats, int ...longitud) throws Exception {
        if (numCostats != longitud.length || numCostats < 3) {
            throw new Exception("La figura no es pot generar");
        }else {
            this.numCostats = numCostats;
            this.longitud = longitud;
        }
    }

    public int perimetre(){
        int perimetre = 0;
        for (int i = 0; i < longitud.length; i++) {
            perimetre += longitud[i];
        }
        return perimetre;
    }
}
