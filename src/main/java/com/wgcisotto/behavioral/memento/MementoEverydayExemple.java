package com.wgcisotto.behavioral.memento;

import java.io.*;

public class MementoEverydayExemple {

    public static final String TEMP_EMPLOYEE_SER = "/temp/employee.ser";

    public static void serialize(Employee emp){
        try(FileOutputStream fileOutputStream = new FileOutputStream(TEMP_EMPLOYEE_SER);
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream)){

            out.writeObject(emp);

        }catch (IOException io){
            io.printStackTrace();
        }
    }

    private static Employee deserialize() {
        try(FileInputStream fileInputStream = new FileInputStream(TEMP_EMPLOYEE_SER);
                ObjectInputStream input = new ObjectInputStream(fileInputStream)){

            return (Employee) input.readObject();
        }catch (IOException io){
            io.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Bryan Hansen");
        emp.setAddress("Rua Vieira Pinto 573");
        emp.setPhone("911 514 666");

        serialize(emp);

        Employee newEmp = deserialize();

        System.out.println(newEmp.getName());
    }

}
