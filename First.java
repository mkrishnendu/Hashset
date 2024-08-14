package HashSet;
import java.util.HashSet;
import java.util.*;
public class First {
    public static void main(String[] args) {
//        store only unique element
//        insert add->0(1)   //instade of array 0(1)
        //serch/ contains-0(1)   //array0(n)
        //delete remove -> 0(1)  //0(n)
HashSet<Integer> set=new HashSet<>();
//insert
set.add(1);//add element
set.add(2);
set.add(3);
set.add(4);
        System.out.println(set);
        //searching use in conatins
        if(set.contains(1)){
            System.out.println("set contains 1");
        }

        if(!set.contains(0)){
            System.out.println("set not conatins 1");
        }

        set.remove(1);
        if(!set.contains(1)){
            System.out.println("set not conatins 1");
        }
        System.out.println(set.size());
      //
        System.out.println(set);//all set element are print
        //Iterator
Iterator it=set.iterator();
while(it.hasNext()){
    System.out.println(it.next());
}



    }
}
