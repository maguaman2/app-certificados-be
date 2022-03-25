package ec.edu.sudamericano.certificados.servicio

import ec.edu.sudamericano.certificados.modelos.Certificado
import ec.edu.sudamericano.certificados.repositorio.RepositorioCertificado
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.util.*

@Service
class ServiceCertificado {
    @Autowired
    lateinit var repositorioCertificado: RepositorioCertificado


    fun list(): List<Certificado> {

        return repositorioCertificado.findAll()
    }

    fun getCertificadoByCedulaId(cedula:String): List<Certificado>{
        return repositorioCertificado.findByCedula(cedula)
    }

    fun getCertificadoById(id:Long): Optional<Certificado> {
        return repositorioCertificado.findById(id)
    }

    fun save(certificado: Certificado): Certificado {
        try {

            certificado.nombres?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("nombre no puede ser vacio")


            certificado.cedula?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("apellidos no puede ser vacio")

            return repositorioCertificado.save(certificado)
        } catch (ex: Exception) {
            throw ResponseStatusException(
                HttpStatus.NOT_FOUND, ex.message
            )
        }

    }
}
