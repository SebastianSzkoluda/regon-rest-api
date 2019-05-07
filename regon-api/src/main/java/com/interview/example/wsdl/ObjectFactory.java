
package com.interview.example.wsdl;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.interview.example.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ZalogujPKluczUzytkownika_QNAME = new QName("http://CIS/BIR/PUBL/2014/07", "pKluczUzytkownika");
    private final static QName _WylogujPIdentyfikatorSesji_QNAME = new QName("http://CIS/BIR/PUBL/2014/07", "pIdentyfikatorSesji");
    private final static QName _ZalogujResponseZalogujResult_QNAME = new QName("http://CIS/BIR/PUBL/2014/07", "ZalogujResult");
    private final static QName _SprawdzCaptchaPCaptcha_QNAME = new QName("http://CIS/BIR/2014/07", "pCaptcha");
    private final static QName _DaneSzukajResponseDaneSzukajResult_QNAME = new QName("http://CIS/BIR/PUBL/2014/07", "DaneSzukajResult");
    private final static QName _DaneSzukajPParametryWyszukiwania_QNAME = new QName("http://CIS/BIR/PUBL/2014/07", "pParametryWyszukiwania");
    private final static QName _DanePobierzPelnyRaportPNazwaRaportu_QNAME = new QName("http://CIS/BIR/PUBL/2014/07", "pNazwaRaportu");
    private final static QName _DanePobierzPelnyRaportPRegon_QNAME = new QName("http://CIS/BIR/PUBL/2014/07", "pRegon");
    private final static QName _DanePobierzPelnyRaportResponseDanePobierzPelnyRaportResult_QNAME = new QName("http://CIS/BIR/PUBL/2014/07", "DanePobierzPelnyRaportResult");
    private final static QName _SetValuePNazwaParametru_QNAME = new QName("http://CIS/BIR/2014/07", "pNazwaParametru");
    private final static QName _SetValuePWartoscParametru_QNAME = new QName("http://CIS/BIR/2014/07", "pWartoscParametru");
    private final static QName _ParametryWyszukiwaniaKrsy_QNAME = new QName("http://CIS/BIR/PUBL/2014/07/DataContract", "Krsy");
    private final static QName _ParametryWyszukiwaniaKrs_QNAME = new QName("http://CIS/BIR/PUBL/2014/07/DataContract", "Krs");
    private final static QName _ParametryWyszukiwaniaRegony9Zn_QNAME = new QName("http://CIS/BIR/PUBL/2014/07/DataContract", "Regony9zn");
    private final static QName _ParametryWyszukiwaniaNipy_QNAME = new QName("http://CIS/BIR/PUBL/2014/07/DataContract", "Nipy");
    private final static QName _ParametryWyszukiwaniaRegon_QNAME = new QName("http://CIS/BIR/PUBL/2014/07/DataContract", "Regon");
    private final static QName _ParametryWyszukiwaniaRegony14Zn_QNAME = new QName("http://CIS/BIR/PUBL/2014/07/DataContract", "Regony14zn");
    private final static QName _ParametryWyszukiwaniaNip_QNAME = new QName("http://CIS/BIR/PUBL/2014/07/DataContract", "Nip");
    private final static QName _DaneKomunikatResponseDaneKomunikatResult_QNAME = new QName("http://CIS/BIR/PUBL/2014/07", "DaneKomunikatResult");
    private final static QName _PobierzCaptchaResponsePobierzCaptchaResult_QNAME = new QName("http://CIS/BIR/2014/07", "PobierzCaptchaResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.interview.example.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PobierzCaptcha }
     * 
     */
    public PobierzCaptcha createPobierzCaptcha() {
        return new PobierzCaptcha();
    }

    /**
     * Create an instance of {@link GetValueResponse }
     * 
     */
    public GetValueResponse createGetValueResponse() {
        return new GetValueResponse();
    }

    /**
     * Create an instance of {@link PobierzCaptchaResponse }
     * 
     */
    public PobierzCaptchaResponse createPobierzCaptchaResponse() {
        return new PobierzCaptchaResponse();
    }

    /**
     * Create an instance of {@link SprawdzCaptcha }
     * 
     */
    public SprawdzCaptcha createSprawdzCaptcha() {
        return new SprawdzCaptcha();
    }

    /**
     * Create an instance of {@link SetValueResponse }
     * 
     */
    public SetValueResponse createSetValueResponse() {
        return new SetValueResponse();
    }

    /**
     * Create an instance of {@link SetValue }
     * 
     */
    public SetValue createSetValue() {
        return new SetValue();
    }

    /**
     * Create an instance of {@link SprawdzCaptchaResponse }
     * 
     */
    public SprawdzCaptchaResponse createSprawdzCaptchaResponse() {
        return new SprawdzCaptchaResponse();
    }

    /**
     * Create an instance of {@link GetValue }
     * 
     */
    public GetValue createGetValue() {
        return new GetValue();
    }

    /**
     * Create an instance of {@link DanePobierzPelnyRaport }
     * 
     */
    public DanePobierzPelnyRaport createDanePobierzPelnyRaport() {
        return new DanePobierzPelnyRaport();
    }

    /**
     * Create an instance of {@link ZalogujResponse }
     * 
     */
    public ZalogujResponse createZalogujResponse() {
        return new ZalogujResponse();
    }

    /**
     * Create an instance of {@link WylogujResponse }
     * 
     */
    public WylogujResponse createWylogujResponse() {
        return new WylogujResponse();
    }

    /**
     * Create an instance of {@link DaneKomunikatResponse }
     * 
     */
    public DaneKomunikatResponse createDaneKomunikatResponse() {
        return new DaneKomunikatResponse();
    }

    /**
     * Create an instance of {@link Wyloguj }
     * 
     */
    public Wyloguj createWyloguj() {
        return new Wyloguj();
    }

    /**
     * Create an instance of {@link DaneKomunikat }
     * 
     */
    public DaneKomunikat createDaneKomunikat() {
        return new DaneKomunikat();
    }

    /**
     * Create an instance of {@link DaneSzukajResponse }
     * 
     */
    public DaneSzukajResponse createDaneSzukajResponse() {
        return new DaneSzukajResponse();
    }

    /**
     * Create an instance of {@link DaneSzukaj }
     * 
     */
    public DaneSzukaj createDaneSzukaj() {
        return new DaneSzukaj();
    }

    /**
     * Create an instance of {@link ParametryWyszukiwania }
     * 
     */
    public ParametryWyszukiwania createParametryWyszukiwania() {
        return new ParametryWyszukiwania();
    }

    /**
     * Create an instance of {@link Zaloguj }
     * 
     */
    public Zaloguj createZaloguj() {
        return new Zaloguj();
    }

    /**
     * Create an instance of {@link DanePobierzPelnyRaportResponse }
     * 
     */
    public DanePobierzPelnyRaportResponse createDanePobierzPelnyRaportResponse() {
        return new DanePobierzPelnyRaportResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07", name = "pKluczUzytkownika", scope = Zaloguj.class)
    public JAXBElement<String> createZalogujPKluczUzytkownika(String value) {
        return new JAXBElement<String>(_ZalogujPKluczUzytkownika_QNAME, String.class, Zaloguj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07", name = "pIdentyfikatorSesji", scope = Wyloguj.class)
    public JAXBElement<String> createWylogujPIdentyfikatorSesji(String value) {
        return new JAXBElement<String>(_WylogujPIdentyfikatorSesji_QNAME, String.class, Wyloguj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07", name = "ZalogujResult", scope = ZalogujResponse.class)
    public JAXBElement<String> createZalogujResponseZalogujResult(String value) {
        return new JAXBElement<String>(_ZalogujResponseZalogujResult_QNAME, String.class, ZalogujResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/2014/07", name = "pCaptcha", scope = SprawdzCaptcha.class)
    public JAXBElement<String> createSprawdzCaptchaPCaptcha(String value) {
        return new JAXBElement<String>(_SprawdzCaptchaPCaptcha_QNAME, String.class, SprawdzCaptcha.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07", name = "DaneSzukajResult", scope = DaneSzukajResponse.class)
    public JAXBElement<String> createDaneSzukajResponseDaneSzukajResult(String value) {
        return new JAXBElement<String>(_DaneSzukajResponseDaneSzukajResult_QNAME, String.class, DaneSzukajResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametryWyszukiwania }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07", name = "pParametryWyszukiwania", scope = DaneSzukaj.class)
    public JAXBElement<ParametryWyszukiwania> createDaneSzukajPParametryWyszukiwania(ParametryWyszukiwania value) {
        return new JAXBElement<ParametryWyszukiwania>(_DaneSzukajPParametryWyszukiwania_QNAME, ParametryWyszukiwania.class, DaneSzukaj.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07", name = "pNazwaRaportu", scope = DanePobierzPelnyRaport.class)
    public JAXBElement<String> createDanePobierzPelnyRaportPNazwaRaportu(String value) {
        return new JAXBElement<String>(_DanePobierzPelnyRaportPNazwaRaportu_QNAME, String.class, DanePobierzPelnyRaport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07", name = "pRegon", scope = DanePobierzPelnyRaport.class)
    public JAXBElement<String> createDanePobierzPelnyRaportPRegon(String value) {
        return new JAXBElement<String>(_DanePobierzPelnyRaportPRegon_QNAME, String.class, DanePobierzPelnyRaport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07", name = "DanePobierzPelnyRaportResult", scope = DanePobierzPelnyRaportResponse.class)
    public JAXBElement<String> createDanePobierzPelnyRaportResponseDanePobierzPelnyRaportResult(String value) {
        return new JAXBElement<String>(_DanePobierzPelnyRaportResponseDanePobierzPelnyRaportResult_QNAME, String.class, DanePobierzPelnyRaportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/2014/07", name = "pNazwaParametru", scope = SetValue.class)
    public JAXBElement<String> createSetValuePNazwaParametru(String value) {
        return new JAXBElement<String>(_SetValuePNazwaParametru_QNAME, String.class, SetValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/2014/07", name = "pWartoscParametru", scope = SetValue.class)
    public JAXBElement<String> createSetValuePWartoscParametru(String value) {
        return new JAXBElement<String>(_SetValuePWartoscParametru_QNAME, String.class, SetValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07/DataContract", name = "Krsy", scope = ParametryWyszukiwania.class)
    public JAXBElement<String> createParametryWyszukiwaniaKrsy(String value) {
        return new JAXBElement<String>(_ParametryWyszukiwaniaKrsy_QNAME, String.class, ParametryWyszukiwania.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07/DataContract", name = "Krs", scope = ParametryWyszukiwania.class)
    public JAXBElement<String> createParametryWyszukiwaniaKrs(String value) {
        return new JAXBElement<String>(_ParametryWyszukiwaniaKrs_QNAME, String.class, ParametryWyszukiwania.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07/DataContract", name = "Regony9zn", scope = ParametryWyszukiwania.class)
    public JAXBElement<String> createParametryWyszukiwaniaRegony9Zn(String value) {
        return new JAXBElement<String>(_ParametryWyszukiwaniaRegony9Zn_QNAME, String.class, ParametryWyszukiwania.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07/DataContract", name = "Nipy", scope = ParametryWyszukiwania.class)
    public JAXBElement<String> createParametryWyszukiwaniaNipy(String value) {
        return new JAXBElement<String>(_ParametryWyszukiwaniaNipy_QNAME, String.class, ParametryWyszukiwania.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07/DataContract", name = "Regon", scope = ParametryWyszukiwania.class)
    public JAXBElement<String> createParametryWyszukiwaniaRegon(String value) {
        return new JAXBElement<String>(_ParametryWyszukiwaniaRegon_QNAME, String.class, ParametryWyszukiwania.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07/DataContract", name = "Regony14zn", scope = ParametryWyszukiwania.class)
    public JAXBElement<String> createParametryWyszukiwaniaRegony14Zn(String value) {
        return new JAXBElement<String>(_ParametryWyszukiwaniaRegony14Zn_QNAME, String.class, ParametryWyszukiwania.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07/DataContract", name = "Nip", scope = ParametryWyszukiwania.class)
    public JAXBElement<String> createParametryWyszukiwaniaNip(String value) {
        return new JAXBElement<String>(_ParametryWyszukiwaniaNip_QNAME, String.class, ParametryWyszukiwania.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/2014/07", name = "pNazwaParametru", scope = GetValue.class)
    public JAXBElement<String> createGetValuePNazwaParametru(String value) {
        return new JAXBElement<String>(_SetValuePNazwaParametru_QNAME, String.class, GetValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/PUBL/2014/07", name = "DaneKomunikatResult", scope = DaneKomunikatResponse.class)
    public JAXBElement<String> createDaneKomunikatResponseDaneKomunikatResult(String value) {
        return new JAXBElement<String>(_DaneKomunikatResponseDaneKomunikatResult_QNAME, String.class, DaneKomunikatResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://CIS/BIR/2014/07", name = "PobierzCaptchaResult", scope = PobierzCaptchaResponse.class)
    public JAXBElement<String> createPobierzCaptchaResponsePobierzCaptchaResult(String value) {
        return new JAXBElement<String>(_PobierzCaptchaResponsePobierzCaptchaResult_QNAME, String.class, PobierzCaptchaResponse.class, value);
    }

}
