public class JMM17 {

//    Java memory management -
    //it is done by JVM itself,
    //it maintains 2 types of memory
        //STACK & HEAP (both are created by JVM and stores in RAM)

    //  1. STACK -
    //           -   stack is a memory which contains all reference variables, temporary variables
    //           -  and primitive variables with value as well.
    //          -   stores methods with separate block in memory
    //          -   stores reference of the heap objects
    //          -   Each thread will have its own copy of stack memory
    //          - variable is only visible within thier scope in memory
    //          -   it will be deleted in LIFO (last in first out) order once the code executed or reaches to } closing
    //          -   if stack memory is full then it will show java.lang.stackoverflowerror

     //Strong reference -   it will tell garbage collector that object stored in heap is having strong ref. from stack so
                        // do not delete it untill reference got removed.

    //weak reference - it says to GC, there is a reference avaiable but if you want to remove then you can remove


    //2. HEAP -

    //  - Stores objects.
    //  - no order or allocating memory in heap.
    //  - Garbage collector is used to delete unreferenced objects from heap memory.
    //  - Heap memory also contains String constant pool SCP.
    //  - when it is full then it will throw an error - java.lang.outofmemoryerror


}

public class Parent{


    //firstly there will be a block or frame allocated in stack memory for main()
    //and inside that block/scope only all variables, references and methods will stored
    public static void main(String[] args) {
        int a = 10;     //1st, store in stack
        JMM17 obj1              = new JMM17();   //object 1 for different class
       //2nd store in stack           //store in heap
        String str              = "Ritvik";
      //3rd store in stack          //store in heap(SCP)

        Parent obj2             = new Parent();     //object 2 for different class
      //4th store in stack        //store in heap

        obj1.test(obj1);    //called method and passed object as an argument

        //another block/scope created for test method
        //and inside that block, firstly store obj1 in stack
    }



    public void test(JMM17 obj1){
        JVM17 obj3              = obj1;
      //5th store in stack
      //obj3 will have same reference which obj1 is having

        String str2         = new String("xyz");
      //6th, store in stack          //store in heap


        //now, as they have stored in order, and when
    }   //<--- when this curly bracket will execute, then scope of test() will be removed in last in first out order
        //along with it will remove the references for objects which are stored in heap memory one by one
        //and then same for main()

        //and at the end GC will come and eat all the unreferenced objects from heap memory
}


/*
* HEAP - it contains two parts
*       - 1. Yonger generations - in this part of memory all the object will stored and till they reaches they thresolds
*                               it will move to next one which is (old generation), garbadge collector will faster here
*                               , which know as minor gc.
*
*       - 2. Old generation - in this part of heap memory it will have promoted objects which touched thier thresolds and garabadge
*                           collector will be performed slow here...which known as major gc
*
*
*       - 3. MetaSpace - it is another type of memory which maintained by JVM and used to store all the classes, class variables, constants like static final
*               and removed them by gc, when execution is done.
*               - it is a part of heap memory only, it is not expandable.
*
*
*
*
*
* GARBADGE COLLECTOR - It is a mechanisum in java, which removes or deletes the unreferenced object or those whos execution
*                       are done.
*                   - it uses mark and sweap algorithm.
*                       - mark - first it identify which objects needs to be deleted.
*                       - sweap - and then it delete those objects.
*
*                   - it also used mark, sweap and compact algorithm
*                       - comapct - after mark and sweap,, it compact the remaining objects in a order so that
*                                   - empty space can be left one side so that new object can be store properly without confusion
*
*
*                   - serial GC
*                   - parallel GC
*                   - g1 Gc
*
*
*
*
*
*
* */




