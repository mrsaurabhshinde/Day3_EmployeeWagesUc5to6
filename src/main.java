public class main {
    static final int fullTime = 1;
    static final int partTime = 2;
    static int wage;

    public static void main(String[] args) {
        System.out.println("Here is starting Check of Employee wages ");
        int fullDayHours = 8, perHoursSallary = 20, partTimeHours = 4, workingDays = 20, monthlyWage = 0;
        int monthly_Wage = 0;
        int hours = 0;
        int days = 1;

        while (days < 20 && hours < 100) {
            days++;
            int check = (int) Math.floor(Math.random() * 10) % 3;
            int remaining_Hours = 100 - hours;
            if (remaining_Hours % 8 < 1) {
                System.out.println("Employee is part time present");
                wage = partTimeHours * perHoursSallary;
                System.out.println("emp wage : " + wage);
                monthlyWage = monthlyWage + wage;

            }
            switch (check) {
                case fullTime:
                    System.out.println("Employee is fullTime present");
                    wage = fullDayHours * perHoursSallary;
                    System.out.println("emp wage : " + wage);
                    monthlyWage = monthlyWage + wage;
                    break;
                case partTime:
                    System.out.println("Employee is Parttime present");
                    wage = partTimeHours * perHoursSallary;
                    System.out.println("emp wage : " + wage);
                    monthlyWage = monthlyWage + wage;
                    break;
                default:
                    System.out.print("Employee is Absent");
                    break;
            }
        }
        System.out.println("Total Wage for a month is " + monthlyWage);
        System.out.println("Total working hours : "+ hours);
        System.out.println("total working days : "+ days);

    }
}