package com.workintech.developers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("This is a senior developer.");
    }
}
