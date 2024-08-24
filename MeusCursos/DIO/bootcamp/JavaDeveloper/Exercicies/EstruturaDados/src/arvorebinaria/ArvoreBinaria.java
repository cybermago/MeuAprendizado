package arvorebinaria;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    /***********************OPERAÇÃO-INSERIR**************/
    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
        if(atual == null){
            return novoNo;
        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        }else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;

    }
    /********************OPERAÇÃO-INSERIR*********************/

    /*******IN ORDEM*******/
    public void inOrdem(){
        System.out.println("\n EmOrdem");
        inOrdem(this.raiz);
    }

    private void inOrdem(BinNo<T> atual){
        if(atual == null){
            inOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ",");
            inOrdem(atual.getNoDir());
        }
    }
    /*******IN ORDEM*******/

    /*******POS ORDEM*******/
    public void posOrdem(){
        System.out.println("\n posOrdem");
        inOrdem(this.raiz);
    }

    private void posOrdem(BinNo<T> atual){
        if(atual == null){
            posOrdem(atual.getNoEsq());
            posOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + ",");

        }
    }
    /*******POS ORDEM*******/

    /*******PRE ORDEM*******/
    public void preOrdem(){
        System.out.println("\n preOrdem");
        inOrdem(this.raiz);
    }

    private void preOrdem(BinNo<T> atual){
        if(atual == null){
            System.out.print(atual.getConteudo() + ",");
            preOrdem(atual.getNoEsq());
            preOrdem(atual.getNoDir());

        }
    }
    /*******PRE ORDEM*******/

    /********OPERAÇÃO REMOVER********/
    public void remover(T conteudo){
        try {
            BinNo<T> atual = this.raiz;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){
                    atual = atual.getNoEsq();
                }else{atual = atual.getNoDir();}
            }

            if(atual == null){
                System.out.println("Conteudo não encontrado Bloco Try");
            }
            /*POSSIBILIDADES DE REMOÇÃO*/
            if(pai == null){
                if(atual.getNoDir() == null){
                    this.raiz = atual.getNoEsq();
                } else if (atual.getNoEsq() == null) {
                    this.raiz = atual.getNoDir();
                }else {
                    for(temp=atual,filho=atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoEsq()
                    ){
                        if(filho != atual.getNoEsq()){
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }
                /* REFERENCIA A DIREITA */
            }else if (atual.getNoDir() ==  null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoEsq());
                }else {
                    pai.setNoDir(atual.getNoEsq());
                }
                /* REFERENCIA A ESQUERDA */
            } else if (atual.getNoEsq() == null) {
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoDir());
                }else {
                    pai.setNoDir(atual.getNoDir());
                }
            }else {
                for(temp = atual, filho = atual.getNoEsq();
                    filho.getNoDir() != null;
                    temp = filho, filho = filho.getNoDir()
                ){
                    if (filho != atual.getNoEsq()){
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if(pai.getNoEsq() == atual){
                        pai.setNoEsq(filho);
                    }else {
                        pai.setNoDir(filho);
                    }
                }
            }

        }catch (NullPointerException erro){
            System.out.println("Conteudo não encontrado Bloco C");
        }
    }
    /**********************************************************/
}