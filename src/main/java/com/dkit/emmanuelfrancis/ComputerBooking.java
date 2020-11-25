package com.dkit.emmanuelfrancis;

public class ComputerBooking {
    public String bookingId;
    public String dateTime;
    public String returnDateTime;
    public String computerType;
    public String compAssetTag;
    public String studentId;

    public ComputerBooking(String bookingId, String dateTime, String returnDateTime, String computerType, String compAssetTag, String studentId) {
        this.bookingId = bookingId;
        this.dateTime = dateTime;
        this.returnDateTime = returnDateTime;
        this.computerType = computerType;
        this.compAssetTag = compAssetTag;
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

    public String getComputerType() {
        return computerType;
    }

    public String getCompAssetTag() {
        return compAssetTag;
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

    public void setComputerType(String computerType) {
        this.computerType = computerType;
    }

    public void setCompAssetTag(String compAssetTag) {
        this.compAssetTag = compAssetTag;
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
                ", computerType='" + computerType + '\'' +
                ", compAssetTag='" + compAssetTag + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}
