//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.06.13 a las 10:01:35 AM UYT 
//


package org.openup.aduana.mic.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaHoraDocumentoElectronico" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CodigoIntercambio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Objeto">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Manifiestos">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Manifiesto" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TransporteTipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ManifiestoTipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ManifiestoNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Recinto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="FechaArribo" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *                                       &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="AgenteTransportistaTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="AgenteTransportistaDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="LugarPartidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="LugarDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="UltimoPuerto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="MedioTransporteMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="MedioTransporteNacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="FechaLlegada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="FechaSalida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="Observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="MedioTransporteNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="FechaFinCargaDescarga" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="ViajeNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ManifiestoOriginalNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="AgenteTransportistaNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="AgenteTransportistaPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="AgenteTransportistaDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="LugarPartida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="LugarDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="AduanaIngresoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="AduanaSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="FechaPasajeFrontera" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="TractoraMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="RemolqueMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="SemiRemolqueMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="TransportistaEfectivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="AgenteTransportistaRepresentanteTipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="AgenteTransportistaRepresentanteDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PaisOrigenCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PaisDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="TransportistaEfectivoRepresentanteTipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="TransportistaEfectivoRepresentanteDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="TransportistaEfectivoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="TransportistaEfectivoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="RemolqueDuenoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="RemolqueDuenoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Lastre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ConductorNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ConductorTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ConductorDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="FechaLlegadaPrevista" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="PlazoOrigenDestino" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *                                       &lt;element name="RutaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="CiudadPartidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="CiudadSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="CiudadEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="AduanaEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="LugarOperativoEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="CiudadDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="AduanaDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="LugarOperativoDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="PaisTrasbordoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="CiudadTrasbordoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="AduanaTrasbordoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="LugarOperativoTrasbordoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="TransitoAduanero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="AgenteTransportistaRepresentanteDocExtranjero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="TransportistaEfectivoRepresentanteDocExtranjero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="MedioTransporteCapacidadArrastre" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                       &lt;element name="MedioTransporteAnoFabricacion" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *                                       &lt;element name="DocumentoPrecedenteTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="MicPrecedenteTipoTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="MicPrecedenteTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="MicPrecedenteNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="MicPrecedenteRecinto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="MicPrecedenteFechaArribo" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *                                       &lt;element name="GexPrecedenteNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Conocimientos" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Conocimiento" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ConocimientoNumeroSecuencial" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *                                                           &lt;element name="ConocimientoOriginalNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="PuertoEmbarque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="ConocimientoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="ConocimientoMasterNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="PuertoDescarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="ConsignatarioTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="ConsignatarioDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="ConsignatarioNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="EndosoFecha" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                           &lt;element name="EndosoLugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="MercaderiaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="RemitenteTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="RemitenteDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="RemitenteNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="RemitenteDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="DestinatarioTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="DestinatarioDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="DestinatarioNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="DestinatarioDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="MercaderiaDestinoFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="MercaderiaPeligrosa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="FleteMonto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                           &lt;element name="SeguroMonto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                           &lt;element name="Consolidado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Fraccionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Lineas" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Linea" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="LineaNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *                                                                               &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                               &lt;element name="PesoBruto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                               &lt;element name="BultoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                               &lt;element name="BultoCantidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                               &lt;element name="Marcas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                               &lt;element name="MercaderiaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                               &lt;element name="DepositoFinalCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                               &lt;element name="MercaderiaPeligrosaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                               &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                               &lt;element name="ActaTexto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                               &lt;element name="ActaNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *                                                                               &lt;element name="ValorDeclaradoImporte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                               &lt;element name="ValorDeclaradoMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                               &lt;element name="ContenedoresLinea" minOccurs="0">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="ContenedorLinea" maxOccurs="unbounded" minOccurs="0">
 *                                                                                           &lt;complexType>
 *                                                                                             &lt;complexContent>
 *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                 &lt;sequence>
 *                                                                                                   &lt;element name="ContenedorNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                                   &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                                                   &lt;element name="CantidadBultos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                                                 &lt;/sequence>
 *                                                                                               &lt;/restriction>
 *                                                                                             &lt;/complexContent>
 *                                                                                           &lt;/complexType>
 *                                                                                         &lt;/element>
 *                                                                                       &lt;/sequence>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="Asociaciones" minOccurs="0">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="Asociacion" maxOccurs="unbounded" minOccurs="0">
 *                                                                                           &lt;complexType>
 *                                                                                             &lt;complexContent>
 *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                 &lt;sequence>
 *                                                                                                   &lt;element name="DocumentoCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                                   &lt;element name="DocumentoNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                                   &lt;element name="DocumentoAduanaCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                                   &lt;element name="DocumentoAno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                                   &lt;element name="DocumentoLinea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                                   &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                                                   &lt;element name="BultoCantidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                                                                   &lt;element name="BultoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                                                 &lt;/sequence>
 *                                                                                               &lt;/restriction>
 *                                                                                             &lt;/complexContent>
 *                                                                                           &lt;/complexType>
 *                                                                                         &lt;/element>
 *                                                                                       &lt;/sequence>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="Imagenes" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="Imagen" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="ImagenNumeroSecuencial" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *                                                                               &lt;element name="ImagenNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *                                                                               &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Contenedores" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="Contenedor" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ContenedorNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Calificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="TamanoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="CompletoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="PesoBruto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                           &lt;element name="Precinto1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Precinto2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Precinto3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Precinto4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Precinto5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Precinto6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Precinto7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Precinto8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Precinto9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="DepositoDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="ManifiestoDestinoNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="ManifiestoDestinoFechaSalida" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *                                                           &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="Observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Precintos" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="Precinto" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="PrecintoNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PaisesDePaso" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence minOccurs="0">
 *                                                 &lt;element name="PaisDePaso" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="PaisDePasoNumeroSecuencial" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *                                                           &lt;element name="PaisDePasoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="CiudadEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="AduanaDeEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="LugarOperativoEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="CiudadSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="AduanaSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="LugarOperativoSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Signature">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SignedInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CanonicalizationMethod">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="SignatureMethod">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Reference">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Transforms">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Transform">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="DigestMethod">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="DigestValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SignatureValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="KeyInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="X509Data">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="X509Certificate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tipoDocumento",
    "idDocumento",
    "fechaHoraDocumentoElectronico",
    "codigoIntercambio",
    "nroTransaccion",
    "objeto",
    "signature"
})
@XmlRootElement(name = "DAE")
public class DAE {

    @XmlElement(name = "TipoDocumento", required = true)
    protected String tipoDocumento;
    @XmlElement(name = "IdDocumento", required = true)
    protected String idDocumento;
    @XmlElement(name = "FechaHoraDocumentoElectronico", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraDocumentoElectronico;
    @XmlElement(name = "CodigoIntercambio", required = true)
    protected String codigoIntercambio;
    @XmlElement(name = "NroTransaccion")
    protected String nroTransaccion;
    @XmlElement(name = "Objeto", required = true)
    protected DAE.Objeto objeto;
    @XmlElement(name = "Signature", required = true)
    protected DAE.Signature signature;

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad idDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocumento() {
        return idDocumento;
    }

    /**
     * Define el valor de la propiedad idDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocumento(String value) {
        this.idDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraDocumentoElectronico.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraDocumentoElectronico() {
        return fechaHoraDocumentoElectronico;
    }

    /**
     * Define el valor de la propiedad fechaHoraDocumentoElectronico.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraDocumentoElectronico(XMLGregorianCalendar value) {
        this.fechaHoraDocumentoElectronico = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoIntercambio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoIntercambio() {
        return codigoIntercambio;
    }

    /**
     * Define el valor de la propiedad codigoIntercambio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoIntercambio(String value) {
        this.codigoIntercambio = value;
    }

    /**
     * Obtiene el valor de la propiedad nroTransaccion
     * 
     * @return
     *     posible object is
     *     {@link String }
     *     
     */
    public String getNroTransaccion(){
    	return nroTransaccion;
    }
    
    /**
     * Define el valor de la propiedad nroTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroTransaccion (String value){
    	this.nroTransaccion = value;
    }
    
    /**
     * Obtiene el valor de la propiedad objeto.
     * 
     * @return
     *     possible object is
     *     {@link DAE.Objeto }
     *     
     */
    public DAE.Objeto getObjeto() {
        return objeto;
    }

    /**
     * Define el valor de la propiedad objeto.
     * 
     * @param value
     *     allowed object is
     *     {@link DAE.Objeto }
     *     
     */
    public void setObjeto(DAE.Objeto value) {
        this.objeto = value;
    }

    /**
     * Obtiene el valor de la propiedad signature.
     * 
     * @return
     *     possible object is
     *     {@link DAE.Signature }
     *     
     */
    public DAE.Signature getSignature() {
        return signature;
    }

    /**
     * Define el valor de la propiedad signature.
     * 
     * @param value
     *     allowed object is
     *     {@link DAE.Signature }
     *     
     */
    public void setSignature(DAE.Signature value) {
        this.signature = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Manifiestos">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Manifiesto" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TransporteTipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ManifiestoTipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ManifiestoNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Recinto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="FechaArribo" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
     *                             &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="AgenteTransportistaTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="AgenteTransportistaDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="LugarPartidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="LugarDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="UltimoPuerto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="MedioTransporteMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="MedioTransporteNacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="FechaLlegada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="FechaSalida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="Observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="MedioTransporteNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="FechaFinCargaDescarga" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="ViajeNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ManifiestoOriginalNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="AgenteTransportistaNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="AgenteTransportistaPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="AgenteTransportistaDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="LugarPartida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="LugarDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="AduanaIngresoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="AduanaSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="FechaPasajeFrontera" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="TractoraMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="RemolqueMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="SemiRemolqueMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="TransportistaEfectivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="AgenteTransportistaRepresentanteTipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="AgenteTransportistaRepresentanteDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PaisOrigenCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PaisDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="TransportistaEfectivoRepresentanteTipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="TransportistaEfectivoRepresentanteDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="TransportistaEfectivoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="TransportistaEfectivoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="RemolqueDuenoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="RemolqueDuenoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Lastre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ConductorNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ConductorTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ConductorDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="FechaLlegadaPrevista" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="PlazoOrigenDestino" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
     *                             &lt;element name="RutaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="CiudadPartidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="CiudadSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="CiudadEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="AduanaEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="LugarOperativoEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="CiudadDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="AduanaDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="LugarOperativoDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="PaisTrasbordoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="CiudadTrasbordoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="AduanaTrasbordoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="LugarOperativoTrasbordoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="TransitoAduanero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="AgenteTransportistaRepresentanteDocExtranjero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="TransportistaEfectivoRepresentanteDocExtranjero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="MedioTransporteCapacidadArrastre" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                             &lt;element name="MedioTransporteAnoFabricacion" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
     *                             &lt;element name="DocumentoPrecedenteTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="MicPrecedenteTipoTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="MicPrecedenteTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="MicPrecedenteNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="MicPrecedenteRecinto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="MicPrecedenteFechaArribo" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
     *                             &lt;element name="GexPrecedenteNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Conocimientos" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Conocimiento" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ConocimientoNumeroSecuencial" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
     *                                                 &lt;element name="ConocimientoOriginalNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="PuertoEmbarque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="ConocimientoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="ConocimientoMasterNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="PuertoDescarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="ConsignatarioTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="ConsignatarioDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="ConsignatarioNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="EndosoFecha" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                                 &lt;element name="EndosoLugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="MercaderiaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="RemitenteTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="RemitenteDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="RemitenteNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="RemitenteDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="DestinatarioTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="DestinatarioDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="DestinatarioNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="DestinatarioDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="MercaderiaDestinoFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="MercaderiaPeligrosa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="FleteMonto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                 &lt;element name="SeguroMonto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                 &lt;element name="Consolidado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Fraccionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Lineas" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Linea" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="LineaNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
     *                                                                     &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                     &lt;element name="PesoBruto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                     &lt;element name="BultoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                     &lt;element name="BultoCantidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                     &lt;element name="Marcas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                     &lt;element name="MercaderiaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                     &lt;element name="DepositoFinalCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                     &lt;element name="MercaderiaPeligrosaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                     &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                     &lt;element name="ActaTexto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                     &lt;element name="ActaNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
     *                                                                     &lt;element name="ValorDeclaradoImporte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                     &lt;element name="ValorDeclaradoMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                     &lt;element name="ContenedoresLinea" minOccurs="0">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="ContenedorLinea" maxOccurs="unbounded" minOccurs="0">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;sequence>
     *                                                                                         &lt;element name="ContenedorNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                                         &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                                         &lt;element name="CantidadBultos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                                       &lt;/sequence>
     *                                                                                     &lt;/restriction>
     *                                                                                   &lt;/complexContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
     *                                                                             &lt;/sequence>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="Asociaciones" minOccurs="0">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="Asociacion" maxOccurs="unbounded" minOccurs="0">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;sequence>
     *                                                                                         &lt;element name="DocumentoCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                                         &lt;element name="DocumentoNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                                         &lt;element name="DocumentoAduanaCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                                         &lt;element name="DocumentoAno" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                                         &lt;element name="DocumentoLinea" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                                         &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                                         &lt;element name="BultoCantidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                                                         &lt;element name="BultoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                                       &lt;/sequence>
     *                                                                                     &lt;/restriction>
     *                                                                                   &lt;/complexContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
     *                                                                             &lt;/sequence>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="Imagenes" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="Imagen" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="ImagenNumeroSecuencial" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
     *                                                                     &lt;element name="ImagenNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
     *                                                                     &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Contenedores" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence minOccurs="0">
     *                                       &lt;element name="Contenedor" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ContenedorNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Calificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="TamanoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="CompletoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="PesoBruto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                                 &lt;element name="Precinto1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Precinto2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Precinto3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Precinto4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Precinto5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Precinto6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Precinto7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Precinto8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Precinto9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="DepositoDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="ManifiestoDestinoNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="ManifiestoDestinoFechaSalida" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
     *                                                 &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="Observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Precintos" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence minOccurs="0">
     *                                       &lt;element name="Precinto" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="PrecintoNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PaisesDePaso" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence minOccurs="0">
     *                                       &lt;element name="PaisDePaso" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="PaisDePasoNumeroSecuencial" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
     *                                                 &lt;element name="PaisDePasoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="CiudadEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="AduanaDeEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="LugarOperativoEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="CiudadSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="AduanaSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="LugarOperativoSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "manifiestos"
    })
    public static class Objeto {

        @XmlElement(name = "Manifiestos", required = true)
        protected DAE.Objeto.Manifiestos manifiestos;

        /**
         * Obtiene el valor de la propiedad manifiestos.
         * 
         * @return
         *     possible object is
         *     {@link DAE.Objeto.Manifiestos }
         *     
         */
        public DAE.Objeto.Manifiestos getManifiestos() {
            return manifiestos;
        }

