package com.wdq.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 交易订单
 */
public class Order implements Serializable {
    private String uuid;//订单id
    private BigDecimal price;//订单价格
    private BigDecimal amount;//订单数量
    private String tradeType; //交易类型 buy 、sell、cancel
    private Long orderTime;//订单时间
    private Integer orderStatus;//订单状态 2 完全成交 1部分成交 0 新订单
    private String assetCode; //币种类型

    public Order() {
    }

    public Order(String uuid, BigDecimal price, BigDecimal amount, String tradeType, Long orderTime, Integer orderStatus, String assetCode) {
        this.uuid = uuid;
        this.price = price;
        this.amount = amount;
        this.tradeType = tradeType;
        this.orderTime = orderTime;
        this.orderStatus = orderStatus;
        this.assetCode = assetCode;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public Long getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Long orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    @Override
    public String toString() {
        return "Order{" +
                "uuid='" + uuid + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", tradeType='" + tradeType + '\'' +
                ", orderTime=" + orderTime +
                ", orderStatus=" + orderStatus +
                ", assetCode='" + assetCode + '\'' +
                '}';
    }
}
