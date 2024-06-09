



class Person {

   private String name;
   private int age;


   Person(){
    this.age=18;
   }

    Person(String name , int age){
        this.name= name;
        this.age=age;
   }

  void  printPerson()  {
    System.out.println("name :: " + name + " " + "age :: " + age + " ");
   }
}

class Day4Java
{
public static void main(String[] args) {
    
    Person person = new Person();
    person.printPerson();
    
}
}