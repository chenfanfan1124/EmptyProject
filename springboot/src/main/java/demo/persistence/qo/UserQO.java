package demo.persistence.qo;

import com.skm.common.bean.dto.Operable;
import com.skm.common.bean.dto.OperatorFilter;
import com.skm.common.bean.dto.SortParam;
import com.skm.common.bean.dto.Sortable;
import com.skm.common.user.domain.UserBean;

import java.util.List;

public class UserQO extends UserBean implements Sortable, Operable {
    private static final long serialVersionUID = -1L;

    private String loginUsernameLike;
    private String loginPasswordLike;
    private String openidLike;
    private String nameLike;
    private String phoneLike;


    private String entryNameLike;
    private String updateNameLike;
    private List<Long> ids;
    private SortParam sortParam = new SortParam();
    private List<OperatorFilter> operatorFilters;
    private List<List<OperatorFilter>> orOperatorFilters;



    public void setIds(List<Long> ids) {
      this.ids = ids;
    }

    public List<Long> getIds() {
      return this.ids;
    }

    public void setLoginUsernameLike(String loginUsernameLike) {
        this.loginUsernameLike = loginUsernameLike;
    }

    public String getLoginUsernameLike() {
        return this.loginUsernameLike;
    }

    public void setLoginPasswordLike(String loginPasswordLike) {
        this.loginPasswordLike = loginPasswordLike;
    }

    public String getLoginPasswordLike() {
        return this.loginPasswordLike;
    }

    public void setOpenidLike(String openidLike) {
        this.openidLike = openidLike;
    }

    public String getOpenidLike() {
        return this.openidLike;
    }

    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
    }

    public String getNameLike() {
        return this.nameLike;
    }

    public void setPhoneLike(String phoneLike) {
        this.phoneLike = phoneLike;
    }

    public String getPhoneLike() {
        return this.phoneLike;
    }

    public void setEntryNameLike(String entryNameLike) {
        this.entryNameLike = entryNameLike;
    }

    public String getEntryNameLike() {
        return this.entryNameLike;
    }

    public void setUpdateNameLike(String updateNameLike) {
        this.updateNameLike = updateNameLike;
    }

    public String getUpdateNameLike() {
        return this.updateNameLike;
    }

    @Override
    public SortParam getSortParam() {
        return this.sortParam;
    }
    @Override
    public List<OperatorFilter> getOperatorFilters() {
      return operatorFilters;
    }
    @Override
    public void setOperatorFilters(List<OperatorFilter> operatorFilters) {
      this.operatorFilters = operatorFilters;
    }

    @Override
    public List<List<OperatorFilter>> getOrOperatorFilters() {
        return orOperatorFilters;
    }
    @Override
    public void setOrOperatorFilters(List<List<OperatorFilter>> operatorFilters) {
        this.orOperatorFilters = operatorFilters;
    }
}
