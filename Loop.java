import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n[]=new int[m];
        for (int i=0;i<m;i++){
            n[i]=sc.nextInt();

        }
        for(int i=0;i<m;i++){
            if(n[i]%3==0&&n[i]%5==0){
                System.out.println("FooBar\n");
            }
            else if(n[i]%3==0&&n[i]%5!=0){
                System.out.println("Foo\n");

            }
            else if(n[i]%5==0&&n[i]%3!=0){
                System.out.println("Bar\n");

            }
            else{
                System.out.println("None");
            }
        }
    }
}
