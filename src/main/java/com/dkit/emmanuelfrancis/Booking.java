package com.dkit.emmanuelfrancis;

public class Booking {
    public String bookingId;
    public String dateTime;
    public String returnDateTime;
    public String type;
    public String assetTag;
    public String studentId;

    public Booking(String bookingId, String dateTime, String returnDateTime, String type, String assetTag, String studentId) {
        this.bookingId = bookingId;
        this.dateTime = dateTime;
        this.returnDateTime = returnDateTime;
        this.type = type;
        this.assetTag = assetTag;
        this.studentId = studentId;
    }

    //Getters
    public String getBookingId() {
        return bookingId;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getReturnDateTime() {
        return returnDateTime;
    }

    public String gettype() {
        return type;
    }

    public String getassetTag() {
        return assetTag;
    }

    public String getStudentId() {
        return studentId;
    }

    //Setters

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public void setReturnDateTime(String returnDateTime) {
        this.returnDateTime = returnDateTime;
    }

    public void settype(String type) {
        this.type = type;
    }

    public void setassetTag(String assetTag) {
        this.assetTag = assetTag;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    //toString

    @Override
    public String toString() {
        return "ComputerBooking{" +
                "bookingId='" + bookingId + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", returnDateTime='" + returnDateTime + '\'' +
                ", type='" + type + '\'' +
                ", assetTag='" + assetTag + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}
