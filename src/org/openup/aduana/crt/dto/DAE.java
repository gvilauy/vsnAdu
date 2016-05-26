//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2014.06.13 a las 10:02:14 AM UYT 
//


package org.openup.aduana.crt.dto;

import java.math.BigInteger;
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
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="IdDocumento" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *         &lt;element name="FechaHoraDocumentoElectronico" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CodigoIntercambio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Objeto">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Imagen">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TipoDocumentoEscaneado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="FechaEmision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DocIdOriginal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DocPaisEmision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ContenidoBase64" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TipoArchivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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

    @XmlElement(name = "TipoDocumento")
    @XmlSchemaType(name = "unsignedByte")
    protected short tipoDocumento;
    @XmlElement(name = "IdDocumento", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger idDocumento;
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
     */
    public short getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     */
    public void setTipoDocumento(short value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad idDocumento.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdDocumento() {
        return idDocumento;
    }

    /**
     * Define el valor de la propiedad idDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdDocumento(BigInteger value) {
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
     *         &lt;element name="Imagen">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TipoDocumentoEscaneado" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="FechaEmision" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DocIdOriginal" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DocPaisEmision" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ContenidoBase64" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TipoArchivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    public static class Objeto {

        @XmlElement(name = "Imagen", required = true)
        protected DAE.Objeto.Imagen imagen;

        /**
         * Obtiene el valor de la propiedad imagen.
         * 
         * @return
         *     possible object is
         *     {@link DAE.Objeto.Imagen }
         *     
         */
        public DAE.Objeto.Imagen getImagen() {
            return imagen;
        }

        /**
         * Define el valor de la propiedad imagen.
         * 
         * @param value
         *     allowed object is
         *     {@link DAE.Objeto.Imagen }
         *     
         */
        public void setImagen(DAE.Objeto.Imagen value) {
            this.imagen = value;
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
         *         &lt;element name="TipoDocumentoEscaneado" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="FechaEmision" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DocIdOriginal" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DocPaisEmision" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ContenidoBase64" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TipoArchivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "tipoDocumentoEscaneado",
            "fechaEmision",
            "docIdOriginal",
            "docPaisEmision",
            "contenidoBase64",
            "tipoArchivo"
        })
        public static class Imagen {

            @XmlElement(name = "TipoDocumentoEscaneado", required = true)
            protected String tipoDocumentoEscaneado;
            @XmlElement(name = "FechaEmision", required = true)
            protected String fechaEmision;
            @XmlElement(name = "DocIdOriginal", required = true)
            protected String docIdOriginal;
            @XmlElement(name = "DocPaisEmision", required = true)
            protected String docPaisEmision;
            @XmlElement(name = "ContenidoBase64", required = true)
            protected String contenidoBase64;
            @XmlElement(name = "TipoArchivo", required = true)
            protected String tipoArchivo;

            /**
             * Obtiene el valor de la propiedad tipoDocumentoEscaneado.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoDocumentoEscaneado() {
                return tipoDocumentoEscaneado;
            }

            /**
             * Define el valor de la propiedad tipoDocumentoEscaneado.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoDocumentoEscaneado(String value) {
                this.tipoDocumentoEscaneado = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaEmision.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaEmision() {
                return fechaEmision;
            }

            /**
             * Define el valor de la propiedad fechaEmision.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaEmision(String value) {
                this.fechaEmision = value;
            }

            /**
             * Obtiene el valor de la propiedad docIdOriginal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocIdOriginal() {
                return docIdOriginal;
            }

            /**
             * Define el valor de la propiedad docIdOriginal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocIdOriginal(String value) {
                this.docIdOriginal = value;
            }

            /**
             * Obtiene el valor de la propiedad docPaisEmision.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDocPaisEmision() {
                return docPaisEmision;
            }

            /**
             * Define el valor de la propiedad docPaisEmision.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDocPaisEmision(String value) {
                this.docPaisEmision = value;
            }

            /**
             * Obtiene el valor de la propiedad contenidoBase64.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContenidoBase64() {
                return contenidoBase64;
            }

            /**
             * Define el valor de la propiedad contenidoBase64.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContenidoBase64(String value) {
                this.contenidoBase64 = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoArchivo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoArchivo() {
                return tipoArchivo;
            }

            /**
             * Define el valor de la propiedad tipoArchivo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoArchivo(String value) {
                this.tipoArchivo = value;
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