        /**
         * Define el valor de la propiedad manifiestos.
         * 
         * @param value
         *     allowed object is
         *     {@link DAE.Objeto.Manifiestos }
         *     
         */
        public void setManifiestos(DAE.Objeto.Manifiestos value) {
            this.manifiestos = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Manifiesto" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TransporteTipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ManifiestoTipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ManifiestoNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Recinto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="FechaArribo" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
         *                   &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="AgenteTransportistaTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="AgenteTransportistaDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="LugarPartidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="LugarDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="UltimoPuerto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="MedioTransporteMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="MedioTransporteNacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="FechaLlegada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="FechaSalida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="Observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="MedioTransporteNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="FechaFinCargaDescarga" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="ViajeNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ManifiestoOriginalNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="AgenteTransportistaNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="AgenteTransportistaPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="AgenteTransportistaDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="LugarPartida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="LugarDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="AduanaIngresoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="AduanaSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="FechaPasajeFrontera" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="TractoraMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="RemolqueMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="SemiRemolqueMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="TransportistaEfectivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="AgenteTransportistaRepresentanteTipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="AgenteTransportistaRepresentanteDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PaisOrigenCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PaisDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="TransportistaEfectivoRepresentanteTipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="TransportistaEfectivoRepresentanteDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="TransportistaEfectivoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="TransportistaEfectivoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="RemolqueDuenoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="RemolqueDuenoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Lastre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ConductorNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ConductorTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ConductorDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="FechaLlegadaPrevista" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="PlazoOrigenDestino" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
         *                   &lt;element name="RutaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="CiudadPartidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="CiudadSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="CiudadEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="AduanaEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="LugarOperativoEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="CiudadDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="AduanaDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="LugarOperativoDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="PaisTrasbordoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="CiudadTrasbordoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="AduanaTrasbordoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="LugarOperativoTrasbordoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="TransitoAduanero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="AgenteTransportistaRepresentanteDocExtranjero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="TransportistaEfectivoRepresentanteDocExtranjero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="MedioTransporteCapacidadArrastre" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                   &lt;element name="MedioTransporteAnoFabricacion" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
         *                   &lt;element name="DocumentoPrecedenteTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="MicPrecedenteTipoTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="MicPrecedenteTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="MicPrecedenteNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="MicPrecedenteRecinto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="MicPrecedenteFechaArribo" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
         *                   &lt;element name="GexPrecedenteNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Conocimientos" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Conocimiento" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ConocimientoNumeroSecuencial" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
         *                                       &lt;element name="ConocimientoOriginalNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="PuertoEmbarque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="ConocimientoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="ConocimientoMasterNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="PuertoDescarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="ConsignatarioTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="ConsignatarioDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="ConsignatarioNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="EndosoFecha" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                                       &lt;element name="EndosoLugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="MercaderiaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="RemitenteTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="RemitenteDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="RemitenteNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="RemitenteDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="DestinatarioTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="DestinatarioDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="DestinatarioNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="DestinatarioDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="MercaderiaDestinoFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="MercaderiaPeligrosa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="FleteMonto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                       &lt;element name="SeguroMonto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                       &lt;element name="Consolidado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Fraccionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Lineas" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Linea" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="LineaNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
         *                                                           &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                           &lt;element name="PesoBruto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                           &lt;element name="BultoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                           &lt;element name="BultoCantidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                           &lt;element name="Marcas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                           &lt;element name="MercaderiaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                           &lt;element name="DepositoFinalCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                           &lt;element name="MercaderiaPeligrosaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                           &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                           &lt;element name="ActaTexto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                           &lt;element name="ActaNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
         *                                                           &lt;element name="ValorDeclaradoImporte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                           &lt;element name="ValorDeclaradoMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                           &lt;element name="ContenedoresLinea" minOccurs="0">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="ContenedorLinea" maxOccurs="unbounded" minOccurs="0">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;sequence>
         *                                                                               &lt;element name="ContenedorNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                               &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                                               &lt;element name="CantidadBultos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                                             &lt;/sequence>
         *                                                                           &lt;/restriction>
         *                                                                         &lt;/complexContent>
         *                                                                       &lt;/complexType>
         *                                                                     &lt;/element>
         *                                                                   &lt;/sequence>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="Asociaciones" minOccurs="0">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="Asociacion" maxOccurs="unbounded" minOccurs="0">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;sequence>
         *                                                                               &lt;element name="DocumentoCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                               &lt;element name="DocumentoNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                               &lt;element name="DocumentoAduanaCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                               &lt;element name="DocumentoAno" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                               &lt;element name="DocumentoLinea" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                               &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                                               &lt;element name="BultoCantidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                                                               &lt;element name="BultoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                                             &lt;/sequence>
         *                                                                           &lt;/restriction>
         *                                                                         &lt;/complexContent>
         *                                                                       &lt;/complexType>
         *                                                                     &lt;/element>
         *                                                                   &lt;/sequence>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="Imagenes" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="Imagen" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="ImagenNumeroSecuencial" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
         *                                                           &lt;element name="ImagenNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
         *                                                           &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Contenedores" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence minOccurs="0">
         *                             &lt;element name="Contenedor" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ContenedorNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Calificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="TamanoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="CompletoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="PesoBruto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                                       &lt;element name="Precinto1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Precinto2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Precinto3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Precinto4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Precinto5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Precinto6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Precinto7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Precinto8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Precinto9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="DepositoDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="ManifiestoDestinoNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="ManifiestoDestinoFechaSalida" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
         *                                       &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="Observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Precintos" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence minOccurs="0">
         *                             &lt;element name="Precinto" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="PrecintoNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PaisesDePaso" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence minOccurs="0">
         *                             &lt;element name="PaisDePaso" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="PaisDePasoNumeroSecuencial" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
         *                                       &lt;element name="PaisDePasoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="CiudadEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="AduanaDeEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="LugarOperativoEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="CiudadSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="AduanaSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="LugarOperativoSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "manifiesto"
        })
        public static class Manifiestos {

            @XmlElement(name = "Manifiesto", required = true)
            protected List<DAE.Objeto.Manifiestos.Manifiesto> manifiesto;

            /**
             * Gets the value of the manifiesto property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the manifiesto property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getManifiesto().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DAE.Objeto.Manifiestos.Manifiesto }
             * 
             * 
             */
            public List<DAE.Objeto.Manifiestos.Manifiesto> getManifiesto() {
                if (manifiesto == null) {
                    manifiesto = new ArrayList<DAE.Objeto.Manifiestos.Manifiesto>();
                }
                return this.manifiesto;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="TransporteTipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ManifiestoTipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ManifiestoNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Recinto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="FechaArribo" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
             *         &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="AgenteTransportistaTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="AgenteTransportistaDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="LugarPartidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="LugarDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="UltimoPuerto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="MedioTransporteMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="MedioTransporteNacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="FechaLlegada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="FechaSalida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="Observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="MedioTransporteNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="FechaFinCargaDescarga" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="ViajeNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ManifiestoOriginalNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="AgenteTransportistaNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="AgenteTransportistaPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="AgenteTransportistaDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="LugarPartida" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="LugarDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="AduanaIngresoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="AduanaSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="FechaPasajeFrontera" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="TractoraMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="RemolqueMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="SemiRemolqueMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="TransportistaEfectivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="AgenteTransportistaRepresentanteTipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="AgenteTransportistaRepresentanteDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PaisOrigenCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PaisDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="TransportistaEfectivoRepresentanteTipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="TransportistaEfectivoRepresentanteDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="TransportistaEfectivoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="TransportistaEfectivoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="RemolqueDuenoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="RemolqueDuenoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Lastre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ConductorNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ConductorTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ConductorDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="FechaLlegadaPrevista" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="PlazoOrigenDestino" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
             *         &lt;element name="RutaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="CiudadPartidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="CiudadSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="CiudadEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="AduanaEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="LugarOperativoEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="CiudadDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="AduanaDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="LugarOperativoDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="PaisTrasbordoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="CiudadTrasbordoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="AduanaTrasbordoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="LugarOperativoTrasbordoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="TransitoAduanero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="AgenteTransportistaRepresentanteDocExtranjero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="TransportistaEfectivoRepresentanteDocExtranjero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="MedioTransporteCapacidadArrastre" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *         &lt;element name="MedioTransporteAnoFabricacion" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
             *         &lt;element name="DocumentoPrecedenteTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="MicPrecedenteTipoTransporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="MicPrecedenteTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="MicPrecedenteNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="MicPrecedenteRecinto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="MicPrecedenteFechaArribo" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
             *         &lt;element name="GexPrecedenteNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Conocimientos" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Conocimiento" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ConocimientoNumeroSecuencial" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
             *                             &lt;element name="ConocimientoOriginalNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="PuertoEmbarque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="ConocimientoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="ConocimientoMasterNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="PuertoDescarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="ConsignatarioTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="ConsignatarioDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="ConsignatarioNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="EndosoFecha" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                             &lt;element name="EndosoLugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="MercaderiaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="RemitenteTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="RemitenteDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="RemitenteNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="RemitenteDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="DestinatarioTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="DestinatarioDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="DestinatarioNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="DestinatarioDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="MercaderiaDestinoFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="MercaderiaPeligrosa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="FleteMonto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                             &lt;element name="SeguroMonto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                             &lt;element name="Consolidado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Fraccionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Lineas" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Linea" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="LineaNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
             *                                                 &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                 &lt;element name="PesoBruto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                                 &lt;element name="BultoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                 &lt;element name="BultoCantidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                                 &lt;element name="Marcas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                 &lt;element name="MercaderiaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                 &lt;element name="DepositoFinalCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                 &lt;element name="MercaderiaPeligrosaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                 &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                 &lt;element name="ActaTexto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                 &lt;element name="ActaNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
             *                                                 &lt;element name="ValorDeclaradoImporte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                                 &lt;element name="ValorDeclaradoMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                 &lt;element name="ContenedoresLinea" minOccurs="0">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="ContenedorLinea" maxOccurs="unbounded" minOccurs="0">
             *                                                             &lt;complexType>
             *                                                               &lt;complexContent>
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                   &lt;sequence>
             *                                                                     &lt;element name="ContenedorNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                                     &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                                     &lt;element name="CantidadBultos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                                                   &lt;/sequence>
             *                                                                 &lt;/restriction>
             *                                                               &lt;/complexContent>
             *                                                             &lt;/complexType>
             *                                                           &lt;/element>
             *                                                         &lt;/sequence>
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="Asociaciones" minOccurs="0">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="Asociacion" maxOccurs="unbounded" minOccurs="0">
             *                                                             &lt;complexType>
             *                                                               &lt;complexContent>
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                   &lt;sequence>
             *                                                                     &lt;element name="DocumentoCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                                     &lt;element name="DocumentoNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                                     &lt;element name="DocumentoAduanaCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                                     &lt;element name="DocumentoAno" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                                     &lt;element name="DocumentoLinea" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                                     &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                                     &lt;element name="BultoCantidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                                                                     &lt;element name="BultoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                                   &lt;/sequence>
             *                                                                 &lt;/restriction>
             *                                                               &lt;/complexContent>
             *                                                             &lt;/complexType>
             *                                                           &lt;/element>
             *                                                         &lt;/sequence>
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="Imagenes" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="Imagen" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="ImagenNumeroSecuencial" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
             *                                                 &lt;element name="ImagenNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
             *                                                 &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Contenedores" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence minOccurs="0">
             *                   &lt;element name="Contenedor" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ContenedorNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Calificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="TamanoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="CompletoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="PesoBruto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                             &lt;element name="Precinto1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Precinto2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Precinto3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Precinto4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Precinto5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Precinto6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Precinto7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Precinto8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Precinto9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="DepositoDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="ManifiestoDestinoNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="ManifiestoDestinoFechaSalida" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
             *                             &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="Observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Precintos" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence minOccurs="0">
             *                   &lt;element name="Precinto" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="PrecintoNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PaisesDePaso" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence minOccurs="0">
             *                   &lt;element name="PaisDePaso" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="PaisDePasoNumeroSecuencial" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
             *                             &lt;element name="PaisDePasoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="CiudadEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="AduanaDeEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="LugarOperativoEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="CiudadSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="AduanaSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="LugarOperativoSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "transporteTipo",
                "manifiestoTipo",
                "manifiestoNumero",
                "recinto",
                "fechaArribo",
                "registroTipo",
                "agenteTransportistaTipoDocumento",
                "agenteTransportistaDocumento",
                "lugarPartidaCodigo",
                "lugarDestinoCodigo",
                "ultimoPuerto",
                "medioTransporteMatricula",
                "medioTransporteNacionalidad",
                "fechaLlegada",
                "fechaSalida",
                "observacion",
                "medioTransporteNombre",
                "fechaFinCargaDescarga",
                "viajeNumero",
                "operacionTipo",
                "manifiestoOriginalNumero",
                "agenteTransportistaNombre",
                "agenteTransportistaPais",
                "agenteTransportistaDireccion",
                "lugarPartida",
                "lugarDestino",
                "aduanaIngresoCodigo",
                "aduanaSalidaCodigo",
                "fechaPasajeFrontera",
                "tractoraMatricula",
                "remolqueMatricula",
                "semiRemolqueMatricula",
                "transportistaEfectivo",
                "agenteTransportistaRepresentanteTipoDoc",
                "agenteTransportistaRepresentanteDoc",
                "paisOrigenCodigo",
                "paisDestinoCodigo",
                "transportistaEfectivoRepresentanteTipoDoc",
                "transportistaEfectivoRepresentanteDoc",
                "transportistaEfectivoTipoDocumento",
                "transportistaEfectivoDocumento",
                "remolqueDuenoTipoDocumento",
                "remolqueDuenoDocumento",
                "lastre",
                "conductorNombre",
                "conductorTipoDocumento",
                "conductorDocumento",
                "fechaLlegadaPrevista",
                "plazoOrigenDestino",
                "rutaDescripcion",
                "ciudadPartidaCodigo",
                "ciudadSalidaCodigo",
                "ciudadEntradaCodigo",
                "aduanaEntradaCodigo",
                "lugarOperativoEntradaCodigo",
                "ciudadDestinoCodigo",
                "aduanaDestinoCodigo",
                "lugarOperativoDestinoCodigo",
                "paisTrasbordoCodigo",
                "ciudadTrasbordoCodigo",
                "aduanaTrasbordoCodigo",
                "lugarOperativoTrasbordoCodigo",
                "transitoAduanero",
                "agenteTransportistaRepresentanteDocExtranjero",
                "transportistaEfectivoRepresentanteDocExtranjero",
                "medioTransporteCapacidadArrastre",
                "medioTransporteAnoFabricacion",
                "documentoPrecedenteTipo",
                "micPrecedenteTipoTransporte",
                "micPrecedenteTipo",
                "micPrecedenteNumero",
                "micPrecedenteRecinto",
                "micPrecedenteFechaArribo",
                "gexPrecedenteNumero",
                "micCelularSMS",
                "conocimientos",
                "contenedores",
                "precintos",
                "paisesDePaso"
            })
            public static class Manifiesto {

