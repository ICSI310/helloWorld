// declare the class.
public class Main 
{
  
  // the main (and only) method
  public static void main(String[] args) 
  {
    HelloWorld hello = new HelloWorld("blahblahblah");

    //hello.setHelloString("blahblah");
    String newString = hello.getHelloString();
    
    System.out.println(newString);
  } // main

} // class Main
