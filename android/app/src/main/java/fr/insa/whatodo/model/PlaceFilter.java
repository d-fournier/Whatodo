package fr.insa.whatodo.model;

/**
 * Created by Segolene on 13/03/2015.
 */
public class PlaceFilter  extends Filter {

    protected String place;
    protected boolean sendMyPosition;
    protected double latitude;
    protected double longitude;

    public PlaceFilter() {
        super(FilterType.LIEU);
        place="";
        sendMyPosition=false;
        longitude = 0;
        latitude = 0;
    }

    public boolean isSendMyPosition() {
        return sendMyPosition;
    }

    public String getTown() {
        return place;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setTown(String town){

        place=town;
        longitude=0;
        latitude=0;
    }

    public void setLocation(double longitude, double latitude){
        this.longitude=longitude;
        this.latitude=latitude;
        place="";
    }
}