                @XmlElement(name = "TransporteTipo", required = true)
                protected String transporteTipo;
                @XmlElement(name = "ManifiestoTipo", required = true)
                protected String manifiestoTipo;
                @XmlElement(name = "ManifiestoNumero")
                protected String manifiestoNumero;
                @XmlElement(name = "Recinto")
                protected String recinto;
                @XmlElement(name = "FechaArribo")
                @XmlSchemaType(name = "unsignedInt")
                protected long fechaArribo;
                @XmlElement(name = "RegistroTipo")
                protected String registroTipo;
                @XmlElement(name = "AgenteTransportistaTipoDocumento")
                protected String agenteTransportistaTipoDocumento;
                @XmlElement(name = "AgenteTransportistaDocumento")
                protected String agenteTransportistaDocumento;
                @XmlElement(name = "LugarPartidaCodigo")
                protected String lugarPartidaCodigo;
                @XmlElement(name = "LugarDestinoCodigo")
                protected String lugarDestinoCodigo;
                @XmlElement(name = "UltimoPuerto")
                protected String ultimoPuerto;
                @XmlElement(name = "MedioTransporteMatricula")
                protected String medioTransporteMatricula;
                @XmlElement(name = "MedioTransporteNacionalidad")
                protected String medioTransporteNacionalidad;
                @XmlElement(name = "FechaLlegada")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar fechaLlegada;
                @XmlElement(name = "FechaSalida")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar fechaSalida;
                @XmlElement(name = "Observacion")
                protected String observacion;
                @XmlElement(name = "MedioTransporteNombre")
                protected String medioTransporteNombre;
                @XmlElement(name = "FechaFinCargaDescarga")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar fechaFinCargaDescarga;
                @XmlElement(name = "ViajeNumero")
                protected String viajeNumero;
                @XmlElement(name = "OperacionTipo")
                protected String operacionTipo;
                @XmlElement(name = "ManifiestoOriginalNumero")
                protected String manifiestoOriginalNumero;
                @XmlElement(name = "AgenteTransportistaNombre")
                protected String agenteTransportistaNombre;
                @XmlElement(name = "AgenteTransportistaPais")
                protected String agenteTransportistaPais;
                @XmlElement(name = "AgenteTransportistaDireccion")
                protected String agenteTransportistaDireccion;
                @XmlElement(name = "LugarPartida")
                protected String lugarPartida;
                @XmlElement(name = "LugarDestino")
                protected String lugarDestino;
                @XmlElement(name = "AduanaIngresoCodigo")
                protected String aduanaIngresoCodigo;
                @XmlElement(name = "AduanaSalidaCodigo")
                protected String aduanaSalidaCodigo;
                @XmlElement(name = "FechaPasajeFrontera")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar fechaPasajeFrontera;
                @XmlElement(name = "TractoraMatricula")
                protected String tractoraMatricula;
                @XmlElement(name = "RemolqueMatricula")
                protected String remolqueMatricula;
                @XmlElement(name = "SemiRemolqueMatricula")
                protected String semiRemolqueMatricula;
                @XmlElement(name = "TransportistaEfectivo")
                protected String transportistaEfectivo;
                @XmlElement(name = "AgenteTransportistaRepresentanteTipoDoc")
                protected String agenteTransportistaRepresentanteTipoDoc;
                @XmlElement(name = "AgenteTransportistaRepresentanteDoc")
                protected String agenteTransportistaRepresentanteDoc;
                @XmlElement(name = "PaisOrigenCodigo")
                protected String paisOrigenCodigo;
                @XmlElement(name = "PaisDestinoCodigo")
                protected String paisDestinoCodigo;
                @XmlElement(name = "TransportistaEfectivoRepresentanteTipoDoc")
                protected String transportistaEfectivoRepresentanteTipoDoc;
                @XmlElement(name = "TransportistaEfectivoRepresentanteDoc")
                protected String transportistaEfectivoRepresentanteDoc;
                @XmlElement(name = "TransportistaEfectivoTipoDocumento")
                protected String transportistaEfectivoTipoDocumento;
                @XmlElement(name = "TransportistaEfectivoDocumento")
                protected String transportistaEfectivoDocumento;
                @XmlElement(name = "RemolqueDuenoTipoDocumento")
                protected String remolqueDuenoTipoDocumento;
                @XmlElement(name = "RemolqueDuenoDocumento")
                protected String remolqueDuenoDocumento;
                @XmlElement(name = "Lastre")
                protected String lastre;
                @XmlElement(name = "ConductorNombre")
                protected String conductorNombre;
                @XmlElement(name = "ConductorTipoDocumento")
                protected String conductorTipoDocumento;
                @XmlElement(name = "ConductorDocumento")
                protected String conductorDocumento;
                @XmlElement(name = "FechaLlegadaPrevista")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar fechaLlegadaPrevista;
                @XmlElement(name = "PlazoOrigenDestino")
                @XmlSchemaType(name = "unsignedInt")
                protected Long plazoOrigenDestino;
                @XmlElement(name = "RutaDescripcion")
                protected String rutaDescripcion;
                @XmlElement(name = "CiudadPartidaCodigo")
                protected String ciudadPartidaCodigo;
                @XmlElement(name = "CiudadSalidaCodigo")
                protected String ciudadSalidaCodigo;
                @XmlElement(name = "CiudadEntradaCodigo")
                protected String ciudadEntradaCodigo;
                @XmlElement(name = "AduanaEntradaCodigo")
                protected String aduanaEntradaCodigo;
                @XmlElement(name = "LugarOperativoEntradaCodigo")
                protected String lugarOperativoEntradaCodigo;
                @XmlElement(name = "CiudadDestinoCodigo")
                protected String ciudadDestinoCodigo;
                @XmlElement(name = "AduanaDestinoCodigo")
                protected String aduanaDestinoCodigo;
                @XmlElement(name = "LugarOperativoDestinoCodigo")
                protected String lugarOperativoDestinoCodigo;
                @XmlElement(name = "PaisTrasbordoCodigo")
                protected String paisTrasbordoCodigo;
                @XmlElement(name = "CiudadTrasbordoCodigo")
                protected String ciudadTrasbordoCodigo;
                @XmlElement(name = "AduanaTrasbordoCodigo")
                protected String aduanaTrasbordoCodigo;
                @XmlElement(name = "LugarOperativoTrasbordoCodigo")
                protected String lugarOperativoTrasbordoCodigo;
                @XmlElement(name = "TransitoAduanero")
                protected String transitoAduanero;
                @XmlElement(name = "AgenteTransportistaRepresentanteDocExtranjero")
                protected String agenteTransportistaRepresentanteDocExtranjero;
                @XmlElement(name = "TransportistaEfectivoRepresentanteDocExtranjero")
                protected String transportistaEfectivoRepresentanteDocExtranjero;
                @XmlElement(name = "MedioTransporteCapacidadArrastre")
                protected BigDecimal medioTransporteCapacidadArrastre;
                @XmlElement(name = "MedioTransporteAnoFabricacion")
                @XmlSchemaType(name = "unsignedInt")
                protected Long medioTransporteAnoFabricacion;
                @XmlElement(name = "DocumentoPrecedenteTipo")
                protected String documentoPrecedenteTipo;
                @XmlElement(name = "MicPrecedenteTipoTransporte")
                protected String micPrecedenteTipoTransporte;
                @XmlElement(name = "MicPrecedenteTipo")
                protected String micPrecedenteTipo;
                @XmlElement(name = "MicPrecedenteNumero")
                protected String micPrecedenteNumero;
                @XmlElement(name = "MicPrecedenteRecinto")
                protected String micPrecedenteRecinto;
                @XmlElement(name = "MicPrecedenteFechaArribo")
                @XmlSchemaType(name = "unsignedInt")
                protected Long micPrecedenteFechaArribo;
                @XmlElement(name = "GexPrecedenteNumero")
                protected String gexPrecedenteNumero;
                @XmlElement(name = "MicCelularSMS")
                protected String micCelularSMS;
                @XmlElement(name = "Conocimientos")
                protected DAE.Objeto.Manifiestos.Manifiesto.Conocimientos conocimientos;
                @XmlElement(name = "Contenedores")
                protected DAE.Objeto.Manifiestos.Manifiesto.Contenedores contenedores;
                @XmlElement(name = "Precintos")
                protected DAE.Objeto.Manifiestos.Manifiesto.Precintos precintos;
                @XmlElement(name = "PaisesDePaso")
                protected DAE.Objeto.Manifiestos.Manifiesto.PaisesDePaso paisesDePaso;

                /**
                 * Obtiene el valor de la propiedad transporteTipo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransporteTipo() {
                    return transporteTipo;
                }

                /**
                 * Define el valor de la propiedad transporteTipo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTransporteTipo(String value) {
                    this.transporteTipo = value;
                }

                /**
                 * Obtiene el valor de la propiedad manifiestoTipo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getManifiestoTipo() {
                    return manifiestoTipo;
                }

                /**
                 * Define el valor de la propiedad manifiestoTipo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setManifiestoTipo(String value) {
                    this.manifiestoTipo = value;
                }

                /**
                 * Obtiene el valor de la propiedad manifiestoNumero.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getManifiestoNumero() {
                    return manifiestoNumero;
                }

                /**
                 * Define el valor de la propiedad manifiestoNumero.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setManifiestoNumero(String value) {
                    this.manifiestoNumero = value;
                }

                /**
                 * Obtiene el valor de la propiedad recinto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRecinto() {
                    return recinto;
                }

                /**
                 * Define el valor de la propiedad recinto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRecinto(String value) {
                    this.recinto = value;
                }

                /**
                 * Obtiene el valor de la propiedad fechaArribo.
                 * 
                 */
                public long getFechaArribo() {
                    return fechaArribo;
                }

                /**
                 * Define el valor de la propiedad fechaArribo.
                 * 
                 */
                public void setFechaArribo(long value) {
                    this.fechaArribo = value;
                }

