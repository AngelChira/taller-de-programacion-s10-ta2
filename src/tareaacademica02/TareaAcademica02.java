package tareaacademica02;


public class TareaAcademica02 {

    public static void main(String[] args) {
        char[] number = {'0','1','2','3','4','5','6','7','8','9'};
        int[] ascii = new int[10];
        System.out.println("Numeros");
        for(char n:number){
            System.out.print(n+", ");
        }
        System.out.println("\nAscii");
        for(int a:number){
            int i=0;
            System.out.print(a+" ");
            ascii[i]=(int) a;
            i++;
        }
        System.out.println(ascii);
        
    }
    
}
