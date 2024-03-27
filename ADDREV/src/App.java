import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            int a=invertirNumero(scanner.nextInt());
            int b=invertirNumero(scanner.nextInt());
            System.out.println(invertirNumero(a+b));

        }
    }
    public static int invertirNumero(int numero){
        int numero_invertido=0;
        while(numero!=0){
            numero_invertido=(numero_invertido*10)+(numero%10);
            numero/=10;
        }
        return numero_invertido;
    }
}
