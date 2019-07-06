package demo.web.vo;

import java.io.Serializable;
import java.util.Date;

public class UserVo implements Serializable {
    private static final long serialVersionUID = -423178660804644085L;
    /**
     * 主键
     */
    private Long id;

    /**
     * 租户 id
     */
    private Long tenantId;
    /**
     * 企业 id
     */
    private Long companyId;
    /**
     * 部门 id
     */
    private Long deptId;
    /**
     * 用户类型：0 管理员，1 普通用户
     */
    private Integer type;
    /**
     * 用户名称
     */
    private String name;
    /**
     * 用户真实姓名
     */
    private String realName;
    /**
     * 用户默认语言
     */
    private String lang;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 状态：0：未激活；1：已激活；2：禁用
     */
    private Integer status;
    /**
     * 性别 0：男，1：女，2：未知性
     */
    private Integer gender;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 电话
     */
    private String tel;
    /**
     * 备注
     */
    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
