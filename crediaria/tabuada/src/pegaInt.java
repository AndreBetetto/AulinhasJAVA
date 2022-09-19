import java.util.Scanner;

class pegaInt {
    private int valor;
    Scanner teclado;
    pegaInt() {
        setValor(teclado.nextInt());
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getvalor(){
        return valor;
    }
    public void digitaValor(int nmax, int nmin) {
        teclado = new Scanner(System.in);
        while (true) {
            System.out.println("Digite um valor entre " + nmin + " e " + nmax + ": ");
            try {
                this.valor=teclado.nextInt(); 
                if (this.valor >= nmin && this.valor <= nmax)
                    break;
                 }catch(Exception erro) {
                    System.out.println("Valor inválido!");
                    teclado.next();
                }
                
             }
    }
}


    
    
