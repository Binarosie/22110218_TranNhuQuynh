package nhuquynh.service;


import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import nhuquynh.entity.UserInfo;
import nhuquynh.repository.UserInfoRepository;

@Service
public class UserService {

    private final UserInfoRepository repository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserInfoRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    public String addUser(UserInfo userInfo) {
        // Mã hóa mật khẩu trước khi lưu
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        // Lưu thông tin người dùng vào cơ sở dữ liệu
        repository.save(userInfo);
        return "Thêm user thành công!";
    }
}
