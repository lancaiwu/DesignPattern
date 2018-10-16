package cn.lancaiwu.design.pattern.builder.demo.dialog;

public class OpTaskBean {
    private Integer deviceId;
    /**
     * 任务类型
     */
    private Integer taskType;
    /**
     * 任务执行总时间
     */
    private Integer taskRunTime;
    /**
     * 任务开始时间时间
     */
    private Long taskTime;
    /**
     * 任务创建时间
     */
    private Long createTime;
    /**
     * 结束时间
     */
    private Long updateTime;
    /**
     * 硬件信息 id
     */
    private Long hardInfoId;

    /**
     * 新增用户 id / wechat 账号 id
     */
    private Long newUserId;

    /**
     * 产品任务 id
     */
    private Long channelTaskId;
    /**
     * 当前 运行 次数
     */
    private Integer runCount;

    public OpTaskBean() {
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public Long getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(Long taskTime) {
        this.taskTime = taskTime;
    }

    public Integer getTaskRunTime() {
        return taskRunTime;
    }

    public void setTaskRunTime(Integer taskRunTime) {
        this.taskRunTime = taskRunTime;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Long getHardInfoId() {
        return hardInfoId;
    }

    public void setHardInfoId(Long hardInfoId) {
        this.hardInfoId = hardInfoId;
    }

    public Long getNewUserId() {
        return newUserId;
    }

    public void setNewUserId(Long newUserId) {
        this.newUserId = newUserId;
    }

    public Long getChannelTaskId() {
        return channelTaskId;
    }

    public void setChannelTaskId(Long channelTaskId) {
        this.channelTaskId = channelTaskId;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Integer getRunCount() {
        return runCount;
    }

    public void setRunCount(Integer runCount) {
        this.runCount = runCount;
    }

}
