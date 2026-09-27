public class StaticMethods10 {
    /*
    *   STATIC METHODS -
    *                       these methods are associated with class
    *                   -  we can call them using class name only
    *
    *                       .e.g...
    *                           public class Parent {
    *
    *                               static void showParentsName(){
    *                                   sout();
    *                               }
    *                           }
    *
    *
    *                           Parent.showParentsName();   //invoke by class name
    *
    *                   - we can not called them using object because static ones will common for all object,
    *                       so it would not able select that with which object should called.
    *
    *                       //we can create multiple objects for Parent class..so
    *                           Parent obj1 = new Parent();
    *                           Parent obj2 = new Parent();
    *
    *                               //now if want to call showParentName() then we dont which object to select
    *                                   //because its common for both objects
    *
    *
    *                   - static methods can not access non-static methods and non-static variables.
    *                       ..e...ggg.....
    *
    *                       public class Child{
    *                           int a = 10;
    *                           static int b = 20;
    *
    *                           public void getNum(){       //non-static method
    *                               return this.a;
    *                           }
    *
    *
    *                           public static void showNum(){   //static method
    *                               sout(a);    //compilation error bcoz a is non-static instance variable
    *
    *                               sout(b);    //its fine bcz b is static one.
    *
    *                               getNum();   //cant called, compilation error, bcz its a static method
    *
    *                           }
    *
    *                       }
    *
    *                   - static method can not be orvidden becoz its associated by class, do not uses object and since there
    *                       will not be any dynamic binding(called instances variables or method which are in object type)
    *                        which why it can access only static ones.
    *                       - there is only static binding.
    *                       - static methods and static variables are compile-time polymorphisum.
    *
    *                       public class Relative extends Child{
    *
    *                           @overridden
    *                           public static void showNum(){   //here, tried to override the static method but it will show an error, not allowed
    *                               sout();
    *                           }
    *
    *                           //because static ones are not depends on object so there is dynamic binding.
    *
    *                       }
    *
    *
    *
    *        -----> WHEN to declare method as STATIC !!!
    *
    *               1. if it is not depending on instance variables.
    *               2. if it is completely depends on passed arguments.
    *
    *           .e.g....
    *
    *               public class Example{
    *
    *                   int a = 10;
    *                   static int b = 20;
    *
    *                   public int showNum(){   //now this method can not be static bcoz it has used static instance variable
    *                       sout(a, b);
    *                       this.b = 40;    //another reason, state is changing here
    *                   }
    *
    *                   public static int sum(int a, int b){    //this can be static bcoz its depend on argument
    *                       return a+b;     // not using or changing any instance variable.
    *                   }
    *
    *               }
    *
    *
    *          --REAL-SCENARIO EXAMPLE -
    *                             *******   FACTORY DESIGN PATTERN ******
    *                       -in this we uses method which are depends on arguments
    *
    * */
}
