import java.util.Date;

//Most Java classes have a Main class.
public class SystemOutPrint {
    //the static main(String[] args) method
    //Used if you want to use the console & run the file
    public static void main(String[] args) {
        //Printing to console
        System.out.println("Hello world!"); //Use this format to print out messages to the console
        System.out.print("Hello"); //Prints to the console, but does not start a new line
        System.out.print(" World! \n"); //Prints out to the console. \n starts a new line

        //Formmatting Strings
        //Strings are formmatted using the % sign. Only works with the printf() method
        //%s - String formmatter. Used to insert a string where %s is
        System.out.printf("I have a message: %s", "Hello World!");
        System.out.println();

        //%d - Decimal (Integer) formmatter. Used to insert an integer where %d is
        System.out.printf("Here is my integer: %d", 100);
        System.out.println();

        //%f - Floating-point formmatter. Used to insert a floating-point where %f is
        System.out.printf("Here is my floating-point number:%5.2f", 1.42); //see below...
        /*
        the 5 indicates the minimum character length of the number, including the decimal. Since 1.42 has 4
        characters, a space is added at the beginning of the number to make the minimum requirement, resulting
        in " 1.42" being inserted. The .2 stands for the number of digits after the decimal that will
        be accepted. Any more will be removed.
        */

        System.out.println();

        //%c - Character formmatter. Used to insert a character where %c is
        System.out.printf("Here is my character: %c", 'a');
        System.out.println();

        //%b - Boolean formmatter. Used to insert a boolean where %b is
        System.out.printf("Here is my boolean: %b", true);
        System.out.println();

        //%x - Hexadecimal formmatter. Used to insert a hexadecimal where %x is
        System.out.printf("Here is my hexadecimal: %x", 31); //31 is converted into hexadecimal form (1f)
        System.out.println();

        //%e - Scientific notation formmatter. Used to insert a number in scientific notation where %e is
        System.out.printf("Here is my number in scientific notation: %e", 133.45);
        System.out.println();

        //%% - Percent sign. Used to insert the percent sign where %% is
        System.out.printf("Here is my percentage: 10%%");
        System.out.println();

        //%t - Date formmatter. Used to insert a date where %t is. Used in examples below
        /*
        %ty or %tY - Displays the date's year
        %tm - Displays the date's month
        %td - Displays the date's day
        %tH - Displays the hour out of the 24 hours as 2 digits (hour 14 would be 14, hour 8 would be 08)
        %tI - Displays the hour out of the 12 hours as 2 digits (hour 14 would be 02, hour 8 would be 08)
        %tk - Displays the hour out of the 24 hours as 1 digit (hour 14 would be 14, hour 8 would be 8)
        %tl - Displays the hour out of the 12 hours as 1 digit (hour 14 would be 2, hour 8 would be 8)
        %tM - Displays the minute of the date
        %tS - Displays the second of the date
        %tL - Displays the millisecond of the date
        %tN - Displays the nanosecond of the date
        %tF - Displays the date in format year-month-day
        %tD - Displays the date in format month/day/year
        %tZ or %tz - Displays the time zone of the date
        %tp - Displays 'am' or 'pm' of the date
        %tA or %ta - Displays the full name of the day (Monday, Tuesday, etc.)
        */

        Date date = new Date(); //Creating date object
        System.out.printf("Here is the date: %tm %td %ty", date, date, date);
        System.out.println();
        System.out.printf("This date was accessed on %tD at %tH:%tM at exactly %tS seconds, " +
                "and %tL milliseconds", date, date, date, date, date);
        System.out.println();

        //%n - Newline. Used to start a new line where %n is
        System.out.printf("This is line 1. %nThis is line 2. %nThis is line 3.%n");

        /*
        Joining formatters in the same method:
        Each argument is correlater with a formatter
        Argument 1: the message that will be displayed to the console
        Argument 2: the value that goes to the first formatter in the message (The % in the methods)
        Argument 3: the value that goes to the second formatter in the message
        Argument 4 and so on: Repeats the process
        '%n' and '%%' do not call the arguments
         */
        System.out.printf("Here is my first argument: %s%nHere is my second argument: %d%n", "Hello World!", 100);
    }

}