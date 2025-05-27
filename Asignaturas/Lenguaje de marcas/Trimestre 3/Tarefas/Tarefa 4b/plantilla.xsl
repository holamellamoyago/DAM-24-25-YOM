<?xml version="1.0"?>

<!--
    Document   : plantilla.xsl
    Created on : 26 de mayo de 2025, 13:54
    Author     : yotermart
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="precipitaciones">
        <html>
            <head>
                <title>plantilla.xsl</title>
            </head>
            <body>
                <h1>Registro de precipitaciones</h1>
                <ul>
                    <xsl:apply-templates select="registro"/>
                </ul>
                
            </body>
        </html>
    </xsl:template>
    
    
    <xsl:template match="registro">
        <xsl:variable name="m2">
            <xsl:value-of select="concat(litros-m2,' l/m2')"/>
        </xsl:variable>
        
        <li>
            <xsl:if test="(lugar='Vigo')">
                <xsl:attribute name="style">color:red;</xsl:attribute>
            </xsl:if>
            
            <b><xsl:value-of select="lugar"/>: </b>
            <xsl:value-of select="fecha"/>
            (<xsl:value-of select="$m2"/>)</li>
    </xsl:template>

</xsl:stylesheet>
