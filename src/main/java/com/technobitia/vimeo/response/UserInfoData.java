package com.technobitia.vimeo.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class UserInfoData {
    private String id;
    
    @JsonProperty("display_name")
    private String displayName;
    
    @JsonProperty("created_on")
    private Date signedUpDate;
    
    @JsonProperty("is_staff")
    private boolean isStaffMember;
    
    @JsonProperty("is_plus")
    private boolean isPlusMember;
    
    private String location;
    private String url;
    private String bio;
    
    @JsonProperty("profile_url")
    private String profileUrl;
    
    @JsonProperty("videos_url")
    private String videosUrl;
    
    @JsonProperty("total_videos_uploaded")
    private int noVideosUploaded;
    
    @JsonProperty("total_videos_appears_in")
    private int noVideosUserAppearsIn;
    
    @JsonProperty("total_videos_liked")
    private int noVideosLiked;
    
    @JsonProperty("total_contacts")
    private int noContacts;
    
    @JsonProperty("total_albums")
    private int noAlbums;
    
    @JsonProperty("total_channels")
    private int noChannels;
    
    @JsonProperty("portrait_small")
    private String smallPortrait;
    
    @JsonProperty("portrait_medium")
    private String mediumPortrait;
    
    @JsonProperty("portrait_large")
    private String largePortrait;

    public String getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Date getSignedUpDate() {
        return signedUpDate;
    }

    public boolean isStaffMember() {
        return isStaffMember;
    }

    public boolean isPlusMember() {
        return isPlusMember;
    }

    public String getLocation() {
        return location;
    }

    public String getUrl() {
        return url;
    }

    public String getBio() {
        return bio;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public String getVideosUrl() {
        return videosUrl;
    }

    public int getNoVideosUploaded() {
        return noVideosUploaded;
    }

    public int getNoVideosUserAppearsIn() {
        return noVideosUserAppearsIn;
    }

    public int getNoVideosLiked() {
        return noVideosLiked;
    }

    public int getNoContacts() {
        return noContacts;
    }

    public int getNoAlbums() {
        return noAlbums;
    }

    public int getNoChannels() {
        return noChannels;
    }

    public String getSmallPortrait() {
        return smallPortrait;
    }

    public String getMediumPortrait() {
        return mediumPortrait;
    }

    public String getLargePortrait() {
        return largePortrait;
    }

}
