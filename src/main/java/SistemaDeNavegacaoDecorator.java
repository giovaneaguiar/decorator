public class SistemaDeNavegacaoDecorator implements Carro {
    private Carro carro;

    public SistemaDeNavegacaoDecorator(Carro carro) {
        this.carro = carro;
    }

    public String getDescription() {
        return carro.getDescription() + ", Sistema de Navegação";
    }

    public double getCusto() {
        return carro.getCusto() + 1000.0;
    }
}