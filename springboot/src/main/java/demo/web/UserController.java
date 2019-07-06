package demo.web;

import com.skm.common.bean.dto.Page;
import com.skm.common.bean.dto.PageParam;
import com.skm.common.bean.dto.Result;
import com.skm.common.bean.dto.UnifyUser;
import com.skm.common.bean.utils.BeanMapper;
import com.skm.common.spring.advisor.BaseController;

import com.skm.common.user.domain.UserBean;
import demo.enums.UserStatus;
import demo.persistence.qo.UserQO;
import demo.service.UserService;
import demo.web.vo.UserQueryVo;
import demo.web.vo.UserSaveVo;
import demo.web.vo.UserUpdateVo;
import demo.web.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/web/v1/user")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/page")
    public Result<Page<UserVo>> page(@RequestBody PageParam<UserQueryVo> pageParam) {
        int pn = pageParam.getPn();
        int ps = pageParam.getPs();
        UnifyUser currentUser = getCurrentUser();
        UserQO userQO = Optional.of(pageParam.getConditions()).map(cond -> {
            return BeanMapper.map(cond, UserQO.class);
        }).orElse(null);

        Page<UserBean> beanPage = userService.list(userQO, ps, pn, currentUser);

        List<UserVo> userVos = BeanMapper.mapList(beanPage.getDatas(), UserBean.class, UserVo.class);
        Page<UserVo> page = new Page<>(beanPage.getPn(), beanPage.getPs());
        page.setTc(beanPage.getTc());
        page.setDatas(userVos);

        return Result.success(page);
    }

    @PostMapping(value = "/disable/{id}")
    public Result<UserVo> disable(@PathVariable("id") Long id) {
        UserBean userBean = new UserBean();
        userBean.setId(id);
        userBean.setStatus(UserStatus.DISABELD.getValue());
        UserBean bean = userService.update(userBean, getCurrentUser());
        UserVo vo = BeanMapper.map(bean, UserVo.class);

        return Result.success(vo);
    }

    @PostMapping(value = "/active/{id}")
    public Result<UserVo> active(@PathVariable("id") Long id) {
        UserBean userBean = new UserBean();
        userBean.setId(id);
        userBean.setStatus(UserStatus.ACTIVED.getValue());
        UserBean bean = userService.update(userBean, getCurrentUser());
        UserVo vo = BeanMapper.map(bean, UserVo.class);

        return Result.success(vo);
    }

    @PostMapping(value = "/save")
    public Result<UserVo> save(@Validated @RequestBody UserSaveVo saveVo) {
        UserBean bean = BeanMapper.map(saveVo, UserBean.class);
        bean.setStatus(UserStatus.ACTIVED.getValue());

        UserBean save = userService.saveWithDefaults(bean, getCurrentUser());
        UserVo savedVo = BeanMapper.map(save, UserVo.class);
        return Result.success(savedVo);
    }

    @PostMapping(value = "/update")
    public Result<UserVo> update(@Validated @RequestBody UserUpdateVo saveVo) {
        UserBean bean = BeanMapper.map(saveVo, UserBean.class);

        UserBean save = userService.update(bean, getCurrentUser());
        UserVo updatedVo = BeanMapper.map(save, UserVo.class);
        return Result.success(updatedVo);
    }
}
