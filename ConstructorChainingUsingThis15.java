public class ConstructorChainingUsingThis15 {

    // this is a built-in entity that we can use with in same class for referencing.
    // we can build constructor chaining using 'this'
    //constructor chaining can be done when we have multiple constructors and we do not wants create seperate objects for them

        //.e.....g......

        String name;
        int id;

        ConstructorChainingUsingThis15(){
            //name - null
            //id - null,    // by default till we assign something else

            //if we use 'this' for chaining
            this(10);   //this will call next constructor, who will receive 1 integer
        }


        ConstructorChainingUsingThis15(int num){
//            this.id = num;
                this("Ritvik", num);    //this will call next constructor, who will receive 1 string and 1 integer
        }

        ConstructorChainingUsingThis15(String str, int num){
            this.name = str;
            this.id = num;
        }   //here finally initialization will be done and build the constructor chaining using 'this'
}

    ConstructorChainingUsingThis15 obj = new ConstructorChainingUsingThis15();
                                        //since we have called normal const() with no parameters while creating obj, so it will go
                                        //to first constructor and then so on...
