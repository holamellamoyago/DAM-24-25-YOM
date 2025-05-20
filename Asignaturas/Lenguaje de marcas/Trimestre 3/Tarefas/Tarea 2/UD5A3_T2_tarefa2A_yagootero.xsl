<?xml version="1.0"?>

<!--
    Document   : UD5A3_T2_tarefa2A_yagootero.xsl
    Created on : 20 de mayo de 2025, 9:08
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
                <title>UD5A3_T2_tarefa2A_yagootero.xsl</title>
            </head>
            <body>
                <table border="1px solid black">
                    <tr>
                        <th><xsl:value-of select="name(//máquina)"/></th>
                        <th><xsl:value-of select="name(//tipo)"/></th>
                    </tr>
                    <xsl:apply-templates select="máquina" mode="amarillo"/>
                    <xsl:apply-templates select="máquina" mode="normal"/>
                    
                </table>
                
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="máquina" mode="amarillo">
        <xsl:variable name="tipo2"><xsl:value-of select="hardware/tipo/text()"/></xsl:variable>
        <xsl:if test="$tipo2='PC Sobremesa' or $tipo2='Semitorre'">
            <xsl:element name="tr">
                <td><xsl:value-of select="@nome"/></td>
                <td><xsl:value-of select="$tipo2"/></td>
            </xsl:element>
            <xsl:attribute name="style">background-color:red</xsl:attribute>
        </xsl:if>
    </xsl:template>
    
    <xsl:template match="máquina" mode="normal">
        <xsl:variable name="tipo2"><xsl:value-of select="hardware/tipo/text()"/></xsl:variable>
        <xsl:if test="$tipo2!='PC Sobremesa' or $tipo2!='Semitorre' or not(starts-with('Impresora')$tipo2)">
            <xsl:element name="tr">
                <td><xsl:value-of select="@nome"/></td>
                <td><xsl:value-of select="$tipo2"/></td>
            </xsl:element>
            <xsl:attribute name="style">background-color:red</xsl:attribute>
        </xsl:if>
    </xsl:template>

</xsl:stylesheet>