                /**
                 * Obtiene el valor de la propiedad registroTipo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRegistroTipo() {
                    return registroTipo;
                }

                /**
                 * Define el valor de la propiedad registroTipo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRegistroTipo(String value) {
                    this.registroTipo = value;
                }

                /**
                 * Obtiene el valor de la propiedad agenteTransportistaTipoDocumento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAgenteTransportistaTipoDocumento() {
                    return agenteTransportistaTipoDocumento;
                }

                /**
                 * Define el valor de la propiedad agenteTransportistaTipoDocumento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAgenteTransportistaTipoDocumento(String value) {
                    this.agenteTransportistaTipoDocumento = value;
                }

                /**
                 * Obtiene el valor de la propiedad agenteTransportistaDocumento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAgenteTransportistaDocumento() {
                    return agenteTransportistaDocumento;
                }

                /**
                 * Define el valor de la propiedad agenteTransportistaDocumento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAgenteTransportistaDocumento(String value) {
                    this.agenteTransportistaDocumento = value;
                }

                /**
                 * Obtiene el valor de la propiedad lugarPartidaCodigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLugarPartidaCodigo() {
                    return lugarPartidaCodigo;
                }

                /**
                 * Define el valor de la propiedad lugarPartidaCodigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLugarPartidaCodigo(String value) {
                    this.lugarPartidaCodigo = value;
                }

                /**
                 * Obtiene el valor de la propiedad lugarDestinoCodigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLugarDestinoCodigo() {
                    return lugarDestinoCodigo;
                }

                /**
                 * Define el valor de la propiedad lugarDestinoCodigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLugarDestinoCodigo(String value) {
                    this.lugarDestinoCodigo = value;
                }

                /**
                 * Obtiene el valor de la propiedad ultimoPuerto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUltimoPuerto() {
                    return ultimoPuerto;
                }

                /**
                 * Define el valor de la propiedad ultimoPuerto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUltimoPuerto(String value) {
                    this.ultimoPuerto = value;
                }

                /**
                 * Obtiene el valor de la propiedad medioTransporteMatricula.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMedioTransporteMatricula() {
                    return medioTransporteMatricula;
                }

                /**
                 * Define el valor de la propiedad medioTransporteMatricula.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMedioTransporteMatricula(String value) {
                    this.medioTransporteMatricula = value;
                }

                /**
                 * Obtiene el valor de la propiedad medioTransporteNacionalidad.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMedioTransporteNacionalidad() {
                    return medioTransporteNacionalidad;
                }

                /**
                 * Define el valor de la propiedad medioTransporteNacionalidad.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMedioTransporteNacionalidad(String value) {
                    this.medioTransporteNacionalidad = value;
                }

                /**
                 * Obtiene el valor de la propiedad fechaLlegada.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getFechaLlegada() {
                    return fechaLlegada;
                }

                /**
                 * Define el valor de la propiedad fechaLlegada.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setFechaLlegada(XMLGregorianCalendar value) {
                    this.fechaLlegada = value;
                }

                /**
                 * Obtiene el valor de la propiedad fechaSalida.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getFechaSalida() {
                    return fechaSalida;
                }

                /**
                 * Define el valor de la propiedad fechaSalida.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setFechaSalida(XMLGregorianCalendar value) {
                    this.fechaSalida = value;
                }

                /**
                 * Obtiene el valor de la propiedad observacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getObservacion() {
                    return observacion;
                }

                /**
                 * Define el valor de la propiedad observacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setObservacion(String value) {
                    this.observacion = value;
                }

                /**
                 * Obtiene el valor de la propiedad medioTransporteNombre.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMedioTransporteNombre() {
                    return medioTransporteNombre;
                }

                /**
                 * Define el valor de la propiedad medioTransporteNombre.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMedioTransporteNombre(String value) {
                    this.medioTransporteNombre = value;
                }

                /**
                 * Obtiene el valor de la propiedad fechaFinCargaDescarga.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getFechaFinCargaDescarga() {
                    return fechaFinCargaDescarga;
                }

                /**
                 * Define el valor de la propiedad fechaFinCargaDescarga.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setFechaFinCargaDescarga(XMLGregorianCalendar value) {
                    this.fechaFinCargaDescarga = value;
                }

                /**
                 * Obtiene el valor de la propiedad viajeNumero.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getViajeNumero() {
                    return viajeNumero;
                }

                /**
                 * Define el valor de la propiedad viajeNumero.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setViajeNumero(String value) {
                    this.viajeNumero = value;
                }

                /**
                 * Obtiene el valor de la propiedad operacionTipo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOperacionTipo() {
                    return operacionTipo;
                }

                /**
                 * Define el valor de la propiedad operacionTipo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOperacionTipo(String value) {
                    this.operacionTipo = value;
                }

                /**
                 * Obtiene el valor de la propiedad manifiestoOriginalNumero.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getManifiestoOriginalNumero() {
                    return manifiestoOriginalNumero;
                }

                /**
                 * Define el valor de la propiedad manifiestoOriginalNumero.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setManifiestoOriginalNumero(String value) {
                    this.manifiestoOriginalNumero = value;
                }

                /**
                 * Obtiene el valor de la propiedad agenteTransportistaNombre.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAgenteTransportistaNombre() {
                    return agenteTransportistaNombre;
                }

                /**
                 * Define el valor de la propiedad agenteTransportistaNombre.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAgenteTransportistaNombre(String value) {
                    this.agenteTransportistaNombre = value;
                }

                /**
                 * Obtiene el valor de la propiedad agenteTransportistaPais.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAgenteTransportistaPais() {
                    return agenteTransportistaPais;
                }

                /**
                 * Define el valor de la propiedad agenteTransportistaPais.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAgenteTransportistaPais(String value) {
                    this.agenteTransportistaPais = value;
                }

                /**
                 * Obtiene el valor de la propiedad agenteTransportistaDireccion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAgenteTransportistaDireccion() {
                    return agenteTransportistaDireccion;
                }

                /**
                 * Define el valor de la propiedad agenteTransportistaDireccion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAgenteTransportistaDireccion(String value) {
                    this.agenteTransportistaDireccion = value;
                }

                /**
                 * Obtiene el valor de la propiedad lugarPartida.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLugarPartida() {
                    return lugarPartida;
                }

                /**
                 * Define el valor de la propiedad lugarPartida.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLugarPartida(String value) {
                    this.lugarPartida = value;
                }

                /**
                 * Obtiene el valor de la propiedad lugarDestino.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLugarDestino() {
                    return lugarDestino;
                }

                /**
                 * Define el valor de la propiedad lugarDestino.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLugarDestino(String value) {
                    this.lugarDestino = value;
                }

                /**
                 * Obtiene el valor de la propiedad aduanaIngresoCodigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAduanaIngresoCodigo() {
                    return aduanaIngresoCodigo;
                }

                /**
                 * Define el valor de la propiedad aduanaIngresoCodigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAduanaIngresoCodigo(String value) {
                    this.aduanaIngresoCodigo = value;
                }

                /**
                 * Obtiene el valor de la propiedad aduanaSalidaCodigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAduanaSalidaCodigo() {
                    return aduanaSalidaCodigo;
                }

                /**
                 * Define el valor de la propiedad aduanaSalidaCodigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAduanaSalidaCodigo(String value) {
                    this.aduanaSalidaCodigo = value;
                }

                /**
                 * Obtiene el valor de la propiedad fechaPasajeFrontera.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getFechaPasajeFrontera() {
                    return fechaPasajeFrontera;
                }

                /**
                 * Define el valor de la propiedad fechaPasajeFrontera.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setFechaPasajeFrontera(XMLGregorianCalendar value) {
                    this.fechaPasajeFrontera = value;
                }

                /**
                 * Obtiene el valor de la propiedad tractoraMatricula.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTractoraMatricula() {
                    return tractoraMatricula;
                }

                /**
                 * Define el valor de la propiedad tractoraMatricula.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTractoraMatricula(String value) {
                    this.tractoraMatricula = value;
                }

                /**
                 * Obtiene el valor de la propiedad remolqueMatricula.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRemolqueMatricula() {
                    return remolqueMatricula;
                }

                /**
                 * Define el valor de la propiedad remolqueMatricula.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRemolqueMatricula(String value) {
                    this.remolqueMatricula = value;
                }

                /**
                 * Obtiene el valor de la propiedad semiRemolqueMatricula.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSemiRemolqueMatricula() {
                    return semiRemolqueMatricula;
                }

                /**
                 * Define el valor de la propiedad semiRemolqueMatricula.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSemiRemolqueMatricula(String value) {
                    this.semiRemolqueMatricula = value;
                }

                /**
                 * Obtiene el valor de la propiedad transportistaEfectivo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransportistaEfectivo() {
                    return transportistaEfectivo;
                }

                /**
                 * Define el valor de la propiedad transportistaEfectivo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTransportistaEfectivo(String value) {
                    this.transportistaEfectivo = value;
                }

                /**
                 * Obtiene el valor de la propiedad agenteTransportistaRepresentanteTipoDoc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAgenteTransportistaRepresentanteTipoDoc() {
                    return agenteTransportistaRepresentanteTipoDoc;
                }

                /**
                 * Define el valor de la propiedad agenteTransportistaRepresentanteTipoDoc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAgenteTransportistaRepresentanteTipoDoc(String value) {
                    this.agenteTransportistaRepresentanteTipoDoc = value;
                }

                /**
                 * Obtiene el valor de la propiedad agenteTransportistaRepresentanteDoc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAgenteTransportistaRepresentanteDoc() {
                    return agenteTransportistaRepresentanteDoc;
                }

                /**
                 * Define el valor de la propiedad agenteTransportistaRepresentanteDoc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAgenteTransportistaRepresentanteDoc(String value) {
                    this.agenteTransportistaRepresentanteDoc = value;
                }

                /**
                 * Obtiene el valor de la propiedad paisOrigenCodigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPaisOrigenCodigo() {
                    return paisOrigenCodigo;
                }

                /**
                 * Define el valor de la propiedad paisOrigenCodigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPaisOrigenCodigo(String value) {
                    this.paisOrigenCodigo = value;
                }

                /**
                 * Obtiene el valor de la propiedad paisDestinoCodigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPaisDestinoCodigo() {
                    return paisDestinoCodigo;
                }

                /**
                 * Define el valor de la propiedad paisDestinoCodigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPaisDestinoCodigo(String value) {
                    this.paisDestinoCodigo = value;
                }

                /**
                 * Obtiene el valor de la propiedad transportistaEfectivoRepresentanteTipoDoc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransportistaEfectivoRepresentanteTipoDoc() {
                    return transportistaEfectivoRepresentanteTipoDoc;
                }

                /**
                 * Define el valor de la propiedad transportistaEfectivoRepresentanteTipoDoc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTransportistaEfectivoRepresentanteTipoDoc(String value) {
                    this.transportistaEfectivoRepresentanteTipoDoc = value;
                }

                /**
                 * Obtiene el valor de la propiedad transportistaEfectivoRepresentanteDoc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransportistaEfectivoRepresentanteDoc() {
                    return transportistaEfectivoRepresentanteDoc;
                }

                /**
                 * Define el valor de la propiedad transportistaEfectivoRepresentanteDoc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTransportistaEfectivoRepresentanteDoc(String value) {
                    this.transportistaEfectivoRepresentanteDoc = value;
                }

                /**
                 * Obtiene el valor de la propiedad transportistaEfectivoTipoDocumento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransportistaEfectivoTipoDocumento() {
                    return transportistaEfectivoTipoDocumento;
                }

                /**
                 * Define el valor de la propiedad transportistaEfectivoTipoDocumento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTransportistaEfectivoTipoDocumento(String value) {
                    this.transportistaEfectivoTipoDocumento = value;
                }

                /**
                 * Obtiene el valor de la propiedad transportistaEfectivoDocumento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransportistaEfectivoDocumento() {
                    return transportistaEfectivoDocumento;
                }

                /**
                 * Define el valor de la propiedad transportistaEfectivoDocumento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTransportistaEfectivoDocumento(String value) {
                    this.transportistaEfectivoDocumento = value;
                }

                /**
                 * Obtiene el valor de la propiedad remolqueDuenoTipoDocumento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRemolqueDuenoTipoDocumento() {
                    return remolqueDuenoTipoDocumento;
                }

                /**
                 * Define el valor de la propiedad remolqueDuenoTipoDocumento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRemolqueDuenoTipoDocumento(String value) {
                    this.remolqueDuenoTipoDocumento = value;
                }

                /**
                 * Obtiene el valor de la propiedad remolqueDuenoDocumento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRemolqueDuenoDocumento() {
                    return remolqueDuenoDocumento;
                }

                /**
                 * Define el valor de la propiedad remolqueDuenoDocumento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRemolqueDuenoDocumento(String value) {
                    this.remolqueDuenoDocumento = value;
                }

                /**
                 * Obtiene el valor de la propiedad lastre.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLastre() {
                    return lastre;
                }

                /**
                 * Define el valor de la propiedad lastre.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLastre(String value) {
                    this.lastre = value;
                }

                /**
                 * Obtiene el valor de la propiedad conductorNombre.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConductorNombre() {
                    return conductorNombre;
                }

                /**
                 * Define el valor de la propiedad conductorNombre.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConductorNombre(String value) {
                    this.conductorNombre = value;
                }

                /**
                 * Obtiene el valor de la propiedad conductorTipoDocumento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConductorTipoDocumento() {
                    return conductorTipoDocumento;
                }

                /**
                 * Define el valor de la propiedad conductorTipoDocumento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConductorTipoDocumento(String value) {
                    this.conductorTipoDocumento = value;
                }

                /**
                 * Obtiene el valor de la propiedad conductorDocumento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConductorDocumento() {
                    return conductorDocumento;
                }

                /**
                 * Define el valor de la propiedad conductorDocumento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConductorDocumento(String value) {
                    this.conductorDocumento = value;
                }

                /**
                 * Obtiene el valor de la propiedad fechaLlegadaPrevista.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getFechaLlegadaPrevista() {
                    return fechaLlegadaPrevista;
                }

                /**
                 * Define el valor de la propiedad fechaLlegadaPrevista.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setFechaLlegadaPrevista(XMLGregorianCalendar value) {
                    this.fechaLlegadaPrevista = value;
                }

                /**
                 * Obtiene el valor de la propiedad plazoOrigenDestino.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getPlazoOrigenDestino() {
                    return plazoOrigenDestino;
                }

                /**
                 * Define el valor de la propiedad plazoOrigenDestino.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setPlazoOrigenDestino(Long value) {
                    this.plazoOrigenDestino = value;
                }

                /**
                 * Obtiene el valor de la propiedad rutaDescripcion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRutaDescripcion() {
                    return rutaDescripcion;
                }

                /**
                 * Define el valor de la propiedad rutaDescripcion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRutaDescripcion(String value) {
                    this.rutaDescripcion = value;
                }

                /**
                 * Obtiene el valor de la propiedad ciudadPartidaCodigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCiudadPartidaCodigo() {
                    return ciudadPartidaCodigo;
                }

                /**
                 * Define el valor de la propiedad ciudadPartidaCodigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCiudadPartidaCodigo(String value) {
                    this.ciudadPartidaCodigo = value;
                }

                /**
                 * Obtiene el valor de la propiedad ciudadSalidaCodigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCiudadSalidaCodigo() {
                    return ciudadSalidaCodigo;
                }

                /**
                 * Define el valor de la propiedad ciudadSalidaCodigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCiudadSalidaCodigo(String value) {
                    this.ciudadSalidaCodigo = value;
                }

                /**
                 * Obtiene el valor de la propiedad ciudadEntradaCodigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCiudadEntradaCodigo() {
                    return ciudadEntradaCodigo;
                }

                /**
                 * Define el valor de la propiedad ciudadEntradaCodigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCiudadEntradaCodigo(String value) {
                    this.ciudadEntradaCodigo = value;
                }

                /**
                 * Obtiene el valor de la propiedad aduanaEntradaCodigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAduanaEntradaCodigo() {
                    return aduanaEntradaCodigo;
                }

                /**
                 * Define el valor de la propiedad aduanaEntradaCodigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAduanaEntradaCodigo(String value) {
                    this.aduanaEntradaCodigo = value;
                }

                /**
                 * Obtiene el valor de la propiedad lugarOperativoEntradaCodigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLugarOperativoEntradaCodigo() {
                    return lugarOperativoEntradaCodigo;
                }

                /**
                 * Define el valor de la propiedad lugarOperativoEntradaCodigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLugarOperativoEntradaCodigo(String value) {
                    this.lugarOperativoEntradaCodigo = value;
                }

                /**
                 * Obtiene el valor de la propiedad ciudadDestinoCodigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCiudadDestinoCodigo() {
                    return ciudadDestinoCodigo;
                }

                /**
                 * Define el valor de la propiedad ciudadDestinoCodigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCiudadDestinoCodigo(String value) {
                    this.ciudadDestinoCodigo = value;
                }

                /**
                 * Obtiene el valor de la propiedad aduanaDestinoCodigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAduanaDestinoCodigo() {
                    return aduanaDestinoCodigo;
                }

                /**
                 * Define el valor de la propiedad aduanaDestinoCodigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAduanaDestinoCodigo(String value) {
                    this.aduanaDestinoCodigo = value;
                }

                /**
                 * Obtiene el valor de la propiedad lugarOperativoDestinoCodigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLugarOperativoDestinoCodigo() {
                    return lugarOperativoDestinoCodigo;
                }

                /**
                 * Define el valor de la propiedad lugarOperativoDestinoCodigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLugarOperativoDestinoCodigo(String value) {
                    this.lugarOperativoDestinoCodigo = value;
                }

                /**
                 * Obtiene el valor de la propiedad paisTrasbordoCodigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPaisTrasbordoCodigo() {
                    return paisTrasbordoCodigo;
                }

                /**
                 * Define el valor de la propiedad paisTrasbordoCodigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPaisTrasbordoCodigo(String value) {
                    this.paisTrasbordoCodigo = value;
                }

                /**
                 * Obtiene el valor de la propiedad ciudadTrasbordoCodigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCiudadTrasbordoCodigo() {
                    return ciudadTrasbordoCodigo;
                }

                /**
                 * Define el valor de la propiedad ciudadTrasbordoCodigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCiudadTrasbordoCodigo(String value) {
                    this.ciudadTrasbordoCodigo = value;
                }

                /**
                 * Obtiene el valor de la propiedad aduanaTrasbordoCodigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAduanaTrasbordoCodigo() {
                    return aduanaTrasbordoCodigo;
                }

                /**
                 * Define el valor de la propiedad aduanaTrasbordoCodigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAduanaTrasbordoCodigo(String value) {
                    this.aduanaTrasbordoCodigo = value;
                }

                /**
                 * Obtiene el valor de la propiedad lugarOperativoTrasbordoCodigo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLugarOperativoTrasbordoCodigo() {
                    return lugarOperativoTrasbordoCodigo;
                }

                /**
                 * Define el valor de la propiedad lugarOperativoTrasbordoCodigo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLugarOperativoTrasbordoCodigo(String value) {
                    this.lugarOperativoTrasbordoCodigo = value;
                }

                /**
                 * Obtiene el valor de la propiedad transitoAduanero.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransitoAduanero() {
                    return transitoAduanero;
                }

                /**
                 * Define el valor de la propiedad transitoAduanero.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTransitoAduanero(String value) {
                    this.transitoAduanero = value;
                }

                /**
                 * Obtiene el valor de la propiedad agenteTransportistaRepresentanteDocExtranjero.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAgenteTransportistaRepresentanteDocExtranjero() {
                    return agenteTransportistaRepresentanteDocExtranjero;
                }

                /**
                 * Define el valor de la propiedad agenteTransportistaRepresentanteDocExtranjero.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAgenteTransportistaRepresentanteDocExtranjero(String value) {
                    this.agenteTransportistaRepresentanteDocExtranjero = value;
                }

                /**
                 * Obtiene el valor de la propiedad transportistaEfectivoRepresentanteDocExtranjero.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTransportistaEfectivoRepresentanteDocExtranjero() {
                    return transportistaEfectivoRepresentanteDocExtranjero;
                }

                /**
                 * Define el valor de la propiedad transportistaEfectivoRepresentanteDocExtranjero.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTransportistaEfectivoRepresentanteDocExtranjero(String value) {
                    this.transportistaEfectivoRepresentanteDocExtranjero = value;
                }

                /**
                 * Obtiene el valor de la propiedad medioTransporteCapacidadArrastre.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getMedioTransporteCapacidadArrastre() {
                    return medioTransporteCapacidadArrastre;
                }

                /**
                 * Define el valor de la propiedad medioTransporteCapacidadArrastre.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setMedioTransporteCapacidadArrastre(BigDecimal value) {
                    this.medioTransporteCapacidadArrastre = value;
                }

                /**
                 * Obtiene el valor de la propiedad medioTransporteAnoFabricacion.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getMedioTransporteAnoFabricacion() {
                    return medioTransporteAnoFabricacion;
                }

                /**
                 * Define el valor de la propiedad medioTransporteAnoFabricacion.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setMedioTransporteAnoFabricacion(Long value) {
                    this.medioTransporteAnoFabricacion = value;
                }

                /**
                 * Obtiene el valor de la propiedad documentoPrecedenteTipo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDocumentoPrecedenteTipo() {
                    return documentoPrecedenteTipo;
                }

                /**
                 * Define el valor de la propiedad documentoPrecedenteTipo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDocumentoPrecedenteTipo(String value) {
                    this.documentoPrecedenteTipo = value;
                }

                /**
                 * Obtiene el valor de la propiedad micPrecedenteTipoTransporte.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMicPrecedenteTipoTransporte() {
                    return micPrecedenteTipoTransporte;
                }

                /**
                 * Define el valor de la propiedad micPrecedenteTipoTransporte.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMicPrecedenteTipoTransporte(String value) {
                    this.micPrecedenteTipoTransporte = value;
                }

                /**
                 * Obtiene el valor de la propiedad micPrecedenteTipo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMicPrecedenteTipo() {
                    return micPrecedenteTipo;
                }

                /**
                 * Define el valor de la propiedad micPrecedenteTipo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMicPrecedenteTipo(String value) {
                    this.micPrecedenteTipo = value;
                }

                /**
                 * Obtiene el valor de la propiedad micPrecedenteNumero.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMicPrecedenteNumero() {
                    return micPrecedenteNumero;
                }

                /**
                 * Define el valor de la propiedad micPrecedenteNumero.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMicPrecedenteNumero(String value) {
                    this.micPrecedenteNumero = value;
                }

                /**
                 * Obtiene el valor de la propiedad micPrecedenteRecinto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMicPrecedenteRecinto() {
                    return micPrecedenteRecinto;
                }

                /**
                 * Define el valor de la propiedad micPrecedenteRecinto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMicPrecedenteRecinto(String value) {
                    this.micPrecedenteRecinto = value;
                }

                /**
                 * Obtiene el valor de la propiedad micPrecedenteFechaArribo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Long }
                 *     
                 */
                public Long getMicPrecedenteFechaArribo() {
                    return micPrecedenteFechaArribo;
                }

                /**
                 * Define el valor de la propiedad micPrecedenteFechaArribo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Long }
                 *     
                 */
                public void setMicPrecedenteFechaArribo(Long value) {
                    this.micPrecedenteFechaArribo = value;
                }

                /**
                 * Obtiene el valor de la propiedad gexPrecedenteNumero.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGexPrecedenteNumero() {
                    return gexPrecedenteNumero;
                }

                /**
                 * Define el valor de la propiedad gexPrecedenteNumero.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGexPrecedenteNumero(String value) {
                    this.gexPrecedenteNumero = value;
                }
                
                /**
                 * Obtiene el valor de la propiedad micCelularSMS.
                 * 
                 * @return
                 *     posible object is
                 *     {@link String}
                 */
                public String getMicCelularSMS() {
                	return micCelularSMS;
                }
                
                /**
                 * Define el valor de la propiedad micCelularSMS
                 * 
                 * @param value
                 *      allowed object is
                 *      {@link String}
                 *      
                 */
                public void setMicCelularSMS(String value) {
                	this.micCelularSMS = value;
                }

                /**
                 * Obtiene el valor de la propiedad conocimientos.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DAE.Objeto.Manifiestos.Manifiesto.Conocimientos }
                 *     
                 */
                public DAE.Objeto.Manifiestos.Manifiesto.Conocimientos getConocimientos() {
                    return conocimientos;
                }

                /**
                 * Define el valor de la propiedad conocimientos.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DAE.Objeto.Manifiestos.Manifiesto.Conocimientos }
                 *     
                 */
                public void setConocimientos(DAE.Objeto.Manifiestos.Manifiesto.Conocimientos value) {
                    this.conocimientos = value;
                }

                /**
                 * Obtiene el valor de la propiedad contenedores.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DAE.Objeto.Manifiestos.Manifiesto.Contenedores }
                 *     
                 */
                public DAE.Objeto.Manifiestos.Manifiesto.Contenedores getContenedores() {
                    return contenedores;
                }

                /**
                 * Define el valor de la propiedad contenedores.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DAE.Objeto.Manifiestos.Manifiesto.Contenedores }
                 *     
                 */
                public void setContenedores(DAE.Objeto.Manifiestos.Manifiesto.Contenedores value) {
                    this.contenedores = value;
                }

                /**
                 * Obtiene el valor de la propiedad precintos.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DAE.Objeto.Manifiestos.Manifiesto.Precintos }
                 *     
                 */
                public DAE.Objeto.Manifiestos.Manifiesto.Precintos getPrecintos() {
                    return precintos;
                }

                /**
                 * Define el valor de la propiedad precintos.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DAE.Objeto.Manifiestos.Manifiesto.Precintos }
                 *     
                 */
                public void setPrecintos(DAE.Objeto.Manifiestos.Manifiesto.Precintos value) {
                    this.precintos = value;
                }

                /**
                 * Obtiene el valor de la propiedad paisesDePaso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DAE.Objeto.Manifiestos.Manifiesto.PaisesDePaso }
                 *     
                 */
                public DAE.Objeto.Manifiestos.Manifiesto.PaisesDePaso getPaisesDePaso() {
                    return paisesDePaso;
                }

