public class main {
    static final int fullTime=1;
    static final int partTime=2;
    static int wage;
    public static void main(String[] args)
    {
        System.out.println("Here is starting Uc5 of employee wages ");
        int  fullDayHours=8, perHoursSallary=20,partTimeHours=4, workingDays=20, monthlyWage=0;

        int check=(int)Math.floor(Math.random()*10)%3;
        switch (check)
        {
            case fullTime:
                System.out.println("Employee is fullTime present");
                monthlyWage=fullDayHours*perHoursSallary;
                System.out.println("emp wage : "+wage);
                monthlyWage=monthlyWage+wage;
                break;
            case partTime:
                System.out.println("Employee is fullTime present");
                wage=partTimeHours*perHoursSallary;
                System.out.println("emp wage : "+wage);
                monthlyWage=monthlyWage+wage;
                break;
            default:
                System.out.print("Employee is Absent");
                break;
        }
        System.out.println("Total Wage for a month is "+monthlyWage);
    }
}