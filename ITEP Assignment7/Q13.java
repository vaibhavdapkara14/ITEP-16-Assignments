class Program13{
    public static void main(String args[]){

        int arr[] = {1,2,3,2,4,5};
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i] + " ");
                    return;
                }
            }
        }

    }
}