                /**
                 * Define el valor de la propiedad paisesDePaso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DAE.Objeto.Manifiestos.Manifiesto.PaisesDePaso }
                 *     
                 */
                public void setPaisesDePaso(DAE.Objeto.Manifiestos.Manifiesto.PaisesDePaso value) {
                    this.paisesDePaso = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Conocimiento" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ConocimientoNumeroSecuencial" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
                 *                   &lt;element name="ConocimientoOriginalNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="PuertoEmbarque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="ConocimientoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="ConocimientoMasterNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="PuertoDescarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="ConsignatarioTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="ConsignatarioDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="ConsignatarioNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="EndosoFecha" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *                   &lt;element name="EndosoLugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="MercaderiaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="RemitenteTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="RemitenteDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="RemitenteNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="RemitenteDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="DestinatarioTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="DestinatarioDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="DestinatarioNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="DestinatarioDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="MercaderiaDestinoFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="MercaderiaPeligrosa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="FleteMonto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                   &lt;element name="SeguroMonto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                   &lt;element name="Consolidado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Fraccionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Lineas" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Linea" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="LineaNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
                 *                                       &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                       &lt;element name="PesoBruto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                                       &lt;element name="BultoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                       &lt;element name="BultoCantidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                                       &lt;element name="Marcas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                       &lt;element name="MercaderiaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                       &lt;element name="DepositoFinalCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                       &lt;element name="MercaderiaPeligrosaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                       &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                       &lt;element name="ActaTexto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                       &lt;element name="ActaNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
                 *                                       &lt;element name="ValorDeclaradoImporte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                                       &lt;element name="ValorDeclaradoMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                       &lt;element name="ContenedoresLinea" minOccurs="0">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="ContenedorLinea" maxOccurs="unbounded" minOccurs="0">
                 *                                                   &lt;complexType>
                 *                                                     &lt;complexContent>
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                         &lt;sequence>
                 *                                                           &lt;element name="ContenedorNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                           &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                                           &lt;element name="CantidadBultos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                                                         &lt;/sequence>
                 *                                                       &lt;/restriction>
                 *                                                     &lt;/complexContent>
                 *                                                   &lt;/complexType>
                 *                                                 &lt;/element>
                 *                                               &lt;/sequence>
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="Asociaciones" minOccurs="0">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="Asociacion" maxOccurs="unbounded" minOccurs="0">
                 *                                                   &lt;complexType>
                 *                                                     &lt;complexContent>
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                         &lt;sequence>
                 *                                                           &lt;element name="DocumentoCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                           &lt;element name="DocumentoNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                           &lt;element name="DocumentoAduanaCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                           &lt;element name="DocumentoAno" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                           &lt;element name="DocumentoLinea" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                           &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                                           &lt;element name="BultoCantidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                                                           &lt;element name="BultoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                                         &lt;/sequence>
                 *                                                       &lt;/restriction>
                 *                                                     &lt;/complexContent>
                 *                                                   &lt;/complexType>
                 *                                                 &lt;/element>
                 *                                               &lt;/sequence>
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="Imagenes" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="Imagen" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="ImagenNumeroSecuencial" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
                 *                                       &lt;element name="ImagenNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
                 *                                       &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "conocimiento"
                })
                public static class Conocimientos {

                    @XmlElement(name = "Conocimiento")
                    protected List<DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento> conocimiento;

                    /**
                     * Gets the value of the conocimiento property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the conocimiento property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getConocimiento().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento }
                     * 
                     * 
                     */
                    public List<DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento> getConocimiento() {
                        if (conocimiento == null) {
                            conocimiento = new ArrayList<DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento>();
                        }
                        return this.conocimiento;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="ConocimientoNumeroSecuencial" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
                     *         &lt;element name="ConocimientoOriginalNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="PuertoEmbarque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="ConocimientoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="ConocimientoMasterNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="PuertoDescarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="ConsignatarioTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="ConsignatarioDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="ConsignatarioNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="EndosoFecha" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                     *         &lt;element name="EndosoLugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="MercaderiaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="RemitenteTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="RemitenteDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="RemitenteNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="RemitenteDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="DestinatarioTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="DestinatarioDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="DestinatarioNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="DestinatarioDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="MercaderiaDestinoFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="MercaderiaPeligrosa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="FleteMonto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *         &lt;element name="SeguroMonto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *         &lt;element name="Consolidado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Fraccionado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Lineas" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Linea" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="LineaNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
                     *                             &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                             &lt;element name="PesoBruto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                             &lt;element name="BultoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                             &lt;element name="BultoCantidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                             &lt;element name="Marcas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                             &lt;element name="MercaderiaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                             &lt;element name="DepositoFinalCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                             &lt;element name="MercaderiaPeligrosaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                             &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                             &lt;element name="ActaTexto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                             &lt;element name="ActaNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
                     *                             &lt;element name="ValorDeclaradoImporte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                             &lt;element name="ValorDeclaradoMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                             &lt;element name="ContenedoresLinea" minOccurs="0">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="ContenedorLinea" maxOccurs="unbounded" minOccurs="0">
                     *                                         &lt;complexType>
                     *                                           &lt;complexContent>
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                               &lt;sequence>
                     *                                                 &lt;element name="ContenedorNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                                 &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                                                 &lt;element name="CantidadBultos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                                               &lt;/sequence>
                     *                                             &lt;/restriction>
                     *                                           &lt;/complexContent>
                     *                                         &lt;/complexType>
                     *                                       &lt;/element>
                     *                                     &lt;/sequence>
                     *                                   &lt;/restriction>
                     *                                 &lt;/complexContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                             &lt;element name="Asociaciones" minOccurs="0">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="Asociacion" maxOccurs="unbounded" minOccurs="0">
                     *                                         &lt;complexType>
                     *                                           &lt;complexContent>
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                               &lt;sequence>
                     *                                                 &lt;element name="DocumentoCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                                 &lt;element name="DocumentoNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                                 &lt;element name="DocumentoAduanaCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                                 &lt;element name="DocumentoAno" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                                 &lt;element name="DocumentoLinea" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                                 &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                                                 &lt;element name="BultoCantidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *                                                 &lt;element name="BultoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                                               &lt;/sequence>
                     *                                             &lt;/restriction>
                     *                                           &lt;/complexContent>
                     *                                         &lt;/complexType>
                     *                                       &lt;/element>
                     *                                     &lt;/sequence>
                     *                                   &lt;/restriction>
                     *                                 &lt;/complexContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="Imagenes" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="Imagen" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="ImagenNumeroSecuencial" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
                     *                             &lt;element name="ImagenNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
                     *                             &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "conocimientoNumeroSecuencial",
                        "conocimientoOriginalNumero",
                        "puertoEmbarque",
                        "registroTipo",
                        "operacionTipo",
                        "conocimientoTipo",
                        "conocimientoMasterNumero",
                        "puertoDescarga",
                        "consignatarioTipoDocumento",
                        "consignatarioDocumento",
                        "consignatarioNombre",
                        "endosoFecha",
                        "endosoLugar",
                        "mercaderiaDestino",
                        "remitenteTipoDocumento",
                        "remitenteDocumento",
                        "remitenteNombre",
                        "remitenteDireccion",
                        "destinatarioTipoDocumento",
                        "destinatarioDocumento",
                        "destinatarioNombre",
                        "destinatarioDireccion",
                        "mercaderiaDestinoFinal",
                        "mercaderiaPeligrosa",
                        "fleteMonto",
                        "seguroMonto",
                        "consolidado",
                        "fraccionado",
                        "lineas",
                        "imagenes"
                    })
                    public static class Conocimiento {

                        @XmlElement(name = "ConocimientoNumeroSecuencial")
                        @XmlSchemaType(name = "unsignedInt")
                        protected long conocimientoNumeroSecuencial;
                        @XmlElement(name = "ConocimientoOriginalNumero")
                        protected String conocimientoOriginalNumero;
                        @XmlElement(name = "PuertoEmbarque")
                        protected String puertoEmbarque;
                        @XmlElement(name = "RegistroTipo")
                        protected String registroTipo;
                        @XmlElement(name = "OperacionTipo")
                        protected String operacionTipo;
                        @XmlElement(name = "ConocimientoTipo")
                        protected String conocimientoTipo;
                        @XmlElement(name = "ConocimientoMasterNumero")
                        protected String conocimientoMasterNumero;
                        @XmlElement(name = "PuertoDescarga")
                        protected String puertoDescarga;
                        @XmlElement(name = "ConsignatarioTipoDocumento")
                        protected String consignatarioTipoDocumento;
                        @XmlElement(name = "ConsignatarioDocumento")
                        protected String consignatarioDocumento;
                        @XmlElement(name = "ConsignatarioNombre")
                        protected String consignatarioNombre;
                        @XmlElement(name = "EndosoFecha")
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar endosoFecha;
                        @XmlElement(name = "EndosoLugar")
                        protected String endosoLugar;
                        @XmlElement(name = "MercaderiaDestino")
                        protected String mercaderiaDestino;
                        @XmlElement(name = "RemitenteTipoDocumento")
                        protected String remitenteTipoDocumento;
                        @XmlElement(name = "RemitenteDocumento")
                        protected String remitenteDocumento;
                        @XmlElement(name = "RemitenteNombre")
                        protected String remitenteNombre;
                        @XmlElement(name = "RemitenteDireccion")
                        protected String remitenteDireccion;
                        @XmlElement(name = "DestinatarioTipoDocumento")
                        protected String destinatarioTipoDocumento;
                        @XmlElement(name = "DestinatarioDocumento")
                        protected String destinatarioDocumento;
                        @XmlElement(name = "DestinatarioNombre")
                        protected String destinatarioNombre;
                        @XmlElement(name = "DestinatarioDireccion")
                        protected String destinatarioDireccion;
                        @XmlElement(name = "MercaderiaDestinoFinal")
                        protected String mercaderiaDestinoFinal;
                        @XmlElement(name = "MercaderiaPeligrosa")
                        protected String mercaderiaPeligrosa;
                        @XmlElement(name = "FleteMonto")
                        protected BigDecimal fleteMonto;
                        @XmlElement(name = "SeguroMonto")
                        protected BigDecimal seguroMonto;
                        @XmlElement(name = "Consolidado")
                        protected String consolidado;
                        @XmlElement(name = "Fraccionado")
                        protected String fraccionado;
                        @XmlElement(name = "Lineas")
                        protected DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas lineas;
                        @XmlElement(name = "Imagenes")
                        protected DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Imagenes imagenes;

                        /**
                         * Obtiene el valor de la propiedad conocimientoNumeroSecuencial.
                         * 
                         */
                        public long getConocimientoNumeroSecuencial() {
                            return conocimientoNumeroSecuencial;
                        }

