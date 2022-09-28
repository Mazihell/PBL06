import java.util.Random;

public class FornecedorBanana extends Thread {

    private Ceasa ceasa;
    private Random aleatorio;

    public FornecedorBanana(Ceasa ceasa) {
        this.ceasa = ceasa;
        aleatorio = new Random();
    }

    @Override
    public void run() {
        try {

            int quantidadeBanana = aleatorio.nextInt(5000 - 1000) + 1000;
            ceasa.depositarBanana(quantidadeBanana);
            int tempo = aleatorio.nextInt(300);
            Thread.sleep(tempo);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
