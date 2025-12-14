import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

class Main{
    public static void main(String[] args){
        Vector<Integer> v=new Vector<Integer>();
        v.add(23);
        v.add(45);
        v.add(56);
        v.add(89);
        v.add(47);
        v.add(36);
        v.add(65);
        v.add(93);
        v.add(23);
        v.add(21);
        v.add(34);
        v.add(78);
        v.add(42);
        v.add(78);
        v.add(67);

        v.remove(1);
        System.out.println("capacity of vector is:"+v.capacity());
        for(int i:v){
            System.out.println(i);
        }
    }
}