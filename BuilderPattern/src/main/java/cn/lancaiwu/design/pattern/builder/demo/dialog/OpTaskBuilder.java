package cn.lancaiwu.design.pattern.builder.demo.dialog;

import java.util.Map;
import java.util.Objects;

public class OpTaskBuilder {
    private Integer mDeviceId;

    private Integer mTaskType;

    private Integer mTaskLevel;

    private Map<String, Object> mDataMap;

    private Long mHardInfoId;

    private Long mNewUserId;

    private Long mChannelTaskId;

    private Integer mTaskRunTime;

    public OpTaskBuilder addTaskRunTime(Integer taskRunTime) {
        this.mTaskRunTime = taskRunTime;
        return this;
    }


    public OpTaskBuilder addChannelTaskId(Long channelTaskId) {
        this.mChannelTaskId = channelTaskId;
        return this;
    }

    public OpTaskBuilder addNewUserId(Long newUserId) {
        this.mNewUserId = newUserId;
        return this;
    }


    public OpTaskBuilder addHardInfoId(Long hardInfoId) {
        this.mHardInfoId = hardInfoId;
        return this;
    }

    public OpTaskBuilder addDeviceId(Integer deviceId) {
        this.mDeviceId = deviceId;
        return this;
    }

    public OpTaskBuilder addTaskType(Integer taskType) {
        this.mTaskType = taskType;
        return this;
    }

    public OpTaskBuilder addTaskLevel(Integer taskLevel) {
        this.mTaskLevel = taskLevel;
        return this;
    }

    public OpTaskBuilder addData(Map<String, Object> dataMap) {
        this.mDataMap = dataMap;
        return this;
    }

    /**
     * 创建一个 操作
     *
     * @return
     */
    public OpTaskBean build() {

        Objects.requireNonNull(mDeviceId);

        Objects.requireNonNull(mTaskType);

        OpTaskBean opTaskBean = createOpTask();

        opTaskBean.setTaskType(mTaskType);
        opTaskBean.setDeviceId(mDeviceId);

        opTaskBean.setNewUserId(mNewUserId);
        opTaskBean.setChannelTaskId(mChannelTaskId);
        opTaskBean.setTaskRunTime(mTaskRunTime);
        opTaskBean.setHardInfoId(mHardInfoId);

        return opTaskBean;
    }

    /**
     * 公共属性值
     *
     * @return
     */
    private OpTaskBean createOpTask() {
        OpTaskBean opTaskBean = new OpTaskBean();
        opTaskBean.setTaskTime(System.currentTimeMillis());
        opTaskBean.setCreateTime(System.currentTimeMillis());
        opTaskBean.setUpdateTime(System.currentTimeMillis());
        opTaskBean.setRunCount(0);
        return opTaskBean;
    }
}
