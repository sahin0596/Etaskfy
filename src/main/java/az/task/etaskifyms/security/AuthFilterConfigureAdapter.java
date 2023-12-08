package az.task.etaskifyms.security;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Slf4j
@RequiredArgsConstructor
public class AuthFilterConfigureAdapter extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {

    private final TokenAuthService tokenAuthService;

    @Override
    public void configure(HttpSecurity http) {
        log.info("Added auth request filter");
        http.addFilterBefore(new AuthRequestFilter(tokenAuthService), UsernamePasswordAuthenticationFilter.class);
    }
}

