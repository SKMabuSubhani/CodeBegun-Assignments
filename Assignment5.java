import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n=scanner.nextInt();
        int feb[]=new int[n];
        int i=2;
        feb[0]=0;
        feb[1]=1;
        while(n>i){
            feb[i]=feb[i-1]+feb[i-2];
            i++;
        }
        for(int j=0;j<n;j++){
            System.out.print(feb[j]+" ");
        }
    }
}
