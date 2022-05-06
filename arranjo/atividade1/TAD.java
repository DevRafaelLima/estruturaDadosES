package arranjo.atividade1;

import javax.naming.spi.DirStateFactory.Result;

public class TAD {
    private PontoCartesiano aluno;
    private PontoCartesiano B;

    public TAD(PontoCartesiano p1, PontoCartesiano p2){
        this.aluno = p1;
        this.B = p2;
    }

    public float distancia(){
        float Dab1 = this.B.getX() - this.aluno.getX();
        float Dab2 = this.B.getY() - this.aluno.getY();
        float result = (float) Math.sqrt((Math.pow(Dab1, 2) + Math.pow(Dab2, 2)));
        return result;      
    }
}
