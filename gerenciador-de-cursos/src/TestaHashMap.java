import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestaHashMap {
	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<>();
		
		pessoas.put(15, "Pedro");
		pessoas.put(23, "Daniel");
		pessoas.put(21, "Denise");
		pessoas.put(12, "Gabi");
		
		Set<Integer> idades = pessoas.keySet();
		for (Integer idade : idades) {
			System.out.println(pessoas.get(idade));
		}
		
		System.out.println("---------------------------");
		
		for(String nome : pessoas.values()) {
			System.out.println(nome);
		}
		
		System.out.println("---------------------------");
		
		for(int idade : pessoas.keySet()) {
			System.out.println(idade);
		}
	}
}
