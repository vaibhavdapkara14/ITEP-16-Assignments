class Program12{
    public static void main(String args[]){

        int A[] = {1,5,10,20,40,80};
        int B[] = {6,7,20,80,100};
        int C[] = {3,4,15,20,30,70,80,120};

        int n = A.length;
        int m = B.length;
        int p = C.length;
        // boolean Same = false;
        
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                for(int k=0; k<p;k++){
                    if(A[i] == B[j] && A[i] == C[k]){
                        System.out.print(C[k] + " ");
                    }
                }
            }
        }
        // if(Same){
        //     System.out.print(C[k] + " ");
        // }
    }
}