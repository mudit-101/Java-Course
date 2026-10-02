// class Student {
//     int rollno;
//     String name;
//     int marks;
// }
// public class Demo {
//     public static void main(String a[]){

//         Student s1 = new Student();
//         s1.rollno = 1;
//         s1.name = "Mudit";
//         s1.marks = 69;

//         Student s2 = new Student();
//         s2.rollno = 1;
//         s2.name = "Mudit";
//         s2.marks = 69;

//         Student s3 = new Student();
//         s3.rollno = 1;
//         s3.name = "Mudit";
//         s3.marks = 69;

//         Student student[] = new Student[3];
//         student[0] = s1;
//         student[1] = s2;
//         student[2] = s3;

//         for(int i = 0; i<student.length; i++){
//             System.out.println(student[i].name + " : " + student[i].marks);
//         }

//     //     int nums[][] = new int[3][];
//     //     nums[0] = new int[4];
//     //     nums[1] = new int[3];
//     //     nums[2] = new int[2];

//     //      for(int i = 0; i<nums.length; i++){
//     //     for(int j  = 0; j<nums[i].length; j++){
//     //         nums[i][j] = (int)(Math.random()*10);
//     //         System.out.print(nums[i][j] + " ");
//     //     }
//     //     System.out.println();
//     //   } 
//     //   int nums[][] = new int[3][4];
//     //   for(int i = 0; i<3; i++){
//     //     for(int j  = 0; j<4; j++){
//     //         nums[i][j] = (int)(Math.random()*10);
//     //         System.out.print(nums[i][j] + " ");
//     //     }
//     //     System.out.println();
//     //   } 
//     //   for(int n[] : nums){
//     //     for(int m: n){
//     //         System.out.print(m + " ");
//     //     }
//     //     System.out.println();
//     //   }
//     }
// }

// String

// public class Demo {
//     public static void main(String[] args){

//         StringBuffer sb = new StringBuffer("Navin");
//         System.out.println(sb.length());
//         sb.append(" Reddy");
//         sb.insert(6, "java ");
//         // sb.deleteCharAt(2);

//         System.out.println(sb);

// String name = "navin";
// name = name + " reddy";
// System.out.println("hello " + name);

// System.out.println(name.hashCode());
// System.out.println(name.charAt(1));
// System.out.println(name.concat(" reddy"));
//     }
// }

//ENCAPSULATION
// class Human {
//     private int age;
//     private String name;

//     public Human() {  //default constructor
//         age = 21;
//         name = "Mudit";
//     }

//     public Human(int a, String n){  // parameterized constructor
//         age = a;
//         name = n;
//     }

//     public int getAge() {
//         return age;
//     }

//     public void setAge(int age) {
//         this.age = age;
//     }

//      public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

// }

// public class Demo {
//     public static void main(String a[]) {
//         Human obj = new Human();
//         Human obj1 = new Human(21, "Goyal");
//         System.out.println(obj.getName() + " : " + obj.getAge());
//         System.out.println(obj1.getName() + " : " + obj1.getAge());

//         // obj.setAge(21);
//         // obj.setName("Mudit");
//         // System.out.println(obj.getName() + " : " + obj.getAge());

//     }
// }

//STATIC KEYWORD

// class Mobile {
//     String brand;
//     int price;
//     static String name;

//     static {
//         name = "Phone";
//         System.out.println("in static block");
//     }

//     public Mobile() {
//         brand = "";
//         price = 200;
//         System.out.println("in constructor");

//     }

//     public void show() {
//         System.out.println(brand + " : " + price + " : " + name);
//     }

// public static void show1(Mobile obj) {
// System.out.println(obj.brand + " : " + obj.price + " : " + name);

// }
// }

// public class Demo {
//     public static void main(String a[]) throws ClassNotFoundException {

//         Class.forName("Mobile");

// Mobile obj1 = new Mobile();
// obj1.brand = "Apple";
// obj1.price = 1500;
// Mobile.name = "SmartPhone";

// Mobile obj2 = new Mobile();

// Mobile obj2 = new Mobile();
// obj2.brand = "Samsung";
// obj2.price = 1700;
// Mobile.name = "SmartPhone";

// obj1.name = "phone";

// obj1.show();
// obj2.show();

// Mobile.show1(obj1);
//     }
// }

// class A {

//     public A() {
//         System.out.println("Object Created");
//     }

//     public void show() {
//         System.out.println("in A show");
//     }
// }

// public class Demo {
//     public static void main(String a[]) {

//         new A().show(); // anonymous object

//     }
// }

// INHERITANCE

// class Calc {
//     public int add(int n1, int n2) {
//         return n1 + n2;
//     }

//     public int sub(int n1, int n2) {
//         return n1 - n2;
//     }
// }
// class A extends Object{
//     public A(){
//         super();
//         System.out.println("in A");
//     }
//     public A(int n){
//         super();
//         System.out.println("in A int");
//     }
// }
// class B extends A {
//     public B (){
//         super();
//         System.out.println("in B");
//     }
//     public B(int n){
//         this();
//         System.out.println("in B int");
//     }
// }
// public class Demo {
//     public static void main(String a[]) {

//         B obj = new B(5);

// VeryAdvCalc obj = new VeryAdvCalc();

// int r1 = obj.add(4,5);
// int r2 = obj.sub(7,5);
// int r3 = obj.mul(7,5);
// int r4 = obj.div(7,5);
// int r5 = obj.power(7,5);

// System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);

//     }

// }

//Method over-riding

// class A {
//         public void show(){
//                 System.out.println("in A show");
//         }
//         public void config(){
//                 System.out.println("int A config");
//         }
// }

