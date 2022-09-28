import java.util.Random;

public class ConsumidorBanana extends Thread {

    private Ceasa ceasa;
    private Random aleatorio;

    public ConsumidorBanana(Ceasa ceasa) {
        this.ceasa = ceasa;
        aleatorio = new Random();

    }

    @Override
    public void run() {

        try {
            int qtdRetirada = aleatorio.nextInt(500 - 1) + 1;

            ceasa.retirarBanana(qtdRetirada);
            int tempo = aleatorio.nextInt(50);
            Thread.sleep(tempo);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
