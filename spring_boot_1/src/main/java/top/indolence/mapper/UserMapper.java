package top.indolence.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import top.indolence.domain.User;
@Repository
public interface UserMapper extends BaseMapper<User> {

    User selectOneUser();
}
