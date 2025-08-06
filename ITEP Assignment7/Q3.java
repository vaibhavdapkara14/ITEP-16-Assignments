class Program3{
    public static void main(String args[]){

        int arr[] = {12,34,21,45,56,78,34,56};

        int start = arr[0];
        int end = arr.length-1;

        while(start < end){
        
                    int temp =arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                    
                }

         for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");

         }
            }
        }
    