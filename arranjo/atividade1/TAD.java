package arranjo.atividade1;

import javax.naming.spi.DirStateFactory.Result;

public class TAD {
    private PontoCartesiano A;
    private PontoCartesiano B;

    public TAD(PontoCartesiano p1, PontoCartesiano p2){
        this.A = p1;
        this.B = p2;
    }

    public float distancia(){
        float Dab1 = this.B.getX() - this.A.getX();
        float Dab2 = this.B.getY() - this.A.getY();
        float result = (float) Math.sqrt((Math.pow(Dab1, 2) + Math.pow(Dab2, 2)));
        return result;      
    }
}
