import static org.junit.jupiter.api.Assertions.*;

import org.gmardones.Main;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {

    @Test
    public void testMainOutput() {
        // Configuramos un stream de salida para capturar la salida del System.out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Llamamos al método main
        String[] args = {};
        Main.main(args);

        // Verificamos que la salida esperada es la que obtenemos
        assertEquals("Hola devops", outContent.toString());
    }
}
