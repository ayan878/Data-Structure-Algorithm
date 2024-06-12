package ArrayDemo;

public class StringPalindrome {

    public static boolean palindrome(String str){
        int left=0;
        int right=str.length()-1;


//        for(int i=0;i<str.length();i++){
//            for (int j=str.length()-1;j>0;j++){
//                if(str.charAt(i)==str.charAt(j)){
//                    return true;
//                }
//                else{
//                    return false;
//                }
//            }
//
//        }
        // two pointer
        while (left<right){
            if(str.charAt(left)==str.charAt(right)){
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str= "mad";
        System.out.println(palindrome(str));
    }
}
