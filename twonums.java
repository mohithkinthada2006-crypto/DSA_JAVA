import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int comp = target-arr[i];
            if(map.containsKey(comp)){
                System.out.print(map.get(comp)+1,(i+1));
                break;
            }
            map.put(arr[i],i);
        }
        System.out.print()
    }
}