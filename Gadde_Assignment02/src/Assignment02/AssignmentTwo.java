package Assignment02;

import java.util.ArrayList;
import java.util.Scanner;



public class AssignmentTwo {



/**
* @param args
*/
public static void main(String[] args) {

AssignmentImplementation w = new AssignmentImplementation();
System.out.println("Enter the size of array");
Scanner sc = new Scanner(System.in);
int size=sc.nextInt();
String[] arr= new String[size];
for(int k =0;k<size;k++)
{
System.out.println("Enter the element in array string:");
arr[k]=sc.next();

}
System.out.println("Problem-01");
System.out.println("Output"+w.countOfKeys(arr));
System.out.println("Problem-02");
System.out.println("Output"+w.firstLetterKey(arr));
System.out.println("Enter the Integer array size ");
int sizee = sc.nextInt();
int argss[] = new int[sizee];
for(int k=0;k<sizee;k++)
{
System.out.println("Enter the element");
argss[k]=sc.nextInt();
System.out.println(argss[k]);

}
System.out.println();
System.out.println("Problem-03");
System.out.println(w.setIncreasing(argss));
System.out.println("Enter the size of arraylist:");
int len= sc.nextInt();

ArrayList<String> bus = new ArrayList<String>();
for(int k =0;k<len;k++)
{
System.out.println("enter the ele:");
String p=sc.next();
bus.add(p);

}
System.out.println("Problem-04");
System.out.println(w.removeDuplicates(bus));
System.out.println("Problem-05");
System.out.println(w.formingKeysValues(bus));
System.out.println("Problem-06");
ArrayList<String> pi = new ArrayList<String>();
System.out.println("Enter the size of the array:");
int derr=sc.nextInt();
for(int k=0;k<derr;k++)
{
System.out.println("enter the ele:");
pi.add(sc.next());
}
System.out.println(w.assigningTrueAndFalse(pi));



}



}
