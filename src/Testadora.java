public class Testadora{
public static void main(String[]args){
    luz s;

    s=luz.VERDE;

    switch(s){
        case VERDE:
        System.out.println("\n Estado Atual da Palestra: " + luz.VERDE.getSituacao());
        break;
        case VERMELHO:
        System.out.println("\n Estado Atual da Palestra: " + luz.VERMELHO.getSituacao());
        break;
        case AMBAR:
        System.out.println("\n Estado Atual da Palestra: " + luz.AMBAR.getSituacao());
        break;
    }
}
}