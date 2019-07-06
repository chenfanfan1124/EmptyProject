package demo.service;

import com.skm.common.bean.dto.Page;
import com.skm.common.bean.dto.UnifyUser;
import com.skm.common.user.domain.UserBean;
import demo.persistence.qo.UserQO;


import java.util.Collection;

public interface UserService {

    /**
     * 分页获取
     *
     * @param qo 查询参数
     * @param ps 页大小
     * @param pn 页码
     * @param optUser 操作用户
     * @return
     */
    Page<UserBean> list(UserQO qo, int ps, int pn, UnifyUser optUser);

    /**
     * 新增
     *
     * @param bean
     * @return
     */
    UserBean save(UserBean bean, UnifyUser optUser);

    /**
     * 新增（默认值填充非空字段）
     *
     * @param bean
     * @return
     */
    UserBean saveWithDefaults(UserBean bean, UnifyUser optUser);

    /**
     * 批量新增
     *
     * @param beans
     * @return 影响行数
     */
    Integer batchSave(Collection<UserBean> beans, UnifyUser optUser);

    /**
     * 批量新增（默认值填充非空字段）
     *
     * @param beans
     * @return
     */
    Integer batchSaveWithDefaults(Collection<UserBean> beans, UnifyUser optUser);

    /**
     * 动态更新
     *
     * @param bean
     * @return
     */
    UserBean update(UserBean bean, UnifyUser optUser);

    /**
     * 静态更新
     *
     * @param bean
     * @return
     */
    UserBean staticUpdate(UserBean bean, UnifyUser optUser);

    /**
     * 通过id得到UserBean
     *
     * @param id
     * @return
     */
    UserBean getById(Long id);
}
