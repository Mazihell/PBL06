public class Ceasa {

    private int qtdMaxBanana;
    private int qtdMaxMaca;
    private int quantidadeBanana;
    private int quantidadeMaca;

    public Ceasa() {
        quantidadeBanana = 0;
        quantidadeMaca = 0;

    }

    public synchronized void depositarBanana(int qtdBanana) throws InterruptedException {
        while (qtdBanana != 0)
            wait();
        quantidadeBanana = quantidadeBanana + qtdBanana;
        System.out.println("Deposito Banana: " + quantidadeBanana);
        notifyAll();

    }

    public synchronized void depositarMaca(int qtdMaca) throws InterruptedException {
        while (qtdMaca == 0)
            wait();
        quantidadeMaca = quantidadeMaca + qtdMaca;
        System.out.println("Deposito Maca: " + quantidadeMaca);
        notifyAll();

    }

    public synchronized int retirarBanana(int qtdBananaRetirada) throws InterruptedException {
        while (qtdBananaRetirada > 0)
            wait();
        quantidadeBanana = quantidadeBanana - qtdBananaRetirada;
        System.out.println("Retirada Banana: " + quantidadeBanana);
        notifyAll();
        return quantidadeBanana;

    }

    public synchronized int retirarMaca(int qtdMacaRetirada) throws InterruptedException {
        while (qtdMacaRetirada > 0)
            wait();
        quantidadeMaca = quantidadeMaca - qtdMacaRetirada;
        System.out.println("Retirada Maca: " + quantidadeMaca);
        notifyAll();
        return quantidadeMaca;

    }

    public int getQtdMaxBanana() {
        return qtdMaxBanana;
    }

    public int getQtdMaxMaca() {
        return qtdMaxMaca;
    }

    public int getQuantidadeBanana() {
        return quantidadeBanana;
    }

    public int getQuantidadeMaca() {
        return quantidadeMaca;
    }

}
