package com.zhongyao.web.base;

/**
 * @author daisyli
 * @create 下午4:29
 **/
public class ResponseResult<T> {

    public static final int SUCCESS_CODE = 0;
    public static final int FAILED_CODE = 1;
    public static final int EXCEPTION_CODE = -1;
    public static final String SUCCESS_MSG = "请求成功";
    public static final String FAILED_MSG = "请求失败";
    public static final String EXCEPTION_MSG = "程序异常";

    private int code;

    private String msg;

    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private ResponseResult() {

    }

    public ResponseResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static ResponseResult successed(Object data) {
        ResponseResult<Object> result = new ResponseResult<>();
        result.setCode(SUCCESS_CODE);
        result.setMsg(SUCCESS_MSG);
        result.setData(data);
        return result;
    }

    public static ResponseResult failed() {
        ResponseResult<Object> result = new ResponseResult<>(FAILED_CODE, FAILED_MSG, "");
        return result;
    }

    public static ResponseResult failed(String msg) {
        ResponseResult<Object> result = new ResponseResult<>(FAILED_CODE, msg, "");
        return result;
    }

    public static ResponseResult failed(Object data) {
        ResponseResult<Object> result = new ResponseResult<>(FAILED_CODE, EXCEPTION_MSG, data);
        return result;
    }

    public static ResponseResult failed(String msg, Object data) {
        ResponseResult<Object> result = new ResponseResult<>(FAILED_CODE, msg, data);
        return result;
    }
}
