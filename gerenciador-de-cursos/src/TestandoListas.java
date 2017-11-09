import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		String aula1 = "aula 1";
		String aula2 = "aula 2";
		String aula3 = "aula 3";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		
		System.out.println(aulas);
		
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println(primeiraAula);
		System.out.println(aulas.size());
		for(int i = 0;i<aulas.size();i++) {
			System.out.println(aulas.get(i));
		}
		
		aulas.forEach(aula -> {
			System.out.println("Percorrendo::::::::");
			System.out.println("Aula ->>>>>>"  + aula);
		});
		
		
		aulas.add("abacaxi");
		aulas.add("laranja");
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
 	}
}
