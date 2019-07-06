package demo.domain;

import com.skm.common.bean.BaseBean;

import java.io.Serializable;

/**
  *  <p>用户
  *
  *  <p>作者: tractor
  */
public class UserBean extends BaseBean implements Serializable{
	private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 登录名称
     */
    private String loginUsername;
    /**
     * 登录密码
     */
    private String loginPassword;
    /**
     * 微信openid
     */
    private String openid;
    /**
     * 用户真实姓名
     */
    private String name;
    /**
     * 联系方式
     */
    private String phone;
    /**
     * 用户类型(1.管理员，2.项目经理，3.项目成员）
     */
    private Integer userType;
    /**
     * 用户状态（1.启用，0.未启用）
     */
    private Integer status;

    /**
     * Set {@link #id}
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets {@link #id}
     *
     * @return value of id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Set {@link #loginUsername}
     */
    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
    }

    /**
     * Gets {@link #loginUsername}
     *
     * @return value of loginUsername
     */
    public String getLoginUsername() {
        return this.loginUsername;
    }

    /**
     * Set {@link #loginPassword}
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    /**
     * Gets {@link #loginPassword}
     *
     * @return value of loginPassword
     */
    public String getLoginPassword() {
        return this.loginPassword;
    }

    /**
     * Set {@link #openid}
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * Gets {@link #openid}
     *
     * @return value of openid
     */
    public String getOpenid() {
        return this.openid;
    }

    /**
     * Set {@link #name}
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets {@link #name}
     *
     * @return value of name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set {@link #phone}
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets {@link #phone}
     *
     * @return value of phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Set {@link #userType}
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * Gets {@link #userType}
     *
     * @return value of userType
     */
    public Integer getUserType() {
        return this.userType;
    }

    /**
     * Set {@link #status}
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Gets {@link #status}
     *
     * @return value of status
     */
    public Integer getStatus() {
        return this.status;
    }

    public void fillDefaults() {
        if(this.loginUsername == null) {
            this.loginUsername = "";
        }
        if(this.loginPassword == null) {
            this.loginPassword = "";
        }
        if(this.name == null) {
            this.name = "";
        }
        if(this.phone == null) {
            this.phone = "";
        }
    }
}
