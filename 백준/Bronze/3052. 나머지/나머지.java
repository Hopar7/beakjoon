import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] a= new int[10];
        int x;
        int y=0;
        for(int i=0;i<a.length;i++)
        {
            x= scanner.nextInt();
            a[i] =x%42;
        }
        for(int i=0;i<a.length;i++)
        {
            int count=0;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j]) count++;
            }
            if(count==0)
            {
                y++;
            }

        }

        System.out.print(y);
    }
}