import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestandoIterator {
	public static void main(String[] args) {
		List<String> letras = new LinkedList<>();
		letras.add("a");
		letras.add("b");
		letras.add("c");
		
		Iterator<String> iterator = letras.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
