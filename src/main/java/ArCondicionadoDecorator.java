public class ArCondicionadoDecorator implements Carro {
    private Carro carro;

    public ArCondicionadoDecorator(Carro carro) {
        this.carro = carro;
    }

    public String getDescription() {
        return carro.getDescription() + ", Ar Condicionado";
    }

    public double getCusto() {
        return carro.getCusto() + 1500.0;
    }
}