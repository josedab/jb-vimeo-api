package com.technobitia.vimeo.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class AlbumInfoData {

    private String id;

    @JsonProperty("created_on")
    private Date creationDate;

    @JsonProperty("last_modified")
    private Date lastModified;

    private String title;
    private String description;
    private String url;
    private String thumbnail;

    @JsonProperty("total_videos")
    private int noVideos;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("user_display_name")
    private String userName;

    @JsonProperty("user_url")
    private String userUrl;

    public String getId() {
        return id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public int getNoVideos() {
        return noVideos;
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

}
