package carros;

import static org.junit.Assert.assertFalse;
import org.junit.Test;
import carros.JogoController; // Importe a classe JogoController

public class JogoControllerTestFalse {

    @Test
    public void testeContinuarJogo() {
        // Chame o método iniciarNovoJogo() da classe JogoController
        boolean não = JogoController.iniciarNovoJogo();

        // Use o assertTrue para verificar se a escolha "sim" foi corretamente processada
        assertFalse(não);
    }
}