package pacoteaplicacao;

public class aplicacao {

	public static void main(String args[]) {
		Pessoa pessoa1 = new Pessoa("Nathalia Pedroso");
		Pessoa pessoa2 = new Pessoa("Bella Nunes");
		Pessoa pessoa3 = new Pessoa("Gabriel Brandini");
		
		Aluno aluno1 = new Aluno("Bruna Pedroso");
		Aluno aluno2 = new Aluno("Kaue Minzon");
		Aluno aluno3 = new Aluno("Carol Ferreira");
		
		pessoa1.setIdade(33);
		pessoa2.setIdade(12);
		pessoa3.setIdade(21);
		
		pessoa1.setNome("Pamela");
		pessoa2.setNome("Fernanda");
		
		aluno1.setIdade(19);
		aluno2.setIdade(17);
		aluno3.setIdade(18);
		
	}
}
