package main;

public class Lada 
{
    private Anyag anyag;
    private String allitas;
    private boolean igaze;

    public Lada(Anyag anyag, String allitas, boolean igaze) 
    {
        this.anyag = anyag;
        this.allitas = allitas;
        this.igaze = igaze;
    }

    public Lada(Anyag anyag, String allitas) 
    {
        this(anyag, allitas, false);
    }    

    public Anyag getAnyag() {
        return anyag;
    }

    public String getAllitas() {
        return allitas;
    }

    public boolean isIgaze() {
        return igaze;
    }


    @Override
    public String toString() {
        return "Lada{" + "anyag=" + anyag + ", allitas=" + allitas + ", igaze=" + igaze + '}';
    }
        
}
