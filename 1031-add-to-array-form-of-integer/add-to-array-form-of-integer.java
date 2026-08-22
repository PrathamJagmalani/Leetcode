class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
         List<Integer> result = new ArrayList<>();
        int i = num.length - 1;

        // Loop as long as there are digits in the array OR k still has value
        while (i >= 0 || k > 0) {
            // Add the current array digit to k if we haven't run out of digits
            if (i >= 0) {
                k += num[i];
                i--;
            }
            
            // Extract the last digit of the combined sum and add it to our list
            result.add(0,k % 10);
            
            // Carry over the remaining value to the next position
            k /= 10;
        }

        // Because we added digits from right to left, reverse the final list
        
        return result;
    }
}