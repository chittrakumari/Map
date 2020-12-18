//Implementaton of clone dunction

package CloneImplementation;

import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer,Student> map=new HashMap<>();
        Student s=new Student();
        s.setName("Chittra");
        s.setRollNo(7);
        Student s1=new Student();
        s1.setName("Kirti");
        s1.setRollNo(3);
        map.put(s.getRollNo(),s);
        map.put(s1.getRollNo(),s1);
        System.out.println("Original HashMap"+map);

        //We need to type cast in as clone function returns object.
        HashMap<Integer,Student> clonemap= (HashMap<Integer, Student>) map.clone();
        for(Integer m:clonemap.keySet()){
            Student s2=clonemap.get(m);
            s2.setRollNo(24);
            break;
        }

        /*We see that if we make changes in cloned map changes will get reflected in original map as well
         * because clone function creates shallow copy(different references are not created for Student
         * objects).Therefore,they point at the same reference.
         */
        System.out.println("Cloned HashMap after making changes"+clonemap);
        System.out.println("Original HashMap after making changes"+map);
    }
}
