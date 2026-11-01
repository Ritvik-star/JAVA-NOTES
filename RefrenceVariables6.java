public class RefrenceVariables6 {
    //There are 4 type of refrence data-types
    /*1. Class
    2. String
    3. Interface
    4. Array


    1. CLASS -

        classes are blur print of objects
        .e.g...



            public class Employee {
                int empId;

                public int getId(){
                    return id;
                }

                public setId(int id){
                    this.empId = id;
                }
            }

            public class student {
                psvm(){
                    Employee obj = new Employee();
                    modifyId(Employee obj);
                }
            }



            //now Object is created of Emp class then some specific memory will allocate in heap memory
            //and this created obj will holds the reference of that memory

            // obj ----->[heap memory]

            //since its having reference so we can change or access the fields of methods of emp class

            sout(obj.empId);
            obj.getId();



             private static void modifyId(Employee obj){
                emp.empId = 20;
            }

            now, initially
                obj ------------->[empId = 10]  //inside heap memory

                //after calling modifyId()

                obj ------------>[empId = 20]   //inside same heap memory

               //which means by using the reference only we can change the value,
               //which is why it is reference data type.

            //In Java, we do not have pass by reference but we have only pass by value.

            //But in java, we can achieve pass by reference using reference data types




     2. STRING -
                [
                    heap memory

                        [string constant pool]

                ]

            -String are immutable
            -means, it can not be changed, it can be created once again only.
            -can be created by using literals ""
                String s1 = "Ritvik";   -------> will stored in string constant pool, SCP
            -or else by using new keyword with literals
                String s2 = new String("Ritvik")    -------> strored in heap memory, outside SCP


                String s3 = "Ritvik"; ----->since, "Ritvik" is already stored in SCP then it will not create seperate space for it
                    //s3 will just point or have reference of same as s1.

              .e.g....

                sout(s1==s2);  //false, == check references and since reference are different or stored in different memory.
                 s1.equals(s2); //true, bcoz equals() checks only content, does not care about reference.



        3. INTERFACE -

                its like a blueprint of class, it can have abstract methods or regular/contcrete methods as well
                .e.g...

                public interface person {
                       public String profession();  //just declared not defined or implementation will be child class
                }

                public class teacher implements person {
                    @Override
                    public String profession(){
                        sout("teacher");
                    }
                }

                public class engineer implements person {
                    @Override
                    public String profession(){
                        sout("engineer");
                    }
                }

                psvm(){

                    person obj1 = new techer();   //object can be only created for classes not for interface
                    //but object reference type can be interface

                    person obj2 = new engineer();


                    // obj1---------->[heap memory]

                    //obj2----------->[heap memory]

                    //so both objects are holding reference of allocated heap memory, hence interface is a refrence datatype

                }


    4. ARRAY -
                arrays are continous collection of same data-type elememts.
                it use indexes to be accessed.
                .e.g...

                int[]    arr            =   new         int[5];
             //datatype  reference          keyword         size
                         variable name

                o/p ---> arr --------------->[ [0, 0, 0, 0, 0] ]//heap memory

            //if we know the values, then

            int[] arr = {1, 2, 3,4, 5}; //known default values.

            //2-D array
                -it will rows and cols
                                    //column
            int[][] arr = new int[3][3];
                                //row
                o/p---> crete 3x3 array
                        [0, 0, 0]
                        [0, 0, 0]
                        [0, 0, 0]       //by default

             arr[1][2] = 0;




















     */
}
