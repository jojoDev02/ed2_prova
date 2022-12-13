public class ArvBin {

    private No raiz;

    public class No {

        private int chave;
        private int valor;
        private No esq, dir;

        public No(int chave, int valor, No esq, No dir) {
            this.chave = chave;
            this.valor = valor;
            this.esq = esq;
            this.dir = dir;
        }

        public No(int chave, int valor) {
            this.chave = chave;
            this.valor = valor;
            this.esq = null;
            this.dir = null;
        }

    }

    public ArvBin() {
        raiz = null;
    }

    public void insere(int valor, int chave){
      No novo = new No(chave, valor);

       raiz = insere(this.raiz, novo);
    }

    private No insere(No raiz,No novo){
        if(raiz == null){
            return novo;
        }
        if(raiz.chave > novo.chave){
            raiz.esq = insere(raiz.esq, novo);
        }
        else {
            raiz.dir = insere(raiz.dir, novo);
        }

        return raiz;
    }

    public void

    public No busca(int chave){

        return busca(raiz,chave);
    }

    private No busca(No raiz, int chave){
        if(raiz == null || raiz.chave == chave)
            return raiz;

        if(raiz.chave > chave){
            return busca(raiz.esq, chave);
        }
        else
            return busca(raiz.dir, chave);
    }


    public static void main(String[] args) {
        ArvBin avr = new ArvBin();

        avr.insere(10,2);
        avr.insere(10,5);
        avr.insere(10,1);
        avr.insere(10,4);

        System.out.println(avr.busca(1).chave);
        System.out.println(avr.busca(7));
    }


}
