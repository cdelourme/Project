package Application.Service;

import Application.Model.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IUserService extends IService<User> {

}