package io.jsonwebtoken;

/**
 * A <a href="https://tools.ietf.org/html/rfc7516">JWE</a> header.
 *
 * @param <T> header type
 * @since 0.7.0
 */
public interface JweHeader<T extends JweHeader<T>> extends Header<T> {

    /**
     * JWE <a href="https://tools.ietf.org/html/rfc7516#section-4.1.1">Algorithm Header</a> name: the string literal <b><code>alg</code></b>
     */
    public static final String ALGORITHM = "alg";

    /**
     * JWE <a href="https://tools.ietf.org/html/rfc7516#section-4.1.2">Encryption Algorithm Header</a> name: the string literal <b><code>enc</code></b>
     */
    public static final String ENCRYPTION_ALGORITHM = "enc";

    /**
     * JWE <a href="https://tools.ietf.org/html/rfc7516#section-4.1.3">Compression Algorithm Header</a> name: the string literal <b><code>zip</code></b>
     */
    public static final String COMPRESSION_ALGORITHM = "zip";

    /**
     * JWE <a href="https://tools.ietf.org/html/rfc7516#section-4.1.4">JWK Set URL Header</a> name: the string literal <b><code>jku</code></b>
     */
    public static final String JWK_SET_URL = "jku";

    /**
     * JWE <a href="https://tools.ietf.org/html/rfc7516#section-4.1.5">JSON Web Key Header</a> name: the string literal <b><code>jwk</code></b>
     */
    public static final String JSON_WEB_KEY = "jwk";

    /**
     * JWE <a href="https://tools.ietf.org/html/rfc7516#section-4.1.6">Key ID Header</a> name: the string literal <b><code>kid</code></b>
     */
    public static final String KEY_ID = "kid";

    /**
     * JWE <a href="https://tools.ietf.org/html/rfc7516#section-4.1.7">X.509 URL Header</a> name: the string literal <b><code>x5u</code></b>
     */
    public static final String X509_URL = "x5u";

    /**
     * JWE <a href="https://tools.ietf.org/html/rfc7516#section-4.1.8">X.509 Certificate Chain Header</a> name: the string literal <b><code>x5c</code></b>
     */
    public static final String X509_CERT_CHAIN = "x5c";

    /**
     * JWE <a href="https://tools.ietf.org/html/rfc7516#section-4.1.9">X.509 Certificate SHA-1 Thumbprint Header</a> name: the string literal <b><code>x5t</code></b>
     */
    public static final String X509_CERT_SHA1_THUMBPRINT = "x5t";

    /**
     * JWE <a href="https://tools.ietf.org/html/rfc7516#section-4.1.10">X.509 Certificate SHA-256 Thumbprint Header</a> name: the string literal <b><code>x5t#S256</code></b>
     */
    public static final String X509_CERT_SHA256_THUMBPRINT = "x5t#S256";

    /**
     * JWE <a href="https://tools.ietf.org/html/rfc7516#section-4.1.13">Critical Header</a> name: the string literal <b><code>crit</code></b>
     */
    public static final String CRITICAL = "crit";

}
