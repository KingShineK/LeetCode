
public class LongSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcabcbb";
		System.out.println(lengthOfLongestSubstring(str));

	}
	public static int lengthOfLongestSubstring(String s) {
        StringBuilder sb =new StringBuilder(s);
        for(int i=0;i<sb.length();i++) {
            for(int j=i+1;j<sb.length();j++) {
                if(sb.charAt(i)==sb.charAt(j)){
                    sb.deleteCharAt(j);
                }
            }
        }
        int len=0;
        for(int i=0;i<sb.length();i++){
            for(int j=sb.length();j>i;j--){
                String sbSub=sb.toString().substring(i,j);
                if(s.contains(sbSub)&&sbSub.length()>len)
                    len=sbSub.length();
            }
        }
        return len;
    }
	
	
	
	public int lengthOfLongestSubstring2(String s) {
        StringBuilder sb =new StringBuilder(s);
        int len=0;
        for(int i=0;i<sb.length();i++){
            for(int j=sb.length();j>i;j--){
                String sbSub=sb.substring(i,j);
                if(isSubstring(sbSub)&&sbSub.length()>len)
                    len=sbSub.length();
            }
        }
        return len;
    }
    public boolean isSubstring(String sb){
        for(int i=0;i<sb.length();i++) {
            for(int j=i+1;j<sb.length();j++) {
                if(sb.charAt(i)==sb.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
