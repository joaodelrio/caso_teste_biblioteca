import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.joao.Controle;

public class ControleTest {

    @Test
    public void testEmprestarAlunoNaoExiste() {
        Controle c = new Controle();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            c.emprestar("10", new int[]{1, 2, 4}, 3);
        });
        assertEquals("Aluno não existe", exception.getMessage());
    }

    @Test
    public void testEmprestarAlunoDebito() {
        Controle c = new Controle();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            c.emprestar("4", new int[]{1, 2, 4}, 3);
        });
        assertEquals("Aluno possui débitos", exception.getMessage());
    }

    @Test
    public void testEmprestarLivroNaoPodeEmprestar() {
        Controle c = new Controle();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            c.emprestar("1", new int[]{1,2,3}, 3);
        });
        assertEquals("Livro não pode ser emprestado", exception.getMessage());
    }

    @Test
    public void testEmprestarLivroPodeEmprestar() {
        Controle c = new Controle();
        assertTrue("Livro nao pode ser emprestado", c.emprestar("1", new int[]{1,2,4}, 3));
    }
}
