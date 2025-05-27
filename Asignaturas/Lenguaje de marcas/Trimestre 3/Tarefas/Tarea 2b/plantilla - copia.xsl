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
    <xsl:variable name="lugar">Vigo</xsl:variable>
    <xsl:variable name="num">3</xsl:variable>
    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <precipitaciones>
            <xsl:for-each select="precipitaciones/registro">
                <xsl:sort select="litros" order="descending" data-type="number"/>
                <xsl:if test="[position()&lt;=3]">
                <xsl:copy-of select="."/>
            </xsl:for-each>
        </precipitaciones>
    </xsl:template>

</xsl:stylesheet>
