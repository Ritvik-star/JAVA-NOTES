public class Methods9 {
    /*
    * *** METHODS --
    *               its a collection of instruction that can perform specific tasks.
    *               its can be used to increase code readebility and reusability.
    *
    *
    *       psvm(){
    *
    *               public static int sum(int a, int b){
    *                   return a+b;
    *               }
    *               //now this method can used anywhere to do sum of 2 numbers
    *
    *       }
    *
    *
    *       ACCESS MODIFIERS -
    *
    *                           these are special keywords provided by JAVA, by using which we can decide the scope of class
    *                            and its fields or methods.
    *
    *           1. PUBLIC -
    *                          it can be accessed within same class or in same package or even in different package.
    *
    *                   ..e.g...
    *
    *             ----> package Department1
    *
    *                   public class Sales{
    *
    *
    *                         public void showSales(){
    *                               sout("total sales");
    *                           }
    *                   }
    *
    *
    *             inside another package
    *           --------> package Department2
    *
    *                       public class Engg{
    *
    *                               public void showDeptartment(){
    *
    *                                       Sales obj1 = new Sales();
    *                                       obj1.showSales;     //since it was defined as public so it can be accessed in another package or class
    *                                }
    *                       }
    *
    *
    *       2. PRIVATE -
    *                     these can be access by methods only in same class,
    *                       not in other class with same package.
    *
    *           private int a;
    *
    *       3. PROTECED -
    *                       it can be access in same class and in other class with same package.
    *                       and other sub/child class in different (not directly in parent)
    *
    *           ---> package one
    *               public class One {
    *                   protected void getAccess(){
    *                           sout();
    *                   }
    *               }
    *
    *           --> package two
    *
    *                public class Two extends One {
    *                      One obj = new One();
    *                       obj.getAccess();    //its fine here becoz its inherited from its parent class
    *               }
    *
    *
    *       4. DEFAULT -
    *                       In Java, if you dont mention any access modifire then by default it will be considered as DEFAULT by Java
    *                    - it can be accessed by classes in same packages.
    *                   --if its default one then you can not access it in different packages (even not by sub-classes)
    *
    *
    *
    *   RETURN-TYPE -
    *                   it tells, what method will return like
    *                   if its void - returns nothing
    *                   if its int - returns integer value  and so on....
    *
    *   METHOD-NAME -
    *                   -it should start with lowercase and with letter
    *                   - should be written in camelcase like getName()
    *                   - should not use built-in keywords or name
    *
    *
    *  TYPES -
    *           1.  BUILT-IN methods - these methods are provided by JRE
    *               .e.g...Math.sqrt(), Array.length(), list.size() etc.
    *
    *
    *           2. USER-DEFINED METHODS -
    *                                   methods defined by users like -
    *                   public static void getName(String name){
    *                       return name;
    *                   }
    *
    *           3. OVERLOADED METHOD -
    *                   - these methods can have same name and different arguments or parameter lists.
    *                   - .e.g...
    *             class Parent {
                       void sum(Object o) {
                            System.out.println("Parent sum(Object)");
                        }
                  }

                    class Child extends Parent {
                        void sum(String s) {
                            System.out.println("Child sum(String)");
                        }
                    }

                    public class Test {
                        public static void main(String[] args) {
                            Parent obj = new Child();
                            obj.sum("hello");   // Output: "Parent sum(Object)"  !!
                        }
                    }
                    *
                    *
                    *
    *
    *             Even though you passed a String and Child has a perfectly matching sum(String),
    *            it still calls Parent's sum(Object) — because:

                The compiler only looks at what's visible in the reference type Parent.
                Parent only has sum(Object).
                The compiler picks that method at compile time and locks it in — the JVM doesn't even consider
                *  Child's overload because, as far as static binding is concerned,
                *  it's calling Parent.sum(Object), and that's not overridden (different signature = different method),
                * so no dynamic dispatch kicks in for it.

    *           //since, we passed 1 string so it will pick matched arguments in class
    *           so in compile time, it will be verified that the method which needs to invoke or is it available or not
    *                    - based on name and arguments or parameter list
    *
    *
    *
    *
    *
    *       4. OVERRIDDEN METHOD - -
                                    sub-class/child class can have exact same method with same signature as parent is having.
                                    *
                         .e.g...

                    public class Parent{
     *
                        public void sum(int a, int b){  //signature is same
                        *   sout(a+b);  //implementation is different
                        *
                        * }
                    }

    *               public class Child extends Parent {
    *
    *                    @override
    *                   public void sum(int a, int b){  //signature is same
    *                       sout(a * b);    //implementation is different
    *                   }
    *                }
    *
    *
                - created an object with Parent as reference type and child as object type
    *
    *               Parent obj = new Child();
    *
    *               obj.sum(2, 3);
    *
    *           The Flow -
            -  Compile time: Compiler checks the reference type (Parent) to see if sum() exists there.
             It does, so compilation is allowed.
            - Runtime: JVM looks at the actual object (Child instance) to find sum().
            - It first checks if Child class itself has overridden sum().
            - It does not find it there.
            - So it walks up the class hierarchy (Child → Parent) and finds sum() defined in Parent.
            - Since Child inherited sum() without overriding it, that inherited version is what executes.
            - Result: Parent's sum() runs — but it's still technically running "on the Child object,"
                 it's just that Child didn't provide its own version, so it uses the inherited one.
                 *
                 *
                 *
    *       overidden methods - depends on its name and signature
    *                       - not depends on return-type,
    *                       -@overriden anotation is optional, even if we use its fine, if not used then also
    *                           there would not be any error.
    *
    *
    *
    *   --->    Why this happens — Static (Compile-time) Binding
                Concept	                |  Overriding	        |       Overloading
                Binding type	            Dynamic (runtime)	        Static (compile-time)
                Decided by	                Actual object type	        Reference type + argument types
                Requires inheritance	    Yes	                        No (can be in the same class too)
                Signature	                Must be same            	Must be different (params)
                @Override relevant?	        Yes                     	No — doesn't apply
    * */
}
