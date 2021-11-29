package com.oops.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public List<String> availableDenominations = new ArrayList<>();

    public Bank() {
        availableDenominations.add("Five");
        availableDenominations.add("Ten");
        availableDenominations.add("Fifty");
        availableDenominations.add("Hundred");
    }

    public void printAvailableDenominations() {
        System.out.println(availableDenominations.toString());
    }
}