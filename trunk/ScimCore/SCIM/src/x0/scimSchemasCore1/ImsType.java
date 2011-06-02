/*
 * XML Type:  ImsType
 * Namespace: urn:scim:schemas:core:1.0
 * Java type: x0.scimSchemasCore1.ImsType
 *
 * Automatically generated - do not modify.
 */
package x0.scimSchemasCore1;


/**
 * An XML ImsType(@urn:scim:schemas:core:1.0).
 *
 * This is a complex type.
 */
public interface ImsType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ImsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49AFFD295516B9521E99EB5B1895FF95").resolveHandle("imstype619dtype");
    
    /**
     * Gets array of all "im" elements
     */
    x0.scimSchemasCore1.ImType[] getImArray();
    
    /**
     * Gets ith "im" element
     */
    x0.scimSchemasCore1.ImType getImArray(int i);
    
    /**
     * Returns number of "im" element
     */
    int sizeOfImArray();
    
    /**
     * Sets array of all "im" element
     */
    void setImArray(x0.scimSchemasCore1.ImType[] imArray);
    
    /**
     * Sets ith "im" element
     */
    void setImArray(int i, x0.scimSchemasCore1.ImType im);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "im" element
     */
    x0.scimSchemasCore1.ImType insertNewIm(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "im" element
     */
    x0.scimSchemasCore1.ImType addNewIm();
    
    /**
     * Removes the ith "im" element
     */
    void removeIm(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.scimSchemasCore1.ImsType newInstance() {
          return (x0.scimSchemasCore1.ImsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.scimSchemasCore1.ImsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.scimSchemasCore1.ImsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.scimSchemasCore1.ImsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.scimSchemasCore1.ImsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.scimSchemasCore1.ImsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.scimSchemasCore1.ImsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.scimSchemasCore1.ImsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.scimSchemasCore1.ImsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.scimSchemasCore1.ImsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.scimSchemasCore1.ImsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.scimSchemasCore1.ImsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.scimSchemasCore1.ImsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.scimSchemasCore1.ImsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.scimSchemasCore1.ImsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.scimSchemasCore1.ImsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.scimSchemasCore1.ImsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.scimSchemasCore1.ImsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.scimSchemasCore1.ImsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.scimSchemasCore1.ImsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.scimSchemasCore1.ImsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.scimSchemasCore1.ImsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.scimSchemasCore1.ImsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.scimSchemasCore1.ImsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.scimSchemasCore1.ImsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.scimSchemasCore1.ImsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.scimSchemasCore1.ImsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.scimSchemasCore1.ImsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.scimSchemasCore1.ImsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.scimSchemasCore1.ImsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.scimSchemasCore1.ImsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static x0.scimSchemasCore1.ImsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.scimSchemasCore1.ImsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static x0.scimSchemasCore1.ImsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.scimSchemasCore1.ImsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
