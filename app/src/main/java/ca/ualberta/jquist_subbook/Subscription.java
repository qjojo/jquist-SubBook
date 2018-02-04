package ca.ualberta.jquist_subbook;

import java.util.Date;

/**
 * Created by jonah on 2018-02-03.
 */

public class Subscription {
    private String name;
    private Date start;
    private double cost;
    private String comment;

    public Subscription() {
        name = "";
        start = new Date();
        cost = -1.0;
        comment = "";
    }

    public Subscription(String n, Date s, double c, String cm) {
        name = n;
        start = s;
        cost = c;
        comment = cm;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setStart(Date s) {
        start = s;
    }

    public Date getStart() {
        return start;
    }

    public void setCost(double c) {
        cost = c;
    }

    public double getCost() {
        return cost;
    }

    public void setComment(String c) {
        comment = c;
    }

    public String getComment() {
        return comment;
    }
}
