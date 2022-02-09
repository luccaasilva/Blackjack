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
            barajada.add(barajaCompleta.get(indiceAleatorio));
        }
        barajaCompleta=barajada;
        for (Carta carta :barajada) {
            System.out.println(carta);
        }
    }

    public void imprimeCartas() {
        for (Carta carta :barajaCompleta) {
            System.out.println(carta);
        }
    }

    @Override
    public String toString() {
        return "Baraja{" +
                "barajaCompleta=" + barajaCompleta +
                '}';
    }
}
