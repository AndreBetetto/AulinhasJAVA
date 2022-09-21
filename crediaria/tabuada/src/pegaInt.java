import java.util.Scanner;

class pegaInt {
    private int valor;
    Scanner teclado;
    pegaInt() {
        setValor(valor);
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getvalor() {
        return valor;
    }

    public void digitaValor(int nmin, int nmax) {
        teclado = new Scanner(System.in);
        while(true) {
            System.out.println("Digite um valor entre " + nmin + " e " + nmax + ": ");
            try {
                    this.valor=teclado.nextInt(); 
                    if (this.valor >= nmin && this.valor <= nmax) {
                    break;
                    } else {
                        throw new Exception(); // força a execução do catch
                    }

                 } catch(Exception erro) {
                    System.out.println("Valor inválido! ");
                    //teclado.next(); ERRADOO //--> Desnecessário... Pois após o erro, o programa deve voltar ao início do loop, ao invés de continuar a execução.
                    teclado.nextLine(); // limpa o buffer do teclado
                }
                
             }
    }
}


    
    
