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
    <xsl:variable name="color">yellow</xsl:variable>
    <xsl:variable name="encabezado">
        <tr>
            <th>Máquina</th>
            <th>Tipo</th>
            <th>OS</th>
            <th>Capacidade HD</th>
        </tr>
    </xsl:variable>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="equipos">
        <equipos>
            <xsl:apply-templates select="máquina[starts-with(@nome,'PC')]máquina[not(starts-with(config/OS, 'Windows'))]"/>
            <xsl:apply-templates select="máquina[starts-with(@nome,'PC')]máquina[starts-with(config/OS, 'Windows')]">
                <xsl:sort select="sum(hardware/disco/@capacidade)" order="descending" data-type="number"/>
            </xsl:apply-templates>
        </equipos>
    </xsl:template>
    
    <xsl:template match="máquina">
        <xsl:copy-of select="."/>
    </xsl:template>
    

</xsl:stylesheet>
