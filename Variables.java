public class Variables {
    public static void main(String[] args) {

    }

    /*
    *
* VARIABLES - they are like container in which we can stores different different types of values.

          JAVA is both - STATIC type langauge (in which, you have to mention type of every variable/methods)
                       - STRONG type langauge (in which, you can store only between of range of variables)


    - variable rules -
        - case sensitive, meaningful or camelcase
        - can start with any letter or $ or _
        - should not use any built-in reserved keyword
        - for constants, it should be in capital.


    - its divided in 2 categories-
    -1. primitive datatype
    -2. non-primitive datatype (reference datatype) {class, integer, Array, String}


   1. PRIMITIVE data-type - they are 8 data types -
        - char - (2 byte (16 bits), can store character or numbers which will be treated as ascii values of character
                range - 0 to 65535)

                char ch = 'a';

        - byte - ( 1 byte (8 bits), singed 2nd compliment{-ve & +ve both can be stored}
                    range - -128 to 127, default value - 0)

            byte var = 1;

        - short - (2 byte (16 bits), Signed 2nd compliment {-ve & +ve both can be stored}
                    Range - -32768 to 32767, defaule value - 0)

                    short var = 12;

        - int - (4 byte (32 bits), Signed 2nd compliment {-ve & +ve both can be stored}
                    Range -  -2^31 to 2^3-1, default value - 0 )

                    int var = 2;

        - long - ( 8byte (64 bits), Signed 2nd compliment {-ve & +ve both can be stored}
                    Range - -2^63 to 2^63-1, default value - 0 )

                long var = 50L; (keep 'L' at the end)

        - float - (32 bit IEEE 754 value)

            float var = 34.50f;

        - double - (64 bit IEEE 754 value)
            double var = 43.230d;

            we should not use these datatype for fraction in java code, until unless we are 100% clear with numbers
            we should use BIGINTEGER instead.

        - boolean -
                    1 bit, TRUE/FALSE, default value - false,
                    boolean var = true;


*
*
    *
    * */
}
