package ca.ualberta.jquist_subbook;

import java.util.ArrayList;

/**
 * Created by jonah on 2018-02-05.
 */

public class SubList {
    private static ArrayList<Subscription> list;

    public SubList() {
        list = new ArrayList<Subscription>();
    }

    public ArrayList<Subscription> getList(){
        return list;
    }
}
