import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(70, 100);
    }

    @Test
    public void hasSheets(){
        assertEquals(70, printer.getSheets());
    }

    @Test
    public void canPrintCopies(){
        assertEquals(true, printer.enoughPaper(5, 10));
    }

    @Test
    public void cantPrintCopies(){
        assertEquals(false, printer.enoughPaper(8, 10));
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }
}
