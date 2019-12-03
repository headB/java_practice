import java.util.ArrayList;
import java.util.List;

public class Test{

    public static void main(String[] args) {
        System.out.println("six");

        List<String> list= new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("six");
        list.add("seven");
        list.add("eight");

        for(int i=0;i<list.size();i++){
            
            System.out.println(list.get(i));
            if (list.get(i).equals("two")){
                list.remove(i);
            }
            if (list.get(i).equals("eight")){
                list.remove(i);
            }
            

        }

        System.out.println(list);

    }

}