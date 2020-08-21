package zhouhe;

import com.example.demo1.Person;
import org.assertj.core.util.Lists;

import java.util.ArrayList;
import java.util.List;

public class Person2 extends Person{

    public static void main(String[] args) {
        List<List<String>> siftedTableNameList  =new ArrayList<List<String>>();
        ArrayList<String> list1 = Lists.newArrayList("t_order13");
        ArrayList<String> list2 = Lists.newArrayList("t_order14","t_order15");
        siftedTableNameList.add(list1);
        siftedTableNameList.add(list2);
        List<String> siftedTableNames = new ArrayList<>();
        siftedTableNames = siftedTableNameList.parallelStream().filter(elementList -> elementList != null && elementList.size() != 0).reduce((a, b) -> {
            a.retainAll(b);
            return a;
        }).orElse(new ArrayList<>());

       /* list1.retainAll(list2);
        System.out.println(list1);
        System.out.println(list2);*/
    }
}
