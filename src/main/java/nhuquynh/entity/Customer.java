package nhuquynh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity // Đánh dấu lớp này là một entity
@Table(name = "customers") // Tùy chọn: chỉ định tên bảng (nếu không, mặc định là "customer")
public class Customer {

    @Id // Đánh dấu đây là khóa chính
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Khóa chính tự động tăng (nếu sử dụng kiểu int hoặc long)
    private String id;

    private String name; // Tên khách hàng
    private String phoneNumber; // Số điện thoại khách hàng
    private String email; // Email khách hàng
}
