package com.tts;

public class Holiday {
    private String name;
    private int month;
    private int day;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Holiday(){
    }

    public Holiday(String name, int month, int day){
        this.setName(name);
        this.setMonth(month);
        this.setDay(day);
    }

    public Holiday(String name, int month){
        this.setName(name);
        this.setMonth(month);
        this.setDay(0);

    }
    public boolean isHoliday(int month, int day){
        if (this.month == month && this.day == day) {
            return true;
        } else {
            return false;
        }
    }
    public String holidayInfo(){
        return this.name + " is on " + this.month + "-" + this.day + ".";
    }
}
