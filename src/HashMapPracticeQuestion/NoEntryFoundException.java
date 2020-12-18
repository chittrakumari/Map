/**
 * Write a Function which accept HaspMap and a key-value pair, this function will check,
 * if that pair is present in the HashMap, if present return that entry else throw an
 * user defined NoEntryFoundException NoEntryFoundException, this NoEntryFoundException will print a message No Record found for given pair.
 *
 * HaspMap contain Object of Employee class, and the key is empId of employee.
 *
 * Employee class contains some fields int empId, String name, double salary, String emailId. You are free to inherit
 * all the required interface and class(if any needed). You are free to override any methods from object class
 * (if any required).
 */





package HashMapPracticeQuestion;

public class NoEntryFoundException extends Exception {
    public NoEntryFoundException(String message){
        super(message);
    }
}
