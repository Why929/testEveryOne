import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class testOne {
    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add("1");
//        list.add("2");
//        list.add(1,"3");
//        List list2 = new LinkedList(list);
//        list.addAll(list2);
//        list2 = list.subList(1,5);
//        list2.clear();
//        System.out.println(list);
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add(1, "3"); //1,3,2
        List list2 = new LinkedList(list);
        list.addAll(list2); //list : 1,3,2,1,3,2
        list2 = list.subList(2, 5);
        list2.clear();//走完这一步后，list变成了1,3,2
        System.out.println(list);//1,3,2
    }
}
