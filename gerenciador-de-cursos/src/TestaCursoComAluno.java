
public class TestaCursoComAluno {
	public static void main(String[] args) {
		Curso curso = new Curso("Dominando cole��es do java", "Paulo Silveira");
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		curso.adiciona(new Aula("Criando uma aula", 20));
		curso.adiciona(new Aula("Modelando com cole��es", 24));
		
		Aluno aluno = new Aluno("Rafael", 1);
		Aluno aluno2 = new Aluno("Jos�", 2);
		Aluno aluno3 = new Aluno("Pedro", 3);
		
		curso.matricula(aluno);
		curso.matricula(aluno2);
		curso.matricula(aluno3);
		
		System.out.println("Todos os alunos matriculados:");
		curso.getAlunos().forEach(System.out::println);
		
	}
}
