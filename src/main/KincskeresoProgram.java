package main;

public class KincskeresoProgram 
{
    public static void main(String[] args) 
    {
        Lada arany = new Lada(Anyag.ARANY, "Én rejtem a kincset.", false);
        Lada ezust = new Lada(Anyag.EZUST, "Nem én rejtem a kincset.", true);
        Lada bronz = new Lada(Anyag.BRONZ, "Az arany hazudik.", false);
        
        System.out.println(arany.toString());
        System.out.println(ezust.toString());
        System.out.println(bronz.toString());
                
    }
    
}
