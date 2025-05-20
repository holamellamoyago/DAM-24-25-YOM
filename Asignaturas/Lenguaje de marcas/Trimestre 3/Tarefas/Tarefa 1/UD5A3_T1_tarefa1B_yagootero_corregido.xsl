<?xml version="1.0"?>

<!--
    Document   : UD5A3_T1_tarefa1B_yagootero_corregido.xsl
    Created on : 20 de mayo de 2025, 8:29
    Author     : yotermart
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="equipos">
        <html>
            <head>
                <title>Lista das máquinas</title>
            </head>
            <body>
                <h1>Máquinas</h1>
                <xsl:apply-templates select="máquina" mode="enlaces"/>
                <xsl:apply-templates select="máquina" mode="descripcion"/>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="máquina" mode="enlaces">
        <a href="#{@nome}"><p><xsl:value-of select="@nome"/></p></a>
    </xsl:template>
    
    <xsl:template match="máquina" mode="descripcion">
        <h2 id="{@nome}"><xsl:value-of select="@nome"/></h2>
        <ul>
            <xsl:apply-templates select="hardware/*"/>
        </ul>
    </xsl:template>
    
    
    <xsl:template match="memoria">
        <li>Memoria: <xsl:value-of select="text()"/></li>
    </xsl:template>
    
    <xsl:template match="disco">
        <li>Disco: <xsl:value-of select="@capacidade"/> GB</li>
    </xsl:template>
    
    <xsl:template match="lectora|gravadora">
        <li><xsl:value-of select="name()"/> de <xsl:value-of select="@tipo"/></li>
    </xsl:template>
    
    <xsl:template match="*">
        <li><xsl:value-of select="text()"/></li>
    </xsl:template>

</xsl:stylesheet>
