package company.facebook;
//TODO: what's wrong with codes below?
public class DecodeWays2 {
    int m = 1000000007;
    public int numDecodings(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        if(s.charAt(0) == 0){
            return 0;
        }
        
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        for(int i = 1; i <= s.length(); i++){
            dp[i] = 0;
            // cur == '*'
            if(s.charAt(i - 1) == '*'){
                dp[i] = dp[i - 1] * 9;
                if(i >= 2){
                    if(s.charAt(i - 2) == '*'){
                        dp[i] = (dp[i] + dp[i - 2] * 15) % m;
                    }else if(s.charAt(i - 2) == '1'){
                        dp[i] = (dp[i] + dp[i - 2] * 9) % m;
                    }else if(s.charAt(i - 2) == '2'){
                        dp[i] = (dp[i] + dp[i - 2] * 6) % m;
                    }
                }
            }else{
                if(s.charAt(i - 1) != '0'){
                    dp[i] = dp[i - 1];
                }
                
                if(i >= 2){
                    if(s.charAt(i - 2) =='*'){
                      if(s.charAt(i - 1) - '0' <= 6){
                          dp[i] = (dp[i] + dp[i - 1] * 2) % m;
                      }else{
                          dp[i] = (dp[i] + dp[i - 1]) % m;
                      }
                    }else{
                        int temp = (s.charAt(i - 2) - '0') * 10 + s.charAt(i - 1) - '0';
                        if(temp >= 10 && temp <= 26){
                            dp[i] = (dp[i] + dp[i - 2]) % m;
                        }
                    }
                }
            }
        }
        return dp[s.length()];
        
    }

}
