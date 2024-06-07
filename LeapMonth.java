public class LeapMonth {

    public static boolean isLeapMonth(int year, int month) {
        boolean isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (month % 100 != 0) || (month % 400 == 0);
        return isLeapMonth;
    }

    public static void main(String[] args) {
        int year = 2028;  // declared variable year
        int month = 2;    // declared variable month (february)

        if (isLeapMonth(year, month)) {
            System.out.println("Month " + month + " in year " + year + " is a leap month.");
        } else {
            System.out.println("Month " + month + " in year " + year + " is not a leap month.");
        }
    }
}

