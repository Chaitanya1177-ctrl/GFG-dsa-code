class Solution {
    public int closest3Sum(int[] arr, int target) {

        Arrays.sort(arr);
        int close = arr[0] + arr[1] + arr[2];

        for(int i = 0; i < arr.length - 2; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while(left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if(Math.abs(target - sum) < Math.abs(target - close) ||
                   (Math.abs(target - sum) == Math.abs(target - close) && sum > close)) {
                    close = sum;
                }

                if(sum < target) {
                    left++;
                } 
                else if(sum > target) {
                    right--;
                } 
                else {
                    return sum;
                }
            }
        }
        return close;
    }
}
