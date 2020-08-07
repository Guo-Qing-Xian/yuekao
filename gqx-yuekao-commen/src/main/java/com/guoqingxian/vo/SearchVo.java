/**
 * 作者:   郭青贤
 * 时间:   2020/8/7 9:25
 */
package com.guoqingxian.vo;

public class SearchVo {
    private String name;//活动名称
    private String startTime;//创建时间
    private String endTime;//创建时间
    private Integer type;//活动类型

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public SearchVo() {
    }

    public SearchVo(String name, String startTime, String endTime, Integer type) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.type = type;
    }

    @Override
    public String toString() {
        return "SearchVo{" +
                "name='" + name + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", type=" + type +
                '}';
    }
}