// class B extends A
// {
//         public void show(){
//                 System.out.println("int B show");
//         }
// }

// public class Demo {
//         public static void main(String a[]) {
//                 A obj = new B();
//                 obj.show();
//                 obj.config();
//         }
// }

// import other.tools.A;

// class C extends A{
//         public void abc(){
//                 System.out.println(marks);
//         }
// }
// public class Demo
// {
//         public static void main(String a[]){
//                 A obj = new A();
//                 System.out.println(obj.marks);

//                 B obj1 = new B();
//                 System.out.println(obj1.marks);
//         }
// }

// POLYMORPHISM

// Runtime Polymorphism(Dynamic method dispatch)

// class A {
//         public void show(){
//                 System.out.println("in A show");
//         }
// }

// class B extends A {
//         public void show(){
//                 System.out.println("in B show");
//         }
// }

// class C extends A {
//         public void show(){
//                 System.out.println("in C show");
//         }
// }

// public class Demo {
//         public static void main(String a[]) {
//                 A obj = new A();
//                 obj.show();

//                 obj = new B();
//                 obj.show();

//                 obj = new C();
//                 obj.show();
//         }
// }

//final keyword(variable, method, class)

// import other.tools.calc;

// class Calc {
//         public final void show(){
//                 System.out.println("in Calc Show");
//         }
//         public void add(int a, int b){
//                 System.out.println(a+b);
//         }
// }
// class AdvCalc extends Calc{
//         public void show(){
//                 System.out.println("By John");
//         }
// }
// public class Demo {
//         public static void main(String a[]) {
//                 AdvCalc obj = new AdvCalc();
//                 obj.show();
//                 obj.add(4, 5);
//         //        final int num = 7;
//         //        num = 8; gives error
//         //        System.out.println(num);
//         }
// }

//Object Class

// class Laptop {
//         String model;
//         int price;

//         // public String toString() {
//         //         return model + " : " + price;
//         // }

//         @Override
//         public int hashCode() {
//                 final int prime = 31;
//                 int result = 1;
//                 result = prime * result + ((model == null) ? 0 : model.hashCode());
//                 result = prime * result + price;
//                 return result;
//         }

//         @Override
//         public String toString() {
//                 return "Laptop [model=" + model + ", price=" + price + "]";
//         }

//         @Override
//         public boolean equals(Object obj) {
//                 if (this == obj)
//                         return true;
//                 if (obj == null)
//                         return false;
//                 if (getClass() != obj.getClass())
//                         return false;
//                 Laptop other = (Laptop) obj;
//                 if (model == null) {
//                         if (other.model != null)
//                                 return false;
//                 } else if (!model.equals(other.model))
//                         return false;
//                 if (price != other.price)
//                         return false;
//                 return true;
//         }

//         // public boolean equals(Laptop that) {
//         //         return this.model.equals(that.model) && this.price == that.price;
//         // }

// }

// public class Demo {
//         public static void main(String a[]) {
//                 Laptop obj1 = new Laptop();
//                 obj1.model = "Lenovo";
//                 obj1.price = 1000;

//                 Laptop obj2 = new Laptop();
//                 obj2.model = "Lenovo yoga";
//                 obj2.price = 1000;

//                 boolean res = obj1.equals(obj2);

//                 System.out.println(res);
//         }
// }

// TypeCasting

// class A{
//         public void show1(){
//                 System.out.println("in A show");
//         }
// }

// class B extends A{
//         public void show2(){
//                 System.out.println("in B show");
//         }
// }

// public class Demo {
//         public static void main(String a[]) {

//                 A obj = (A) new B(); //upcasting
//                 obj.show1();

//                 B obj1  = (B) obj; // downcasting
//                 obj1.show2();

//     double d = 4.5;
//     int i = (int)d;
//     System.out.println(i);    
//         }
// }

//Wrapper classes

// public class Demo {
//         public static void main(String a[]) {
//                 int num = 7;
//                 // Integer num1 = new Integer(num); //boxing -> taking primitive value and
//                 // storing that in primitve object or wrapper object or calss object

//                 Integer num1 = num; // Autoboxing -> when you stored primitive type automatically

//                 // int num2 = num1.intValue(); // unboxing -
//                 int num2 = num1; // auto - unboxing -> when you take out the primitive value from the object

//                 System.out.println(num2);

//                 String str = "12";
//                 int num3 = Integer.parseInt(str); // convert string to int
//                 System.out.println(num3 * 2);
//         }
// }

// Abstract Keywords

// abstract class Car
// {
//        public abstract void drive(); // abstract class can have abstract mehod and normal method or both and either one of them. there is no problem with only one method.
//        public abstract void fly(); 

//        public void playMusic(){
//         System.out.println("play Music");
//        } 
// }

// abstract class WagonR extends Car{
//         // public void fly(){  if we do not define method in class so i have to make abstract this class and make a new class for calling that class below.
//         //         System.out.println("Flying..");
//         // }
//             public void drive()
//             {
//                 System.out.println("Driving..");
//             }
   
// }

// class updatedWagonR extends WagonR  // concrete class
// {
//         public void fly(){
//                 System.out.println("Flying..");
//         }
// }

// public class Demo {
//         public static void main(String[] args) {
//                 Car obj = new updatedWagonR();
//                 obj.drive();
//                 obj.playMusic();
//                 obj.fly();
//         }
// }

// Inner Class

class A {
    int age;
    public void show(){
        System.out.println("in A show");
    }

     class B {
        public void config(){
            System.out.println("in config");
        }
    }
}
public class Demo{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // A.B obj1 = new A.B(); // when we use static class B
        A.B obj1 = obj.new B(); // when we do not use static in class B
        obj1.config();

    }
}