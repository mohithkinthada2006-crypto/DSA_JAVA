import java.util.*;
class twonum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nums[] =new int[2];
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();    //TC=O(n)
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int comp = target-arr[i];
            if(map.containsKey(comp)){
                System.out.println("["+map.get(comp)+","+i+"]");
                return;
            }
            map.put(arr[i], i);
        }
    }
}
// import java.util.*;

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         // Edge case: if array is null or has less than 2 elements
//         if (nums == null || nums.length < 2) {
//             return new int[]{-1, -1};
//         }
        
//         HashMap<Integer, Integer> map = new HashMap<>();
        
//         for (int i = 0; i < nums.length; i++) {
//             int complement = target - nums[i];
            
//             if (map.containsKey(complement)) {
//                 return new int[]{map.get(complement), i};  // Returning, not printing
//             }
            
//             map.put(nums[i], i);
//         }
        
//         // If no solution exists (problem guarantees one exists, but still good practice)
//         return new int[]{-1, -1};
//     }
// }