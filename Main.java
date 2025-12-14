import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main{
    public static void main(String[] args){
        List<Integer>values=new ArrayList<>();
        values.add(13);
        values.add(23);
        values.add(77);
        values.add(45);
        Collections.sort(values);

        for(int i:values){
            System.out.println(i);
        } 
    }
}