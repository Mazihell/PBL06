import java.util.Random;

public class FornecedorMacas extends Thread {

    private Ceasa ceasa;
    private Random aleatorio;

    FornecedorMacas(Ceasa ceasa) {
        this.ceasa = ceasa;
        aleatorio = new Random();
    }

    @Override
    public void run() {
        try {

            int quantidadeMaca = aleatorio.nextInt(5000 - 1000) + 1000;
            ceasa.depositarMaca(quantidadeMaca);
            int tempo = aleatorio.nextInt(50);
            Thread.sleep(tempo);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
