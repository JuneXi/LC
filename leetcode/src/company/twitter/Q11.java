package company.twitter;

import java.util.Arrays;

public class Q11 {
	public static int leastRotation(String s){
        String concat = new String(s+s);
        int[] failure = new int[concat.length()];
        Arrays.fill(failure,-1);
        int k = 0;

        for(int j=1;j<concat.length();j++){
            char sj = concat.charAt(j);
            int i = failure[j-k-1];
            while(i!=-1 && sj != concat.charAt(k+i+1)){
                if(sj < concat.charAt(k+i+1))
                    k = j-i-1;
                i = failure[i];
            }
            if(sj != concat.charAt(k+i+1)){
                if(sj<concat.charAt(k)) k = j;
                failure[j-k] = -1;
            }else{
                failure[j-k] = i+1;
            }
        }

        return k;
    }

}
