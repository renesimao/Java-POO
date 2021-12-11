package projetolivro;


public class ProjetoLivro {

    public static void main(String[] args) {
       Pessoa[] p = new Pessoa[2];
       p[0] = new Pessoa("Pedro",22,"M");
       p[1] = new Pessoa("Maria",31,"F");
       
       Livro[] l = new Livro[2];
      l[0] = new Livro("Glórias do Flamengo","Mauro Betting",500,p[0]);
      l[1] = new Livro("Revolução dos Bichos","George Orwell",140,p[1]);
      
      l[0].abrir();
        System.out.println(l[0].detalhes());
      
       
       
               
    }
    
}
