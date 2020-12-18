/**
 * Write a Function which accept HaspMap and a key-value pair, this function will check,
 * if that pair is present in the HashMap, if present return that entry else throw an
 * user defined NoEntryFoundException NoEntryFoundException, this NoEntryFoundException will print a message No Record
 * found for given pair.
 *
 * HaspMap contain Object of Employee class, and the key is empId of employee.
 *
 * Employee class contains some fields int empId, String name, double salary, String emailId.
 * You are free to inherit all the required interface and class(if any needed). You are free to override any methods from object class
 * (if any required).
 */





package HashMapPracticeQuestion;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, Employee> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 2; i++) {
            Employee employee = new Employee();
            employee.setName(sc.nextLine());
            employee.setEmailId(sc.nextLine());
            int key = sc.nextInt();
            employee.setEmpId(key);
            employee.setSalary(sc.nextDouble());
            sc.nextLine();
            map.put(key, employee);

        }
        Employee employee1 = new Employee();
        employee1.setName(sc.nextLine());
        employee1.setEmailId(sc.nextLine());
        int key = sc.nextInt();
        employee1.setEmpId(key);
        employee1.setSalary(sc.nextDouble());
        Main obj = new Main();

        try {
            obj.search(map,employee1.getEmpId(), employee1);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Map.Entry<Integer, Employee> search(HashMap<Integer, Employee> map1, Integer key, Employee value) throws NoEntryFoundException {
        Map.Entry<Integer, Employee> searchentry = Map.entry(key, value);
        System.out.println(searchentry);
        System.out.println(map1);
        for (Map.Entry<Integer, Employee> m : map1.entrySet()) {
            if (m.getKey() == searchentry.getKey()) {
                System.out.println("record found hurray!!");

                return m;
            }
        }
        throw new NoEntryFoundException("record not found");
    }
}