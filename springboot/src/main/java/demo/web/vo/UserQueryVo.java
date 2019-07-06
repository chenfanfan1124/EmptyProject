package demo.web.vo;

import java.io.Serializable;

public class UserQueryVo implements Serializable {
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
    private String nameLike;

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

    public String getNameLike() {
        return nameLike;
    }

    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
    }
}
