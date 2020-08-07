package com.guoqingxian.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@TableName(value = "t_activity")
public class TActivity implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "activity_code")
    private Integer activityCode;

    @TableField(value = "activity_type")
    private Integer activityType;

    @TableField(value = "activity_name")
    private String activityName;

    @TableField(value = "start_time")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date startTime;

    @TableField(value = "end_time")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date endTime;

    @TableField(value = "create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:ss:mm",timezone = "GMT+8")
    private Date createTime;
    @TableField(exist = false)
    private String tname;

    @TableField(exist = false)
    private String sname;
    @TableField(exist = false)
    private List<Integer> type;

    public List<Integer> getType() {
        return type;
    }

    public void setType(List<Integer> type) {
        this.type = type;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_ACTIVITY_CODE = "activity_code";

    public static final String COL_ACTIVITY_TYPE = "activity_type";

    public static final String COL_ACTIVITY_NAME = "activity_name";

    public static final String COL_START_TIME = "start_time";

    public static final String COL_END_TIME = "end_time";

    public static final String COL_CREATE_TIME = "create_time";

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return activity_code
     */
    public Integer getActivityCode() {
        return activityCode;
    }

    /**
     * @param activityCode
     */
    public void setActivityCode(Integer activityCode) {
        this.activityCode = activityCode;
    }

    /**
     * @return activity_type
     */
    public Integer getActivityType() {
        return activityType;
    }

    /**
     * @param activityType
     */
    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    /**
     * @return activity_name
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * @param activityName
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    /**
     * @return start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}