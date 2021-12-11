package projetopessoapoo;

public class ProjetoPessoaPoo {

    public static void main(String[] args) {
       /* Visitante v1 = new Visitante();
        v1.setNome("Carlos");
        v1.setIdade(31);
        v1.setSexo("M");
        System.out.println(v1.toString());*/
       
       Aluno a1 = new Aluno();
       a1.setNome("Claudio");
       a1.setMatricula(1111);
       a1.setCurso("Java");
       a1.setIdade(22);
       a1.setSexo("M");
       
       
       Bolsista b1 = new Bolsista();
       b1.setNome("Jubileu");
       b1.setIdade(20);
       b1.setBolsa(50);
       b1.setCurso("Javascript");
       
      
       
       
       
       Professor p1 = new Professor();
       p1.setNome("Luís");
       p1.setIdade(55);
       p1.setEspecialidade("Programação");
       p1.setSalario(6000);
       System.out.println(p1.toString());
       p1.receberAum(500);
       System.out.println("o Salário atual é de "+p1.getSalario()+" reais");
       
        
    }
    
}
