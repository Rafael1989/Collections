import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso curso = new Curso("Dominando cole��es do java", "Paulo Silveira");
		List<Aula> aulas = curso.getAulas();
		//curso.getAulas().add(new Aula("Trabalhando com ArrayLists", 21));
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Criando uma aula", 20));
		curso.adiciona(new Aula("Modelando com cole��es", 24));
		
		curso.getAulas().add(new Aula("Dar� pau com o unModifiableList", 21));
		System.out.println(aulas);
	}
}
