public class KindsOfVariables5 {

    int memberVariable;     //member variable
    //it can be accessed by object of its class


    static int staticVariable = 99;     //static/class variable
    //it can be accessed by using its class name only


    //this is default constructor
    KindsOfVariables5(){
    //it will just assign null to all variables if not initialized
        //memberVariable = null;    //internally
    }


    //parameterzied constructor
    KindsOfVariables5(int a){
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
        KindsOfVariables5 obj1 = KindsOfVariables();
        KindsOfVariables5 obj2 = KindsOfVariables();
        KindsOfVariables5 obj3 = KindsOfVariables(111);  //it will call parameterized constructor

        //as many object we can create of one class


        //to access static member
        System.out.println(KindsOfVariables5.staticVariable);

        //to access non-static member
        System.out.println(obj1.memberVariable);
        obj1.show(2, 3);

    }
}
