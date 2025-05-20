<?xml version="1.0"?>

<!--
    Document   : UD5A2_T2_tarefa2B_yagootero.xsl
    Created on : 12 de mayo de 2025, 21:17
    Author     : yago8
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="text"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="produto">
        <xsl:text><xsl:value-of select="@cod"/></xsl:text>
    </xsl:template>

</xsl:stylesheet>
