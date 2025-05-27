<?xml version="1.0"?>

<!--
    Document   : 2a.xsl
    Created on : 26 de mayo de 2025, 21:43
    Author     : yago8
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="polizas">
        <html>
            <head>
                <title>2a.xsl</title>
            </head>
            <body>
                <h1>Reclamaciones desde 2004</h1>
                <xsl:apply-templates select="poliza[reclamaciones/reclamacion/ano&gt;2003]"/>
            </body>
        </html>
    </xsl:template>
    
    
    <xsl:template match="poliza">
        <p><xsl:value-of select="cliente"/></p>
        <p><xsl:apply-templates select="reclamaciones/reclamacion/ano"/></p>
    </xsl:template>
    
    <xsl:template match="ano">
        <xsl:value-of select="."/>
        <xsl:if test="position() != last()">
            <xsl:text> </xsl:text>
        </xsl:if>
    </xsl:template>
    

</xsl:stylesheet>
