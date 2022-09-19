class tabuada {
    private int conta, result;
    pegaInt valor; // valortabuada- agregacao de objeto Pegaint

    tabuada() {
        valor = new pegaInt();
    }

    tabuada(int x) {
        valor = new pegaInt();
        valor.setValor(x);
    }

    public void AlteraValor(int x) {
        valor.setValor(x);
    }

    public int PegaValor() {
        return valor.getvalor();
    }

    public void Mostra() {
        System.out.println("\n Tabuada do numero = " + valor.getvalor());
        for (conta = 0; conta <= 10; conta++) {
            result = conta * PegaValor();
            System.out.println(conta + " x " + PegaValor() + " = " + result);
        }
    }

    public void Digita() {

        valor.digitaValor(0, 100);
    }
}