public class BancosDeCouroDecorator implements Carro {
    private Carro carro;

    public BancosDeCouroDecorator(Carro carro) {
        this.carro = carro;
    }

    public String getDescription() {
        return carro.getDescription() + ", Bancos de Couro";
    }

    public double getCusto() {
        return carro.getCusto() + 2500.0;
    }
}