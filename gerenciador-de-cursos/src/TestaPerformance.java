import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
	public static void main(String[] args) {
//		Collection<Integer> numeros = new ArrayList<>();
		Collection<Integer> numeros = new HashSet<>();
		
		long inicioInsercao = System.currentTimeMillis();
		
		for(int i = 0; i < 5000000;i++) {
			numeros.add(i);
		}
		
		long fimInsercao = System.currentTimeMillis();
		
		long inicioPesquisa = System.currentTimeMillis();
		
		for(int i = 0; i < 50000;i++) {
			numeros.contains(i);
		}
			
		long fimPesquisa = System.currentTimeMillis();
		
		
		
		System.out.println("Tempo de inserção " + (fimInsercao-inicioInsercao));
		System.out.println("Tempo de pesquisa " + (fimPesquisa-inicioPesquisa));
	}
}
