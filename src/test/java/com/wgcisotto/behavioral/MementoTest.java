package com.wgcisotto.behavioral;

import com.wgcisotto.behavioral.memento.CareTaker;
import com.wgcisotto.behavioral.memento.Employee;
import org.junit.jupiter.api.Test;

public class MementoTest {

    @Test
    public void run(){
        CareTaker careTaker = new CareTaker();

        Employee emp = new Employee();

        emp.setName("William");
        emp.setPhone("111111");
        emp.setAddress("Rua Vieira");

        System.out.println("Employee before save:               " + emp);

        careTaker.save(emp);

        emp.setPhone("22222");

        careTaker.save(emp);

        System.out.println("Employee agter changed phone save:  " + emp);

        emp.setPhone("33333"); // <- we haven't called save!

        careTaker.revert(emp);

        System.out.println("Reverts to last save point:         " + emp);

        careTaker.revert(emp);

        System.out.println("Reverts to original:                " + emp);
    }

}
