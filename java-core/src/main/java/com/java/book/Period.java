package com.java.book;

import java.util.Date;

/**
 * Created by Quang on 01/30/2017.
 */
public final class Period {

    private final Date start;
    private final Date end;

    /**
     *
     * @param start the beginning of the period
     * @param end the end of the period
     * @throws IllegalArgumentException if start is after end
     * @throws NullPointerException if start or end is null
     */
    public Period(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        if(this.start.compareTo(this.end) > 0) {
            throw new IllegalArgumentException(start + " after " + end);
        }

    }

    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        p.getEnd().setYear(78);

        System.out.println(p.getEnd());
    }

    public Date getStart() {
        return new Date(start.getTime());
    }

    public Date getEnd() {
        return new Date(end.getTime());
    }
}
