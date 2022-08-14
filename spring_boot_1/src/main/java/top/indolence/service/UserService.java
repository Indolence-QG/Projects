package top.indolence.service;

import com.baomidou.mybatisplus.extension.service.IService;

import top.indolence.domain.User;

public interface UserService extends IService<User> {
    boolean login(User user);
}
