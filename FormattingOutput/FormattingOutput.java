package code;

public class FormattingOutput {

    public static void main(String[] args) {

        System.out.println("Helllo");   // we go automatically on the next row
        System.out.print("Hello Petya"); //use for prompts, the same row
        System.out.println();           // empty row, or the same as end line
        // using \n for new line in strings
        System.out.println("It is\nfunny\nsometimes");

        System.out.printf("Product is %d%n", 123); //printf, for formatting output
        /*
                %c	character
                %d	decimal (integer) number (base 10)
                %e	exponential floating-point number
                %f	floating-point number
                %i	integer (base 10)
                %o	octal number (base 8)
                %s	a string of characters
                %u	unsigned decimal (integer) number
                %x	number in hexadecimal (base 16)
                %%	print a percent sign
                \%	print a percent sign
            */
//The %3d specifier is used with integers,
//and means a minimum width of three spaces, which, by default, will be right-justified:
        System.out.printf("%3d", 0);            //        0
        System.out.println();

        System.out.printf("%3d", 123456789);    //123456789
        System.out.println();

        System.out.printf("%3d", -10);            //      -10
        System.out.println();

        System.out.printf("%3d", -123456789);    //-123456789
        System.out.println();

//To left-justify integer output with printf, just add a minus sign (-)
//after the % symbol, like this:
        System.out.printf("%-3d", 0);           //0
        System.out.println();

        System.out.printf("%-3d", 123456789);    //123456789
        System.out.println();

        System.out.printf("%-3d", -10);            //-10
        System.out.println();

        System.out.printf("%-3d", -123456789);  //-123456789
        System.out.println();

// To zero-fill your printf integer output, just add a zero (0)
//after the % symbol, like this:
        System.out.printf("%03d", 0);             //       000
        System.out.println();

        System.out.printf("%03d", 1);             //       001
        System.out.println();

        System.out.printf("%03d", 123456789);     // 123456789
        System.out.println();

        System.out.printf("%03d", -10);             //       -10
        System.out.println();

        System.out.printf("%03d", -123456789);     //-123456789
        System.out.println();


//At least five wide
        System.out.printf("'%5d'", 10);        //'   10'
        System.out.println();

//At least five-wide, left-justified
        System.out.printf("'%-5d'", 10);        //'10   '
        System.out.println();

//At least five-wide, zero-filled
        System.out.printf("'%05d'", 10);        //'00010'
        System.out.println();

//At least five-wide, with a plus sign
        System.out.printf("'%+5d'", 10);        //'  +10'
        System.out.println();

//Five-wide, plus sign, left-justified
        System.out.printf("'%-+5d'", 10);        //'+10  '
        System.out.println();

//Print one position after the decimal
        System.out.printf("'%.1f'", 10.3456);            //'10.3'
        System.out.println();

//Two positions after the decimal
        System.out.printf("'%.2f'", 10.3456);            //'10.35'
        System.out.println();

//Eight-wide, two positions after the decimal
        System.out.printf("'%8.2f'", 10.3456);        //'   10.35'
        System.out.println();

//Eight-wide, four positions after the decimal
        System.out.printf("'%8.4f'", 10.3456);            //' 10.3456'
        System.out.println();

//Eight-wide, two positions after the decimal, zero-filled
        System.out.printf("'%08.2f'", 10.3456);        //'00010.35'
        System.out.println();

//Eight-wide, two positions after the decimal, left-justified
        System.out.printf("'%-8.2f'", 10.3456);            //'10.35   '
        System.out.println();

//Printing a much larger number with that same format
        System.out.printf("'%-8.2f'", 101234567.3456);    //'101234567.35'
        System.out.println();


//A simple string
        System.out.printf("'%s'", "Hello");        //'Hello'
//A string with a minimum length
        System.out.printf("'%10s'", "Hello");     //'     Hello'
//Minimum length, left-justified
        System.out.printf("'%-10s'", "Hello");    //'Hello     '

/*
    \a	audible alert
    \b	backspace
    \f	form feed
    \n	newline, or linefeed
    \r	carriage return
    \t	tab
    \v	vertical tab
    \\	backslash
 */
//Insert a tab character in a string
        System.out.printf("Hello\tworld");	//Hello     world
        System.out.println();

//Insert a newline character in a string
        System.out.printf("Hello\nworld");	//Hello
        System.out.println();               // world

//Typical use of the newline character
        System.out.printf("Hello world\n"); //Hello world
        System.out.println();

//A DOS/Windows path with backslash characters
        System.out. printf("C:\\Windows\\System32\\");	//C:\Windows\System32\
        System.out.println();


    }
}
