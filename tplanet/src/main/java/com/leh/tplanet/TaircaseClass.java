package com.leh.tplanet;

public class TaircaseClass {
    private int laderNumberInput, height =0;
    public String lader ="";
    public int getLaderNumberInput() {
        return laderNumberInput;
    }

    public void setLaderNumberInput(int laderNumberInput) {
        this.laderNumberInput = laderNumberInput;
    }

    @Override
    public String toString() {
        if (laderNumberInput<1 || laderNumberInput>100)
            return "invalid input";
        height++;
        for (int i =1; i<=height; i++){
            lader += "#";
        }

        if (height < laderNumberInput) {
            lader += "\n";
            toString();
        }
        height= 0;
        return lader;
    }
}
