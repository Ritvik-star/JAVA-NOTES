public class Oops1 {
    public static void main(String[] args) {

    }

//    * OOP -   (object oriented programming)
//    In this, programming revoles around object and classes
//    object -
//    are real world entities which will have both behaviour(functionality) and properties
//for exmaple -
//    car
//    behaviour/functionality - driving, breaking, egnition
//    properties - color, brand, fuel type
//
//
//    class -
//    blueprint or templates of objects, object can be created by classes only.
//    from one class we can create multiple objects.
//    to create class we use 'class' keyword.
//
//
//    public class OOPs {
//        public static void main(String[] args) {
//
//        }
//
//        //data variables
//        int num;
//        string str;
//
//
//        //data member
//        //by using which we can access data members of class
//        //and to use them we need to have an object of this class
//        int getter(){
//            return this.num;
//        }
//
//        void setter(int n, string s){
//            this.num = n;
//            this.str = s;
//        }
//    }
//
//
//* OOPs concept -
// 1. DATA ABSTRACTION - in this we hide the unneccessary data from end user (can be achieved by interface and abstract classes)
// 2. DATA ENCAPSULATION - it bundles all the code and methods which works on that code in single unit or class, it also known as data hiding.
//                        -achieved by private variables and methods in class and by providing getter/setter methods to access.
// 3. INHERITANCE - in this we can inherite the behaviour or functionality from parent to child class,
//    it can be done by using EXTREND keyword.
//
//            -there are 4 types of inheritance
//    a). single inheritance.
//
//    {one parent class can have one child class inherited}
//    class A {
//
//    }
//
//    class B extend A {
//
//    }
//
//    b). multilevel inheritance.
//    {class A can have class B as child and class B can have class C as child}
//
//    class A {
//
//    }
//
//    class B extend A {
//
//    }
//
//    class C extend B {
//    }
//
//    c). hierarical inheritance.
//    {one parent class like class A can have more than one child classes like class B and class C }
//    class A{}
//
//    class B extend A{}
//    class C extend A{}
//
//                -> above all 3 can be achieved by using "extend" keyword.
//
//            d). multiple inheritance
//    {one child class can have multiple parent class, it is not allowed in Java,
//        allowed in c++.
//
//                    ->can be achived by using interface
//                    -> its a diamond problem in java, .e.g..
//        class A {
//            function get();
//        },
//        class B{
//            function get();
//        }
//
//        class C extend A, B {}
//        this.get()  //here compiler might get stuck like which methods in which class needs to call exactly.
//    }
//
//                    -->using INTERFACE (by using "IMPLEMENTS")-
//    interface A {} , interface B {}
//
//    class C implement A, B {}
//
//                     -> it can be override.
//
//            --> we can achive POLYMORPHISUM by inheritance.
//
// 4. POLYMORPHISUM :-     it means, we can have same method with different different behaviour or forms.
//            ...e.g..
//    person()    -> son, husband, brother, father etc..
//
//            -> 2 types of polymorphisum.
//            a). compile-time/static/overloading
//    {
//        1 method can have same name but can be used multiple times in different forms like
//            ..e.g...
//        class Sum {
//
//            int doSum(int a, int b){
//                return a+b;
//            }
//
//            String doSum(String a, String b){
//                return a+b;
//            }
//
//            int doSum(int a, int b, int c){
//                return a+b+c;
//            }
//
//
//            //if you see all above 3 methods are having same names but
//            //different amount or types of parameters.
//            //different return types (does not matter)
//
//        }
//
//        Sum obj = new Sum();
//        obj.doSum(2, 3)    //here, java will know in compile-time only by passing
//        //the arguments that which methods needs to call.
//    }
//
//
//    b). run-time/dynamic/overriding
//
//    {
//
//        in this, java will know about it in run-time only when object will be called.
//                                ..e.g....
//
//        class A {
//
//            Boolean isChecked(String name){
//                if (name == "R"){
//                    return true;
//                }
//            }
//        }
//
//        class B extend A{
//            @Override     -->not manadatory
//            Boolean isChecked(String name){
//                if (name == "R"){
//                    return false;   //here, we have override its implementation                                                                      }
//                }   //means, it will only identify in run-time that which method need to call.
//            }
//        }
//
//
//        //objecct for class B
//        B obj = new B();
//        obj.isChecked() //so it will the class B method only in run-time
//
//        //obejct for A
//        A obj1 = new A();
//        obj1.isChecked();   //it will be calling class A method
//
//
//                               -> return-type, arguments, method name all will same.
//                               -> implementation can be differ (since its overriding).
//    }
//
//
//* IS-RELATIONSHIP -
//            -It can be achieved by INHERITANCE.
//            ...e.g....
//    class A {}
//
//    class B extends A {}
//
//                        ->so here, we can say class B is related to class A.
//
//            * HAS-A-RELATIONSHIP -
//
//    whenever an object is used in another class, it means that class has a relation with object's class.
//            ....e.g......
//
//    class A {
//
//
//    }
//
//    A objA = new A();    //object of A class
//
//    class B {
//        objA;   //here its using class A object in class B, which means
//        //class B has a relation with class A
//    }
//
//                    ->one to one
//                    ->one to many
//                    ->many to many
//    {all these are possible}
//                    .e...g.....
//
//
//    class Courses {
//        javaCourse(){
//            return course;
//        }
//
//        python(){}
//
//        c++(){}
//    }
//
//    Courses objC = new Courses();
//
//    class Students {
//                          objC.javaCours()
//    }
//
//    //now 1 student can have one java course also;
//    //1 student can have many courses (java, python...) also.
//    //many students can have many courses.....also.
}
