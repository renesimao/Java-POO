package projetopessoas;

public class ProjetoPessoas {

   
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Astolfo");
        p3.setNome("Geraldo");
        p4.setNome("Maria");
        
        p2.setCurso("Java");
        p3.setSalario(2500.75f);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
        p3.receberAum(500);
    }
    
}
