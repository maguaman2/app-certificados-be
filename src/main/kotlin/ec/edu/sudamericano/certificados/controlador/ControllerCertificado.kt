package ec.edu.sudamericano.certificados.controlador

import ec.edu.sudamericano.certificados.modelos.Certificado
import ec.edu.sudamericano.certificados.servicio.ServiceCertificado
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RestController
@RequestMapping("/certificado")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])
class ControllerCertificado {


    @Autowired
    lateinit var serviceCertificado: ServiceCertificado
    @GetMapping
    fun list(): List<Certificado> {
        return serviceCertificado.list()

    }

    @GetMapping("/cedula/{cedula}")
    fun getBySystemId(@PathVariable("cedula") cedula:String): ResponseEntity<*>
    {
        val response = serviceCertificado.getCertificadoByCedulaId(cedula)
        return response?.let {            ResponseEntity(response, HttpStatus.OK)        } ?: ResponseEntity<Certificado>( HttpStatus.NOT_FOUND)    }

    @GetMapping("/id/{id}")
    fun getCertificadoById(@PathVariable("id") id:Long): ResponseEntity<*>
    {
        val response = serviceCertificado.getCertificadoById(id)
        return response?.let {            ResponseEntity(response, HttpStatus.OK)        } ?: ResponseEntity<Certificado>( HttpStatus.NOT_FOUND)    }


    @PostMapping
    fun save (@RequestBody  certificado: Certificado): Certificado{
        return serviceCertificado.save(certificado)
    }

    //agregar put
    @PutMapping
    fun update (@RequestBody certificado: Certificado): Certificado{
        return serviceCertificado.update(certificado)
    }


}