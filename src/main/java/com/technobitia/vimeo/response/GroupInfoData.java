package com.technobitia.vimeo.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class GroupInfoData {

    private String id;
    private String name;
    private String description;
    private String url;
    private String logo;
    private String thumbnail;
    @JsonProperty("created_on")
    private Date creationDate;
    @JsonProperty("creator_id")
    private String userId;
    @JsonProperty("creator_display_name")
    private String userName;
    @JsonProperty("creator_url")
    private String userUrl;
    @JsonProperty("total_members")
    private int noMembers;
    @JsonProperty("total_videos")
    private int noVideos;
    @JsonProperty("total_files")
    private int noFiles;
    @JsonProperty("total_forum_topics")
    private int noForumTopics;
    @JsonProperty("total_events")
    private int noEvents;
    @JsonProperty("total_upcoming_events")
    private int noUpcomingEvents;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getLogo() {
        return logo;
    }

    public String getThumbnail() {
        return thumbnail;
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

    public int getNoMembers() {
        return noMembers;
    }

    public int getNoVideos() {
        return noVideos;
    }

    public int getNoFiles() {
        return noFiles;
    }

    public int getNoForumTopics() {
        return noForumTopics;
    }

    public int getNoEvents() {
        return noEvents;
    }

    public int getNoUpcomingEvents() {
        return noUpcomingEvents;
    }

}
