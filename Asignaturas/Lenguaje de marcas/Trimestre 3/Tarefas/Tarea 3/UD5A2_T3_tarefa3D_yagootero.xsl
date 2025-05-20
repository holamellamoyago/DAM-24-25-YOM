<?xml version="1.0"?>

<!--
    Document   : UD5A2_T3_tarefa3D_yagootero.xsl
    Created on : 18 de mayo de 2025, 23:25
    Author     : yago8
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="xml"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/equipos">
        <máquinas>
            <xsl:apply-templates select="máquina"/>
        </máquinas>
    </xsl:template>
    
    <xsl:template match="máquina">
        <xsl:element name="máquina">
            <xsl:attribute name="tipo">
                <xsl:value-of select="hardware/tipo"/>
            </xsl:attribute>
            <xsl:attribute name="fabricante">
                <xsl:value-of select="hardware/fabricante"/>
            </xsl:attribute>
            <xsl:attribute name="procesador">
                Intel 
                <xsl:value-of select="hardware/procesador"/>
                 núcleos
                <xsl:value-of select="hardware/procesador/@num_nucleos"/>
                 a 
                <xsl:value-of select="hardware/@velocidade"/>
                GHz
            </xsl:attribute>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>
