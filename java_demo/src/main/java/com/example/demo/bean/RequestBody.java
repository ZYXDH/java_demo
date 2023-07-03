package com.example.demo.bean;

public class RequestBody {
    private int code;
    private  String msg;
    private Object data;

    public RequestBody(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public RequestBody() {
    }
    public static RequestBody success(Object data){
        return new RequestBody(1,"SUCCESS",data);
    }
    public static RequestBody success(){
        return new RequestBody(1,"SUCCESS",null);
    }
    public static RequestBody error(String msg){
        return new RequestBody(0,msg,null);
    }

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RequestBody{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
