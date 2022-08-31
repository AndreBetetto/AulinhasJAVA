//Lutador.java
import java.util.Scanner;
class Lutador
{
    private String nome;
    private String nacional;
    private double peso;
    private double altura;
    private int idade;
    private String categoria;
    private int qtdvito, qtdperda, qtdempate;
   
    //construtor
    Lutador()
    {  setNome("Indefinido");
       setNacionalidade("DESCONHECIDO");
       setPeso(52);    
       setAltura(1.5);
       setIdade(18);
       setVitoria(0);
       setDerrota(0);
       setEmpate(0);    
    }

   public void setNome(String n)
   {  
      nome = n; 
   }
   public String getNome()
   {  
      return this.nome; 
   }
   public void setNacionalidade(String n)
   {  
      nacional = n; 
   }
   public String getNacionalidade()
   {  
      return this.nacional; 
   }

   public void setPeso(double p)
   {  
      peso = p; 
   }
   public double getPeso()
   {  
      return this.peso; 
   }

   public void setAltura(double a)
   {  
      altura = a; 
   }
   public double getAltura()
   {  
      return this.altura; 
   }

   public void setIdade(int i)
   {  
      idade = i; 
   }
   public int getIdade()
   {  
      return this.idade; 
   }
   //inicio vitoria, perde, empate
    public void setVitoria(int qtd)
    {   
      qtdvito = qtd;
    }

    public int getVitoria()
    {
      return this.qtdvito;
    }

    public void ganhaLuta() 
    {
      setVitoria(getVitoria() + 1);
    }

    public void setDerrota(int qtd)
    {   
      qtdperda = qtd;
    }

    public int getDerrota()
    {
      return this.qtdperda;
    }

    public void perdeLuta() 
    {
      setDerrota(getDerrota() + 1);
    }

    public void setEmpate(int qtd)
    {   
      qtdempate = qtd;
    }

    public int getEmpate()
    {
      return this.qtdempate;
    }

    public void empateLuta() 
    {
      setEmpate(getEmpate() + 1);
    }

    //fim ganha, perde, empata

    Lutador(String nome, String naci)
    {  setNome(nome);
       setNacionalidade(naci);
       setPeso(52);    
       setAltura(1.5);
       setIdade(18);
       setVitoria(0);
       setDerrota(0);
       setEmpate(0);    
    }
   
    Lutador(String no, String na, double pe, double al, int ida, int vi, int de, int em)
    {  setNome(no);
       setNacionalidade(na);
       setPeso(pe);    
       setAltura(al);
       setIdade(ida);
       setVitoria(vi);
       setDerrota(de);
       setEmpate(em);    
    }
   
}


//UsaLutador.java
class UsaLutador
{
    public static void main(String txt[])
    {
      Lutador l1,l2,l3;
      l1=new Lutador();
      l2=new Lutador("Pedro klaus","Canada",110,1.82,19,1,2,3);
      l3= new Lutador("Bad _dog","EUA");
      l3.setIdade(20);

      Scanner entrada = new Scanner(System.in);
      System.out.println("Digite o nome do lutador: ");
      String nome = entrada.nextLine();
      System.out.println("Digite a nacionalidade do lutador: ");
      String naci = entrada.nextLine();
      System.out.println("Digite o peso do lutador: ");
      double peso = entrada.nextDouble();
      System.out.println("Digite a altura do lutador: ");
      double altura = entrada.nextDouble();
      System.out.println("Digite a idade do lutador: ");
      int idade = entrada.nextInt();
      System.out.println("Digite a quantidade de vitorias do lutador: ");
      int vitoria = entrada.nextInt();
      System.out.println("Digite a quantidade de derrotas do lutador: ");
      int derrota = entrada.nextInt();
      System.out.println("Digite a quantidade de empates do lutador: ");
      int empate = entrada.nextInt();
      
      System.out.println("Nome: "+l1.getNome());
      System.out.println("Nacionalidade: "+l1.getNacionalidade());
      System.out.println("Peso: "+l1.getPeso());
      System.out.println("Altura: "+l1.getAltura());  
      System.out.println("Idade: "+l1.getIdade());
      System.out.println("Vitorias: "+l1.getVitoria());
      System.out.println("Derrotas: "+l1.getDerrota());
      System.out.println("Empates: "+l1.getEmpate());

    }
    
}