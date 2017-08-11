package com.villegapps.attendance.model;

/**
 * Created by john.villegas on 31/07/2017.
 */

public class UserInfo {
    public String id;
    public String firstName;
    public String lastName;
    public String email;
    public String phone;
    public String latitude;
    public String longitude;
    public String dateJoined;
    public String lastOnline;
    public String timeIn;
    public String timeOut;
    public String photoUri;
    public String others2;

    public UserInfo() {

    }

    public UserInfo(String id, String firstName, String lastName, String email, String phone, String latitude, String longitude, String dateJoined, String lastOnline, String timeIn, String timeOut, String photoUri, String others2) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.latitude = latitude;
        this.longitude = longitude;
        this.dateJoined = dateJoined;
        this.lastOnline = lastOnline;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.photoUri = photoUri;
        this.others2 = others2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(String dateJoined) {
        this.dateJoined = dateJoined;
    }

    public String getLastOnline() {
        return lastOnline;
    }

    public void setLastOnline(String lastOnline) {
        this.lastOnline = lastOnline;
    }

    public String getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    public String getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }

    public String getPhotoUri() {
        return photoUri;
    }

    public void setPhotoUri(String photoUri) {
        this.photoUri = photoUri;
    }

    public String getOthers2() {
        return others2;
    }

    public void setOthers2(String others2) {
        this.others2 = others2;
    }
}