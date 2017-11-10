import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteListas {
	public static void main(String[] args) {
		System.out.println("ArrayList vs LinkedList");
		List<Integer> numerosArrayList = new ArrayList<>();
		List<Integer> numerosLinkedList = new LinkedList<>();
		
		int quantidadeElementos = 1000000;
		
		long tempoArrayList = insereElementosNo(numerosArrayList,quantidadeElementos);
		long tempoLinkedList = insereElementosNo(numerosLinkedList,quantidadeElementos);
		
		System.out.println("Inserção na ArrayList demorou " + tempoArrayList);
		System.out.println("Inserção na LinkedList demorou " + tempoLinkedList);
		
		tempoArrayList = removePrimeirosElementos(numerosArrayList);
		tempoLinkedList = removePrimeirosElementos(numerosLinkedList);
		
		System.out.println("Remoção da ArrayList demorou " + tempoArrayList);
		System.out.println("Remoção da LinkedList demorou " + tempoLinkedList);
	}

	private static long removePrimeirosElementos(List<Integer> numeros) {
		long inicio = System.currentTimeMillis();
		
		for(int i = 0;i < 100;i++) {
			numeros.remove(0);
		}
		
		long fim = System.currentTimeMillis();
		
		return fim-inicio;
	}

	private static long insereElementosNo(List<Integer> numeros, int quantidade) {
		long inicio = System.currentTimeMillis();
			
		for(int i = 0;i<quantidade;i++) {
			numeros.add(i);
		}
		
		long fim = System.currentTimeMillis();
		
		return fim-inicio;
	}
}
