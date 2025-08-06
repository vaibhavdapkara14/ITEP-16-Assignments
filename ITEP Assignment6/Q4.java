import java.util.Scanner;
    class Program4{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
     
            System.out.print("Enter how much Index you want : ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i=0; i<arr.length; i++){
                System.out.println("Enter " + (i+1) + " value : " );
                arr[i] = sc.nextInt();
            }

             System.out.println("Enter value you find : ");
             int find = sc.nextInt();

            int flag = 0;
            for( int i=0; i<n; i++){
                if(arr[i] == find){
                System.out.println(find +" is finded");
                flag = 1;
                break;
                }
                
            }
            if(flag == 0){
                System.out.println(find +" is not found");

            }
            
        }
    }
