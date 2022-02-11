import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Baraja {
    private List<Carta> barajaCompleta = new LinkedList<>();

    public Baraja() {
        for (String palo : Carta.palos) {
            for (int i = 1; i <= 13; i++) {
                barajaCompleta.add(new Carta(i, palo));
            }
        }
    }


    public void barajar() {
        Random random = new Random();
        List<Carta> barajada = new LinkedList<>();
        while (!barajaCompleta.isEmpty()) {
            int indiceAleatorio = random.nextInt(barajaCompleta.size());
            barajada.add(barajaCompleta.remove(indiceAleatorio));

        }
        barajaCompleta = barajada;
    }

    public Carta extraerCarta() {
        Carta sacar;
        if (!barajaCompleta.isEmpty()) {
            sacar = barajaCompleta.remove(0);
            return sacar;
        }
        return null;
    }

    public List<Carta> ordenada() {
        List<Carta> barajaFinal = new LinkedList<>();
        for (String palo : Carta.palos) {
            for (Carta carta : barajaCompleta) {
                if (carta.getPalo().equals(palo)) {
                    barajaFinal.add(carta);
                }
            }
        }
        return barajaFinal;
    }

    public void imprimeOrdenada() {
        for (Carta carta : ordenada()) {
            System.out.println(carta);
        }
    }

    public void imprimeBarajadas() {
        for (Carta carta : barajaCompleta) {
            System.out.println(carta);
        }
    }

    public void imprimeCartas() {
        for (Carta carta : barajaCompleta) {
            System.out.println(carta);
        }
    }

    @Override
    public String toString() {
        return "Baraja{" +
                "barajaCompleta=" + barajaF +
                '}';
    }
}
