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
            //���f[j - k -1]����֣���������Ϊkһֱ�ڸı䣬��������k��ô�䣬��k��Ϊ�����󣬶�Ĭ����f[0]����k���iֵ���Դ����ƣ�f[1]��ͬ��k + 1��
            //��ʵҲ������⣿��Ϊ��k��Ϊ���������ǲ��ٿ���k֮ǰ�������
            //TODO: ��֪��ȫ������f[k]��ɲ����ԣ�
            int i = failure[j-k-1];
            // to compute the i with kmp( #1.1, #2.2 ), at the same time ,try to  compute k ( #1.2 ) 
            
            while(i!=-1 && sj != concat.charAt(k+i+1)){
            	//# 1.2 ���sjһֱС��k+i+1��Ҳ����ʧ��ĵ�һ������������kһֱ����
            	
            	//   0 1 2 3 4 5 6 7 8
                //   a b d a b e a b c
            	// i-1-1-1 0 1 2 0 1 2
            	//����˿�j= 8��k = 0������i = 1��c��dʧ����c < d, ���k��Ҫ���Ƶ�������a��λ�ã�k = j - i - 1 = 6
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
