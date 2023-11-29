public class PRG02_T03_Ejerc6 {
    public enum Razas{
        Mastín,Terrier,Bulldog,Pekinés,Caniche,Galgo
    }
    public static void main(String[] args){
        Razas var1=Razas.Pekinés;
        Razas var2=Razas.Galgo;
        if(var1==var2){
            System.out.println("variables iguais");
        }else{
            System.out.println("variables distintas");
        }
    }
}
