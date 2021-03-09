package Task6;

public class Class6 {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "ABD";

        int compare = str2.compareTo(str1);

        if (compare>0){
            System.out.println(1);
        }
        if (compare<0){
            System.out.println(2);
        }
    }
}
