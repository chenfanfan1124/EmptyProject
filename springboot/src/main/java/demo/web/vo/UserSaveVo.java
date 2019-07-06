package demo.web.vo;



import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

public class UserSaveVo implements Serializable {
    private static final long serialVersionUID = -2601535954622674618L;

    /**
     * 租户 id
     */
    @NotNull
    private Long tenantId;
    /**
     * 企业 id
     */
    @NotNull
    private Long companyId;
    /**
     * 部门 id
     */
    private Long deptId;
    /**
     * 用户类型：0 管理员，1 普通用户
     */
    @NotNull
    private Integer type;
    /**
     * 用户名称
     */
    @NotBlank
    private String name;
    /**
     * 用户真实姓名
     */
    @NotBlank
    private String realName;
    /**
     * 用户默认语言
     */
    @NotBlank
    private String lang;
    /**
     * 邮箱
     */
    @NotBlank
    private String email;
    /**
     * 密码
     */
    @NotBlank
    private String password;
    /**
     * 性别 0：男，1：女，2：未知性
     */
    @NotNull
    private Integer gender;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 电话
     */
    @NotBlank
    private String tel;
    /**
     * 备注
     */
    private String remark;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
