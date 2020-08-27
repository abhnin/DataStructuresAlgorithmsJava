package com.abhnin.dsalgojavall.sorting;

public class MasterSort{
    private long startTime;
    private long endTime;

    public void getCompletionTime(){
        System.out.println(this.getClass().getSimpleName() + " Completed in: " + (this.endTime - this.startTime));
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
        getCompletionTime();
    }
}
