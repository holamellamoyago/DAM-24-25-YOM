<?xml version="1.0"?>

<!--
    Document   : UD5A2_T4_tarefa4C_yagootero.xsl
    Created on : 19 de mayo de 2025, 0:05
    Author     : yago8
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="xml"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/horario">
        <materias>
            <xsl:apply-templates select="dia"/>
        </materias>
    </xsl:template>
    
    <xsl:template match="dia">
        <día num="{@num}">
            <xsl:apply-templates select="materia"/>
        </día>
    </xsl:template>
    
    <xsl:template match="materia">
        <materia hora="{@hora}" nome="{@nome}"/>
    </xsl:template>

</xsl:stylesheet>
