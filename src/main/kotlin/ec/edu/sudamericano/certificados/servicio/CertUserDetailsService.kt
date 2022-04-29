package ec.edu.sudamericano.certificados.servicio

import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import java.util.ArrayList

@Service
class CertUserDetailsService: UserDetailsService {
    override fun loadUserByUsername(username: String?): UserDetails {
        return User("user","{noop}admin", ArrayList())
    }
}