import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        boolean imp=true;
        while (scanner.hasNext()) {
            int numero=scanner.nextInt();
            if(numero==42)
                imp=false;
            if(imp)
                System.out.println(numero);
        }
    }
}
