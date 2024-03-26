import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextInt()+scanner.nextInt());
        }
        
    }
}
