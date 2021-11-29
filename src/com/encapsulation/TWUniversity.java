package com.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class TWUniversity {
    private List<String> branches = new ArrayList<>();
    private List<String> colleges = new ArrayList<>();

    public TWUniversity (List<String> b, List<String> c) {
        this.branches.addAll(b);
        this.colleges.addAll(c);
    }

    public List<String> getColleges() {
        return colleges;
    }

    public void setColleges(List<String> colleges) {
        this.colleges = colleges;
    }

    public List<String> getBranches() {
        return branches;
    }

    public void setBranches(List<String> branches) {
        this.branches = branches;
    }

    public void printCollegeCourseDetails() {
        System.out.println("Printing College/Course details provided at ThoughtWorks University (Hyd):");
        System.out.println(this.getBranches().toString());
        System.out.println(this.getColleges().toString());
    }

    public static void main(String [] args) {
        List<String> collegesList = new ArrayList<>();
        collegesList.add("Chaitanya Bharathi Institute of Technology");
        collegesList.add("Vignana Bharathi Institue of Technologyu");
        collegesList.add("Vasavi College of Engineering");
        collegesList.add("MJ Engineering College");
        collegesList.add("Deccan College of Engineering and Technology");

        List<String> branchesList = new ArrayList<>();
        branchesList.add("EEE");
        branchesList.add("ECE");
        branchesList.add("CSE");
        branchesList.add("IT");
        branchesList.add("MECH");

        TWUniversity thoughtworks = new TWUniversity(branchesList, collegesList);
        thoughtworks.printCollegeCourseDetails();
    }
}