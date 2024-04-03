import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        if(M>=45)
        {
            M-=45;
            System.out.print(H+" "+M);
        }
        else
        {
            if(H==0)
            {
                H=23;
                M +=15;
                System.out.print(H+" "+M);
            }
            else
            {
                H-=1;
                M+=15;
                System.out.print(H+" "+M);
            }
        }
    }
}