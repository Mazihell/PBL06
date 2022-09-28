import java.util.Random;

public class ConsumidorMacas extends Thread {

    private Ceasa ceasa;
    private Random aleatorio;

    public ConsumidorMacas(Ceasa ceasa) {
        this.ceasa = ceasa;
        aleatorio = new Random();

    }

    @Override
    public void run() {

        try {
            int qtdRetirada = aleatorio.nextInt(500 - 1) + 1;

            ceasa.retirarMaca(qtdRetirada);
            int tempo = aleatorio.nextInt(50);
            Thread.sleep(tempo);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
