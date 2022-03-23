package ec.edu.sudamericano.certificados.servicio

import ec.edu.sudamericano.certificados.modelos.Certificado
import ec.edu.sudamericano.certificados.repositorio.RepositorioCertificado
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
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

}