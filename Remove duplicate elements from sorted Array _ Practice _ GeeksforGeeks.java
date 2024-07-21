//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            ArrayList<Integer> arr = new ArrayList<>();
            String input = sc.nextLine();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            Solution ob = new Solution();
            int ans = ob.remove_duplicate(arr);
            for (int i = 0; i < ans; i++) {
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to remove duplicates from the given array
    public int remove_duplicate(List<Integer> arr) {
        // Code Here
         if (arr.size() == 0) return 0;

        int j = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (!arr.get(i).equals(arr.get(j))) {
                j++;
                arr.set(j, arr.get(i));
            }
        }
          while (arr.size() > j + 1) {
            arr.remove(arr.size() - 1);
        }

        return j + 1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        List<Integer> arr1 = List.of(2, 2, 2, 2, 2);
        int newSize1 = sol.remove_duplicate(arr1);
        System.out.println("New Size: " + newSize1);
        System.out.println("Modified Array: " + arr1);

        List<Integer> arr2 = List.of(1, 2, 4);
        int newSize2 = sol.remove_duplicate(arr2);
        System.out.println("New Size: " + newSize2);
        System.out.println("Modified Array: " + arr2);
    }
}
