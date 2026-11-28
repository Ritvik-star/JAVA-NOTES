public class EnumClass21 {

    /*
    *
    *      --- Enum class are the collections of constants
    *       -- internally enums are static final only
    *       -- constants which we can create using "static final"
    *       -- enum class can not extends any other class because internally it extends java.lang.Enum class
    *       -- it can implement interfaces
    *       -- it can have variables, constructor, methods as well.
    *       -- it can have abstract method as well
    *
    *       .e.g....
    *
    *           public enum EnumClass{
    *             0  ONE,
    *             1  TWO,
    *             2  THREE,
    *
    *           }
    *
    *           EnumClass.values()    -> it will give an array of all enum elements
    *           EnumClass.Ordinal()   -> it will give the default values like 0,1,2,3,4....
    *          EnumClass enum1 =  EnumClass.valueOf("String") -> using this method we can pass any enum as string to search ang get
    *           enum1.name() --> it give the exact matching name with above passed string.
    *
    *
    *
    *       ---> we can use ENUM with abstract methods
    *       ---> we can use ENUM with interfaces as well
    *
    *
    *       --->> benefits ---> if we pass ENUM as an argument in any method and then used any enum constant
    *                       --> then that method will only accept limited values or matching values which are already available in
    *                       --> enum array, apart from that it will not accept anything else.
    *
    * */
}
