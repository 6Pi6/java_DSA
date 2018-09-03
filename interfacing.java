package Lab4;

import java.io.*;

//A simple interface
interface in1
{
 // public, static and final
 final int a = 10;

 // public and abstract 
 void display();
}

//A class that implements interface.
class interfacing implements in1
{
 // Implementing the capabilities of
 // interface.
 public void display()
 {
     System.out.println("Geek");
 }

 // Driver Code
 public static void main (String[] args)
 {
    interfacing t = new interfacing();
     t.display();
     System.out.println(a);
 }
}