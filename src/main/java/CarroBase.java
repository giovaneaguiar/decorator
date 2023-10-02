public class CarroBase implements Carro {
    private double custo;

    public CarroBase(double custo) {
        this.custo = custo;
    }

    public String getDescription() {
        return "Carro Básico";
    }

    public double getCusto() {
        return custo;
    }
}