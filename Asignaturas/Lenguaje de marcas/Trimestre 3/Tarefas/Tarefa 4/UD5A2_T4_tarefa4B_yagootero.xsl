<?xml version="1.0"?>

<!--
    Document   : UD5A2_T4_tarefa4B_yagootero.xsl
    Created on : 18 de mayo de 2025, 23:56
    Author     : yago8
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/horario">
        <html>
            <head>
                <title>UD5A2_T4_tarefa4B_yagootero.xsl</title>
            </head>
            <body>
                <h1>Asignaturas por día</h1>
                <xsl:apply-templates select="dia"/>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="dia">
        <ul>
            <li>
                <xsl:value-of select="concat('Día ' , @num)"/>
                <ul>
                    <xsl:apply-templates select="materia"/>
                </ul>
            </li>
        </ul>
    </xsl:template>
    
    <xsl:template match="materia">
        <li><xsl:value-of select="@nome"/></li>
    </xsl:template>

</xsl:stylesheet>
