package com.example.myrequestpages.Requstmodel;

import java.io.Serializable;

import globl.listitems;

public class request  implements Serializable {
    String requestno;
    listitems status;
    String date;

    public String getRequestno() {
        return requestno;
    }

    public void setRequestno(String requestno) {
        this.requestno = requestno;
    }

    public listitems getStatus() {
        return status;
    }

    public void setStatus(listitems status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
