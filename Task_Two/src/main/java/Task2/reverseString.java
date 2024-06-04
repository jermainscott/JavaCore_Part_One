package Task2;/* Task 2 - Reverse String
Write 3 implementations (or more) for reversing a string.

Input:

String stringToRevers = "I'm going to go to school today morning."

Output:

".gninrom yadot loohcs ot og ot gniog m'I"
*/



public class reverseString {
    public static void main(String[] args) {

        //FIRST Implementation of reverse string


        String originalStr = "I'm going to go to school today morning.";
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: "+ reversedStr);
    }




    /* public static void main(String[] args) {

            //SECOND Implementation of reverse string

                String string = "I'm going to go to school today morning.";
                StringBuilder reversed = new StringBuilder(string).reverse();
                System.out.println(reversed);
            }
            */





    /*
        public static void main(String[] args) {

            //THIRD Implementation of reverse string

            String str = "I'm going to go to school today morning.";
            char[] charArray = str.toCharArray();
            int start = 0;
            int end = charArray.length - 1;
            while (start < end) {
                char temp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = temp;
                start++;
                end--;
            }
            String reversed = new String(charArray);
            System.out.println(reversed);
        }

        */


}