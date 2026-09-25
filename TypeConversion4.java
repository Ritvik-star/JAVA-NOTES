public class TypeConversion4 {
    public static void main(String[] args) {

    }

    /*
    * it means while storing or assigning values to any variable it can convert it from its smaller type to bigger type
    * and bigger to smaller as well
    *
    *
    *
        1. Automatics conversion (if variables value can store/assign from small type to bigger type)

                byte var1 = 10;
                int var2 = var1;

                {so its possible, without any error}
                *
        2. Explicit conversion (variables value assigns from bigger to smaller)

               * int var1 = 128;
               * byte var2 = var1;  //it will show compile error
               * byte var2 = (byte) var1;   //in this way we are saying compiler explicilty that you convert it int to byte
               *
               *
        3. Promotion -
        *       byte a = 120;
        *       byte b  = 8;
        *
        *       byte c = a+b;   //it will show error
        *       byte c = (byte) (a+b);
        *               or
        *       int c = a+b;    //here we promoted byte var to int var
        *

    * */
}
