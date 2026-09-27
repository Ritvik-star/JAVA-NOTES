public class VariableArguments13 {

    //so we do not know about amount of arguments needs pass

    //or how much arguments will come in method

    //specially in case of method overloading

    //we can use this operator '...' as argument while declaration and defination.

    //.e.g....



        public static int sum(int a, int b, int c){
            return a+b+c;
        }

    public static int sum(int a, int b, int c, int d, int e, int f){
        return a+b+c+d+e+f;
    }

    //so we are not sure about arguments in above methods so

        public static int sum(int ...variables){    //so here after using ... it will make all passed arguments in dynamic list

            int res = 0;

            for(int var : variables){
                res = res + var;
            }

            return res;
        }

    // you can not have multiple variable argument lists in single method
        //  sum(int ...var, int ...var2)   ------->it will show error

    //keep single arguments first, means vaarriable argument list should always be in last

        //  sum(int a, int b, int ...variables)




    VariableArguments13.sum(1);
    VariableArguments13.sum(1, 2, 3, 4, 5);
    VariableArguments13.sum(1, 3);

}
