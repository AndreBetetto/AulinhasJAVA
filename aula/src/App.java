//Lutador.java
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
       
    }
}