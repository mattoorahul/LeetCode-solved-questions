import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingSort{

     public static void main(String []args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        ;
        int N,K;
        String firstLine = br.readLine();
        N = Integer.parseInt(firstLine.split(" ")[0]);
        K = Integer.parseInt(firstLine.split(" ")[1]);
        
        int arr[] = new int[1000];
        String line[] = br.readLine().split(" ");
        for(int j=0;j<N;j++){
            arr[j] = Integer.parseInt(line[j]);
        }
        
        // int arr[]= {4,3,2,1,0};
        // int K=5;
        
        countingSort(arr, K, N);
        
        for(int j=0;j<N;j++){
           System.out.print(arr[j] + " ");
        }
        
     }
     
     public static void countingSort(int arr[], int K, int N){
         int count[] = new int[K];
         int temp[] = new int[N];
         for(int i=0;i<K;i++){
             count[i] = 0;
         }
         
         for(int i=0;i<N;i++){
             count[arr[i]]++;
         }
         
         for(int i=1;i<K;i++){
             count[i] = count[i] + count[i-1];
         }
         
         for(int j=N-1;j>=0;j--){
             temp[count[arr[j]]-1] = arr[j];
             count[arr[j]]--;
         }
         
         for(int i=0;i<N;i++){
             arr[i] = temp[i];
         }
         
     }
}