package com.example.mvince.instagramviewer;

/**
 * Created by mvince on 1/26/15.
 */
public class Comment {
    public String profileUrl;
    public String username;
    public String text;
    public String createdTime;

    public String getRelativeTime() {
        long ct = Long.parseLong(createdTime);
        long now = System.currentTimeMillis() / 1000;
        long elapsedSeconds = now - ct;

        if (elapsedSeconds < 60) { // less than a minute
            return String.format(elapsedSeconds == 1 ? "%.0f second ago" : "%.0f seconds ago", elapsedSeconds);
        } else if (elapsedSeconds < 3600) { // less than an hour
            return String.format(Math.floor(elapsedSeconds / 60) == 1 ? "%.0f minute ago" : "%.0f minutes ago", Math.floor(elapsedSeconds / 60));
        } else if (elapsedSeconds < 86400) { // less than a day
            return String.format(Math.floor(elapsedSeconds / 3600) == 1 ? "%.0f hour ago" : "%.0f hours ago", Math.floor(elapsedSeconds / 3600));
        } else {
            return String.format(Math.floor(elapsedSeconds / 86400) == 1 ? "%.0f day ago" : "%.0f days ago", Math.floor(elapsedSeconds / 86400));
        }
    }
}
