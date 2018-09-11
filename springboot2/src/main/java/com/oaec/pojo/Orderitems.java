package com.oaec.pojo;

public class Orderitems {
    private Integer orderitemId;

    private Integer bookId;

    private Integer orderId;

    private Integer cartid;

    private Integer orderitemNum;

    private Float orderitemPrice;

    public Integer getOrderitemId() {
        return orderitemId;
    }

    public void setOrderitemId(Integer orderitemId) {
        this.orderitemId = orderitemId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public Integer getOrderitemNum() {
        return orderitemNum;
    }

    public void setOrderitemNum(Integer orderitemNum) {
        this.orderitemNum = orderitemNum;
    }

    public Float getOrderitemPrice() {
        return orderitemPrice;
    }

    public void setOrderitemPrice(Float orderitemPrice) {
        this.orderitemPrice = orderitemPrice;
    }
}