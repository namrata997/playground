package Requestmodel;

import java.io.Serializable;

import global.listitem;

public class request implements Serializable {
    public String getRequestno() {
        return requestno;
    }

    public void setRequestno(String requestno) {
        this.requestno = requestno;
    }

    public listitem getStatus() {
        return status;
    }

    public void setStatus(listitem status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    String requestno;
    listitem status;
    String date;

    public String setRequestno() {
        return null;
    }
}
