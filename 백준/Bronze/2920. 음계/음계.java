import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[8];
        for(int i=0;i<a.length;i++)
        {
            a[i]=scanner.nextInt();
        }
        String s="";
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1]-1)
            {
                s="ascending";
            }
            else if(a[i]==a[i+1]+1)
            {
                s="descending";
            }
            else
            {
                s="mixed";
                break;
            }

        }
        System.out.print(s);
    }
}