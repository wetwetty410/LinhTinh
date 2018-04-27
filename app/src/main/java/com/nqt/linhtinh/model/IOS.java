package com.nqt.linhtinh.model;

/**
 * Created by USER on 4/23/2018.
 */

public class IOS {
    private String avatar;
    private String title;
    private String titlePic;

    public IOS(String avatar, String title, String titlePic) {

        this.avatar = avatar;
        this.title = title;
        this.titlePic = titlePic;
    }

    public IOS() {
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitlePic() {
        return titlePic;
    }

    public void setTitlePic(String titlePic) {
        this.titlePic = titlePic;
    }

}
