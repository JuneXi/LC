package easy;

public class AddBinary {
    public String addBinary(String a, String b) {
	if(a == null || a.length() == 0){
		return b;
	}
	if(b == null || b.length() == 0){
		return a;
	}
	String res = "";
	int carry = 0;
	
	for(int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--){
		int sum = carry;
		sum = sum + ((i >= 0)? a.charAt(i) - '0' : 0);
		sum += j >= 0 ? b.charAt(j) - '0' : 0;
		res = sum % 2 + res;
		carry = sum / 2;
		
	}
	if(carry != 0){
		res = carry + res;
	}
    return res;
}

}
