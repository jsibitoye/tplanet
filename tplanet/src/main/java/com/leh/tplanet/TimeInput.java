package com.leh.tplanet;

public class TimeInput {
    private int hour;
    private int minute;

    public int getHour() {
        return hour;
    }


    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {


        this.minute = minute;
    }

    @Override
    public String toString() {
        if(hour>12)
            return "invalid input";

        if(minute==00)
            return numberConvert(hour)+ " o'clock";

        else if (minute== 30)
            return " half past " + numberConvert(hour);

        else if (minute== 15)
            return " quarter past " + numberConvert(hour);

        else if (minute== 45) {
            if (hour == 12)
                return " quarter to " + numberConvert(1);
            return " quarter to " + numberConvert(hour + 1);
        }

        else if (minute<= 30)
            return numberConvert(minute)+" minutes past " + numberConvert(hour);

        else if (minute> 30 && minute<60) {
            if (hour == 12)
                return numberConvert(60 - minute) + " minutes to "  + numberConvert(1);
            return numberConvert(60 - minute) + " minutes to " + numberConvert(hour + 1);
        }

        return "Invalid Inpute";
    }

    //*******************


        public String numberConvert(int num) {

//string type array for one-digit numbers
            String[] numberInWord = new String[]{"", "One", "Two", "Three", "Four", "Five",
                    "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
                    "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty"};

            if(num>20)
                return "Twenty "+ numberInWord[num-20];
            else
            return numberInWord[num];
        }
}
