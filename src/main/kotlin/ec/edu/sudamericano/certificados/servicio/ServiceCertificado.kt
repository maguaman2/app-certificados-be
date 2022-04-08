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

            certificado.cedula?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Cedula no puede ser vacio")

            certificado.nombres?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Nombre no puede ser vacio")

            certificado.email?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Email no puede ser vacio")

            certificado.fechas?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Fechas no puede ser vacio")

            certificado.rol?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Rol no puede ser vacio")

            certificado.capacitador?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Capacitador no puede ser vacio")

            certificado.codigo?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Codigo no puede ser vacio")

            certificado.area?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Area no puede ser vacio")

            certificado.curso?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Curso no puede ser vacio")

            certificado.objetivo?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Objetivo no puede ser vacio")

            certificado.contenidos?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Contenidos no puede ser vacio")

            return repositorioCertificado.save(certificado)
        } catch (ex: Exception) {
            throw ResponseStatusException(
                HttpStatus.NOT_FOUND, ex.message
            )
        }

    }

    fun update(certificado: Certificado): Certificado {
        try {
            certificado.cedula?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Cedula no puede ser vacio")

            certificado.nombres?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Nombres no puede ser vacio")

            certificado.email?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Email no puede ser vacio")

            certificado.fechas?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Fechas no puede ser vacio")

            certificado.rol?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Rol puede ser vacio")

            certificado.capacitador?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Capacitador no puede ser vacio")

            certificado.codigo?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Codigo no puede ser vacio")

            certificado.area?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Area no puede ser vacio")

            certificado.curso?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Curso no puede ser vacio")

            certificado.objetivo?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Objetivo no puede ser vacio")

            certificado.contenidos?.takeIf { it.trim().isNotEmpty() }
                ?: throw java.lang.Exception("Contenidos no puede ser vacio")


            repositorioCertificado.findById(certificado.id)
                ?: throw Exception()
            return repositorioCertificado.save(certificado)
        }catch (ex:Exception){
            throw Exception()
        }

    }
}
