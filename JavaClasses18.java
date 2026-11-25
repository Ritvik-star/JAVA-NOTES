public class JavaClasses18 {
    /*
    *
    * 1. Concrete class -
    *   -----------------
    *
    *              - these are normal classes which can have all the fields and method implementations ..e.g..
    *              - it can use both either interface or abstract keyword to acheive abstraction
    *               - access modifier can be public or package private (by default it would package private only)
    *              - new instance/object can be created using new keyword.
    *
    *           .e.g....
    *                       public class Example {
    *                           int id;
    *
    *                           Example(int n){     //parameterized constructor
    *                               this.id = n;
    *                           }
    *
    *                           public int getId(){
    *                               return id;
    *                           }
    *                        }
    *
    *                       public interface Emp{
    *
    *                           //abstract method -> no implementation only declaration
    *
    *                           public showIdName();
    *                       }
    *
    *                       public class Employee implements Emp{
    *
    *                           @Override
    *                           public showIdName(){
    *                               sout(id+"1234");
    *                            }
    *                       }
    *
    *
    *
    * 2. ABSTRACT CLASS -
    *
    *   - these class can be created by using "abstract" keyword
    *   - we create these classes to achieve 0-100% abstraction.
    *   - it can have both abstract methods and concrete methods as well
    *   -
    *
    *
    *       - for example -
    *
    *          public abstract class Example {  //since we have used abstract keyword so it is abstract class now
    *                                           //direct its object can not be created, have to create child class object
    *                                               //this class can only declare the variables and method or implemente as well
    *
    *               int id;
    *
    *               Example(int id){
    *                   this.id = id;
    *               }
    *               abstract void showName();
    *
    *               void showId(){
    *                   return id;
    *               }
    *           }
    *
    *           public abstract ChildExample extends Example {
    *                           //since this child class is also abstract class and also extended from its parent
    *               //then it can inherite its parents properties or it can have more abstraction/implementaion
    *
    *               ChildExample(int id){
                            super(id);  //this will call/invoke super class/parent class constructor
    *
    *               }
    *
    *               //we can more abstract method
    *               abstract void showExample();
    *
    *               //needs to implement parents abstracted methods
    *               @Override
    *               showName(){
    *
    *                   sout("Ritvik");
    *               }
    *
    *
    *               public class GirlExample extends ChildExample{
    *                   //since it is not an abstract child class so we can not have abstract methods in it
    *                   //and we can create an object of it
    *
    *                   GirlExample(int id){
    *                       super(id);  //it will call its parent constructor
    *                    }
    *
    *                   //then again since it is extended by a abstract class then
    *                   //needs to give implementation
    *                   @Override
    *                   void showExample(){
    *                       sout("this is girl child example");
    *                   }
    *
    *
    *               }
    *
    *
    *               ChildExample obj = new GirlExample(101);
    *           }
    *
    *
    *
    *
    *
    * 3. SUPER & SUB CLASS -
    *
    *       subclass - a class which is derived or extended by any class is called as sub class
    *       superclass - a parent class
    *       if there is no parent class then implicitly there will be a Object class always as topmost class
    *       and we can have some built in methods from Object class .e.g....
    *       clone(), toString(), equals(), notify(), wait() etc....
    *
    *
    *       class Parent{
    *
    *           Object childObj = new ChildClass(); // by using Object class also we can create child class object in parent
    *       }
    *
    *
    *
    * 4. NESTED CLASS -
    *
    *       - those classes which are created inside a class
    *       - there are 2 types of nested classes
    *       - so when we know that class A is only used by class B then no need to create separate file A.java or class file
    *       - then we can create nested class A in class B.
    *       - nested class scope would be same as parent class
    *       - parent class scope can be only public or default (package private)
    *       - nested class can be public, private, protected, default...
    *
    *       - 1. STATIC nested class -
    *
    *                   public class Parent{
    *
    *                       int id;
    *                       static String name;
    *
    *                       Parent(int id){
    *                       this.id = id;
    *                       }
    *
    *                       static class NestedClass{
    *
    *                           //this is nested static class
    *                           //so we can its outer static members as well
    *                           void showName(){
    *                               sout(name);
    *                           }
    *
    *                       }
    *
    *                   }
    *
    *                   //we can create object for outer/parent class directly
    *
    *                   Parent Pobj = new Parent();
    *
    *
    *                   //if we want to create an obj for static nested class
    *
    *                    Parent.NestedClass Nobj = new Parent.NestedClass();    //here we are using outer class because nested class is static which depends on its class
    *                             Nobj.showName();
    *
    *
    *           2. NON-STATIC LOCAL inner class -
    *
    *                   public class OuterClass{
    *                       int id;
    *                       static String name;
    *
    *                       class LocalInnerClass{
    *                               sout(id + name);
    *                        }
    *                   }
    *
    *
    *                   //first need to create object for outer
    *                   OuterClass Oobj = new OuterClass();
    *
    *                       //obect creation for inner class using outer class object
    *                   OuterClass Iobj = Oobj.LocalInnderClass();
    *
    *
    *           3. NON-STATIC MEMBER inner class -
    *
    *                  - this is a nested class which can be created inside any block like if-else, loop or inside any method
    *                   - and its scope will be that block only
    *                   - it can be only default (package-private)
    *
    *               .e.g...
    *
    *                   public class OuterClass{
    *                       int id;
    *                       Static String name;
    *
    *                       void showName(){
    *                           sout(name);
    *                       }
    *
    *
    *                       void showId(){
    *
    *                           int innerClass;
    *
    *                           class LocalInnerClass{
    *                               //this is local inner class and this class or its object can not be used outside of its block
    *                               //but it can access its outer class all member as well
    *
    *                               sout(id);
    *
    *                               sout(name);
    *
    *                               sout(innerClass);
    *
    *                               void showClassName(){
    *                                   sout("its local inner class);
    *                               }
    *                           }
    *
    *
    *                           LocalInnerClass obj = new LocalInnerClass();
    *                           obj.showClassname();
    *                       }
    *                   }
    *
    *
    *
    *       ----INHERITANCE in nested class--------
    *
    *
    *           - 1 inner class can inherite class 2 in same outer class
    *
    *           public class Outer{
    *                int a
    *               class InnerClass1{
    *                   int b;
    *               }
    *
    *               class InnerClass2 extends InnerClass1{
    *                   int c;
    *                   sout(a + b + c);
    *               }
    *           }
    *
    *
    *           //first create object for outer class
    *
    *           - Outer Pobj = new Outer();
    *
                //using that can create object for inner class
                *
                * Outer Iobj2 = Pobj.new InnerClass2();
                *
                *
                *
                * - inheritance can be done with different class as well
                *
                * .e.g...we can have outer class and static nested class or non static inner class
                *   and then we can have another outer class with inner class and then inheritance can be done between
                *   both outer classes inner class for both static and non-static
                *
                *
                *

     *      3. ANONYMOUS inner class
     *
     *          - any class which does not have any name called as ANONYMOUS class.
     *          - .e.g....
     *          public abstract class Car{
     *                  void pressBreak();
     *              }
     *
     *          //now as a developer we dont want to declare an abstract class or declare a method
     *          //we just want to use it directly with implementation
     *
     *          //so instead of writing in above way we can do it in below way
     *
     *          psvm(){
     *
     *              Car obj = new Car(){
     *              @Override
     *              public void pressBreak(){
     *                      sout();
     *              }
     *              };  //here we have used anonymous class and direct implementation and kept ; to terminate it
     *
     *              obj.pressBreak();
     *          }
     *
     *          -- since we have not given any name so
     *          ---- internally compiler gives the name of anonymous class for us....
     *
    * */
}
