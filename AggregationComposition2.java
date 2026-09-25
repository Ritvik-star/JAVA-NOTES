public class AggregationComposition2 {
    public static void main(String[] args) {

    }

//
//* AGGREGATION & COMPOSITION -
//
//            ->it is a relationship between objects.
//
//
//    AGGREGATION -
//    Both objects can survive individually, means ending of one object,
//    will not end another object...e.g....
//
//    class School {},                class Student{}
//    //if I end this object            //then it will affect students, they will enroll somewhere else
//
//
//    COMPOSITION -
//    Ending of 1 object will end another object as well, both are dependent.
//                    ....e.g......
//    class School{},
//
//    class Rooms{},
//
//            //now if I destroy rooms then it will also destroy the school.
//
//
//
//            * JDK - Java development kit (it will have JRE + JVM + language details, debugger, compiler(JavaC))
//            -it is plateform dependent (we have to install it, then only java bytecode will execute)
//
//*JRE - Java run-time environment (JVM + all built-in class libraries like Arrays, Maths, Scanner etc.)
//        -it is also platform dependent.
//
//* JVM - Java virtual machine (it converts java bytecode into machine code, which is executable)
//        -it is also platform dependent.
//
//* JIT - it is a just-in-time compiler.
//
//            *JAVAC - its compiler which runs/compiles the java code and convert .java into .class (bytecode).
//            - this bytecode will be platform independent (means, it can run anywhere).
//
//
//
//            * JSE - Java standard edition {its a core java, which includes classes, object and other imp concepts}
//
//* JEE - Java enterprise edition/Jakarda EE {it includes services/apis which can be used while doing enterprise
//        project development, like (JSE + rollback/transaction api, servelts, JSP, persistent api)
//        -it uses while doing large scale project development like an e-commorce.
//
//                * JME - Java Micro/mobile edition (it includes, apis/services related to mobile applications)
//
//
//
//                * Why java code/file should have only 1 public class ??
//
//        -JVM calls the main(), which is a entry point of java code to execute.
//                -java file name should same as its public class ...e.g...Student.java (file), public class Student {}
//        -so that it can easily identify and accessed by JVM and main()
//                -main() also should public and static so that can be accessed without any object
//
//    ....e.g.....(basic java program)
//
//        public class Student {
//            public static void main(String[] args){
//                System.out.print("its basic java code."};
//        }
//    }
//

}
