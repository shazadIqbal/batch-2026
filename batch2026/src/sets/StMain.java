package sets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StMain {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Ahsan", Gender.MALE));
        studentList.add(new Student("Taha", Gender.MALE));
        studentList.add(new Student("Adil", Gender.MALE));
        studentList.add(new Student("Hira", Gender.FEMALE));
        studentList.add(new Student("Alima", Gender.FEMALE));

        Map<Gender, Integer> map = new HashMap<>();
        for(Student s : studentList){
            if(map.containsKey(s.getGender())){

                int val = map.get(s.getGender()) + 1;
                map.put(s.getGender(),val);

            }else
            {
                map.put(s.getGender(), 1);
            }
        }
        System.out.println(map);


    }
}
