import org.testng.Assert;
import org.testng.annotations.Test;

public class PrinterTests 
{
	@Test
	public void printTest()
	{
		Printer printer = new Printer();
		String expectedText = "hello, I'm printer";
		String actualText = printer.print();
		Assert.assertEquals(actualText, expectedText);
	}
}
