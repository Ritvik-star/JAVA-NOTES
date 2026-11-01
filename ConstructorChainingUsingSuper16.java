public class ConstructorChainingUsingSuper16 {
    //using SUPER() also we can build constructor chaining between Parent-child classes
/*
*     -Example-1
*
*       public class Parent{
*
*           Parent(){
*               //no argu constructor
*           }
*        }
*
*
*       public class Child extends Parent{
*
*           Child(){
*               super() //hidden, added by-default
*
*           }
*       }
*
* // object created by using child class
*
*       Child obj = new Child();
*       //now once this object is created by-default compiler will call Parent constructor first
*       - then it will call child constructor,
*       - bcoz even if we dont add, super() will added by-default in child class before its constructor -
*
*           --flow
*               - object created using child class
*               - since its created by using Child class's constructor it will go to child class
*               - by default or hidden, add super() in child class before its constructor
*               - due to super() it will go to its parent class's constructor, executes it
*               - then come back to child's constructor and then execute it.
*
*
*       Example - 2, if its parameterized constructor
*
*           public class Parent{
*               int id;
*               Parent(int a){
*                   this.id = a;
*               }
*             }
*
*           public class Child{
*               String name;
*
*               Child(String s, int a){
*                   super(a);   //since its parameterized, added mannually so that it call Parent const. with passed parameter
*                   this.name = s;
*               }
*           }
*
*           Child obj = new Child("Ritvik", 25);    //this will go to child class
*
*           ------> FLOW -
*                       - since its a paramterized constructor then
*                       - it will go to child class and child constructor
*                       - and then as we added mannually super(a) with int a
*                       - then it will Parent's constructor and executes
*                       - on next line it will come back and executes it.
*
*
*        *** that's how it build constructor chaining using super() b/t classes
* */

}

