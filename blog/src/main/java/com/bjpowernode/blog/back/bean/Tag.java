package com.bjpowernode.blog.back.bean;

import lombok.Data;
import lombok.ToString;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Company :  北京动力节点
 * Author :   Andy
 * Date : 2021/1/13
 * Description :
 */
@Data
@ToString
@Table(name = "t_tag")
@NameStyle(Style.normal)
public class Tag {

    @Id
    private String tid;
    private String tname;
    private String cid;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
}
