package nhuquynh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Dùng để khai báo với Spring Boot rằng đây là một entity biểu diễn bảng trong cơ sở dữ liệu
@Data // Tự động tạo getter, setter, toString, equals và hashCode
@AllArgsConstructor // Tự động tạo constructor với tất cả các thuộc tính
@NoArgsConstructor // Tự động tạo constructor không tham số
public class UserInfo {

    @Id // Xác định cột này là khóa chính
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Tự động tăng giá trị khóa chính
    private int id;

    private String name;     // Tên người dùng
    private String email;    // Email người dùng
    private String password; // Mật khẩu người dùng
    private String roles;    // Vai trò của người dùng (ví dụ: ADMIN, USER)
}
