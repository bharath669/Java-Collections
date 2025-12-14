import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Main{
    public static void main(String[] args){
        Collection values=new ArrayList();
        values.add(13);
        values.add("Hello");
        values.add(3.5f);

        Iterator i=values.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        } 
    }
}