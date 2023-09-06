import java.util.*;


class linear_search{

    public static void main(String args[]){
      
        
        Scanner sc = new Scanner(System.in);
        
      System.out.println("Enter the length of array");
        int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the array elements");
    
    

         for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();              
         }
System.out.println("Enter the the value, you want to search");
int ans = sc.nextInt();
int temp = 0;
int index = -1;
      for(int i=0; i<n; i++){
                if(arr[i]==ans){
                    index = i;
                    break;
                }             
         }

      if(index==-1){
          System.out.println("The value is not present");
      }
      else{
     System.out.println("The value is present on index number: "+ index);
      }

    }
}


