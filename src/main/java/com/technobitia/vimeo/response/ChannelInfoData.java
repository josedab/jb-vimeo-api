package com.technobitia.vimeo.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class ChannelInfoData {
    
    private String id;
    private String name;
    private String description;
    private String log;
    private String url;
    
    @JsonProperty("rss")
    private String rssFeedUrl;
    
    @JsonProperty("created_on")
    private Date creationDate;
    
    @JsonProperty("creator_id")
    private String userId;
    
    @JsonProperty("creator_display_name")
    private String userName;
    
    @JsonProperty("creator_url")
    private String userUrl;
    
    @JsonProperty("total_videos")
    private int noVideos;
    
    @JsonProperty("total_subscribers")
    private int noSubscribers;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getLog() {
        return log;
    }

    public String getUrl() {
        return url;
    }

    public String getRssFeedUrl() {
        return rssFeedUrl;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserUrl() {
        return userUrl;
    }

    public int getNoVideos() {
        return noVideos;
    }

    public int getNoSubscribers() {
        return noSubscribers;
    }

}
