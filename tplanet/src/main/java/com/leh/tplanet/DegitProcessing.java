package com.leh.tplanet;

public class DuplicateRemover {
    private String inputString;
    private String [] inputArray;

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public String getUnique() {
       // inputArray = inputString.split("");
        return "duplicateRemover{" +
                "inputString='" + inputString + '\'' +
                '}';
    }
}
