package MyProgPackage;

public class ReverseNumber {
    public static void main(String[] args){
        int num = 9876 , reverse = 0;
        while(num!=0)
        {
            int remainder = num % 10;
            reverse = reverse*10 +remainder;
            num = num/10;
        }
        System.out.println("Reverse of a given number is:"+reverse);
    }
}
