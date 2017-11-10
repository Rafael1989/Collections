import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso curso = new Curso("Dominando coleções do java", "Paulo Silveira");
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Criando uma aula", 20));
		curso.adiciona(new Aula("Modelando com coleções", 24));
		
		List<Aula> aulasImutaveis = curso.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		System.out.println(curso.getTempoTotal());
		System.out.println(curso);
		
	}
}
