public class IsLeapYear {

    public static void main(String[] args) {
        int year = 2100;
        boolean isLeapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        System.out.printf("%b", isLeapYear);
    }
    
}
