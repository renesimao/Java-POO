package projetopessoapoo;

public class Professor extends Pessoa {
    private String especialidade;
    private int salario;
    
    public void receberAum(int aum){
        this.salario+=aum;
        System.out.println("Recebeu Aumento de "+aum+" Reais");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", especialidade=" + especialidade + ", salario=" + salario + '}';
    }
    
}
