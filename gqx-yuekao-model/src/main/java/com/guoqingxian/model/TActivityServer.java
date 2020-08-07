package com.guoqingxian.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

@TableName(value = "t_activity_server")
public class TActivityServer implements Serializable {
    @TableField(value = "activity_id")
    private Integer activityId;

    @TableField(value = "server_id")
    private Integer serverId;

    private static final long serialVersionUID = 1L;

    public static final String COL_ACTIVITY_ID = "activity_id";

    public static final String COL_SERVER_ID = "server_id";

    /**
     * @return activity_id
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * @param activityId
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * @return server_id
     */
    public Integer getServerId() {
        return serverId;
    }

    /**
     * @param serverId
     */
    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    public TActivityServer() {
    }

    public TActivityServer(Integer activityId, Integer serverId) {
        this.activityId = activityId;
        this.serverId = serverId;
    }

    @Override
    public String toString() {
        return "TActivityServer{" +
                "activityId=" + activityId +
                ", serverId=" + serverId +
                '}';
    }
}