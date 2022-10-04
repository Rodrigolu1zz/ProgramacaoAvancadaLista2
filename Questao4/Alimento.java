package Questao4;
public class Alimento extends ItemDeLoja {
    private int selo;
    public int getSelo() {
        return selo;
    }
    public void setSelo(int selo) {
        this.selo = selo;
    }
    @Override
    public int getIdentificador(){
        return selo;
    }
}