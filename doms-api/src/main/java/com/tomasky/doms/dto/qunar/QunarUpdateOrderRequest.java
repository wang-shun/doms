package com.tomasky.doms.dto.qunar;

import com.tomasky.doms.model.Person;

import java.util.List;

/**
 * Created by Administrator on 2016/6/15.
 */
public class QunarUpdateOrderRequest {
    //渠道id
    private String otaId;
    //房间号
    private String roomIds;
    //房间号名称
    private String roomNames;
    private String roomNos;
    //oms订单号
    private String omsOrderNo;
    //渠道订单号
    private String channelOrderNo;
    //订单状态（0:未处理、1:已接受（已分房）、2:已拒绝、3:已取消、4:验证失败、5：已接受（未分房）、6：入住、7：离店）
    private String orderStatus;
    //实际入住时间
    private String liveInDate;
    //实际离店时间
    private String leaveOutDate;
    //
    private String refuseType;
    //客栈id
    private String innId;
    //客栈名称
    private String innName;
    //入住人信息
    private List<Person> personList;

    public String getRoomNos() {
        return roomNos;
    }

    public void setRoomNos(String roomNos) {
        this.roomNos = roomNos;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public String getInnId() {
        return innId;
    }

    public void setInnId(String innId) {
        this.innId = innId;
    }

    public String getInnName() {
        return innName;
    }

    public void setInnName(String innName) {
        this.innName = innName;
    }

    public String getRefuseType() {
        return refuseType;
    }

    public void setRefuseType(String refuseType) {
        this.refuseType = refuseType;
    }

    public String getOtaId() {
        return otaId;
    }

    public void setOtaId(String otaId) {
        this.otaId = otaId;
    }

    public String getRoomIds() {
        return roomIds;
    }

    public void setRoomIds(String roomIds) {
        this.roomIds = roomIds;
    }

    public String getRoomNames() {
        return roomNames;
    }

    public void setRoomNames(String roomNames) {
        this.roomNames = roomNames;
    }

    public String getOmsOrderNo() {
        return omsOrderNo;
    }

    public void setOmsOrderNo(String omsOrderNo) {
        this.omsOrderNo = omsOrderNo;
    }

    public String getChannelOrderNo() {
        return channelOrderNo;
    }

    public void setChannelOrderNo(String channelOrderNo) {
        this.channelOrderNo = channelOrderNo;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getLiveInDate() {
        return liveInDate;
    }

    public void setLiveInDate(String liveInDate) {
        this.liveInDate = liveInDate;
    }

    public String getLeaveOutDate() {
        return leaveOutDate;
    }

    public void setLeaveOutDate(String leaveOutDate) {
        this.leaveOutDate = leaveOutDate;
    }
}
