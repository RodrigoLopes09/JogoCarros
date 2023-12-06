package carros;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import carros.JogoController; // Importe a classe JogoController

public class JogoControllerTestTrue {

    @Test
    public void testeContinuarJogo() {
        // Chame o método iniciarNovoJogo() da classe JogoController
        boolean sim = JogoController.iniciarNovoJogo();

        // Use o assertTrue para verificar se a escolha "sim" foi corretamente processada
        assertTrue(sim);
    }
}
