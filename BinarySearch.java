import java.util.Scanner;
import java.util.Arrays;

 class BinarySearch {
     public int[] acceptArrays(){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of Arryas");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Element of Arrays ");
       
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
     }
     public void printArrays(int arr[]){
        System.out.println("You Entered Element Before sort: "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("You Entered Element After sort: "+Arrays.toString(arr));
     }

    public int BinarySeaarchImplementation(int arr[],int key){
        int left=0;
        int right= arr.length-1;
         
        while (left<=right) {
            int mid=(left + right)/2;
            
            if(arr[mid]==key)

            
            return mid;
            
            if(arr[mid] < key){
                
                left=mid+1;
            }
            else{
                right=mid-1;
            }    
        }
        return -1;
    }

    public int BinarySeaarchRecursion(int arr[],int key,int left,int right){
            // int left;
            // int right=arr.length-1;

            while(right>=left && left<=arr.length-1){
                int mid=(left+right)/2;

                if(arr[mid]==key)
                return mid;

                if(arr[mid]<key){
                    return BinarySeaarchRecursion(arr, key,mid+1,right);
                }
                else{
                    return BinarySeaarchRecursion(arr, key,left,mid-1);
                }
            }
            return -1;

    }
    public void printRecord(int result,int key){
        if(result==-1){
            System.out.println("Key is not found");
        }
        else{
            System.out.println("Key is found : "+key);
        }
    }

    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int []arr=new int[]{10,20,30,40,50,60,70,80,90,100};
        int key=75;
        // key=50;
        BinarySearch bi=new BinarySearch();
        int result=bi.BinarySeaarchImplementation(arr,key);

        if(result==-1){
            System.out.println("Key is not found");
        }
        else{
            System.out.println("Key is found : "+key);
        }
    }
    
    public static void main2(String[] args) {
        BinarySearch bi=new BinarySearch();
        Scanner sc=new Scanner(System.in);
        int []arr=new int[10];
        System.out.println("Enter Element of arrays in sorted mannar");
        int i;
        for(i=0; i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        /*For loops for print the arrays.
         
            for(i=0;i<=arr.length;i++){
             System.out.println(arr[i]);
         }
         */

        //Insted of this directly print arrays by toString.
        System.out.println("You Entered Element is: "+Arrays.toString(arr));
        System.out.println("Enter the key you want to find in arrays:");
        int key=sc.nextInt();

        int result=bi.BinarySeaarchImplementation(arr,key);

        if(result==-1){
            System.out.println("Key is not found");
        }
        else{
            System.out.println("Key is found : "+key);
        }
    }
    
    public static void main3(String[] args) {
        BinarySearch bi=new BinarySearch();
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter Element of arrays in sorted mannar");
        int i;
        for(i=0; i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("You Entered Element is: "+Arrays.toString(arr));
        
        System.out.println("Enter the key you want to find in arrays:");
        int key=sc.nextInt();
        int result=bi.BinarySeaarchImplementation(arr,key);

        if(result==-1){
            System.out.println("Key is not found");
        }
        else{
            System.out.println("Key is found : "+key);
        }

    }


    public static void main4(String[] args) {
        BinarySearch bi=new BinarySearch();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of Arryas");
        n=sc.nextInt();
        int[]arr=new int[n];

        System.out.println("Enter Element of Arrays ");
        int i;
        for(i=0; i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("You Entered Element Before sort: "+Arrays.toString(arr));
      
        Arrays.sort(arr);
        System.out.println("You Entered Element After sort: "+Arrays.toString(arr));
        
        System.out.println("Enter the key you want to find in arrays:");
        int key=sc.nextInt();
        int result=bi.BinarySeaarchImplementation(arr,key);
        System.out.println("With out recursion");
        if(result==-1){
            System.out.println("Key is not found");
        }
        else{
            System.out.println("Key is found : "+key);
        }

    }
    
    public static void main5(String[] args) {
        BinarySearch bi=new BinarySearch();
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[]arr=new int[n];

        System.out.println("Enter Element of Arrays ");
        int i;
        for(i=0; i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("You Entered Element Before sort: "+Arrays.toString(arr));
      
        Arrays.sort(arr);
        System.out.println("You Entered Element After sort: "+Arrays.toString(arr));
        
        System.out.println("Enter the key you want to find in arrays:");
        int key=sc.nextInt();

        System.out.println("With out recursion");
        int result=bi.BinarySeaarchImplementation(arr,key);
        bi.printRecord(result, key);
        
        System.out.println("With recursion");
        result=bi.BinarySeaarchRecursion(arr, key, 0, arr.length-1);
        bi.printRecord(result, key);
    }


    public static void main(String[] args) {
        Test bi=new Test();
        Scanner sc=new Scanner(System.in);

        int[] arr = bi.acceptArrays();
        bi.printArrays(arr);
        int option=0;
        do {
            System.out.println("Enter the key you want to find in arrays:");
            int key=sc.nextInt();

            System.out.println("Press 0 : Exit");
            System.out.println("Press 1 : Binary Search Without Recusion");
            System.out.println("Press 2 : Binary Search With Recursion");
            System.out.println("Enter Your Choice: ");
            option=sc.nextInt();
            switch (option) {
                case 1:
                System.out.println("With out recursion");
                int result=bi.BinarySeaarchImplementation(arr,key);
                bi.printRecord(result, key);
                    break;
                case 2:
                System.out.println("With recursion");
                result=bi.BinarySeaarchRecursion(arr, key, 0, arr.length-1);
                bi.printRecord(result, key);
       
                    break;
            
                default:
                    break;
            }
        } while (option!=0);
    }

}