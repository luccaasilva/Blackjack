public class Carta {
    private int numero;
    public int getNumero() {
        return numero;
    }

    private String palo;
    public String getPalo() {
        return palo;
    }
    public Carta(int numero,String palo){
        this.numero=numero;
        this.palo = palo;
    }

    public static String palos[] = new String[]{"♠", "♥", "♦", "♣"};

    @Override
    public String toString() {
        return "Carta{" +
                "numero=" + numero +
                ", palo='" + palo + '\'' +
                '}';
    }
}
