// encapsulation 
class A{
  private String name;  //data hiding 
 
  public void setname(String name){
       this.name=name;
  }
  public String getname(){
        return name;
  }
}
public class Encapsulation_Concept {
public static void main(String arg []) {

       A N1=new A();
       N1.setname("gopal");
       System.out.println(N1.getname() );
}
}