package com.bjpowernode.blog.base.bean;

import lombok.Data;

/**
 * Company :  北京动力节点
 * Author :   Andy
 * Date : 2021/7/19
 * Description : 给客户端返回消息的Bean对象，返回数据
 */
@Data
public class ResultVo<T> {
    private String mess;//给客户端的消息
    private boolean isOk;//用户操作是否成功
    private T t;//返回对象数据

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public boolean isOk() {
        return isOk;
    }

    public void setOk(boolean ok) {
        isOk = ok;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
