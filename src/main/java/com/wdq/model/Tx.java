package com.wdq.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Tx implements Serializable {

    // 交易类型 buy 、sell、cancel
    private String txType;
    // 买单id
    private String buyOrderId;
    // 卖单id
    private String sellOrderId;
    // 卖单剩余冻结额度
    private BigDecimal sellRemainAmt;
    // 买单剩余冻结额度
    private BigDecimal buyRemainAmt;
    // 成交额
    private BigDecimal dealVolumePrice;
    // 成交价
    private BigDecimal dealPrice;
    // 成交量
    private BigDecimal dealQuantity;

    private Integer orderStatus;//订单状态 2 完全成交 1部分成交 0 新订单

    public Tx() {
    }

    public Tx(String txType, String buyOrderId, String sellOrderId, BigDecimal sellRemainAmt, BigDecimal buyRemainAmt, BigDecimal dealVolumePrice, BigDecimal dealPrice, BigDecimal dealQuantity, Integer orderStatus) {
        this.txType = txType;
        this.buyOrderId = buyOrderId;
        this.sellOrderId = sellOrderId;
        this.sellRemainAmt = sellRemainAmt;
        this.buyRemainAmt = buyRemainAmt;
        this.dealVolumePrice = dealVolumePrice;
        this.dealPrice = dealPrice;
        this.dealQuantity = dealQuantity;
        this.orderStatus = orderStatus;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getTxType() {
        return txType;
    }

    public void setTxType(String txType) {
        this.txType = txType;
    }

    public String getBuyOrderId() {
        return buyOrderId;
    }

    public void setBuyOrderId(String buyOrderId) {
        this.buyOrderId = buyOrderId;
    }

    public String getSellOrderId() {
        return sellOrderId;
    }

    public void setSellOrderId(String sellOrderId) {
        this.sellOrderId = sellOrderId;
    }

    public BigDecimal getSellRemainAmt() {
        return sellRemainAmt;
    }

    public void setSellRemainAmt(BigDecimal sellRemainAmt) {
        this.sellRemainAmt = sellRemainAmt;
    }

    public BigDecimal getBuyRemainAmt() {
        return buyRemainAmt;
    }

    public void setBuyRemainAmt(BigDecimal buyRemainAmt) {
        this.buyRemainAmt = buyRemainAmt;
    }

    public BigDecimal getDealVolumePrice() {
        return dealVolumePrice;
    }

    public void setDealVolumePrice(BigDecimal dealVolumePrice) {
        this.dealVolumePrice = dealVolumePrice;
    }

    public BigDecimal getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(BigDecimal dealPrice) {
        this.dealPrice = dealPrice;
    }

    public BigDecimal getDealQuantity() {
        return dealQuantity;
    }

    public void setDealQuantity(BigDecimal dealQuantity) {
        this.dealQuantity = dealQuantity;
    }

    @Override
    public String toString() {
        return "Tx{" +
                "txType='" + txType + '\'' +
                ", buyOrderId='" + buyOrderId + '\'' +
                ", sellOrderId='" + sellOrderId + '\'' +
                ", sellRemainAmt=" + sellRemainAmt +
                ", buyRemainAmt=" + buyRemainAmt +
                ", dealVolumePrice=" + dealVolumePrice +
                ", dealPrice=" + dealPrice +
                ", dealQuantity=" + dealQuantity +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
