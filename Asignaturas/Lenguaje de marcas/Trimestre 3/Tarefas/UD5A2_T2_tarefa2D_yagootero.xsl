<?xml version="1.0"?>

<!--
    Document   : UD5A2_T2_tarefa2D_yagootero.xsl
    Created on : 12 de mayo de 2025, 23:39
    Author     : yago8
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="text"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="venda">
        <xsl:text>Produto da familia </xsl:text>
        <xsl:value-of select="substring(produtos/produto/@cod,1,4)"/>
        <xsl:text> con código para el cliente de código </xsl:text>
        <xsl:value-of select="cliente/@cod"/>    
        
        
        <xsl:for-each select="produtos/produto">
            <xsl:text>&#xA;</xsl:text>
            <xsl:text>Produto da familia </xsl:text>
            <xsl:value-of select="substring(@cod,1,4)"/>
            <xsl:text> con código para el cliente de código </xsl:text>
            <xsl:value-of select="../../cliente/@cod"/>    
        </xsl:for-each>
    </xsl:template>
</xsl:stylesheet>
