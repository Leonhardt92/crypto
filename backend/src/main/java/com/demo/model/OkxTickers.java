package com.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class OkxTickers {

    @JsonProperty("code")
    private String code;
    @JsonProperty("msg")
    private String msg;
    @JsonProperty("data")
    private List<DataDTO> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataDTO> getData() {
        return data;
    }

    public void setData(List<DataDTO> data) {
        this.data = data;
    }

    public static class DataDTO {
        @JsonProperty("instType")
        private String instType;
        @JsonProperty("instId")
        private String instId;
        @JsonProperty("last")
        private String last;
        @JsonProperty("lastSz")
        private String lastSz;
        @JsonProperty("askPx")
        private String askPx;
        @JsonProperty("askSz")
        private String askSz;
        @JsonProperty("bidPx")
        private String bidPx;
        @JsonProperty("bidSz")
        private String bidSz;
        @JsonProperty("open24h")
        private String open24h;
        @JsonProperty("high24h")
        private String high24h;
        @JsonProperty("low24h")
        private String low24h;
        @JsonProperty("volCcy24h")
        private String volCcy24h;
        @JsonProperty("vol24h")
        private String vol24h;
        @JsonProperty("ts")
        @JsonFormat(shape = JsonFormat.Shape.NUMBER)
        private Date ts;
        @JsonProperty("sodUtc0")
        private String sodUtc0;
        @JsonProperty("sodUtc8")
        private String sodUtc8;

        public String getInstType() {
            return instType;
        }

        public void setInstType(String instType) {
            this.instType = instType;
        }

        public String getInstId() {
            return instId;
        }

        public void setInstId(String instId) {
            this.instId = instId;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }

        public String getLastSz() {
            return lastSz;
        }

        public void setLastSz(String lastSz) {
            this.lastSz = lastSz;
        }

        public String getAskPx() {
            return askPx;
        }

        public void setAskPx(String askPx) {
            this.askPx = askPx;
        }

        public String getAskSz() {
            return askSz;
        }

        public void setAskSz(String askSz) {
            this.askSz = askSz;
        }

        public String getBidPx() {
            return bidPx;
        }

        public void setBidPx(String bidPx) {
            this.bidPx = bidPx;
        }

        public String getBidSz() {
            return bidSz;
        }

        public void setBidSz(String bidSz) {
            this.bidSz = bidSz;
        }

        public String getOpen24h() {
            return open24h;
        }

        public void setOpen24h(String open24h) {
            this.open24h = open24h;
        }

        public String getHigh24h() {
            return high24h;
        }

        public void setHigh24h(String high24h) {
            this.high24h = high24h;
        }

        public String getLow24h() {
            return low24h;
        }

        public void setLow24h(String low24h) {
            this.low24h = low24h;
        }

        public String getVolCcy24h() {
            return volCcy24h;
        }

        public void setVolCcy24h(String volCcy24h) {
            this.volCcy24h = volCcy24h;
        }

        public String getVol24h() {
            return vol24h;
        }

        public void setVol24h(String vol24h) {
            this.vol24h = vol24h;
        }

        public Date getTs() {
            return ts;
        }

        public void setTs(Date ts) {
            this.ts = ts;
        }

        public String getSodUtc0() {
            return sodUtc0;
        }

        public void setSodUtc0(String sodUtc0) {
            this.sodUtc0 = sodUtc0;
        }

        public String getSodUtc8() {
            return sodUtc8;
        }

        public void setSodUtc8(String sodUtc8) {
            this.sodUtc8 = sodUtc8;
        }
    }
}
