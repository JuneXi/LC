package dynamicPro;

public class BurstBalloons {
    public int maxCoins(int[] nums) {
        int[] a = new int[nums.length + 2];
        int l = 1;
        while(l <= nums.length){
            a[l] = nums[l - 1];
            l++;
        }
        a[0] = a[l++] = 1;
        //dp[i][j] : in range (i, j), what it the max
        int[][] dp = new int[l][l];
                                
        //k: interval length
        for(int k = 2; k < l; k++){
            //left: interval left boundary
            for(int left = 0; left < l - k; left++){
                int right = left + k;
                //in interval[left, right],
                //assuming i is the last balloon to burst
                for(int i = left + 1; i < right; i++){
                    dp[left][right] = Math.max(dp[left][right], dp[left][i] + a[left] * a[i] * a[right] + dp[i][right]);
                }
            }
        }
        return dp[0][l - 1];
        
    }

}
