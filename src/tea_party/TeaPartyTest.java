package tea_party;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeaPartyTest {

	public static void main(String[] args) {
		TeaPartyTest tea= new TeaPartyTest();
		tea.test();

	}
	
    @Test
    public void test() {
            teaparty teaParty = new teaparty();
            String greeting = teaParty.welcome(null, false, false);
            assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
            assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
            assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
    }
}



