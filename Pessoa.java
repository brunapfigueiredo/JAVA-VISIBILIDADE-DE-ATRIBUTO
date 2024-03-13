package pacoteaplicacao;

public class Pessoa {
	private String nome;
	private int idade;
	
	
	//construtor
	public Pessoa(String n) {
		this.nome = n;
		this.idade = 0;
	}
	
	//função para calcular os anos que faltam para os 18
	public int calcular() {
        return 18 - this.idade;
    }

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(this.idade>=18) {
		this.nome = nome;
		System.out.println("Mudança de nome realizada com sucesso. Parabéns, " + this.nome + "\n");
		} else {
			System.out.println("Só é possível realizar a mudança de nome a partir dos 18 anos de idade, "+nome+". Ainda faltam " + calcular() + " anos. \n");
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
