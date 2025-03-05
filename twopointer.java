public class twopointer {
    //two pointer can be used for reversing a string or checking palindrome
    public static void main(String[] args) {
        String s = "hello";
        char[] ch = s.toCharArray();
        int left = 0;   
        int right = ch.length-1;
        while(left<right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
            if(left==right){
                break;
            }
        }

        //left=0, right=4
        //while(left<right) swap left and right
        //temporary variable is used to swap
        //left++, right--
        //if left=right, break
        //print the string
    }
}
