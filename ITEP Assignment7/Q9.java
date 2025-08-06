import java.util.Scanner;
class Program9{
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of first array: ");
        int n = sc.nextInt();

        System.out.print("Enter Size of Second array: ");
        int m = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[m];
        int p = n+m;
        int c[] = new int[p];
 
        System.out.println("Enter First Array values...");
        int i;
        for( i=0; i<n; i++){
            System.out.print("Enter " + (i+1) + " value : ");
            a[i] = sc.nextInt();
            c[i] = a[i];
        }

        System.out.println("Enter Second Array values...");
        int j;
        for(j=0; j<m; j++){
            System.out.print("Enter " + (j+1) + " value : ");
            b[j] = sc.nextInt();
            c[n+j] = b[j];
        }

        int Ucount = 0;
        int Icount = 0;
        for (int k = 0; k < p; k++) {
            boolean isDuplicate = false;

            for (int l = 0; l < k; l++) {
                if (c[k] == c[l]) {
                    isDuplicate = true;
                    break;
                }
            }
            //  System.out.println("Union value is : ");
            if (!isDuplicate) {
                System.out.print( c[k] + " ");
                Ucount++;
            }
            // System.out.println("Intersection value is : ");
            if(isDuplicate){
                System.out.print("\n" + c[k] + " ");
                Icount++;
            }
        }
        System.out.print("\nTotal Union value : " + Ucount);
        System.out.print("\nTotal Intersection value : " + Icount);
   }
}
