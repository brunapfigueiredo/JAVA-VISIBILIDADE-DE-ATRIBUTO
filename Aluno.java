package pacoteaplicacao;

public class Aluno extends Pessoa {

    public Aluno(String nome) {
        super(nome);
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
        verificarElegibilidadeEstagio();
    }

    private void verificarElegibilidadeEstagio() {
        if (this.getIdade() >= 18) {
            System.out.println(this.getNome() + " pode concorrer a vaga de estágio.");
        } else {
            System.out.println("Só é possível concorrer a vaga de estágio ao completar 18 anos, "+this.getNome());
        }
    }
}




