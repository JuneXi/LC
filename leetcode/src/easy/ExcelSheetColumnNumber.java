package easy;

/*Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 */

public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
    	if(s == null || s.length() == 0){
    		return 0;
    	}
        char[] a = s.toCharArray();
        int res = a[0] - 'A' + 1;
        for(int i = 1; i < a.length; i ++){
        	int cur = a[i] - 'A' + 1;
        	res = res * 26 + cur;
        }
        return res;
    }

}
