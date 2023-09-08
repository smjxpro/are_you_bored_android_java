package com.example.areyoubored;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class BoringResponse implements Serializable {
    private String activity;
    private String type;
    private Long participants;
    private Double price;
    private String link;
    private String key;
    private Double accessibility;

    @SerializedName("activity")
    public String getActivity() { return activity; }
    @SerializedName("activity")
    public void setActivity(String value) { this.activity = value; }

    @SerializedName("type")
    public String getType() { return type; }
    @SerializedName("type")
    public void setType(String value) { this.type = value; }

    @SerializedName("participants")
    public Long getParticipants() { return participants; }
    @SerializedName("participants")
    public void setParticipants(Long value) { this.participants = value; }

    @SerializedName("price")
    public Double getPrice() { return price; }
    @SerializedName("price")
    public void setPrice(Double value) { this.price = value; }

    @SerializedName("link")
    public String getLink() { return link; }
    @SerializedName("link")
    public void setLink(String value) { this.link = value; }

    @SerializedName("key")
    public String getKey() { return key; }
    @SerializedName("key")
    public void setKey(String value) { this.key = value; }

    @SerializedName("accessibility")
    public Double getAccessibility() { return accessibility; }
    @SerializedName("accessibility")
    public void setAccessibility(Double value) { this.accessibility = value; }
}