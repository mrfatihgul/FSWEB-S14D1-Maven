package com.workintech.developers;

public class HRManager extends Employee{

    String[] juniorDevelopers = new String[10];
    String[] midDevelopers = new String[10];
    String[] seniorDevelopers = new String[10];

    public HRManager(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("This is an hr manager.");
    }

    public void addEmployee(int index, String name, String type){
        switch (type) {
            case "junior":
                if (index>=juniorDevelopers.length) {
                    System.out.println("Index is out of range.");
                    return;
                }
                if (juniorDevelopers[index]==null) {
                    juniorDevelopers[index] = name;
                } else {
                    System.out.println("Index is full");
                }
                break;
            case "mid":
                if (index>=midDevelopers.length) {
                    System.out.println("Index is out of range.");
                    return;
                }
                if (midDevelopers[index]==null) {
                    midDevelopers[index] = name;
                } else {
                    System.out.println("Index is full");
                }
                break;
            case "senior":
                if (index>=seniorDevelopers.length) {
                    System.out.println("Index is out of range.");
                    return;
                }
                if (seniorDevelopers[index]==null) {
                    seniorDevelopers[index] = name;
                } else {
                    System.out.println("Index is full");
                }
                break;
        }
    }

    public void addEmployee(String name, String type) {
        switch (type) {
            case "junior":
                for (int index=0; index<juniorDevelopers.length; index++) {
                    if (juniorDevelopers[index]==null) {
                        juniorDevelopers[index] = name;
                        return;
                    }
                }
                System.out.println("There is no available index.");
                break;
            case "mid":
                for (int index=0; index<midDevelopers.length; index++) {
                    if (midDevelopers[index]==null) {
                        midDevelopers[index] = name;
                        return;
                    }
                }
                System.out.println("There is no available index.");
                break;
            case "senior":
                for (int index=0; index<seniorDevelopers.length; index++) {
                    if (seniorDevelopers[index]==null) {
                        seniorDevelopers[index] = name;
                        return;
                    }
                }
                System.out.println("There is no available index.");
                break;
        }
    }

    public void addEmployee(int index, String name) {
        addEmployee(index, name, "junior");

    }

    public void addEmployee(String type) {
        addEmployee("Unknown person", type);
    }
}
