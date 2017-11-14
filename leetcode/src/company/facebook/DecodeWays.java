package company.facebook;

public class DecodeWays {
    public int numDecodings(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        if(s.charAt(0) == '0'){
            return 0;
        }
        
        int[] dp = new int[s.length() + 1];
        //note: what about 0 in string?
        dp[0] = 1;
        dp[1] = s.charAt(0) == 0? 0: 1;
        for(int i = 2; i <= s.length(); i++){
            if(s.charAt(i -1 ) != '0'){
                dp[i] = dp[i - 1];
            }
            
            int temp = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');
            //note: why is <= 10? not < 10?
            if(temp >= 10 && temp <= 26 ){
                dp[i] += dp[i - 2];
            }
        }
        return dp[s.length()];
        
    
        
    }

}
