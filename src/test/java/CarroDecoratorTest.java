import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarroDecoratorTest {

    @Test
    public void testCarroComArCondicionado() {
        Carro carro = new CarroBase(50000.0);
        carro = new ArCondicionadoDecorator(carro);

        assertEquals("Carro Básico, Ar Condicionado", carro.getDescription());
        assertEquals(51500.0, carro.getCusto());
    }

    @Test
    public void testCarroComBancosDeCouro() {
        Carro carro = new CarroBase(50000.0);
        carro = new BancosDeCouroDecorator(carro);

        assertEquals("Carro Básico, Bancos de Couro", carro.getDescription());
        assertEquals(52500.0, carro.getCusto());
    }

    @Test
    public void testCarroComSistemaDeNavegacao() {
        Carro carro = new CarroBase(50000.0);
        carro = new SistemaDeNavegacaoDecorator(carro);

        assertEquals("Carro Básico, Sistema de Navegação", carro.getDescription());
        assertEquals(51000.0, carro.getCusto());
    }

    @Test
    public void testCarroComArCondicionadoBancosDeCouro() {
        Carro carro = new CarroBase(50000.0);
        carro = new ArCondicionadoDecorator(carro);
        carro = new BancosDeCouroDecorator(carro);

        assertEquals("Carro Básico, Ar Condicionado, Bancos de Couro", carro.getDescription());
        assertEquals(54000.0, carro.getCusto());
    }

    @Test
    public void testCarroComArCondicionadoSistemaDeNavegacao() {
        Carro carro = new CarroBase(50000.0);
        carro = new ArCondicionadoDecorator(carro);
        carro = new SistemaDeNavegacaoDecorator(carro);

        assertEquals("Carro Básico, Ar Condicionado, Sistema de Navegação", carro.getDescription());
        assertEquals(52500.0, carro.getCusto());
    }
}
