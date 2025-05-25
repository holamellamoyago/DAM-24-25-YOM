<?xml version="1.0"?>

<!--
    Document   : UD5A3_T2_tarefa2E_yagootero.xsl
    Created on : 25 de mayo de 2025, 23:11
    Author     : yago8
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="xml"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="equipos">
        <xsl:apply-templates select="máquina[starts-with(@nome, 'PC')]">
            <xsl:sort select="config/OS" order="ascending" data-type="text"/>
        </xsl:apply-templates>
    </xsl:template>
    
    <xsl:template match="máquina[starts-with(@nome, 'PC')]">
        <xsl:apply-templates select="máquina[starts-with(config/OS, 'Windows')]">
            <xsl:sort select="sum(hardware/disco/@capacidade)" order="descending" data-type="number"/>
        </xsl:apply-templates>
        
        <xsl:apply-templates select="máquina[not(starts-with(config/OS, 'Windows'))]"/>
        
    </xsl:template>
    
    <xsl:template match="máquina[not(starts-with(config/OS, 'Windows'))]">
        <xsl:copy-of select="."/>
    </xsl:template>
    
    <xsl:template match="máquina[starts-with(config/OS, 'Windows')]">
        <xsl:copy-of select="."/>
    </xsl:template>

</xsl:stylesheet>
