package ec.edu.sudamericano.certificados.repositorio

import ec.edu.sudamericano.certificados.modelos.Certificado
import org.springframework.data.jpa.repository.JpaRepository


interface RepositorioCertificado:JpaRepository<Certificado,Long> {
    fun findById(id: Long?): Certificado?

    fun findByCedula(cedula: String): List<Certificado>

}