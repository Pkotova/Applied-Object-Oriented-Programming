package code;

public class CountOccurrences {

    public static int count(String str, char a){

        if (str.length() == 0)
            return 0;
        else if (str.charAt(0) == a)
            return 1 + count(str.substring(1), a);
        else
            return count(str.substring(1), a);
        
    }

    public static void main(String[] args) {
        System.out.println(count("Welcome", 'e'));
    }
}
