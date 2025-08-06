import java.util.Scanner;

class Program8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size : ");
        int size = sc.nextInt();

        int a[] = new int[size];
        int c[] = new int[size];

        for(int i=0; i<size; i++){
        System.out.print("Enter " + (i+1 )+ " value : ");
        a[i] = sc.nextInt();
        } 

        for(int element : a){
            if(a[i] > 0){
                c[i] = element;
            }

            if(a[i] < 0){
                c[i] = element;
            }
        }

        for(int i=0; i<size; i++){
          System.out.print(c[i] + " ") ;
            }

    }
}