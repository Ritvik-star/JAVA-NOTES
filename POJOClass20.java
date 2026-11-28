public class POJOClass20 {

    /*
    *
    *        ----- POJO Classes -----
    *
    *           - these classes are "Plain Old Java Classes" which are very simple and public classess
    *           - with public constructor
    *           - with getter and setter methods
    *           - should not be extends and implements any interface
    *           - should not use any anotations.
    *
    *           .e.g....
    *
    *           public class Example{
    *
    *               int id;
    *               String name;
    *
    *               public Example(int id, String name){
    *                   this.id = id;
    *                   this.name = name;
    *               }
    *
    *               public void showValues(){
    *                   return this.id;
    *               }
    *
    *               public void setValues(int id, String value){
    *                   this.id = id;
    *                   this.name = value;
    *               }
    *           }
    *
    *           Example obj = new Example(12, "Ram");
    *           obj.showValues();
    *
    *
    *
    *       ----- When to use it -
    *
    *           1.
    *             - use POJO when if user request object comes to component or controller and then it can be used in multiple classes
    *             - but that request object should not be used directly because if we change anything in that req objtect then it will
    *           - affect everywhere so therefore we have to do one to one mapping and for that mapping POJO
    *           - classes can be created.
    *
    *           2.
    *               - when the request object comes to controller --> business logic (service) -->
    *                  ----> repository (here we can have POJO classes for enities before DB interaction)
    *
    *
    *
    *
    * */
}
