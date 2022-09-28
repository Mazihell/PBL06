public class Program {
    public static void main(String[] args) {


        Ceasa ceasa = new Ceasa();
        FornecedorBanana fornecedorBanana = new FornecedorBanana(ceasa);
        FornecedorMacas fornecedorMacas = new FornecedorMacas(ceasa);
        ConsumidorBanana consumidorBanana = new ConsumidorBanana(ceasa);
        ConsumidorMacas consumidorMacas = new ConsumidorMacas(ceasa);

        fornecedorBanana.start();
        fornecedorMacas.start();
        

        consumidorBanana.start();
        consumidorMacas.start();




        try {
            fornecedorBanana.join();
            fornecedorMacas.join();
            consumidorBanana.join();
            consumidorMacas.join();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
