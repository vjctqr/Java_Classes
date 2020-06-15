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
        printer.print(5, 10);
        assertEquals(20, printer.getSheets());
        assertEquals(50, printer.getToner());
    }

    @Test
    public void cantPrintCopies(){
        printer.print(8, 10);
        assertEquals(70, printer.getSheets());
        assertEquals(100, printer.getToner());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }
}
