package company.twitter;

import java.util.Arrays;

public class Q11 {
	public static int leastRotation(String s){
        String concat = new String(s+s);
        
        //k: start location of the minimal string rotation in s
        int k = 0;
        
        
        // i be the length of the longest suffix of S[1..j] satisfies S[k..k+i-1] = S[j-i+1..j]
        int[] failure = new int[concat.length()];
        
        Arrays.fill(failure,-1);

        for(int j=1;j<concat.length();j++){
            char sj = concat.charAt(j);
            // i be the length of the longest suffix of S[1..j] satisfies S[k..k+i] = S[j-i..j]
            //这个f[j - k -1]很奇怪，可能是因为k一直在改变，所以无论k怎么变，在k成为新起点后，都默认用f[0]来存k点的i值，以此类推，f[1]等同于k + 1点
            //其实也可以理解？因为当k成为新起点后，我们不再考虑k之前的数如何
            //TODO: 不知道全部换成f[k]后可不可以？
            int i = failure[j-k-1];
            // to compute the i with kmp( #1.1, #2.2 ), at the same time ,try to  compute k ( #1.2 ) 
            
            while(i!=-1 && sj != concat.charAt(k+i+1)){
            	//# 1.2 如果sj一直小于k+i+1（也就是失配的第一个数），就令k一直后移
            	
            	//   0 1 2 3 4 5 6 7 8
                //   a b d a b e a b c
            	// i-1-1-1 0 1 2 0 1 2
            	//假设此刻j= 8，k = 0，于是i = 1，c与d失配且c < d, 因此k需要后移到第三个a的位置，k = j - i - 1 = 6
                if(sj < concat.charAt(k + i + 1))
                    k = j-i-1;
                //# 1.1
                i = failure[i];
            }
            
        	// s : a b d a b c
        	//     0 1 2 3 4 5
            // f :-1 0 0 0 1 2
        	//assuming now k = 3, j = 5
        	//mismatch here, and c < d, so abc < abd, k = j = 3
            //when i == -1 && sj != concat.charAt(k + i + 1)
            //it means we have no match before
            if(sj != concat.charAt(k + i + 1)){           	
                if(sj < concat.charAt(k)) {
                	k = j;
                }
                // 
                failure[j-k] = -1;
            }else{
            	//# 2.2
            	//when sj == s[k + i + 1], i may equals to -1 or not
            	//then we treat it as common kmp to compute the i 
                failure[j-k] = i+1;
            }
        }

        return k;
    }

}
