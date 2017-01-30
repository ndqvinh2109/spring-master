package com.java.book;

import java.util.Date;

public class PeriodBuilder {
    private Date start;
    private Date end;

    public PeriodBuilder setStart(Date start) {
        this.start = start;
        return this;
    }

    public PeriodBuilder setEnd(Date end) {
        this.end = end;
        return this;
    }

    public Period createPeriod() {
        return new Period(start, end);
    }
}