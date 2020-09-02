package com.azhar.azhar_siddiq.Model;

import com.google.gson.annotations.SerializedName;

public class ResponseKutipan {
    @SerializedName("sr")
    private String sr;
    @SerializedName("en")
    private String en;
    @SerializedName("author")
    private String author;
    @SerializedName("source")
    private Object source;
    @SerializedName("numberOfVotes")
    private Integer numberOfVotes;
    @SerializedName("rating")
    private Double rating;
    @SerializedName("addedBy")
    private String addedBy;
    @SerializedName("id")
    private String id;

    public String getSr() {
        return sr;
    }

    public void setSr(String sr) {
        this.sr = sr;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Integer getNumberOfVotes() {
        return numberOfVotes;
    }

    public void setNumberOfVotes(Integer numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
