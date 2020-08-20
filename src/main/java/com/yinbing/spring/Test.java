package com.yinbing.spring;

public class Test {
    public static void main(String[] args) {
        String text = "\n" +
                "package iata.ndc182.extension;\n" +
                "\n" +
                "import iata.ndc18.common.OrderStatusCodeContentType;\n" +
                "import java.util.ArrayList;\n" +
                "import java.util.List;\n" +
                "import javax.xml.bind.annotation.XmlAccessType;\n" +
                "import javax.xml.bind.annotation.XmlAccessorType;\n" +
                "import javax.xml.bind.annotation.XmlElement;\n" +
                "import javax.xml.bind.annotation.XmlSchemaType;\n" +
                "import javax.xml.bind.annotation.XmlType;\n" +
                "import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;\n" +
                "import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;\n" +
                "import javax.xml.datatype.XMLGregorianCalendar;\n" +
                "import iata.ndc182.orderchangenotifrq.BilateralTimeLimitType;\n" +
                "import iata.ndc182.orderchangenotifrq.BookingRefType;\n" +
                "import iata.ndc182.orderchangenotifrq.Order1Type;\n" +
                "import iata.ndc182.orderchangenotifrq.OrderStatusCodeContentType;\n" +
                "import iata.ndc182.orderchangenotifrq.OriginalOrderType;\n" +
                "import iata.ndc182.orderchangenotifrq.OwnerTypeCodeContentType;\n" +
                "import iata.ndc182.orderchangenotifrq.PaxGroupType;\n" +
                "import iata.ndc182.orderchangenotifrq.PaymentInfoType;\n" +
                "import iata.ndc182.orderchangenotifrq.PriceType;\n" +
                "\n" +
                "\n" +
                "/**\n" +
                " * A uniquely identified record of the agreement of one party with another to receive products and services under " +
                "specified terms and conditions. Order supports the sale of a flexible range of airline products and services that are " +
                "not necessarily Journey b\n" +
                " * \n" +
                " * <p>NotificationOrderType complex type的 Java 类。\n" +
                " * \n" +
                " * <p>以下模式片段指定包含在此类中的预期内容。\n" +
                " * \n" +
                " * <pre>\n" +
                " * &lt;complexType name=\"NotificationOrderType\"&gt;\n" +
                " *   &lt;complexContent&gt;\n" +
                " *     &lt;restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\"&gt;\n" +
                " *       &lt;sequence&gt;\n" +
                " *         &lt;element name=\"BilateralTimeLimit\" type=\"{http://www.iata.org/IATA/2015/00/2018" +
                ".2/IATA_OrderChangeNotifRQ}BilateralTimeLimitType\" maxOccurs=\"unbounded\" minOccurs=\"0\"/&gt;\n" +
                " *         &lt;element name=\"BookingRef\" type=\"{http://www.iata.org/IATA/2015/00/2018" +
                ".2/IATA_OrderChangeNotifRQ}BookingRefType\" maxOccurs=\"unbounded\" minOccurs=\"0\"/&gt;\n" +
                " *         &lt;element name=\"DepositTimeLimitDateTime\" type=\"{http://www.iata.org/IATA/2015/00/2018" +
                ".2/IATA_OrderChangeNotifRQ}DateTimeType\" minOccurs=\"0\"/&gt;\n" +
                " *         &lt;element name=\"NamingTimeLimitDateTime\" type=\"{http://www.iata.org/IATA/2015/00/2018" +
                ".2/IATA_OrderChangeNotifRQ}DateTimeType\" minOccurs=\"0\"/&gt;\n" +
                " *         &lt;element name=\"OrderID\" type=\"{http://www.iata.org/IATA/2015/00/2018" +
                ".2/IATA_OrderChangeNotifRQ}ID_Type\" minOccurs=\"0\"/&gt;\n" +
                " *         &lt;element name=\"OrderItem\" type=\"{http://www.iata.org/IATA/2015/00/2018" +
                ".2/OJT/IATA_Extension}NotificationOrderItemType\" maxOccurs=\"unbounded\" minOccurs=\"0\"/&gt;\n" +
                " *         &lt;element name=\"OrderKeys\" type=\"{http://www.iata.org/IATA/2015/00/2018" +
                ".2/IATA_OrderChangeNotifRQ}Order1Type\" maxOccurs=\"unbounded\" minOccurs=\"0\"/&gt;\n" +
                " *         &lt;element name=\"OriginalOrder\" type=\"{http://www.iata.org/IATA/2015/00/2018" +
                ".2/IATA_OrderChangeNotifRQ}OriginalOrderType\" minOccurs=\"0\"/&gt;\n" +
                " *         &lt;element name=\"OwnerCode\" type=\"{http://www.iata.org/IATA/2015/00/2018" +
                ".2/IATA_OrderChangeNotifRQ}AirlineDesigCodeType\" minOccurs=\"0\"/&gt;\n" +
                " *         &lt;element name=\"OwnerTypeCode\" type=\"{http://www.iata.org/IATA/2015/00/2018" +
                ".2/IATA_OrderChangeNotifRQ}OwnerTypeCodeType\" minOccurs=\"0\"/&gt;\n" +
                " *         &lt;element name=\"PaxGroup\" type=\"{http://www.iata.org/IATA/2015/00/2018" +
                ".2/IATA_OrderChangeNotifRQ}PaxGroupType\" minOccurs=\"0\"/&gt;\n" +
                " *         &lt;element name=\"PaymentInfo\" type=\"{http://www.iata.org/IATA/2015/00/2018" +
                ".2/IATA_OrderChangeNotifRQ}PaymentInfoType\" maxOccurs=\"unbounded\" minOccurs=\"0\"/&gt;\n" +
                " *         &lt;element name=\"PaymentTimeLimitDateTime\" type=\"{http://www.iata.org/IATA/2015/00/2018" +
                ".2/IATA_OrderChangeNotifRQ}DateTimeType\" minOccurs=\"0\"/&gt;\n" +
                " *         &lt;element name=\"StatusCode\" type=\"{http://www.iata.org/IATA/2015/00/2018" +
                ".2/IATA_OrderChangeNotifRQ}OrderStatusCodeType\" minOccurs=\"0\"/&gt;\n" +
                " *         &lt;element name=\"TotalPrice\" type=\"{http://www.iata.org/IATA/2015/00/2018" +
                ".2/IATA_OrderChangeNotifRQ}PriceType\" minOccurs=\"0\"/&gt;\n" +
                " *         &lt;element name=\"WebAddressURI\" type=\"{http://www.iata.org/IATA/2015/00/2018" +
                ".2/IATA_OrderChangeNotifRQ}UniformResourceID_Type\" minOccurs=\"0\"/&gt;\n" +
                " *       &lt;/sequence&gt;\n" +
                " *     &lt;/restriction&gt;\n" +
                " *   &lt;/complexContent&gt;\n" +
                " * &lt;/complexType&gt;\n" +
                " * </pre>\n" +
                " * \n" +
                " * \n" +
                " */\n" +
                "@XmlAccessorType(XmlAccessType.FIELD)\n" +
                "@XmlType(name = \"NotificationOrderType\", propOrder = {\n" +
                "    \"bilateralTimeLimit\",\n" +
                "    \"bookingRef\",\n" +
                "    \"depositTimeLimitDateTime\",\n" +
                "    \"namingTimeLimitDateTime\",\n" +
                "    \"orderID\",\n" +
                "    \"orderItem\",\n" +
                "    \"orderKeys\",\n" +
                "    \"originalOrder\",\n" +
                "    \"ownerCode\",\n" +
                "    \"ownerTypeCode\",\n" +
                "    \"paxGroup\",\n" +
                "    \"paymentInfo\",\n" +
                "    \"paymentTimeLimitDateTime\",\n" +
                "    \"statusCode\",\n" +
                "    \"totalPrice\",\n" +
                "    \"webAddressURI\"\n" +
                "})\n" +
                "public class NotificationOrderType {\n" +
                "\n" +
                "    @XmlElement(name = \"BilateralTimeLimit\")\n" +
                "    protected List<BilateralTimeLimitType> bilateralTimeLimit;\n" +
                "    @XmlElement(name = \"BookingRef\")\n" +
                "    protected List<BookingRefType> bookingRef;\n" +
                "    @XmlElement(name = \"DepositTimeLimitDateTime\")\n" +
                "    @XmlSchemaType(name = \"dateTime\")\n" +
                "    protected XMLGregorianCalendar depositTimeLimitDateTime;\n" +
                "    @XmlElement(name = \"NamingTimeLimitDateTime\")\n" +
                "    @XmlSchemaType(name = \"dateTime\")\n" +
                "    protected XMLGregorianCalendar namingTimeLimitDateTime;\n" +
                "    @XmlElement(name = \"OrderID\")\n" +
                "    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)\n" +
                "    @XmlSchemaType(name = \"token\")\n" +
                "    protected String orderID;\n" +
                "    @XmlElement(name = \"OrderItem\")\n" +
                "    protected List<NotificationOrderItemType> orderItem;\n" +
                "    @XmlElement(name = \"OrderKeys\")\n" +
                "    protected List<Order1Type> orderKeys;\n" +
                "    @XmlElement(name = \"OriginalOrder\")\n" +
                "    protected OriginalOrderType originalOrder;\n" +
                "    @XmlElement(name = \"OwnerCode\")\n" +
                "    protected String ownerCode;\n" +
                "    @XmlElement(name = \"OwnerTypeCode\")\n" +
                "    @XmlSchemaType(name = \"string\")\n" +
                "    protected OwnerTypeCodeContentType ownerTypeCode;\n" +
                "    @XmlElement(name = \"PaxGroup\")\n" +
                "    protected PaxGroupType paxGroup;\n" +
                "    @XmlElement(name = \"PaymentInfo\")\n" +
                "    protected List<PaymentInfoType> paymentInfo;\n" +
                "    @XmlElement(name = \"PaymentTimeLimitDateTime\")\n" +
                "    @XmlSchemaType(name = \"dateTime\")\n" +
                "    protected XMLGregorianCalendar paymentTimeLimitDateTime;\n" +
                "    @XmlElement(name = \"StatusCode\")\n" +
                "    @XmlSchemaType(name = \"string\")\n" +
                "    protected OrderStatusCodeContentType statusCode;\n" +
                "    @XmlElement(name = \"TotalPrice\")\n" +
                "    protected PriceType totalPrice;\n" +
                "    @XmlElement(name = \"WebAddressURI\")\n" +
                "    @XmlSchemaType(name = \"anyURI\")\n" +
                "    protected String webAddressURI;\n" +
                "\n" +
                "    /**\n" +
                "     * Gets the value of the bilateralTimeLimit property.\n" +
                "     * \n" +
                "     * <p>\n" +
                "     * This accessor method returns a reference to the live list,\n" +
                "     * not a snapshot. Therefore any modification you make to the\n" +
                "     * returned list will be present inside the JAXB object.\n" +
                "     * This is why there is not a <CODE>set</CODE> method for the bilateralTimeLimit property.\n" +
                "     * \n" +
                "     * <p>\n" +
                "     * For example, to add a new item, do as follows:\n" +
                "     * <pre>\n" +
                "     *    getBilateralTimeLimit().add(newItem);\n" +
                "     * </pre>\n" +
                "     * \n" +
                "     * \n" +
                "     * <p>\n" +
                "     * Objects of the following type(s) are allowed in the list\n" +
                "     * {@link BilateralTimeLimitType }\n" +
                "     * \n" +
                "     * \n" +
                "     */\n" +
                "    public List<BilateralTimeLimitType> getBilateralTimeLimit() {\n" +
                "        if (bilateralTimeLimit == null) {\n" +
                "            bilateralTimeLimit = new ArrayList<BilateralTimeLimitType>();\n" +
                "        }\n" +
                "        return this.bilateralTimeLimit;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * Gets the value of the bookingRef property.\n" +
                "     * \n" +
                "     * <p>\n" +
                "     * This accessor method returns a reference to the live list,\n" +
                "     * not a snapshot. Therefore any modification you make to the\n" +
                "     * returned list will be present inside the JAXB object.\n" +
                "     * This is why there is not a <CODE>set</CODE> method for the bookingRef property.\n" +
                "     * \n" +
                "     * <p>\n" +
                "     * For example, to add a new item, do as follows:\n" +
                "     * <pre>\n" +
                "     *    getBookingRef().add(newItem);\n" +
                "     * </pre>\n" +
                "     * \n" +
                "     * \n" +
                "     * <p>\n" +
                "     * Objects of the following type(s) are allowed in the list\n" +
                "     * {@link BookingRefType }\n" +
                "     * \n" +
                "     * \n" +
                "     */\n" +
                "    public List<BookingRefType> getBookingRef() {\n" +
                "        if (bookingRef == null) {\n" +
                "            bookingRef = new ArrayList<BookingRefType>();\n" +
                "        }\n" +
                "        return this.bookingRef;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 获取depositTimeLimitDateTime属性的值。\n" +
                "     * \n" +
                "     * @return\n" +
                "     *     possible object is\n" +
                "     *     {@link XMLGregorianCalendar }\n" +
                "     *     \n" +
                "     */\n" +
                "    public XMLGregorianCalendar getDepositTimeLimitDateTime() {\n" +
                "        return depositTimeLimitDateTime;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 设置depositTimeLimitDateTime属性的值。\n" +
                "     * \n" +
                "     * @param value\n" +
                "     *     allowed object is\n" +
                "     *     {@link XMLGregorianCalendar }\n" +
                "     *     \n" +
                "     */\n" +
                "    public void setDepositTimeLimitDateTime(XMLGregorianCalendar value) {\n" +
                "        this.depositTimeLimitDateTime = value;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 获取namingTimeLimitDateTime属性的值。\n" +
                "     * \n" +
                "     * @return\n" +
                "     *     possible object is\n" +
                "     *     {@link XMLGregorianCalendar }\n" +
                "     *     \n" +
                "     */\n" +
                "    public XMLGregorianCalendar getNamingTimeLimitDateTime() {\n" +
                "        return namingTimeLimitDateTime;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 设置namingTimeLimitDateTime属性的值。\n" +
                "     * \n" +
                "     * @param value\n" +
                "     *     allowed object is\n" +
                "     *     {@link XMLGregorianCalendar }\n" +
                "     *     \n" +
                "     */\n" +
                "    public void setNamingTimeLimitDateTime(XMLGregorianCalendar value) {\n" +
                "        this.namingTimeLimitDateTime = value;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 获取orderID属性的值。\n" +
                "     * \n" +
                "     * @return\n" +
                "     *     possible object is\n" +
                "     *     {@link String }\n" +
                "     *     \n" +
                "     */\n" +
                "    public String getOrderID() {\n" +
                "        return orderID;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 设置orderID属性的值。\n" +
                "     * \n" +
                "     * @param value\n" +
                "     *     allowed object is\n" +
                "     *     {@link String }\n" +
                "     *     \n" +
                "     */\n" +
                "    public void setOrderID(String value) {\n" +
                "        this.orderID = value;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * Gets the value of the orderItem property.\n" +
                "     * \n" +
                "     * <p>\n" +
                "     * This accessor method returns a reference to the live list,\n" +
                "     * not a snapshot. Therefore any modification you make to the\n" +
                "     * returned list will be present inside the JAXB object.\n" +
                "     * This is why there is not a <CODE>set</CODE> method for the orderItem property.\n" +
                "     * \n" +
                "     * <p>\n" +
                "     * For example, to add a new item, do as follows:\n" +
                "     * <pre>\n" +
                "     *    getOrderItem().add(newItem);\n" +
                "     * </pre>\n" +
                "     * \n" +
                "     * \n" +
                "     * <p>\n" +
                "     * Objects of the following type(s) are allowed in the list\n" +
                "     * {@link NotificationOrderItemType }\n" +
                "     * \n" +
                "     * \n" +
                "     */\n" +
                "    public List<NotificationOrderItemType> getOrderItem() {\n" +
                "        if (orderItem == null) {\n" +
                "            orderItem = new ArrayList<NotificationOrderItemType>();\n" +
                "        }\n" +
                "        return this.orderItem;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * Gets the value of the orderKeys property.\n" +
                "     * \n" +
                "     * <p>\n" +
                "     * This accessor method returns a reference to the live list,\n" +
                "     * not a snapshot. Therefore any modification you make to the\n" +
                "     * returned list will be present inside the JAXB object.\n" +
                "     * This is why there is not a <CODE>set</CODE> method for the orderKeys property.\n" +
                "     * \n" +
                "     * <p>\n" +
                "     * For example, to add a new item, do as follows:\n" +
                "     * <pre>\n" +
                "     *    getOrderKeys().add(newItem);\n" +
                "     * </pre>\n" +
                "     * \n" +
                "     * \n" +
                "     * <p>\n" +
                "     * Objects of the following type(s) are allowed in the list\n" +
                "     * {@link Order1Type }\n" +
                "     * \n" +
                "     * \n" +
                "     */\n" +
                "    public List<Order1Type> getOrderKeys() {\n" +
                "        if (orderKeys == null) {\n" +
                "            orderKeys = new ArrayList<Order1Type>();\n" +
                "        }\n" +
                "        return this.orderKeys;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 获取originalOrder属性的值。\n" +
                "     * \n" +
                "     * @return\n" +
                "     *     possible object is\n" +
                "     *     {@link OriginalOrderType }\n" +
                "     *     \n" +
                "     */\n" +
                "    public OriginalOrderType getOriginalOrder() {\n" +
                "        return originalOrder;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 设置originalOrder属性的值。\n" +
                "     * \n" +
                "     * @param value\n" +
                "     *     allowed object is\n" +
                "     *     {@link OriginalOrderType }\n" +
                "     *     \n" +
                "     */\n" +
                "    public void setOriginalOrder(OriginalOrderType value) {\n" +
                "        this.originalOrder = value;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 获取ownerCode属性的值。\n" +
                "     * \n" +
                "     * @return\n" +
                "     *     possible object is\n" +
                "     *     {@link String }\n" +
                "     *     \n" +
                "     */\n" +
                "    public String getOwnerCode() {\n" +
                "        return ownerCode;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 设置ownerCode属性的值。\n" +
                "     * \n" +
                "     * @param value\n" +
                "     *     allowed object is\n" +
                "     *     {@link String }\n" +
                "     *     \n" +
                "     */\n" +
                "    public void setOwnerCode(String value) {\n" +
                "        this.ownerCode = value;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 获取ownerTypeCode属性的值。\n" +
                "     * \n" +
                "     * @return\n" +
                "     *     possible object is\n" +
                "     *     {@link OwnerTypeCodeContentType }\n" +
                "     *     \n" +
                "     */\n" +
                "    public OwnerTypeCodeContentType getOwnerTypeCode() {\n" +
                "        return ownerTypeCode;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 设置ownerTypeCode属性的值。\n" +
                "     * \n" +
                "     * @param value\n" +
                "     *     allowed object is\n" +
                "     *     {@link OwnerTypeCodeContentType }\n" +
                "     *     \n" +
                "     */\n" +
                "    public void setOwnerTypeCode(OwnerTypeCodeContentType value) {\n" +
                "        this.ownerTypeCode = value;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 获取paxGroup属性的值。\n" +
                "     * \n" +
                "     * @return\n" +
                "     *     possible object is\n" +
                "     *     {@link PaxGroupType }\n" +
                "     *     \n" +
                "     */\n" +
                "    public PaxGroupType getPaxGroup() {\n" +
                "        return paxGroup;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 设置paxGroup属性的值。\n" +
                "     * \n" +
                "     * @param value\n" +
                "     *     allowed object is\n" +
                "     *     {@link PaxGroupType }\n" +
                "     *     \n" +
                "     */\n" +
                "    public void setPaxGroup(PaxGroupType value) {\n" +
                "        this.paxGroup = value;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * Gets the value of the paymentInfo property.\n" +
                "     * \n" +
                "     * <p>\n" +
                "     * This accessor method returns a reference to the live list,\n" +
                "     * not a snapshot. Therefore any modification you make to the\n" +
                "     * returned list will be present inside the JAXB object.\n" +
                "     * This is why there is not a <CODE>set</CODE> method for the paymentInfo property.\n" +
                "     * \n" +
                "     * <p>\n" +
                "     * For example, to add a new item, do as follows:\n" +
                "     * <pre>\n" +
                "     *    getPaymentInfo().add(newItem);\n" +
                "     * </pre>\n" +
                "     * \n" +
                "     * \n" +
                "     * <p>\n" +
                "     * Objects of the following type(s) are allowed in the list\n" +
                "     * {@link PaymentInfoType }\n" +
                "     * \n" +
                "     * \n" +
                "     */\n" +
                "    public List<PaymentInfoType> getPaymentInfo() {\n" +
                "        if (paymentInfo == null) {\n" +
                "            paymentInfo = new ArrayList<PaymentInfoType>();\n" +
                "        }\n" +
                "        return this.paymentInfo;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 获取paymentTimeLimitDateTime属性的值。\n" +
                "     * \n" +
                "     * @return\n" +
                "     *     possible object is\n" +
                "     *     {@link XMLGregorianCalendar }\n" +
                "     *     \n" +
                "     */\n" +
                "    public XMLGregorianCalendar getPaymentTimeLimitDateTime() {\n" +
                "        return paymentTimeLimitDateTime;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 设置paymentTimeLimitDateTime属性的值。\n" +
                "     * \n" +
                "     * @param value\n" +
                "     *     allowed object is\n" +
                "     *     {@link XMLGregorianCalendar }\n" +
                "     *     \n" +
                "     */\n" +
                "    public void setPaymentTimeLimitDateTime(XMLGregorianCalendar value) {\n" +
                "        this.paymentTimeLimitDateTime = value;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 获取statusCode属性的值。\n" +
                "     * \n" +
                "     * @return\n" +
                "     *     possible object is\n" +
                "     *     {@link OrderStatusCodeContentType }\n" +
                "     *     \n" +
                "     */\n" +
                "    public OrderStatusCodeContentType getStatusCode() {\n" +
                "        return statusCode;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 设置statusCode属性的值。\n" +
                "     * \n" +
                "     * @param value\n" +
                "     *     allowed object is\n" +
                "     *     {@link OrderStatusCodeContentType }\n" +
                "     *     \n" +
                "     */\n" +
                "    public void setStatusCode(OrderStatusCodeContentType value) {\n" +
                "        this.statusCode = value;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 获取totalPrice属性的值。\n" +
                "     * \n" +
                "     * @return\n" +
                "     *     possible object is\n" +
                "     *     {@link PriceType }\n" +
                "     *     \n" +
                "     */\n" +
                "    public PriceType getTotalPrice() {\n" +
                "        return totalPrice;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 设置totalPrice属性的值。\n" +
                "     * \n" +
                "     * @param value\n" +
                "     *     allowed object is\n" +
                "     *     {@link PriceType }\n" +
                "     *     \n" +
                "     */\n" +
                "    public void setTotalPrice(PriceType value) {\n" +
                "        this.totalPrice = value;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 获取webAddressURI属性的值。\n" +
                "     * \n" +
                "     * @return\n" +
                "     *     possible object is\n" +
                "     *     {@link String }\n" +
                "     *     \n" +
                "     */\n" +
                "    public String getWebAddressURI() {\n" +
                "        return webAddressURI;\n" +
                "    }\n" +
                "\n" +
                "    /**\n" +
                "     * 设置webAddressURI属性的值。\n" +
                "     * \n" +
                "     * @param value\n" +
                "     *     allowed object is\n" +
                "     *     {@link String }\n" +
                "     *     \n" +
                "     */\n" +
                "    public void setWebAddressURI(String value) {\n" +
                "        this.webAddressURI = value;\n" +
                "    }\n" +
                "\n" +
                "}\n";

        String s = text.replaceAll("^import" + "\\.*OrderStatusCodeContentType;"+System.lineSeparator()+"$","");
        System.out.println(s);
    }
}
