class Program11{
    public static void main(String args[]){

        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int count = 0;
     
        int k = 6;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i]+arr[j] == k){
                    
                    count++;
                }
            }
        } 
        System.out.print(count);
    }
}