import java.util.Scanner;
public class DecToBin {
    int arr[];
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        DecToBin db=new DecToBin();
        System.out.println("enter the no:");
        int n=s.nextInt();
        db.toBin(n);

    }
    public void toBin(int n){
        arr=new int[10];
        int i=0;
        System.out.println("bin of "+n);
        while(n!=0){
            arr[i]=n%2;
            n=n/2;
            i++;
        }
        i--;
        while(i!=-1){
            System.out.print(arr[i]);
            i--;
        }
    }
}
