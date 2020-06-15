import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(70);
    }

    @Test
    public void hasSheets(){
        assertEquals(70, printer.getSheets());
    }

    @Test
    public void canPrintCopies(){
        assertEquals(true, printer.print(5, 10));
    }

    @Test
    public void cantPrintCopies(){
        assertEquals(false, printer.print(8, 10));
    }
}
