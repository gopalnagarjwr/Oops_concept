  //compail time polymophisam
class A {
  int num1;
  int num2;
  public void poly(int x){
        this.num1=x;
        System.out.println("valu of num1 ="+" "+num1);
  }
  public void poly(int x,int y){
         this.num1=x;
         this.num2=y;
        System.out.println("value of num1 and num2 =" +" "+ num1+" "+ num2);
  }
}
public class MethodOverLoding {
public static void main(String arg []) {
     A value=new A();
     value.poly(5); // compailar declare call by  poly(int x)
     value.poly(5,3);//compailar declare call by poly(int x, int y)
 }
}