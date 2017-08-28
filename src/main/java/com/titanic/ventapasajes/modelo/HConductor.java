package com.titanic.ventapasajes.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Created by josediaz on 1/12/16.
 */
@Entity
@Table(name = "pvm_hconductor")
public class HConductor implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long ideConductor;
    private String nombreConductor;
    private TipoDocumento tipoDocumento;
    private String nroDocumento;
    private Date fechaInicio;
    private Date fechaTermino;
    private int Turno;
    private HojaRuta hojaRuta;
    private String nroLicencia;

    @Id
    @GeneratedValue
    @Column(name="ide_conductor", nullable = false, length= 10)
    public Long getIdeConductor() {
        return ideConductor;
    }

    public void setIdeConductor(Long ideConductor) {
        this.ideConductor = ideConductor;
    }


    @Column(name="nombre_conductor", nullable=false, length = 255)
    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }




    @Enumerated(EnumType.STRING)
    @Column(name="tipo_documento", nullable=false, length = 50)
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    @Column(name="numero_documento",  nullable=false, length = 11)
    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_inicio", nullable = false)
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }



    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_termino", nullable = false)
    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }


    @Column(name="numero_licencia",  length = 11)
    public String getNroLicencia() {
        return nroLicencia;
    }

    public void setNroLicencia(String nroLicencia) {
        this.nroLicencia = nroLicencia;
    }


    @Column(name="turno")
    public int getTurno() {
        return Turno;
    }

    public void setTurno(int turno) {
        Turno = turno;
    }

    @ManyToOne
    @JoinColumn(name = "ide_hoja_ruta", nullable = false)
    public HojaRuta getHojaRuta() {
        return hojaRuta;
    }

    public void setHojaRuta(HojaRuta hojaRuta) {
        this.hojaRuta = hojaRuta;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HConductor that = (HConductor) o;
        return Objects.equals(ideConductor, that.ideConductor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ideConductor);
    }

    @Override
    public String toString() {
        return "HConductor{" +
                "ideConductor=" + ideConductor +
                ", nombreConductor='" + nombreConductor + '\'' +
                ", tipoDocumento=" + tipoDocumento +
                ", nroDocumento='" + nroDocumento + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaTermino=" + fechaTermino +
                ", Turno=" + Turno +
                ", hojaRuta=" + hojaRuta +
                ", nroLicencia='" + nroLicencia + '\'' +
                '}';
    }
}
