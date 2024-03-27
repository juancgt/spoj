import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            long numero=scanner.nextLong();
            int con=0;
            do{
                long numero_invertido=invertirNumero(numero);
                numero=numero+numero_invertido;
                con++;
            }while(numero!=invertirNumero(numero));
            
            
            System.out.println(con+" "+numero);


        }
    }
    public static long invertirNumero(long numero){
        long numero_invertido=0;
        while(numero!=0){
            numero_invertido=(numero_invertido*10)+(numero%10);
            numero/=10;
        }
        return numero_invertido;
    }
}
