<?xml version="1.0"?>

<!--
    Document   : UD5A3_T1_tarefa1B_yagootero.xsl
    Created on : 19 de mayo de 2025, 14:57
    Author     : yotermart
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>
                <title>UD5A3_T1_tarefa1B_yagootero.xsl</title>
            </head>
            <body>
                <h1>Máquinas</h1>
                <xsl:apply-templates select="equipos/máquina"/>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="equipos/máquina">
        <a href="">
            <p><xsl:value-of select="@nome"/></p>
        </a>
    </xsl:template>
    
    <xsl:template match="equipos/máquina">
        <h2><xsl:value-of select="@nome"/></h2>
        <ul>
            <li><xsl:value-of select="hardware/tipo"/></li>
            <li><xsl:value-of select="hardware/fabricante"/></li>
            <li><xsl:value-of select="hardware/procesador"/></li>
            <li>Memoria: <xsl:value-of select="hardware/memoria"/>GB</li>
            <li>Lectora tipo: <xsl:value-of select="hardware[lectora or gravadora]/@cod"/></li>



        </ul>
    </xsl:template>

</xsl:stylesheet>
