package com.workintech.developers;

public class MidDeveloper extends Employee{

    public MidDeveloper(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("This is a mid developer");
    }
}
