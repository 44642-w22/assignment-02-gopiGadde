package Assignment02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author S545441
 *
 */

public class AssignmentImplementation {
public Map<String,Integer> countOfKeys(String[] z)
{
Map<String,Integer> b = new HashMap<>();
for(String a:z)
{

if(b.containsKey(a))
{
Integer g = b.get(a);
b.put(a,g+1 );
}
else
{
b.put(a, 1);
}

}

return b;

}
public Map<String,String> firstLetterKey(String[] args)
{
Map<String,String> go= new HashMap<>();
for(String s: args)
{
if(go.containsKey(s.substring(0,1))) {
String a=go.get(s.substring(0,1));
a= a+s;
go.put(s.substring(0,1), a);

}
else
{
go.put(s.substring(0,1), s);
}
}
return go;

}
/**
* @param arr
* @return
*/
public Set<Integer> setIncreasing(int[] arr)
{
int count =0;
Set<Integer> w=new HashSet<Integer>();
for(int k=0;k<arr.length;k++)
{ if(arr[k]==0)
{
w.add(1);
}
else
{
if(w.contains(arr[k]))
{
if(k!=0 && arr[k-1]==arr[k])
{
count= count+1;
w.add(arr[k]+count);

}
else
{
w.add(arr[k]+1);
}
}
else
{
w.add(arr[k]);
}
}
}

return w;
}
public ArrayList<String> removeDuplicates(ArrayList<String> arr)
{
ArrayList<String> arr2 = new ArrayList<String>();
String a=null;
for(String k:arr)
{
a="";
for(int l =0;l<k.length();l++)
{
String x=String.valueOf(k.charAt(l));
if(a.contains(x))
{
//System.out.println("if");
}
else
{
a=a+x;
//System.out.println(a);

}

}
arr2.add(a);

}
return arr2;

}
public Map<String,String> formingKeysValues(ArrayList<String> arr)
{
Map<String,String> p =new HashMap<>();
for(String i:arr)
{
p.put(String.valueOf(i.charAt(0)), String.valueOf(i.charAt(i.length()-1)));
}
return p;
}
public Map<String,Boolean> assigningTrueAndFalse(ArrayList<String> arr)
{
Map<String,Boolean> m= new HashMap();
for(String k: arr)
{
if(m.containsKey(k))
{
m.put(k, true);
}
else
{
m.put(k, false);
}
}
return m;

}




}