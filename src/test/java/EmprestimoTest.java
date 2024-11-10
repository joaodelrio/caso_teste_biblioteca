import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.joao.Emprestimo;
import com.joao.Item;
import com.joao.Livro;



public class EmprestimoTest {
    @Test
    public void testCalculaDataDevolucaoCaso1() {
        Emprestimo e = new Emprestimo();
        assertThrows(IllegalArgumentException.class, () -> {
            e.CalculaDataDevolucao();
        });
    }
    @Test
    public void testCalculaDataDevolucaoCaso2() {
        Emprestimo e = new Emprestimo();
        Livro l1 = new Livro(1);
        Livro l2 = new Livro(2);
        Item i1 = new Item(l1);
        Item i2 = new Item(l2);
        List<Item> itens = new ArrayList<Item>();
        itens.add(i1);
        itens.add(i2);
        e.setItem(itens);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 3);
        calendar.set(Calendar.MILLISECOND, 0);
        Date dateCorreta = calendar.getTime();
        Date datePrevista = e.CalculaDataDevolucao();
        calendar.setTime(datePrevista);
        calendar.set(Calendar.MILLISECOND, 0);
        datePrevista = calendar.getTime();
        assertTrue("Datas nao sao iguais", dateCorreta.equals(datePrevista));
    }
    @Test
    public void testCalculaDataDevolucaoCaso3() {
        Emprestimo e = new Emprestimo();
        Livro l1 = new Livro(1);
        Livro l2 = new Livro(2);
        Livro l3 = new Livro(3);
        Item i1 = new Item(l1);
        Item i2 = new Item(l2);
        Item i3 = new Item(l3);
        List<Item> itens = new ArrayList<Item>();
        itens.add(i1);
        itens.add(i2);
        itens.add(i3);
        e.setItem(itens);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 6);
        Date date = calendar.getTime();
        assertTrue("Datas nao sao iguais", date.equals(e.CalculaDataDevolucao()));
    }
    @Test
    public void testCalculaDataDevolucaoCaso4(){
        Emprestimo e = new Emprestimo();
        Livro l1 = new Livro(1);
        Livro l2 = new Livro(2);
        Livro l3 = new Livro(3);
        Livro l4 = new Livro(4);
        Livro l5 = new Livro(5);
        Item i1 = new Item(l1);
        Item i2 = new Item(l2);
        Item i3 = new Item(l3);
        Item i4 = new Item(l4);
        Item i5 = new Item(l5);
        List<Item> itens = new ArrayList<Item>();
        itens.add(i1);
        itens.add(i2);
        itens.add(i3);
        itens.add(i4);
        itens.add(i5);
        e.setItem(itens);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 12);
        Date date = calendar.getTime();
        assertTrue("Datas nao sao iguais", date.equals(e.CalculaDataDevolucao()));
    }
    @Test
    public void testCalculaDataDevolucaoCaso5(){
        Emprestimo e = new Emprestimo();
        Livro l1 = new Livro(1);
        Livro l2 = new Livro(2);
        Livro l3 = new Livro(3);
        Livro l4 = new Livro(4);
        Livro l5 = new Livro(5);
        Livro l6 = new Livro(6);
        Item i1 = new Item(l1);
        Item i2 = new Item(l2);
        Item i3 = new Item(l3);
        Item i4 = new Item(l4);
        Item i5 = new Item(l5);
        Item i6 = new Item(l6);
        List<Item> itens = new ArrayList<Item>();
        itens.add(i1);
        itens.add(i2);
        itens.add(i3);
        itens.add(i4);
        itens.add(i5);
        itens.add(i6);
        e.setItem(itens);
        assertThrows(IllegalArgumentException.class, () -> {
            e.CalculaDataDevolucao();
        });
    }
}
