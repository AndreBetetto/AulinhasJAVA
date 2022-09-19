class tabuada {
    private int conta, result;
    pegaInt vt; // valortabuada- agregacao de objeto Pegaint

    tabuada() {
        vt = new pegaInt();
    }

    tabuada(int x) {
        vt = new pegaInt();
        vt.setValor(x);
    }

    public void AlteraValor(int valor) {
        vt.setValor(valor);
    }

    public int PegaValor() {
        return vt.getvalor();
    }

    public void Mostra() {
        System.out.println("\n Tabuada do numero=" + vt);
        for (conta = 0; conta <= 10; conta++) {
            result = conta * PegaValor();
            System.out.println(conta + " x " + PegaValor() + " = " + result);
        }
    }

    public void Digita() {

        vt.digitaValor(0, 100);
    }
}