                        /**
                         * Define el valor de la propiedad conocimientoNumeroSecuencial.
                         * 
                         */
                        public void setConocimientoNumeroSecuencial(long value) {
                            this.conocimientoNumeroSecuencial = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad conocimientoOriginalNumero.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getConocimientoOriginalNumero() {
                            return conocimientoOriginalNumero;
                        }

                        /**
                         * Define el valor de la propiedad conocimientoOriginalNumero.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setConocimientoOriginalNumero(String value) {
                            this.conocimientoOriginalNumero = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad puertoEmbarque.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPuertoEmbarque() {
                            return puertoEmbarque;
                        }

                        /**
                         * Define el valor de la propiedad puertoEmbarque.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPuertoEmbarque(String value) {
                            this.puertoEmbarque = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad registroTipo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRegistroTipo() {
                            return registroTipo;
                        }

                        /**
                         * Define el valor de la propiedad registroTipo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRegistroTipo(String value) {
                            this.registroTipo = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad operacionTipo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOperacionTipo() {
                            return operacionTipo;
                        }

                        /**
                         * Define el valor de la propiedad operacionTipo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOperacionTipo(String value) {
                            this.operacionTipo = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad conocimientoTipo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getConocimientoTipo() {
                            return conocimientoTipo;
                        }

                        /**
                         * Define el valor de la propiedad conocimientoTipo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setConocimientoTipo(String value) {
                            this.conocimientoTipo = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad conocimientoMasterNumero.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getConocimientoMasterNumero() {
                            return conocimientoMasterNumero;
                        }

                        /**
                         * Define el valor de la propiedad conocimientoMasterNumero.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setConocimientoMasterNumero(String value) {
                            this.conocimientoMasterNumero = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad puertoDescarga.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPuertoDescarga() {
                            return puertoDescarga;
                        }

                        /**
                         * Define el valor de la propiedad puertoDescarga.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPuertoDescarga(String value) {
                            this.puertoDescarga = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad consignatarioTipoDocumento.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getConsignatarioTipoDocumento() {
                            return consignatarioTipoDocumento;
                        }

                        /**
                         * Define el valor de la propiedad consignatarioTipoDocumento.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setConsignatarioTipoDocumento(String value) {
                            this.consignatarioTipoDocumento = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad consignatarioDocumento.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getConsignatarioDocumento() {
                            return consignatarioDocumento;
                        }

                        /**
                         * Define el valor de la propiedad consignatarioDocumento.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setConsignatarioDocumento(String value) {
                            this.consignatarioDocumento = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad consignatarioNombre.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getConsignatarioNombre() {
                            return consignatarioNombre;
                        }

                        /**
                         * Define el valor de la propiedad consignatarioNombre.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setConsignatarioNombre(String value) {
                            this.consignatarioNombre = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad endosoFecha.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getEndosoFecha() {
                            return endosoFecha;
                        }

                        /**
                         * Define el valor de la propiedad endosoFecha.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setEndosoFecha(XMLGregorianCalendar value) {
                            this.endosoFecha = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad endosoLugar.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEndosoLugar() {
                            return endosoLugar;
                        }

                        /**
                         * Define el valor de la propiedad endosoLugar.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEndosoLugar(String value) {
                            this.endosoLugar = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad mercaderiaDestino.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMercaderiaDestino() {
                            return mercaderiaDestino;
                        }

                        /**
                         * Define el valor de la propiedad mercaderiaDestino.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMercaderiaDestino(String value) {
                            this.mercaderiaDestino = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad remitenteTipoDocumento.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRemitenteTipoDocumento() {
                            return remitenteTipoDocumento;
                        }

                        /**
                         * Define el valor de la propiedad remitenteTipoDocumento.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRemitenteTipoDocumento(String value) {
                            this.remitenteTipoDocumento = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad remitenteDocumento.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRemitenteDocumento() {
                            return remitenteDocumento;
                        }

                        /**
                         * Define el valor de la propiedad remitenteDocumento.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRemitenteDocumento(String value) {
                            this.remitenteDocumento = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad remitenteNombre.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRemitenteNombre() {
                            return remitenteNombre;
                        }

                        /**
                         * Define el valor de la propiedad remitenteNombre.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRemitenteNombre(String value) {
                            this.remitenteNombre = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad remitenteDireccion.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRemitenteDireccion() {
                            return remitenteDireccion;
                        }

                        /**
                         * Define el valor de la propiedad remitenteDireccion.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRemitenteDireccion(String value) {
                            this.remitenteDireccion = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad destinatarioTipoDocumento.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDestinatarioTipoDocumento() {
                            return destinatarioTipoDocumento;
                        }

                        /**
                         * Define el valor de la propiedad destinatarioTipoDocumento.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDestinatarioTipoDocumento(String value) {
                            this.destinatarioTipoDocumento = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad destinatarioDocumento.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDestinatarioDocumento() {
                            return destinatarioDocumento;
                        }

                        /**
                         * Define el valor de la propiedad destinatarioDocumento.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDestinatarioDocumento(String value) {
                            this.destinatarioDocumento = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad destinatarioNombre.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDestinatarioNombre() {
                            return destinatarioNombre;
                        }

                        /**
                         * Define el valor de la propiedad destinatarioNombre.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDestinatarioNombre(String value) {
                            this.destinatarioNombre = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad destinatarioDireccion.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDestinatarioDireccion() {
                            return destinatarioDireccion;
                        }

                        /**
                         * Define el valor de la propiedad destinatarioDireccion.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDestinatarioDireccion(String value) {
                            this.destinatarioDireccion = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad mercaderiaDestinoFinal.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMercaderiaDestinoFinal() {
                            return mercaderiaDestinoFinal;
                        }

                        /**
                         * Define el valor de la propiedad mercaderiaDestinoFinal.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMercaderiaDestinoFinal(String value) {
                            this.mercaderiaDestinoFinal = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad mercaderiaPeligrosa.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMercaderiaPeligrosa() {
                            return mercaderiaPeligrosa;
                        }

                        /**
                         * Define el valor de la propiedad mercaderiaPeligrosa.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMercaderiaPeligrosa(String value) {
                            this.mercaderiaPeligrosa = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad fleteMonto.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getFleteMonto() {
                            return fleteMonto;
                        }

                        /**
                         * Define el valor de la propiedad fleteMonto.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setFleteMonto(BigDecimal value) {
                            this.fleteMonto = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad seguroMonto.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getSeguroMonto() {
                            return seguroMonto;
                        }

                        /**
                         * Define el valor de la propiedad seguroMonto.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setSeguroMonto(BigDecimal value) {
                            this.seguroMonto = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad consolidado.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getConsolidado() {
                            return consolidado;
                        }

                        /**
                         * Define el valor de la propiedad consolidado.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setConsolidado(String value) {
                            this.consolidado = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad fraccionado.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getFraccionado() {
                            return fraccionado;
                        }

                        /**
                         * Define el valor de la propiedad fraccionado.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setFraccionado(String value) {
                            this.fraccionado = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad lineas.
                         * 
                         * @return
                         *     possible object is
                         *     {@link DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas }
                         *     
                         */
                        public DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas getLineas() {
                            return lineas;
                        }

                        /**
                         * Define el valor de la propiedad lineas.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas }
                         *     
                         */
                        public void setLineas(DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas value) {
                            this.lineas = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad imagenes.
                         * 
                         * @return
                         *     possible object is
                         *     {@link DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Imagenes }
                         *     
                         */
                        public DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Imagenes getImagenes() {
                            return imagenes;
                        }

                        /**
                         * Define el valor de la propiedad imagenes.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Imagenes }
                         *     
                         */
                        public void setImagenes(DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Imagenes value) {
                            this.imagenes = value;
                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="Imagen" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="ImagenNumeroSecuencial" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
                         *                   &lt;element name="ImagenNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
                         *                   &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "imagen"
                        })
                        public static class Imagenes {

                            @XmlElement(name = "Imagen")
                            protected List<DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Imagenes.Imagen> imagen;

                            /**
                             * Gets the value of the imagen property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the imagen property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getImagen().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Imagenes.Imagen }
                             * 
                             * 
                             */
                            public List<DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Imagenes.Imagen> getImagen() {
                                if (imagen == null) {
                                    imagen = new ArrayList<DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Imagenes.Imagen>();
                                }
                                return this.imagen;
                            }


                            /**
                             * <p>Clase Java para anonymous complex type.
                             * 
                             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="ImagenNumeroSecuencial" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
                             *         &lt;element name="ImagenNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
                             *         &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "imagenNumeroSecuencial",
                                "imagenNumero",
                                "registroTipo"
                            })
                            public static class Imagen {

                                @XmlElement(name = "ImagenNumeroSecuencial")
                                @XmlSchemaType(name = "unsignedInt")
                                protected long imagenNumeroSecuencial;
                                @XmlElement(name = "ImagenNumero")
                                @XmlSchemaType(name = "unsignedInt")
                                protected long imagenNumero;
                                @XmlElement(name = "RegistroTipo")
                                protected String registroTipo;

                                /**
                                 * Obtiene el valor de la propiedad imagenNumeroSecuencial.
                                 * 
                                 */
                                public long getImagenNumeroSecuencial() {
                                    return imagenNumeroSecuencial;
                                }

                                /**
                                 * Define el valor de la propiedad imagenNumeroSecuencial.
                                 * 
                                 */
                                public void setImagenNumeroSecuencial(long value) {
                                    this.imagenNumeroSecuencial = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad imagenNumero.
                                 * 
                                 */
                                public long getImagenNumero() {
                                    return imagenNumero;
                                }

                                /**
                                 * Define el valor de la propiedad imagenNumero.
                                 * 
                                 */
                                public void setImagenNumero(long value) {
                                    this.imagenNumero = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad registroTipo.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getRegistroTipo() {
                                    return registroTipo;
                                }

                                /**
                                 * Define el valor de la propiedad registroTipo.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setRegistroTipo(String value) {
                                    this.registroTipo = value;
                                }

                            }

                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="Linea" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="LineaNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
                         *                   &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                   &lt;element name="PesoBruto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *                   &lt;element name="BultoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                   &lt;element name="BultoCantidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *                   &lt;element name="Marcas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                   &lt;element name="MercaderiaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                   &lt;element name="DepositoFinalCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                   &lt;element name="MercaderiaPeligrosaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                   &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                   &lt;element name="ActaTexto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                   &lt;element name="ActaNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
                         *                   &lt;element name="ValorDeclaradoImporte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *                   &lt;element name="ValorDeclaradoMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                   &lt;element name="ContenedoresLinea" minOccurs="0">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="ContenedorLinea" maxOccurs="unbounded" minOccurs="0">
                         *                               &lt;complexType>
                         *                                 &lt;complexContent>
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                     &lt;sequence>
                         *                                       &lt;element name="ContenedorNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                                       &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                                       &lt;element name="CantidadBultos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *                                     &lt;/sequence>
                         *                                   &lt;/restriction>
                         *                                 &lt;/complexContent>
                         *                               &lt;/complexType>
                         *                             &lt;/element>
                         *                           &lt;/sequence>
                         *                         &lt;/restriction>
                         *                       &lt;/complexContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                   &lt;element name="Asociaciones" minOccurs="0">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="Asociacion" maxOccurs="unbounded" minOccurs="0">
                         *                               &lt;complexType>
                         *                                 &lt;complexContent>
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                     &lt;sequence>
                         *                                       &lt;element name="DocumentoCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                                       &lt;element name="DocumentoNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                                       &lt;element name="DocumentoAduanaCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                                       &lt;element name="DocumentoAno" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                                       &lt;element name="DocumentoLinea" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                                       &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                                       &lt;element name="BultoCantidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                         *                                       &lt;element name="BultoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                                     &lt;/sequence>
                         *                                   &lt;/restriction>
                         *                                 &lt;/complexContent>
                         *                               &lt;/complexType>
                         *                             &lt;/element>
                         *                           &lt;/sequence>
                         *                         &lt;/restriction>
                         *                       &lt;/complexContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "linea"
                        })
                        public static class Lineas {

                            @XmlElement(name = "Linea")
                            protected List<DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea> linea;

                            /**
                             * Gets the value of the linea property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the linea property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getLinea().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea }
                             * 
                             * 
                             */
                            public List<DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea> getLinea() {
                                if (linea == null) {
                                    linea = new ArrayList<DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea>();
                                }
                                return this.linea;
                            }


                            /**
                             * <p>Clase Java para anonymous complex type.
                             * 
                             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="LineaNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
                             *         &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *         &lt;element name="PesoBruto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                             *         &lt;element name="BultoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *         &lt;element name="BultoCantidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                             *         &lt;element name="Marcas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *         &lt;element name="MercaderiaDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *         &lt;element name="DepositoFinalCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *         &lt;element name="MercaderiaPeligrosaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *         &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *         &lt;element name="ActaTexto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *         &lt;element name="ActaNumero" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
                             *         &lt;element name="ValorDeclaradoImporte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                             *         &lt;element name="ValorDeclaradoMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *         &lt;element name="ContenedoresLinea" minOccurs="0">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="ContenedorLinea" maxOccurs="unbounded" minOccurs="0">
                             *                     &lt;complexType>
                             *                       &lt;complexContent>
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                           &lt;sequence>
                             *                             &lt;element name="ContenedorNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                             &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *                             &lt;element name="CantidadBultos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                             *                           &lt;/sequence>
                             *                         &lt;/restriction>
                             *                       &lt;/complexContent>
                             *                     &lt;/complexType>
                             *                   &lt;/element>
                             *                 &lt;/sequence>
                             *               &lt;/restriction>
                             *             &lt;/complexContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *         &lt;element name="Asociaciones" minOccurs="0">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="Asociacion" maxOccurs="unbounded" minOccurs="0">
                             *                     &lt;complexType>
                             *                       &lt;complexContent>
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                           &lt;sequence>
                             *                             &lt;element name="DocumentoCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                             &lt;element name="DocumentoNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                             &lt;element name="DocumentoAduanaCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                             &lt;element name="DocumentoAno" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                             &lt;element name="DocumentoLinea" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                             &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *                             &lt;element name="BultoCantidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                             *                             &lt;element name="BultoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *                           &lt;/sequence>
                             *                         &lt;/restriction>
                             *                       &lt;/complexContent>
                             *                     &lt;/complexType>
                             *                   &lt;/element>
                             *                 &lt;/sequence>
                             *               &lt;/restriction>
                             *             &lt;/complexContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "lineaNumero",
                                "registroTipo",
                                "pesoBruto",
                                "bultoTipo",
                                "bultoCantidad",
                                "marcas",
                                "mercaderiaDescripcion",
                                "depositoFinalCodigo",
                                "mercaderiaPeligrosaCodigo",
                                "operacionTipo",
                                "actaTexto",
                                "actaNumero",
                                "valorDeclaradoImporte",
                                "valorDeclaradoMoneda",
                                "contenedoresLinea",
                                "asociaciones"
                            })
                            public static class Linea {

                                @XmlElement(name = "LineaNumero")
                                @XmlSchemaType(name = "unsignedInt")
                                protected long lineaNumero;
                                @XmlElement(name = "RegistroTipo")
                                protected String registroTipo;
                                @XmlElement(name = "PesoBruto")
                                protected BigDecimal pesoBruto;
                                @XmlElement(name = "BultoTipo")
                                protected String bultoTipo;
                                @XmlElement(name = "BultoCantidad")
                                protected BigDecimal bultoCantidad;
                                @XmlElement(name = "Marcas")
                                protected String marcas;
                                @XmlElement(name = "MercaderiaDescripcion")
                                protected String mercaderiaDescripcion;
                                @XmlElement(name = "DepositoFinalCodigo")
                                protected String depositoFinalCodigo;
                                @XmlElement(name = "MercaderiaPeligrosaCodigo")
                                protected String mercaderiaPeligrosaCodigo;
                                @XmlElement(name = "OperacionTipo")
                                protected String operacionTipo;
                                @XmlElement(name = "ActaTexto")
                                protected String actaTexto;
                                @XmlElement(name = "ActaNumero")
                                @XmlSchemaType(name = "unsignedInt")
                                protected Long actaNumero;
                                @XmlElement(name = "ValorDeclaradoImporte")
                                protected BigDecimal valorDeclaradoImporte;
                                @XmlElement(name = "ValorDeclaradoMoneda")
                                protected String valorDeclaradoMoneda;
                                @XmlElement(name = "ContenedoresLinea")
                                protected DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea.ContenedoresLinea contenedoresLinea;
                                @XmlElement(name = "Asociaciones")
                                protected DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea.Asociaciones asociaciones;

                                /**
                                 * Obtiene el valor de la propiedad lineaNumero.
                                 * 
                                 */
                                public long getLineaNumero() {
                                    return lineaNumero;
                                }

                                /**
                                 * Define el valor de la propiedad lineaNumero.
                                 * 
                                 */
                                public void setLineaNumero(long value) {
                                    this.lineaNumero = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad registroTipo.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getRegistroTipo() {
                                    return registroTipo;
                                }

                                /**
                                 * Define el valor de la propiedad registroTipo.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setRegistroTipo(String value) {
                                    this.registroTipo = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad pesoBruto.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getPesoBruto() {
                                    return pesoBruto;
                                }

                                /**
                                 * Define el valor de la propiedad pesoBruto.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setPesoBruto(BigDecimal value) {
                                    this.pesoBruto = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad bultoTipo.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getBultoTipo() {
                                    return bultoTipo;
                                }

                                /**
                                 * Define el valor de la propiedad bultoTipo.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setBultoTipo(String value) {
                                    this.bultoTipo = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad bultoCantidad.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getBultoCantidad() {
                                    return bultoCantidad;
                                }

                                /**
                                 * Define el valor de la propiedad bultoCantidad.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setBultoCantidad(BigDecimal value) {
                                    this.bultoCantidad = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad marcas.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getMarcas() {
                                    return marcas;
                                }

                                /**
                                 * Define el valor de la propiedad marcas.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setMarcas(String value) {
                                    this.marcas = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad mercaderiaDescripcion.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getMercaderiaDescripcion() {
                                    return mercaderiaDescripcion;
                                }

                                /**
                                 * Define el valor de la propiedad mercaderiaDescripcion.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setMercaderiaDescripcion(String value) {
                                    this.mercaderiaDescripcion = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad depositoFinalCodigo.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getDepositoFinalCodigo() {
                                    return depositoFinalCodigo;
                                }

                                /**
                                 * Define el valor de la propiedad depositoFinalCodigo.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setDepositoFinalCodigo(String value) {
                                    this.depositoFinalCodigo = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad mercaderiaPeligrosaCodigo.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getMercaderiaPeligrosaCodigo() {
                                    return mercaderiaPeligrosaCodigo;
                                }

                                /**
                                 * Define el valor de la propiedad mercaderiaPeligrosaCodigo.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setMercaderiaPeligrosaCodigo(String value) {
                                    this.mercaderiaPeligrosaCodigo = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad operacionTipo.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getOperacionTipo() {
                                    return operacionTipo;
                                }

                                /**
                                 * Define el valor de la propiedad operacionTipo.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setOperacionTipo(String value) {
                                    this.operacionTipo = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad actaTexto.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getActaTexto() {
                                    return actaTexto;
                                }

                                /**
                                 * Define el valor de la propiedad actaTexto.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setActaTexto(String value) {
                                    this.actaTexto = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad actaNumero.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Long }
                                 *     
                                 */
                                public Long getActaNumero() {
                                    return actaNumero;
                                }

                                /**
                                 * Define el valor de la propiedad actaNumero.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Long }
                                 *     
                                 */
                                public void setActaNumero(Long value) {
                                    this.actaNumero = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad valorDeclaradoImporte.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getValorDeclaradoImporte() {
                                    return valorDeclaradoImporte;
                                }

                                /**
                                 * Define el valor de la propiedad valorDeclaradoImporte.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setValorDeclaradoImporte(BigDecimal value) {
                                    this.valorDeclaradoImporte = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad valorDeclaradoMoneda.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getValorDeclaradoMoneda() {
                                    return valorDeclaradoMoneda;
                                }

                                /**
                                 * Define el valor de la propiedad valorDeclaradoMoneda.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setValorDeclaradoMoneda(String value) {
                                    this.valorDeclaradoMoneda = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad contenedoresLinea.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea.ContenedoresLinea }
                                 *     
                                 */
                                public DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea.ContenedoresLinea getContenedoresLinea() {
                                    return contenedoresLinea;
                                }

                                /**
                                 * Define el valor de la propiedad contenedoresLinea.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea.ContenedoresLinea }
                                 *     
                                 */
                                public void setContenedoresLinea(DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea.ContenedoresLinea value) {
                                    this.contenedoresLinea = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad asociaciones.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea.Asociaciones }
                                 *     
                                 */
                                public DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea.Asociaciones getAsociaciones() {
                                    return asociaciones;
                                }

                                /**
                                 * Define el valor de la propiedad asociaciones.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea.Asociaciones }
                                 *     
                                 */
                                public void setAsociaciones(DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea.Asociaciones value) {
                                    this.asociaciones = value;
                                }


                                /**
                                 * <p>Clase Java para anonymous complex type.
                                 * 
                                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                                 * 
                                 * <pre>
                                 * &lt;complexType>
                                 *   &lt;complexContent>
                                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *       &lt;sequence>
                                 *         &lt;element name="Asociacion" maxOccurs="unbounded" minOccurs="0">
                                 *           &lt;complexType>
                                 *             &lt;complexContent>
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                 &lt;sequence>
                                 *                   &lt;element name="DocumentoCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *                   &lt;element name="DocumentoNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *                   &lt;element name="DocumentoAduanaCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *                   &lt;element name="DocumentoAno" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *                   &lt;element name="DocumentoLinea" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *                   &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                                 *                   &lt;element name="BultoCantidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                                 *                   &lt;element name="BultoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                                 *                 &lt;/sequence>
                                 *               &lt;/restriction>
                                 *             &lt;/complexContent>
                                 *           &lt;/complexType>
                                 *         &lt;/element>
                                 *       &lt;/sequence>
                                 *     &lt;/restriction>
                                 *   &lt;/complexContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "asociacion"
                                })
                                public static class Asociaciones {

                                    @XmlElement(name = "Asociacion")
                                    protected List<DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea.Asociaciones.Asociacion> asociacion;

                                    /**
                                     * Gets the value of the asociacion property.
                                     * 
                                     * <p>
                                     * This accessor method returns a reference to the live list,
                                     * not a snapshot. Therefore any modification you make to the
                                     * returned list will be present inside the JAXB object.
                                     * This is why there is not a <CODE>set</CODE> method for the asociacion property.
                                     * 
                                     * <p>
                                     * For example, to add a new item, do as follows:
                                     * <pre>
                                     *    getAsociacion().add(newItem);
                                     * </pre>
                                     * 
                                     * 
                                     * <p>
                                     * Objects of the following type(s) are allowed in the list
                                     * {@link DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea.Asociaciones.Asociacion }
                                     * 
                                     * 
                                     */
                                    public List<DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea.Asociaciones.Asociacion> getAsociacion() {
                                        if (asociacion == null) {
                                            asociacion = new ArrayList<DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea.Asociaciones.Asociacion>();
                                        }
                                        return this.asociacion;
                                    }


                                    /**
                                     * <p>Clase Java para anonymous complex type.
                                     * 
                                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                                     * 
                                     * <pre>
                                     * &lt;complexType>
                                     *   &lt;complexContent>
                                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                     *       &lt;sequence>
                                     *         &lt;element name="DocumentoCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                     *         &lt;element name="DocumentoNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                     *         &lt;element name="DocumentoAduanaCodigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                     *         &lt;element name="DocumentoAno" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                     *         &lt;element name="DocumentoLinea" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                     *         &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                                     *         &lt;element name="BultoCantidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                                     *         &lt;element name="BultoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                                     *       &lt;/sequence>
                                     *     &lt;/restriction>
                                     *   &lt;/complexContent>
                                     * &lt;/complexType>
                                     * </pre>
                                     * 
                                     * 
                                     */
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "documentoCodigo",
                                        "documentoNumero",
                                        "documentoAduanaCodigo",
                                        "documentoAno",
                                        "documentoLinea",
                                        "registroTipo",
                                        "bultoCantidad",
                                        "bultoTipo"
                                    })
                                    public static class Asociacion {

                                        @XmlElement(name = "DocumentoCodigo", required = true)
                                        protected String documentoCodigo;
                                        @XmlElement(name = "DocumentoNumero", required = true)
                                        protected String documentoNumero;
                                        @XmlElement(name = "DocumentoAduanaCodigo", required = true)
                                        protected String documentoAduanaCodigo;
                                        @XmlElement(name = "DocumentoAno", required = true)
                                        protected String documentoAno;
                                        @XmlElement(name = "DocumentoLinea", required = true)
                                        protected String documentoLinea;
                                        @XmlElement(name = "RegistroTipo")
                                        protected String registroTipo;
                                        @XmlElement(name = "BultoCantidad")
                                        protected BigDecimal bultoCantidad;
                                        @XmlElement(name = "BultoTipo")
                                        protected String bultoTipo;

                                        /**
                                         * Obtiene el valor de la propiedad documentoCodigo.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getDocumentoCodigo() {
                                            return documentoCodigo;
                                        }

                                        /**
                                         * Define el valor de la propiedad documentoCodigo.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setDocumentoCodigo(String value) {
                                            this.documentoCodigo = value;
                                        }

                                        /**
                                         * Obtiene el valor de la propiedad documentoNumero.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getDocumentoNumero() {
                                            return documentoNumero;
                                        }

                                        /**
                                         * Define el valor de la propiedad documentoNumero.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setDocumentoNumero(String value) {
                                            this.documentoNumero = value;
                                        }

                                        /**
                                         * Obtiene el valor de la propiedad documentoAduanaCodigo.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getDocumentoAduanaCodigo() {
                                            return documentoAduanaCodigo;
                                        }

                                        /**
                                         * Define el valor de la propiedad documentoAduanaCodigo.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setDocumentoAduanaCodigo(String value) {
                                            this.documentoAduanaCodigo = value;
                                        }

                                        /**
                                         * Obtiene el valor de la propiedad documentoAno.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getDocumentoAno() {
                                            return documentoAno;
                                        }

                                        /**
                                         * Define el valor de la propiedad documentoAno.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setDocumentoAno(String value) {
                                            this.documentoAno = value;
                                        }

                                        /**
                                         * Obtiene el valor de la propiedad documentoLinea.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getDocumentoLinea() {
                                            return documentoLinea;
                                        }

                                        /**
                                         * Define el valor de la propiedad documentoLinea.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setDocumentoLinea(String value) {
                                            this.documentoLinea = value;
                                        }

                                        /**
                                         * Obtiene el valor de la propiedad registroTipo.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getRegistroTipo() {
                                            return registroTipo;
                                        }

                                        /**
                                         * Define el valor de la propiedad registroTipo.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setRegistroTipo(String value) {
                                            this.registroTipo = value;
                                        }

                                        /**
                                         * Obtiene el valor de la propiedad bultoCantidad.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link BigDecimal }
                                         *     
                                         */
                                        public BigDecimal getBultoCantidad() {
                                            return bultoCantidad;
                                        }

                                        /**
                                         * Define el valor de la propiedad bultoCantidad.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link BigDecimal }
                                         *     
                                         */
                                        public void setBultoCantidad(BigDecimal value) {
                                            this.bultoCantidad = value;
                                        }

                                        /**
                                         * Obtiene el valor de la propiedad bultoTipo.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getBultoTipo() {
                                            return bultoTipo;
                                        }

                                        /**
                                         * Define el valor de la propiedad bultoTipo.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setBultoTipo(String value) {
                                            this.bultoTipo = value;
                                        }

                                    }

                                }


                                /**
                                 * <p>Clase Java para anonymous complex type.
                                 * 
                                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                                 * 
                                 * <pre>
                                 * &lt;complexType>
                                 *   &lt;complexContent>
                                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *       &lt;sequence>
                                 *         &lt;element name="ContenedorLinea" maxOccurs="unbounded" minOccurs="0">
                                 *           &lt;complexType>
                                 *             &lt;complexContent>
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                 &lt;sequence>
                                 *                   &lt;element name="ContenedorNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *                   &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                                 *                   &lt;element name="CantidadBultos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                                 *                 &lt;/sequence>
                                 *               &lt;/restriction>
                                 *             &lt;/complexContent>
                                 *           &lt;/complexType>
                                 *         &lt;/element>
                                 *       &lt;/sequence>
                                 *     &lt;/restriction>
                                 *   &lt;/complexContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "contenedorLinea"
                                })
                                public static class ContenedoresLinea {

                                    @XmlElement(name = "ContenedorLinea")
                                    protected List<DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea.ContenedoresLinea.ContenedorLinea> contenedorLinea;

                                    /**
                                     * Gets the value of the contenedorLinea property.
                                     * 
                                     * <p>
                                     * This accessor method returns a reference to the live list,
                                     * not a snapshot. Therefore any modification you make to the
                                     * returned list will be present inside the JAXB object.
                                     * This is why there is not a <CODE>set</CODE> method for the contenedorLinea property.
                                     * 
                                     * <p>
                                     * For example, to add a new item, do as follows:
                                     * <pre>
                                     *    getContenedorLinea().add(newItem);
                                     * </pre>
                                     * 
                                     * 
                                     * <p>
                                     * Objects of the following type(s) are allowed in the list
                                     * {@link DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea.ContenedoresLinea.ContenedorLinea }
                                     * 
                                     * 
                                     */
                                    public List<DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea.ContenedoresLinea.ContenedorLinea> getContenedorLinea() {
                                        if (contenedorLinea == null) {
                                            contenedorLinea = new ArrayList<DAE.Objeto.Manifiestos.Manifiesto.Conocimientos.Conocimiento.Lineas.Linea.ContenedoresLinea.ContenedorLinea>();
                                        }
                                        return this.contenedorLinea;
                                    }


                                    /**
                                     * <p>Clase Java para anonymous complex type.
                                     * 
                                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                                     * 
                                     * <pre>
                                     * &lt;complexType>
                                     *   &lt;complexContent>
                                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                     *       &lt;sequence>
                                     *         &lt;element name="ContenedorNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                     *         &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                                     *         &lt;element name="CantidadBultos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                                     *       &lt;/sequence>
                                     *     &lt;/restriction>
                                     *   &lt;/complexContent>
                                     * &lt;/complexType>
                                     * </pre>
                                     * 
                                     * 
                                     */
                                    @XmlAccessorType(XmlAccessType.FIELD)
                                    @XmlType(name = "", propOrder = {
                                        "contenedorNumero",
                                        "registroTipo",
                                        "cantidadBultos"
                                    })
                                    public static class ContenedorLinea {

                                        @XmlElement(name = "ContenedorNumero", required = true)
                                        protected String contenedorNumero;
                                        @XmlElement(name = "RegistroTipo")
                                        protected String registroTipo;
                                        @XmlElement(name = "CantidadBultos")
                                        protected BigDecimal cantidadBultos;

                                        /**
                                         * Obtiene el valor de la propiedad contenedorNumero.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getContenedorNumero() {
                                            return contenedorNumero;
                                        }

                                        /**
                                         * Define el valor de la propiedad contenedorNumero.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setContenedorNumero(String value) {
                                            this.contenedorNumero = value;
                                        }

                                        /**
                                         * Obtiene el valor de la propiedad registroTipo.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getRegistroTipo() {
                                            return registroTipo;
                                        }

                                        /**
                                         * Define el valor de la propiedad registroTipo.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setRegistroTipo(String value) {
                                            this.registroTipo = value;
                                        }

                                        /**
                                         * Obtiene el valor de la propiedad cantidadBultos.
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link BigDecimal }
                                         *     
                                         */
                                        public BigDecimal getCantidadBultos() {
                                            return cantidadBultos;
                                        }

                                        /**
                                         * Define el valor de la propiedad cantidadBultos.
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link BigDecimal }
                                         *     
                                         */
                                        public void setCantidadBultos(BigDecimal value) {
                                            this.cantidadBultos = value;
                                        }

                                    }

                                }

                            }

                        }

                    }

                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence minOccurs="0">
                 *         &lt;element name="Contenedor" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ContenedorNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Calificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="TamanoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="CompletoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="PesoBruto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *                   &lt;element name="Precinto1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Precinto2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Precinto3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Precinto4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Precinto5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Precinto6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Precinto7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Precinto8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Precinto9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="DepositoDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="ManifiestoDestinoNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="ManifiestoDestinoFechaSalida" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
                 *                   &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="Observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "contenedor"
                })
                public static class Contenedores {

