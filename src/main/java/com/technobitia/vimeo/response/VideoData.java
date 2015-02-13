package com.technobitia.vimeo.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class VideoData {

    private String title;
    private String url;
    private String id;
    private String description;
    
    @JsonProperty("thumbnail_small")
    private String thumbnailSmall;
    
    @JsonProperty("thumbnail_medium")
    private String thumbnailMedium;
    
    @JsonProperty("thumbnail_large")
    private String thumbnailLarge;
    
    @JsonProperty("user_name")
    private String userName;
    
    @JsonProperty("user_url")
    private String userUrl;
    
    @JsonProperty("upload_date")
    private Date uploadDate;
    
    @JsonProperty("user_portrait_small")
    private String userPortraitSmall;
    
    @JsonProperty("user_portrait_medium")
    private String userPortraitMedium;
    
    @JsonProperty("user_portrait_large")
    private String userPortraitLarge;
    
    @JsonProperty("stats_number_of_likes")
    private int likes;
    
    @JsonProperty("stats_number_of_views")
    private int views;
    
    @JsonProperty("stats_number_of_comments")
    private int comments;
    
    @JsonProperty("duration")
    private int durationInSeconds;
    
    private int width;
    private int height;
    private String tags;

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getThumbnailSmall() {
        return thumbnailSmall;
    }

    public String getThumbnailMedium() {
        return thumbnailMedium;
    }

    public String getThumbnailLarge() {
        return thumbnailLarge;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserUrl() {
        return userUrl;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public String getUserPortraitSmall() {
        return userPortraitSmall;
    }

    public String getUserPortraitMedium() {
        return userPortraitMedium;
    }

    public String getUserPortraitLarge() {
        return userPortraitLarge;
    }

    public int getLikes() {
        return likes;
    }

    public int getViews() {
        return views;
    }

    public int getComments() {
        return comments;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getTags() {
        return tags;
    }
}
