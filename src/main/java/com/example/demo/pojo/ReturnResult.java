package com.example.demo.pojo;

/**
 * 通用的页面结果对象
 */
public class ReturnResult {

    private Integer status;// 业务状态码，200代表成功

    private String msg;// 返回页面的消息

    private Object data;// 可能要携带的数据

    public ReturnResult() {
        super();
    }
    // 构造函数
    public ReturnResult(Integer status) {
        super();
        this.status = status;
    }

    public ReturnResult(Integer status, String msg) {
        this(status);
        this.msg = msg;
    }

    public ReturnResult(Integer status, String msg, Object data) {
        this(status, msg);
        this.data = data;
    }

    // 快捷获取200状态
    public static ReturnResult ok() {
        return new ReturnResult(200);
    }

    // 快捷获取200状态
    public static ReturnResult ok(Object data) {
        return new ReturnResult(200, null, data);
    }

    // 快捷获取ReturnResult对象
    public static ReturnResult build(Integer status, String msg) {
        return new ReturnResult(status, msg);
    }

    // 快捷获取ReturnResult对象
    public static ReturnResult build(Integer status, String msg, Object data) {
        return new ReturnResult(status, msg, data);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
