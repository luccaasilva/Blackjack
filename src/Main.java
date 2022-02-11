public class Main {
    public static void main(String[] args) {
Baraja baraja = new Baraja();
     //   baraja.imprimeCartas();
        baraja.barajar();
   //     baraja.imprimeCartasBar();
        System.out.println();
        System.out.println(baraja.extraerCarta());
        System.out.println();
   //     baraja.imprimeCartasBar();
        baraja.imprimeOrdenada();
    }
}
