public class AbstractMethod12 {

        //  these methods can be inside only abstract classes.

        //uses 'abstract' keyword in declaration, means
        //there will be only declaration or signature, no implementation in same abstract class
`
            //impletementation should be done by its child class,

    //.e.g....
            public abstract class Parent{

                public abstract void show(); //only declaration
            }

            public class Child extends Parent{

                public void show(){     //implementation or defination of abstract method
                    sout("implementation will in child class");
                }
            }
}
