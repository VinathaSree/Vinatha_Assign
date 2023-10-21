public class ShuffleTheArray {
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        int ans[] = shuffle(nums,k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    private static int[] shuffle(int[] nums, int k) {
        int result[] = new int[nums.length];
        for (int i = 0; i < nums.length-1 ; i+=2) {
            result[i] = nums[i/2];
            result[i+1] = nums[nums.length - k];
            k -= 1;
        }
        return result;
    }
}
