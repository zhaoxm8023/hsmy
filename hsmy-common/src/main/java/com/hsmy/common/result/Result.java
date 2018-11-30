package com.hdw.common.result;

import com.hdw.common.util.JacksonUtils;

import java.io.Serializable;


/**
 * @author TuMinglong
 * @description 操作结果集
 * @date 2018年1月24日 下午4:10:10
 */
public class Result implements Serializable {

    public static final int SUCCESS = 0;
    public static final int FAILURE = 1;

    private static final long serialVersionUID = 5576237395711742681L;

    private boolean success = false;

    private String msg = "";

    private Integer code;

    private Object obj = null;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Result(Integer code, boolean success, String msg) {
        super();
        this.success = success;
        this.msg = msg;
        this.code = code;
    }

    public Result(boolean success, Integer code, Object obj) {
        super();
        this.success = success;
        this.code = code;
        this.obj = obj;
    }

    public Result(boolean success, String msg, Integer code, Object obj) {
        super();
        this.success = success;
        this.msg = msg;
        this.code = code;
        this.obj = obj;
    }

    public Result() {
        super();
    }

    @Override
    public String toString() {
        return JacksonUtils.toJson(this);
    }
}
