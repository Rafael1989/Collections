import java.util.Iterator;
import java.util.TreeSet;

public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		Funcionario funcionario3 = new Funcionario();
		
		TreeSet<Funcionario> treeSet = new TreeSet<>(new OrdenaPorIdade());
		treeSet.add(funcionario);
		treeSet.add(funcionario2);
		treeSet.add(funcionario3);
		
		Iterator<Funcionario> iterator = treeSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getNome());
		}
	}
}
