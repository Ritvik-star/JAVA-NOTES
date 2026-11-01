public class Constructos14 {
    /*
    *
    *       CONSTRUCTOR -
    *                       it is used to create an instance and also used to initialize the instance variables.
    *
    *          .e.g....
    *
    *          public class Example{
    *               String name;
    *
    *               Example(String s){  ----->this is parameterized constructor, which recieve any argument to initilize instance var
    *                   this.name = s
    *               }
    *
    *
    *               Example(){  //this is normal, non-parameterized constructor
    *                   sout();
    *               }
    *           }
    *
    *       CONSTRUCTOR NAME -
    *                               - its name should be same as class name
    *                           ----> bcoz it become easy to identified by compiler then.
    *                           *--> methods can also has same name as class name, no issues, not recomended bcoz it creates confusion then
    *
    *       CONSTRUCTOR RETURN TYPE -
    *
    *                   CONSTRUCTOR do not have any return type, explicitly(we should not write it)
    *                         - otherwise it would be confusing
    *                           - bcoz a method can also have same name as class and it should have a return type
    *                           - it would have class type IMPLICITELY in run-time.
    *
    *                   .e.g...
    *                       class type      constructor
    *                         Example       Example(){    //here we can see, how in run-time it will get class type itself
    *                           }
    *
    *
    *    -----------------> suppose, if any method has same name as class then how it would be identify in run-time
    *
    *                       .e.g...
    *
    *                           method with same name as class -
    *                           void Example(){
    *                               sout();
    *                               }
    *               Difference---->//this method is having same name as class but also having return-type
    *                           -->as we know, constructor does not need return type.
    *
    *
    *                   ---->if we create an object of example class then -
    *                       Example obj = new Example();
    *                                           //not a method
    *                Flow------>so new keyword tells compiler to call Example() constructor, Example() is not method
    *                       --->it will go to correct constructor if we have multiple constructor depends upon pass arguments
    *                       ---->then it will initialze instance variables if needed.
    *
    *
    *       **FINAL -   why Constructor can not be final ?
    *
    *                  - Constructor can not be final.
    *               - bcoz final used methods can not be overridden, (if, its final then it can not be changed, nor the implementations)
    *               - Constructor can not be overridden, otherwise due to its naming and no return type rule
    *                   - it might be treated as method in child class, if it can inherited or overridden
    *
    *                   .e..g...suppose if it could be overridden
    *
    *               - public class Parent{
    *                       Parent(){
    *                       }
    *                   }
    *
    *               public clas Child{
    *                   @override
    *                   Parent(){   //according to constructor naming rule - it should have name as class name
    *                           //which it cant and then it would be treated as method and if it would work like
    *                           //method then we have to give any return-type and implementation as well
    *                   }   //and then it would not be constructor anymore, hence it can not be final or overridden.
    *               }
    *
    *
    *       ** ABSTRACT -   why Constructor can not be abstract ?
    *
    *                   ----> suppose, if we use abstract with constructor then in child it can not be inherited and
    *                       - child class can not ful-fill the duty of completing implementation of abstract method in it.
    *
    *                   public class Parent{
    *
    *                      abstract Parent();   //forcefull, abstract constructor   (ideally not allowed)

    *                   }
    *
    *                   public clas Child extends Parent{
    *
    *                       Parent(){
    *                           //since it was declared as abstract, then some implementation needs to given here.
    *                       }   //but we know that constructor can not be inherited since it would be error
    *                       // and since it can not inherited then you can not complete implementation in child class
    *                       //hence there is no point of having abstract constructor
    *                   }
    *
    *
    *       **STATIC -
    *                   Why Constructor can not be a static ?
    *
    *                   - constructor can also be parameterized so .e.g...
    *                   public class Parent{
    *                       int id;
    *
    *                       Parent(int value){
    *                           id = value; //if its parameterized constructor then easily it can access instance variable
    *                       }           // and initialized it
    *                   }
    *
    *               //but if constructor would be static, then static entities can not access non-static fields or methods
    *               //in that case initialization will be breaked
    *
    *
    *       **INTERFACE -
    *                       Why Interface can not have Constructor ?
    *
    *                     - bcoz in interface we only write signature or declare method,
    *                       - does not do implementation (which needs to be done by child class)
    *                   - if we write constructor in interface then -
    *                   interface Example{
    *                       Example();  //firstly, according to interface it should be declaration here
    *                               // but if it is constructor then its not possible
    *                   }       //and since constructor can not be inherited then we can not give the implementation.
    *                           //anywhere else
    *
    *               ---> most imp. we can not create object for interface, it will done for class only
    *               --> but using constructor we can create objects as well.
    *
    *
    *
    *
    * --------> TYPE of Constructor -
    *
    *       ** DEFAULT CONSTRUCTOR -
    *                               it would be created by compiler itself when there is no constructor created then
    *                           - once code started compiling then it would be automatic added in java.class file
    *                       - only till developer creates a constructor in the class
    *
    *
    *       ** No Arg/Normal Constructor -
    *                       ..e.g....
    *                                   public class Example{
    *
    *                                       Example(){
    *                                           //initialization
    *                                       }
    *                                   }
    *
    *
    *       ** Parameterized Constructor -
    *
    *           ..e..g....
    *
    *                       public class Example{
    *                           int id; //if we do not initialize it in constructor then by default constructor will assign null to it
    *                           Example(int value){  //but using parameterized constructor we can initialize that variable
    *                               id = value;
    *                           }
    *                       }
    *
    *                       Example obj = new Example(12); //here, new keyword will tell compiler to call parameterized const.
    *                                           //which receives same paramters.
    *
    *
    *       ** Overloaded Constructor -
    *
    *                       - As overloaded method, we can also do overloading with constructor,
    *                   - we can have multiple constructor in same class with same name and with different parameter list
    *                   - so at compile-time compiler will select based on passed parameters when object is created.
    *                   .e...gg....
    *                   public class Example{
    *                       int id;
    *                       int num;
    *                       Example(){
    *                           //here id will initialize as null by default.
    *                       }
    *
    *
    *                       Example(int a){
    *
    *                           id = a;
    *                       }
    *
    *                       Example(int a, int b){
    *                           int id = a;
    *                           int num = b;
    *
    *                       }
    *                   }
    *
    *                   Example obj = new Example(1, 2);    //so it will call 2nd constructor
    *
    *      ********* CONSTRUCTOR OVERRIDDEN is not possible bcoz constructor can not be inherited ****
    *
    *
    *
    *   ** Private Constructor -
    *                           public class Example{
    *
    *                               private Example(){
    *
    *                               }   //since its private constructor now, then it can not access out side of this class
    *                           }     //it will be accessible only within same class.
    *                           //then no one will able to create an object outside of class
    *                           //and in that case if they have to do it then they have make methods as STATIC so that it
    *                           //can accessed using class, not object.
    *
    *                       -- it can be used in SINGLTON CLASS PATTERN
    *
    *                           public class Example{
    *
    *                               private Example(){
    *
    *                               }
    *
    *                               //since we can not create object outside of this class bcoz const. is private
    *                                // so methods needs to be static
    *
    *                               public static Example getInstance(){
    *
    *                                   return new Example();   //it will that private constructor
    *                               }           // that's how it will be accessible even outside using class
    *
    *                           }
    *
    *                       //Example.getInstance();    //likewise we can access the methods
    *
    *
    * */
}
