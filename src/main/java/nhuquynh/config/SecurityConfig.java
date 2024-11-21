package nhuquynh.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    // Define in-memory users for authentication
//    @Bean
//    public UserDetailsService userDetailsService(PasswordEncoder encoder) {
//        // Admin user with ROLE_ADMIN
//        UserDetails admin = User.withUsername("trung")
//                .password(encoder.encode("123")) // Password: "123"
//                .roles("ADMIN")
//                .build();
//
//        // Standard user with ROLE_USER
//        UserDetails user = User.withUsername("user")
//                .password(encoder.encode("123")) // Password: "123"
//                .roles("USER")
//                .build();
//
//        // Return an InMemoryUserDetailsManager containing both users
//        return new InMemoryUserDetailsManager(admin, user);
//    }
//
//    // Define the password encoder (BCrypt)
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        return http
//                .csrf(csrf -> csrf.disable()) // Disable CSRF protection
//                .authorizeHttpRequests(auth -> auth
//                                .requestMatchers("/").permitAll() // Allow access to the root ("/") endpoint for everyone
//                                .requestMatchers("/customer/**").authenticated() // Require authentication for "/customer/**" endpoints
//                        // .anyRequest().authenticated() // Uncomment this to secure all other endpoints
//                )
//                .formLogin(Customizer.withDefaults()) // Enable default form-based authentication
//                .build();
//    }
//
//}
import nhuquynh.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

//    @Autowired
//    private UserInfoRepository repository;
//
//    @Bean
//    public UserDetailsService userDetailsService() {
//        return new UserInfoService(repository);
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public AuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
//        authenticationProvider.setUserDetailsService(userDetailsService());
//        authenticationProvider.setPasswordEncoder(passwordEncoder());
//        return authenticationProvider;
//    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        return http
//                .csrf(csrf -> csrf.disable())
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/user/new").permitAll()
//                        .requestMatchers("/").permitAll()
//                        .requestMatchers("/customer/**").authenticated()
//                )
//                .formLogin(Customizer.withDefaults())
//                .build();
//    }
}
