import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void Before() {
        printer = new Printer(100, 50);
    }

    @Test
    public void hasPages() {
        assertEquals(100, printer.getSheetsOfPaper());
    }

    @Test
    public void canPrint() {
        printer.print(2, 5);
        assertEquals(90, printer.getSheetsOfPaper());
    }

    @Test
    public void willNotPrintIfOutOfPages() {
        printer.print(10, 20);
        assertEquals(100, printer.getSheetsOfPaper());
    }

    @Test
    public void hasToner() {
        assertEquals(50, printer.getToner());
    }

    @Test
    public void printingDepletesToner() {
        printer.print(1, 6);
        assertEquals(44, printer.getToner());
    }
}
