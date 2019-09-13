package pe.edu.tecsup.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 *
 */
@Entity
@Table(name="tms_broke_promise")
public class BrokePromises implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name="broke_type")
    private String brokeType;//失信类型
    @Column(name = "broke_info")
    private String brokeInfo;//失信信息
    @Column(name = "start_time")
    private String startTime;//开始时间
    @Column(name = "end_time")
    private String endTime;//结束时间
    @Column(name = "broke_reason")
    private String brokeReason;//失信原因
    @Column(name = "remark")
    private String remark;//备注
    @Column(name = "state")
    private Integer state;//状态
    @Column(name = "create_user")
    private String createUser;//创建人
    @Column(name = "create_time")
    private Date createTime;//创建时间
    @Column(name = "update_user")
    private String updateUser;//修改人
    @Column(name = "update_time")
    private Date updateTime;//修改时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrokeType() {
        return brokeType;
    }

    public void setBrokeType(String brokeType) {
        this.brokeType = brokeType;
    }

    public String getBrokeInfo() {
        return brokeInfo;
    }

    public void setBrokeInfo(String brokeInfo) {
        this.brokeInfo = brokeInfo;
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

    public String getBrokeReason() {
        return brokeReason;
    }

    public void setBrokeReason(String brokeReason) {
        this.brokeReason = brokeReason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "BrokePromises{" +
                "id=" + id +
                ", brokeType='" + brokeType + '\'' +
                ", brokeInfo='" + brokeInfo + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", brokeReason='" + brokeReason + '\'' +
                ", remark='" + remark + '\'' +
                ", state=" + state +
                ", createUser='" + createUser + '\'' +
                ", createTime=" + createTime +
                ", updateUser='" + updateUser + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}
