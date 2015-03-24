package fr.insa.whatodo.model;

import java.util.ArrayList;

/**
 * Created by Segolene on 13/03/2015.
 */
public class CategoryFilter extends Filter {

    public enum Category {SPECTACLE, CONCERT, THEATRE, CONFERENCE, DEBAT, EXPOSITION, SOIREE, SPORT, PROJECTIONVIDEO};

    protected ArrayList<Category> categories;

    public CategoryFilter() {
        super(FilterType.CATEGORIE);
        categories=new ArrayList<Category>();
    }

    @Override
    public Object getValue() {
        return categories;
    }

    public void addCategory(Category c){
        categories.add(c);
    }

    public void removeCategory(Category c){categories.remove(c);}
}
