package tests;

import control.CalculadoraImc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraImcTestes {

    CalculadoraImc calcImc;

    @Before
    public void setup() {
        calcImc = new CalculadoraImc();
    }

    @Test
    public void testeAdultoBaixoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", calcImc.calcularImc(48.0, 1.735, 20, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveInferior() {
        Assert.assertEquals("Baixo peso grave", calcImc.calcularImc(48.0, 1.73, 20, "feminino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveSuperior() {
        Assert.assertEquals("Baixo peso grave", calcImc.calcularImc(50.0, 1.72, 65, "masculino"));
    }

    @Test
    public void testeMenina4anosObesidade() {
        Assert.assertEquals("Obesidade", calcImc.calcularImc(50.0, 1.639, 4, "feminino"));
    }
}