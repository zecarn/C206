public abstract class HomemAranha implements Comparable<HomemAranha> {
    protected String vilao;
    protected int anoDoFilme;

    public String getVilao() {
        return vilao;
    }

    public int getAnoDoFilme() {
        return anoDoFilme;
    }

    @Override
    public int compareTo(HomemAranha o) {
        if(this.anoDoFilme < o.getAnoDoFilme()){
            return 1;
        }
        if(this.anoDoFilme > o.getAnoDoFilme()){
            return -1;
        }
        return 0;
    }
    public HomemAranha(String vilao, int ano){
        this.vilao = vilao;
        this.anoDoFilme = ano;
    }
}
