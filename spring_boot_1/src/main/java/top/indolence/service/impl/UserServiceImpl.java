package top.indolence.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.indolence.domain.User;
import top.indolence.mapper.UserMapper;
import top.indolence.service.UserService;
@Service
public class UserServiceImpl  extends ServiceImpl<UserMapper, User>implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public boolean login(User user) {

        User loginuser = userMapper.selectById(user.getId());
        if (loginuser!=null)
            return true;

        return false;
    }
}
