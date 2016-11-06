package ge.geolab.dreaming.dreamsscanner.model;

import java.util.ArrayList;

/**
 * Created by Jay on 11/7/2016.
 */

public class DreamModel {
    private String title, description, date;
    private int iconId;
    private ArrayList<String> tags;
    private double latitude, longitude;

    public DreamModel(String title, String description, String date, int iconId) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.iconId = iconId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "DreamModel{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", iconId=" + iconId +
                ", tags=" + tags +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
