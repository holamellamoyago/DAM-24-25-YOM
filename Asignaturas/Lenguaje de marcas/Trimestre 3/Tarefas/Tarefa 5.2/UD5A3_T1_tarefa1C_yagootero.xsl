<?xml version="1.0"?>

<!--
    Document   : UD5A3_T1_tarefa1C_yagootero.xsl
    Created on : 24 de mayo de 2025, 23:23
    Author     : yago8
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="xml"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="Catálogo">
        <equipamiento>
            <portátiles>
                <xsl:apply-templates select="Marca"/>
            </portátiles>
        </equipamiento>
    </xsl:template>
    
    
    <xsl:template match="Marca">
        <xsl:element name="{Portatil/name()}">
            <xsl:attribute name="marca">
                <xsl:value-of select="@nome"/>
            </xsl:attribute>
        </xsl:element>
    </xsl:template>
    
    

</xsl:stylesheet>
