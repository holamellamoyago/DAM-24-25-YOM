<?xml version="1.0"?>

<!--
    Document   : plantilla.xsl
    Created on : 26 de mayo de 2025, 13:54
    Author     : yotermart
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="xml"/>
    <xsl:variable name="numero">3</xsl:variable>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="precipitaciones">
        <precipitaciones>
            <xsl:apply-templates select="registro">
                <xsl:sort select="litros-m2" order="descending" data-type="number"/>
            </xsl:apply-templates>
        </precipitaciones>
    </xsl:template>
    
    
    <xsl:template match="registro">
        <xsl:if test="position()&lt;=$numero">
            <xsl:copy-of select="."/>
        </xsl:if>
       
    </xsl:template>

</xsl:stylesheet>
