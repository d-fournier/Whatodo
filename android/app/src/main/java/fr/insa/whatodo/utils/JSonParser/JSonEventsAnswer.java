package fr.insa.whatodo.utils.JSonParser;

import java.util.ArrayList;

import fr.insa.whatodo.model.Event;

/**
 * Created by William on 29/03/2015.
 */
public class JSonEventsAnswer {

    protected int count;
    protected String next;
    protected String previous;
    protected ArrayList<Event> results;

    public int getCount() {
        return count;
    }

    public ArrayList<Event> getResults() {
        return results;
    }
}
