package comparing;

import collection3.Employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("hello world");
//        List<Employee> list = new ArrayList<>();
//
//        list.add(new Employee(1,"ALI"));
//        list.add(new Employee(1,"TAHA"));
//        list.add(new Employee(1,"Junaid"));
//
//        Collections.sort(list, new EmployeeNameComparitor());
//        System.out.println(list);

        List<Card> listofCard = new ArrayList<>();
        listofCard.add(new Card("Hammad",49002345,1234 ,28/5/31));
        listofCard.add(new Card("Ali",49002345,1234 ,28/5/31));

        Collections.sort(listofCard,new CardNameComparitor());

//        System.out.println(listofCard);

        listofCard.forEach(c -> System.out.println(c));

    }
}
