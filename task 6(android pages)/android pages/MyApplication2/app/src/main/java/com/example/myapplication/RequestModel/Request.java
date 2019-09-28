package com.example.myapplication.RequestModel;

import com.example.myapplication.Global.Listitems;

import java.io.Serializable;

public class Request implements Serializable {
    public String getRequestno() {
        return requestno;
    }

    public void setRequestno(String requestno) {
        this.requestno = requestno;
    }

    public Listitems getStatus() {
        return status;
    }

    public void setStatus(Listitems status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    String requestno;
    Listitems status;
    String date;


}