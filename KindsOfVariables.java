public class KindsOfVariables {

    int memberVariable;     //member variable
    //it can be accessed by object of its class


    static int staticVariable = 99;     //static/class variable
    //it can be accessed by using its class name only


    //this is default constructor
    KindsOfVariables(){

    }


    //parameterzied constructor
    KindsOfVariables(int a){
        this.memberVariable = a;
    }


    public void show(){ //again its a public non-static method then it can be called by object only
        int localVariable = 110;    //its local variable
        System.out.println(localVariable);
    }

    //parameterized method

    public int show(int a, int b){
        return a+b;
    }


    public static void main(String[] args) {
        KindsOfVariables obj1 = KindsOfVariables();
        KindsOfVariables obj2 = KindsOfVariables();
        KindsOfVariables obj3 = KindsOfVariables(111);  //it will call parameterized constructor

        //as many object we can create of one class


        //to access static member
        System.out.println(KindsOfVariables.staticVariable);

        //to access non-static member
        System.out.println(obj1.memberVariable);
        obj1.show(2, 3);

    }
}
