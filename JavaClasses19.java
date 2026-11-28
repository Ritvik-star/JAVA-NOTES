public class JavaClasses19 {
    /*
    *
    *
    * ---GENERIC CLASSES -
    *
    *      - classes for those we can define the return type while creation of object or classes which can accepts
    *      - different different type values...
    *      - simply, for classes which we dont know the return type we can define them as generic type classes
    *      - and if we have defined it as generic then it can received any type.
    *       .e.g....
    *
    *           public class Color<T>{
    *
    *               T value;
    *
    *               void T getValue(){
    *                   return value;
    *               }
    *
    *               void T setValue(T value){
    *                   this.value = value;
    *               }
    *           }
    *
    *           Color<Integer> obj = new Color<Integer>     //Color class is generic type but while creating the object
    *                                    //defined it as integer so now it will only accept integer as value
    *               obj.setValue(123);
    *
    *
    *       --- Inheritance with non-generic sub class
    *
    *           public class BlueColor extends Color<String>{
    *
    *                   //we can do inheritance with non-generic class but during extending the sub-class with super class
    *                   //that time only have to define the return type of super class.
    *           }
    *
    *       --- Inheritance with generic sub class
    *
    *           public class PinkColor<T> extends Color<T>{
    *
    *               //with this case also inheritance can be achieved and can have the generic type while inheritance
    *               //and later while creating obj of sub class we can give the return type
    *           }
    *
    *           PinkColor<String> childObj = new PinkColor<String>();
    *           childObj.setValue("pink");
    *
    *
    *
    *       ---- Generic Class with mutiple generic type Class<K, V>
    *           .e.g...
    *
    *           public class Pair<K, V>{
    *
    *               K key;
    *               V value;
    *
    *               Pair(K value1, V value2){
    *                   this.key = value1;
    *                   this.value = value2;
    *               }
    *
    *               void showValues(){
    *                   sout(key, value);
    *               }
    *           }
    *
    *           Pair<String, Integer> obj = new Pair<>();
    *               obj.showValues();
    *
    *
    *
    *
    *       ----- Generic Method
    *
    *               - we can also make a generic method, inside even non-generic class
    *               - scope would be limited to that method only
    *               .e.g...
    *
    *               public class NormalClass{
    *
    *                   public <T> void showValues(T value){
    *                       sout(value);
    *                   }
    *               }
    *
    *
    *
    *
    *       --- Raw type class
    *
    *           - while defining the class we can give the generic type <T> but
    *           - while creating the object we do not give any specific type to it explicitly
    *           - but compiler internally gives type to it according to the passed value, like if we pass string
    *           - then type will be string and if we pass integer value then type will be integer only
    *               .e.g...
    *
    *                   public class Print<T> {
    *
    *                       T value;
    *
    *                       Print(T value){
    *                           this.value = value;
    *                       }
    *
    *                       void showValue(){
    *                           return value;
    *                       }
    *
    *                       void setValue(T value){
    *                           this.value = value;
    *                       }
    *                   }
    *
    *
    *                   //normal way of creating object for generic class
    *                   Print<Integer> obj = new Print<>();
    *
    *                       //now compiler will take only integer via this obj
    *
    *
    *                   //raw type
    *
    *                   Print rawObj = new Print();
    *
    *                   rawObj.setValue(1);
    *                   rawObj.setValue("Ram");
    *
    *
    *
    *          --- Bounded generic classes
    *
    *               - in generic class we can bound or restrict the type while creating a generic class
    *               - so that while creating object we pass only that type which is allowed.
    *               .e.g...
    *
    *                   topmost class ---> object
    *                                       |
    *                                       v
    *                                     Number
    *                                           -> Long
    *                                           -> double
    *                                           -> BigInt
    *                                           -> Short....etc.
    *
    *
    *               public class Print<T Number>{   //with this generic class we have given the generic type
    *                     //with Number class only so now only its child types like Long, double, BigInt, Short will be allowed.
    *
    *                   T value;
    *
    *                   void setValue(T value){
    *                       this.value = value;
    *                   }
    *
    *                   void getValue(){
    *                       return value;
    *                    }
    *               }
    *
    *
    *               Print obj = new Print();
    *               //since it is restricted to Number only so we can pass only Number's type
    *               //otherwise it will give compiler error
    *
    *
    *
    *
    *   ---- WILD CARDS ------------
    *
    *           - if we do not know what type of object it can accept and can come then we can use it
    *           - we use ? as wild card type
    *           - e.g...
    *
    *           public class Parent{
    *
    *               //wild card
    *
    *               public void showValue(List <?> value){
    *                              //here list of value can be type of anything
    *                       //like it can be string, integer so we do not know the type which is why we have used ?
    *               }
    *
    *
    *               //generic method
    *
    *               public <T> void showData(List <T> data){
    *                   //so in generic we would be knowing about the data type,
    *                   //or it will be of certain data type like
    *               //if we gave Number while creating object then it will take all child of Numbers
    *
    *               }
    *
    *           }
    *
    *
    *
    *       ---- Type erasure ------------
    *
    *           - so while development we use generic types or wild cards
    *           - but after execution or converting the java code into byte code, this type erasure will
    *           - replace the generic and wild type into real once like object or number or string.....
    *
    *
    *
    *
    *
    *
    * */
}
