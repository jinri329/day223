package com.zyy.vo;

import com.zyy.bean.TbItem;

import java.io.Serializable;
import java.util.List;

public class LayuiTableResult implements Serializable{
    private Integer code;
    private String msg;
    private Integer count;
    private List<TbItem> data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<TbItem> getData() {
        return data;
    }

    public void setData(List<TbItem> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "LayuiTableResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }
}