                    @XmlElement(name = "Contenedor")
                    protected List<DAE.Objeto.Manifiestos.Manifiesto.Contenedores.Contenedor> contenedor;

                    /**
                     * Gets the value of the contenedor property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the contenedor property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getContenedor().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link DAE.Objeto.Manifiestos.Manifiesto.Contenedores.Contenedor }
                     * 
                     * 
                     */
                    public List<DAE.Objeto.Manifiestos.Manifiesto.Contenedores.Contenedor> getContenedor() {
                        if (contenedor == null) {
                            contenedor = new ArrayList<DAE.Objeto.Manifiestos.Manifiesto.Contenedores.Contenedor>();
                        }
                        return this.contenedor;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="ContenedorNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Calificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="TamanoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="CompletoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="PesoBruto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                     *         &lt;element name="Precinto1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Precinto2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Precinto3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Precinto4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Precinto5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Precinto6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Precinto7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Precinto8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Precinto9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="DepositoDestinoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="ManifiestoDestinoNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="ManifiestoDestinoFechaSalida" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
                     *         &lt;element name="OperacionTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="Observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "contenedorNumero",
                        "registroTipo",
                        "calificador",
                        "tamanoCodigo",
                        "completoCodigo",
                        "pesoBruto",
                        "precinto1",
                        "precinto2",
                        "precinto3",
                        "precinto4",
                        "precinto5",
                        "precinto6",
                        "precinto7",
                        "precinto8",
                        "precinto9",
                        "depositoDestinoCodigo",
                        "manifiestoDestinoNumero",
                        "manifiestoDestinoFechaSalida",
                        "operacionTipo",
                        "observacion"
                    })
                    public static class Contenedor {

                        @XmlElement(name = "ContenedorNumero", required = true)
                        protected String contenedorNumero;
                        @XmlElement(name = "RegistroTipo")
                        protected String registroTipo;
                        @XmlElement(name = "Calificador")
                        protected String calificador;
                        @XmlElement(name = "TamanoCodigo")
                        protected String tamanoCodigo;
                        @XmlElement(name = "CompletoCodigo")
                        protected String completoCodigo;
                        @XmlElement(name = "PesoBruto")
                        protected BigDecimal pesoBruto;
                        @XmlElement(name = "Precinto1")
                        protected String precinto1;
                        @XmlElement(name = "Precinto2")
                        protected String precinto2;
                        @XmlElement(name = "Precinto3")
                        protected String precinto3;
                        @XmlElement(name = "Precinto4")
                        protected String precinto4;
                        @XmlElement(name = "Precinto5")
                        protected String precinto5;
                        @XmlElement(name = "Precinto6")
                        protected String precinto6;
                        @XmlElement(name = "Precinto7")
                        protected String precinto7;
                        @XmlElement(name = "Precinto8")
                        protected String precinto8;
                        @XmlElement(name = "Precinto9")
                        protected String precinto9;
                        @XmlElement(name = "DepositoDestinoCodigo")
                        protected String depositoDestinoCodigo;
                        @XmlElement(name = "ManifiestoDestinoNumero")
                        protected String manifiestoDestinoNumero;
                        @XmlElement(name = "ManifiestoDestinoFechaSalida")
                        @XmlSchemaType(name = "unsignedInt")
                        protected Long manifiestoDestinoFechaSalida;
                        @XmlElement(name = "OperacionTipo")
                        protected String operacionTipo;
                        @XmlElement(name = "Observacion")
                        protected String observacion;

                        /**
                         * Obtiene el valor de la propiedad contenedorNumero.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getContenedorNumero() {
                            return contenedorNumero;
                        }

                        /**
                         * Define el valor de la propiedad contenedorNumero.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setContenedorNumero(String value) {
                            this.contenedorNumero = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad registroTipo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRegistroTipo() {
                            return registroTipo;
                        }

                        /**
                         * Define el valor de la propiedad registroTipo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRegistroTipo(String value) {
                            this.registroTipo = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad calificador.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCalificador() {
                            return calificador;
                        }

                        /**
                         * Define el valor de la propiedad calificador.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCalificador(String value) {
                            this.calificador = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad tamanoCodigo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTamanoCodigo() {
                            return tamanoCodigo;
                        }

                        /**
                         * Define el valor de la propiedad tamanoCodigo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTamanoCodigo(String value) {
                            this.tamanoCodigo = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad completoCodigo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCompletoCodigo() {
                            return completoCodigo;
                        }

                        /**
                         * Define el valor de la propiedad completoCodigo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCompletoCodigo(String value) {
                            this.completoCodigo = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad pesoBruto.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getPesoBruto() {
                            return pesoBruto;
                        }

                        /**
                         * Define el valor de la propiedad pesoBruto.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setPesoBruto(BigDecimal value) {
                            this.pesoBruto = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad precinto1.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPrecinto1() {
                            return precinto1;
                        }

                        /**
                         * Define el valor de la propiedad precinto1.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPrecinto1(String value) {
                            this.precinto1 = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad precinto2.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPrecinto2() {
                            return precinto2;
                        }

                        /**
                         * Define el valor de la propiedad precinto2.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPrecinto2(String value) {
                            this.precinto2 = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad precinto3.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPrecinto3() {
                            return precinto3;
                        }

                        /**
                         * Define el valor de la propiedad precinto3.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPrecinto3(String value) {
                            this.precinto3 = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad precinto4.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPrecinto4() {
                            return precinto4;
                        }

                        /**
                         * Define el valor de la propiedad precinto4.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPrecinto4(String value) {
                            this.precinto4 = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad precinto5.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPrecinto5() {
                            return precinto5;
                        }

                        /**
                         * Define el valor de la propiedad precinto5.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPrecinto5(String value) {
                            this.precinto5 = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad precinto6.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPrecinto6() {
                            return precinto6;
                        }

                        /**
                         * Define el valor de la propiedad precinto6.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPrecinto6(String value) {
                            this.precinto6 = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad precinto7.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPrecinto7() {
                            return precinto7;
                        }

                        /**
                         * Define el valor de la propiedad precinto7.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPrecinto7(String value) {
                            this.precinto7 = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad precinto8.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPrecinto8() {
                            return precinto8;
                        }

                        /**
                         * Define el valor de la propiedad precinto8.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPrecinto8(String value) {
                            this.precinto8 = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad precinto9.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPrecinto9() {
                            return precinto9;
                        }

                        /**
                         * Define el valor de la propiedad precinto9.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPrecinto9(String value) {
                            this.precinto9 = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad depositoDestinoCodigo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDepositoDestinoCodigo() {
                            return depositoDestinoCodigo;
                        }

                        /**
                         * Define el valor de la propiedad depositoDestinoCodigo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDepositoDestinoCodigo(String value) {
                            this.depositoDestinoCodigo = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad manifiestoDestinoNumero.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getManifiestoDestinoNumero() {
                            return manifiestoDestinoNumero;
                        }

                        /**
                         * Define el valor de la propiedad manifiestoDestinoNumero.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setManifiestoDestinoNumero(String value) {
                            this.manifiestoDestinoNumero = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad manifiestoDestinoFechaSalida.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Long }
                         *     
                         */
                        public Long getManifiestoDestinoFechaSalida() {
                            return manifiestoDestinoFechaSalida;
                        }

