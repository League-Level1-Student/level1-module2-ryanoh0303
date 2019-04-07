

package tea_party;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class teaparty {

	 public String welcome(String name, boolean isWoman, boolean isKnighted)
     {
		 if(isWoman==true) {
			 return "Hello Ms. "+name;
		 }
		 else if(isKnighted==true && isWoman==false ) {
			 return "Hello Sir "+ name;
		 }
		 else if(isKnighted==false && isWoman==false) {
			 return "Hello Mr. " + name;
		 }
		return name;


     }
}
