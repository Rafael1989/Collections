import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {
	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		alunos.add("Rafael");
		alunos.add("José");
		alunos.add("Pedro");
		alunos.add("Manuel");
		alunos.add("Gilberto");
		alunos.add("João");
		alunos.add("João");
		
		boolean ramdolfeEstaPresente = alunos.contains("Randolfe");
		System.out.println(ramdolfeEstaPresente);
		
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		System.out.println(alunosEmLista.get(0));
	}
}