                        /**
                         * Define el valor de la propiedad manifiestoDestinoFechaSalida.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Long }
                         *     
                         */
                        public void setManifiestoDestinoFechaSalida(Long value) {
                            this.manifiestoDestinoFechaSalida = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad operacionTipo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOperacionTipo() {
                            return operacionTipo;
                        }

                        /**
                         * Define el valor de la propiedad operacionTipo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOperacionTipo(String value) {
                            this.operacionTipo = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad observacion.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getObservacion() {
                            return observacion;
                        }

                        /**
                         * Define el valor de la propiedad observacion.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setObservacion(String value) {
                            this.observacion = value;
                        }

                    }

                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence minOccurs="0">
                 *         &lt;element name="PaisDePaso" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="PaisDePasoNumeroSecuencial" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
                 *                   &lt;element name="PaisDePasoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="CiudadEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="AduanaDeEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="LugarOperativoEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="CiudadSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="AduanaSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="LugarOperativoSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "paisDePaso"
                })
                public static class PaisesDePaso {

                    @XmlElement(name = "PaisDePaso")
                    protected List<DAE.Objeto.Manifiestos.Manifiesto.PaisesDePaso.PaisDePaso> paisDePaso;

                    /**
                     * Gets the value of the paisDePaso property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the paisDePaso property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPaisDePaso().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link DAE.Objeto.Manifiestos.Manifiesto.PaisesDePaso.PaisDePaso }
                     * 
                     * 
                     */
                    public List<DAE.Objeto.Manifiestos.Manifiesto.PaisesDePaso.PaisDePaso> getPaisDePaso() {
                        if (paisDePaso == null) {
                            paisDePaso = new ArrayList<DAE.Objeto.Manifiestos.Manifiesto.PaisesDePaso.PaisDePaso>();
                        }
                        return this.paisDePaso;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="PaisDePasoNumeroSecuencial" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
                     *         &lt;element name="PaisDePasoCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="CiudadEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="AduanaDeEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="LugarOperativoEntradaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="CiudadSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="AduanaSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="LugarOperativoSalidaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "paisDePasoNumeroSecuencial",
                        "paisDePasoCodigo",
                        "ciudadEntradaCodigo",
                        "aduanaDeEntradaCodigo",
                        "lugarOperativoEntradaCodigo",
                        "ciudadSalidaCodigo",
                        "aduanaSalidaCodigo",
                        "lugarOperativoSalidaCodigo",
                        "registroTipo"
                    })
                    public static class PaisDePaso {

                        @XmlElement(name = "PaisDePasoNumeroSecuencial")
                        @XmlSchemaType(name = "unsignedInt")
                        protected long paisDePasoNumeroSecuencial;
                        @XmlElement(name = "PaisDePasoCodigo")
                        protected String paisDePasoCodigo;
                        @XmlElement(name = "CiudadEntradaCodigo")
                        protected String ciudadEntradaCodigo;
                        @XmlElement(name = "AduanaDeEntradaCodigo")
                        protected String aduanaDeEntradaCodigo;
                        @XmlElement(name = "LugarOperativoEntradaCodigo")
                        protected String lugarOperativoEntradaCodigo;
                        @XmlElement(name = "CiudadSalidaCodigo")
                        protected String ciudadSalidaCodigo;
                        @XmlElement(name = "AduanaSalidaCodigo")
                        protected String aduanaSalidaCodigo;
                        @XmlElement(name = "LugarOperativoSalidaCodigo")
                        protected String lugarOperativoSalidaCodigo;
                        @XmlElement(name = "RegistroTipo")
                        protected String registroTipo;

                        /**
                         * Obtiene el valor de la propiedad paisDePasoNumeroSecuencial.
                         * 
                         */
                        public long getPaisDePasoNumeroSecuencial() {
                            return paisDePasoNumeroSecuencial;
                        }

                        /**
                         * Define el valor de la propiedad paisDePasoNumeroSecuencial.
                         * 
                         */
                        public void setPaisDePasoNumeroSecuencial(long value) {
                            this.paisDePasoNumeroSecuencial = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad paisDePasoCodigo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPaisDePasoCodigo() {
                            return paisDePasoCodigo;
                        }

                        /**
                         * Define el valor de la propiedad paisDePasoCodigo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPaisDePasoCodigo(String value) {
                            this.paisDePasoCodigo = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad ciudadEntradaCodigo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCiudadEntradaCodigo() {
                            return ciudadEntradaCodigo;
                        }

                        /**
                         * Define el valor de la propiedad ciudadEntradaCodigo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCiudadEntradaCodigo(String value) {
                            this.ciudadEntradaCodigo = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad aduanaDeEntradaCodigo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAduanaDeEntradaCodigo() {
                            return aduanaDeEntradaCodigo;
                        }

                        /**
                         * Define el valor de la propiedad aduanaDeEntradaCodigo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAduanaDeEntradaCodigo(String value) {
                            this.aduanaDeEntradaCodigo = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad lugarOperativoEntradaCodigo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getLugarOperativoEntradaCodigo() {
                            return lugarOperativoEntradaCodigo;
                        }

                        /**
                         * Define el valor de la propiedad lugarOperativoEntradaCodigo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setLugarOperativoEntradaCodigo(String value) {
                            this.lugarOperativoEntradaCodigo = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad ciudadSalidaCodigo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCiudadSalidaCodigo() {
                            return ciudadSalidaCodigo;
                        }

                        /**
                         * Define el valor de la propiedad ciudadSalidaCodigo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCiudadSalidaCodigo(String value) {
                            this.ciudadSalidaCodigo = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad aduanaSalidaCodigo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAduanaSalidaCodigo() {
                            return aduanaSalidaCodigo;
                        }

                        /**
                         * Define el valor de la propiedad aduanaSalidaCodigo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAduanaSalidaCodigo(String value) {
                            this.aduanaSalidaCodigo = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad lugarOperativoSalidaCodigo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getLugarOperativoSalidaCodigo() {
                            return lugarOperativoSalidaCodigo;
                        }

                        /**
                         * Define el valor de la propiedad lugarOperativoSalidaCodigo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setLugarOperativoSalidaCodigo(String value) {
                            this.lugarOperativoSalidaCodigo = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad registroTipo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRegistroTipo() {
                            return registroTipo;
                        }

                        /**
                         * Define el valor de la propiedad registroTipo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRegistroTipo(String value) {
                            this.registroTipo = value;
                        }

                    }

                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence minOccurs="0">
                 *         &lt;element name="Precinto" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="PrecintoNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "precinto"
                })
                public static class Precintos {

                    @XmlElement(name = "Precinto")
                    protected List<DAE.Objeto.Manifiestos.Manifiesto.Precintos.Precinto> precinto;

                    /**
                     * Gets the value of the precinto property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the precinto property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPrecinto().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link DAE.Objeto.Manifiestos.Manifiesto.Precintos.Precinto }
                     * 
                     * 
                     */
                    public List<DAE.Objeto.Manifiestos.Manifiesto.Precintos.Precinto> getPrecinto() {
                        if (precinto == null) {
                            precinto = new ArrayList<DAE.Objeto.Manifiestos.Manifiesto.Precintos.Precinto>();
                        }
                        return this.precinto;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="PrecintoNumero" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="RegistroTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "precintoNumero",
                        "registroTipo"
                    })
                    public static class Precinto {

                        @XmlElement(name = "PrecintoNumero", required = true)
                        protected String precintoNumero;
                        @XmlElement(name = "RegistroTipo")
                        protected String registroTipo;

                        /**
                         * Obtiene el valor de la propiedad precintoNumero.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPrecintoNumero() {
                            return precintoNumero;
                        }

                        /**
                         * Define el valor de la propiedad precintoNumero.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPrecintoNumero(String value) {
                            this.precintoNumero = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad registroTipo.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRegistroTipo() {
                            return registroTipo;
                        }

                        /**
                         * Define el valor de la propiedad registroTipo.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRegistroTipo(String value) {
                            this.registroTipo = value;
                        }

                    }

                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SignedInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CanonicalizationMethod">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="SignatureMethod">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Reference">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Transforms">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Transform">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="DigestMethod">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="DigestValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SignatureValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="KeyInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="X509Data">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="X509Certificate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "signedInfo",
        "signatureValue",
        "keyInfo"
    })
    public static class Signature {

        @XmlElement(name = "SignedInfo", required = true)
        protected DAE.Signature.SignedInfo signedInfo;
        @XmlElement(name = "SignatureValue", required = true)
        protected String signatureValue;
        @XmlElement(name = "KeyInfo", required = true)
        protected DAE.Signature.KeyInfo keyInfo;

        /**
         * Obtiene el valor de la propiedad signedInfo.
         * 
         * @return
         *     possible object is
         *     {@link DAE.Signature.SignedInfo }
         *     
         */
        public DAE.Signature.SignedInfo getSignedInfo() {
            return signedInfo;
        }

        /**
         * Define el valor de la propiedad signedInfo.
         * 
         * @param value
         *     allowed object is
         *     {@link DAE.Signature.SignedInfo }
         *     
         */
        public void setSignedInfo(DAE.Signature.SignedInfo value) {
            this.signedInfo = value;
        }

        /**
         * Obtiene el valor de la propiedad signatureValue.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSignatureValue() {
            return signatureValue;
        }

        /**
         * Define el valor de la propiedad signatureValue.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSignatureValue(String value) {
            this.signatureValue = value;
        }

        /**
         * Obtiene el valor de la propiedad keyInfo.
         * 
         * @return
         *     possible object is
         *     {@link DAE.Signature.KeyInfo }
         *     
         */
        public DAE.Signature.KeyInfo getKeyInfo() {
            return keyInfo;
        }

        /**
         * Define el valor de la propiedad keyInfo.
         * 
         * @param value
         *     allowed object is
         *     {@link DAE.Signature.KeyInfo }
         *     
         */
        public void setKeyInfo(DAE.Signature.KeyInfo value) {
            this.keyInfo = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="X509Data">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="X509Certificate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "x509Data"
        })
        public static class KeyInfo {

            @XmlElement(name = "X509Data", required = true)
            protected DAE.Signature.KeyInfo.X509Data x509Data;

            /**
             * Obtiene el valor de la propiedad x509Data.
             * 
             * @return
             *     possible object is
             *     {@link DAE.Signature.KeyInfo.X509Data }
             *     
             */
            public DAE.Signature.KeyInfo.X509Data getX509Data() {
                return x509Data;
            }

            /**
             * Define el valor de la propiedad x509Data.
             * 
             * @param value
             *     allowed object is
             *     {@link DAE.Signature.KeyInfo.X509Data }
             *     
             */
            public void setX509Data(DAE.Signature.KeyInfo.X509Data value) {
                this.x509Data = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="X509Certificate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "x509Certificate"
            })
            public static class X509Data {

                @XmlElement(name = "X509Certificate", required = true)
                protected String x509Certificate;

                /**
                 * Obtiene el valor de la propiedad x509Certificate.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getX509Certificate() {
                    return x509Certificate;
                }

                /**
                 * Define el valor de la propiedad x509Certificate.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setX509Certificate(String value) {
                    this.x509Certificate = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="CanonicalizationMethod">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="SignatureMethod">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Reference">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Transforms">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Transform">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="DigestMethod">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="DigestValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "canonicalizationMethod",
            "signatureMethod",
            "reference"
        })
        public static class SignedInfo {

            @XmlElement(name = "CanonicalizationMethod", required = true)
            protected DAE.Signature.SignedInfo.CanonicalizationMethod canonicalizationMethod;
            @XmlElement(name = "SignatureMethod", required = true)
            protected DAE.Signature.SignedInfo.SignatureMethod signatureMethod;
            @XmlElement(name = "Reference", required = true)
            protected DAE.Signature.SignedInfo.Reference reference;

            /**
             * Obtiene el valor de la propiedad canonicalizationMethod.
             * 
             * @return
             *     possible object is
             *     {@link DAE.Signature.SignedInfo.CanonicalizationMethod }
             *     
             */
            public DAE.Signature.SignedInfo.CanonicalizationMethod getCanonicalizationMethod() {
                return canonicalizationMethod;
            }

            /**
             * Define el valor de la propiedad canonicalizationMethod.
             * 
             * @param value
             *     allowed object is
             *     {@link DAE.Signature.SignedInfo.CanonicalizationMethod }
             *     
             */
            public void setCanonicalizationMethod(DAE.Signature.SignedInfo.CanonicalizationMethod value) {
                this.canonicalizationMethod = value;
            }

            /**
             * Obtiene el valor de la propiedad signatureMethod.
             * 
             * @return
             *     possible object is
             *     {@link DAE.Signature.SignedInfo.SignatureMethod }
             *     
             */
            public DAE.Signature.SignedInfo.SignatureMethod getSignatureMethod() {
                return signatureMethod;
            }

            /**
             * Define el valor de la propiedad signatureMethod.
             * 
             * @param value
             *     allowed object is
             *     {@link DAE.Signature.SignedInfo.SignatureMethod }
             *     
             */
            public void setSignatureMethod(DAE.Signature.SignedInfo.SignatureMethod value) {
                this.signatureMethod = value;
            }

            /**
             * Obtiene el valor de la propiedad reference.
             * 
             * @return
             *     possible object is
             *     {@link DAE.Signature.SignedInfo.Reference }
             *     
             */
            public DAE.Signature.SignedInfo.Reference getReference() {
                return reference;
            }

            /**
             * Define el valor de la propiedad reference.
             * 
             * @param value
             *     allowed object is
             *     {@link DAE.Signature.SignedInfo.Reference }
             *     
             */
            public void setReference(DAE.Signature.SignedInfo.Reference value) {
                this.reference = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class CanonicalizationMethod {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Algorithm")
                @XmlSchemaType(name = "anyURI")
                protected String algorithm;

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad algorithm.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAlgorithm() {
                    return algorithm;
                }

                /**
                 * Define el valor de la propiedad algorithm.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAlgorithm(String value) {
                    this.algorithm = value;
                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Transforms">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Transform">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="DigestMethod">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="DigestValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="URI" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "transforms",
                "digestMethod",
                "digestValue"
            })
            public static class Reference {

                @XmlElement(name = "Transforms", required = true)
                protected DAE.Signature.SignedInfo.Reference.Transforms transforms;
                @XmlElement(name = "DigestMethod", required = true)
                protected DAE.Signature.SignedInfo.Reference.DigestMethod digestMethod;
                @XmlElement(name = "DigestValue", required = true)
                protected String digestValue;
                @XmlAttribute(name = "URI")
                protected String uri;

                /**
                 * Obtiene el valor de la propiedad transforms.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DAE.Signature.SignedInfo.Reference.Transforms }
                 *     
                 */
                public DAE.Signature.SignedInfo.Reference.Transforms getTransforms() {
                    return transforms;
                }

                /**
                 * Define el valor de la propiedad transforms.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DAE.Signature.SignedInfo.Reference.Transforms }
                 *     
                 */
                public void setTransforms(DAE.Signature.SignedInfo.Reference.Transforms value) {
                    this.transforms = value;
                }

                /**
                 * Obtiene el valor de la propiedad digestMethod.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DAE.Signature.SignedInfo.Reference.DigestMethod }
                 *     
                 */
                public DAE.Signature.SignedInfo.Reference.DigestMethod getDigestMethod() {
                    return digestMethod;
                }

                /**
                 * Define el valor de la propiedad digestMethod.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DAE.Signature.SignedInfo.Reference.DigestMethod }
                 *     
                 */
                public void setDigestMethod(DAE.Signature.SignedInfo.Reference.DigestMethod value) {
                    this.digestMethod = value;
                }

                /**
                 * Obtiene el valor de la propiedad digestValue.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDigestValue() {
                    return digestValue;
                }

                /**
                 * Define el valor de la propiedad digestValue.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDigestValue(String value) {
                    this.digestValue = value;
                }

                /**
                 * Obtiene el valor de la propiedad uri.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getURI() {
                    return uri;
                }

                /**
                 * Define el valor de la propiedad uri.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setURI(String value) {
                    this.uri = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class DigestMethod {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "Algorithm")
                    @XmlSchemaType(name = "anyURI")
                    protected String algorithm;

                    /**
                     * Obtiene el valor de la propiedad value.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Define el valor de la propiedad value.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad algorithm.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAlgorithm() {
                        return algorithm;
                    }

                    /**
                     * Define el valor de la propiedad algorithm.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAlgorithm(String value) {
                        this.algorithm = value;
                    }

                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Transform">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "transform"
                })
                public static class Transforms {

                    @XmlElement(name = "Transform", required = true)
                    protected DAE.Signature.SignedInfo.Reference.Transforms.Transform transform;

                    /**
                     * Obtiene el valor de la propiedad transform.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DAE.Signature.SignedInfo.Reference.Transforms.Transform }
                     *     
                     */
                    public DAE.Signature.SignedInfo.Reference.Transforms.Transform getTransform() {
                        return transform;
                    }

                    /**
                     * Define el valor de la propiedad transform.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DAE.Signature.SignedInfo.Reference.Transforms.Transform }
                     *     
                     */
                    public void setTransform(DAE.Signature.SignedInfo.Reference.Transforms.Transform value) {
                        this.transform = value;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *       &lt;attribute name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class Transform {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "Algorithm")
                        @XmlSchemaType(name = "anyURI")
                        protected String algorithm;

                        /**
                         * Obtiene el valor de la propiedad value.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Define el valor de la propiedad value.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad algorithm.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAlgorithm() {
                            return algorithm;
                        }

                        /**
                         * Define el valor de la propiedad algorithm.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAlgorithm(String value) {
                            this.algorithm = value;
                        }

                    }

                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="Algorithm" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class SignatureMethod {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Algorithm")
                @XmlSchemaType(name = "anyURI")
                protected String algorithm;

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad algorithm.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAlgorithm() {
                    return algorithm;
                }

                /**
                 * Define el valor de la propiedad algorithm.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAlgorithm(String value) {
                    this.algorithm = value;
                }

            }

        }

    }

}
