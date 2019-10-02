package com.clockingInApp.clockingInApp.security;

//@EnableWebSecurity
//@Configuration
public class SecurityConfig {
//    public class SecurityConfig extends WebSecurityConfigurerAdapter {


//    private static final String USER_ROLE = "USER";
//    private static final String ADMIN_ROLE = "ADMIN";
//
////    @Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth.inMemoryAuthentication()
////                .withUser("user")
////                .password(encode("upassword"))
////                .roles(USER_ROLE)
////                .and()
////                .withUser("admin")
////                .password("apassword")
////                .roles(USER_ROLE, ADMIN_ROLE);
////    }
//
////   1original
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http.csrf().disable();
////        http.authorizeRequests()
////                .antMatchers("**/security/**")
////                .authenticated()
////                .anyRequest()
////                .permitAll()
////                .and()
////                .formLogin()
////                .permitAll();
////    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .inMemoryAuthentication()
//                .withUser("user").password(passwordEncoder().encode("user")).roles(USER_ROLE)
//                .and()
//                .withUser("admin").password(passwordEncoder().encode("admin")).roles(USER_ROLE, ADMIN_ROLE);
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers(HttpMethod.POST, "/**/create/**").hasRole(ADMIN_ROLE)
//                .antMatchers("/").permitAll()
//                .and().httpBasic()
//                .and().formLogin();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }

}
