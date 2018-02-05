package ca.ualberta.jquist_subbook;

import java.util.ArrayList;

/**
 * Created by jonah on 2018-02-05.
 */

public class SubList {
    private static ArrayList<Subscription> list = new ArrayList<Subscription>();

    public SubList() {
    }

    public void addSub(Subscription s) {
        list.add(s);
    }

    public Subscription getSub(int i) {
        return list.get(i);
    }

    public void editSub(int i, Subscription s) {
        list.set(i, s);
    }

    public ArrayList<Subscription> getList(){
        return list;
    }
}
