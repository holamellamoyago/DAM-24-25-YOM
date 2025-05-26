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
        <html>
            <head>
                <title>Táboa das máquinas</title>
            </head>
            <body>
                <h1>Máquinas</h1>
                <table border="1">
                    <xsl:copy-of select="$encabezado"/>
                    <xsl:apply-templates select="máquina[config/OS]">
                        <xsl:sort select="sum(hardware/disco/@capacidade)" 
                                   order="descending" data-type="number"/>
                    </xsl:apply-templates>
                </table>
                
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="máquina">
        <xsl:variable name="capacidad" select="sum(hardware/disco/@capacidade)"/>
        <tr>
            <xsl:if test="starts-with(config/OS,'Windows')">
                <xsl:attribute name="style">background:<xsl:value-of select="$color"/></xsl:attribute>
            </xsl:if>
            
            <td><xsl:value-of select="@nome"/></td>
            <td><xsl:value-of select="hardware/tipo"/></td>
            <td><xsl:value-of select="config/OS"/></td>
            
            <td>
                
                <xsl:variable name="cor_capacidade">
                    <xsl:choose>
                        <xsl:when test="$capacidad &gt;= 1000">
                            red
                        </xsl:when>

                        <xsl:when test="$capacidad &gt;= 500">
                            #FF4500
                        </xsl:when>

                        <xsl:otherwise>
                            #FFA500
                        </xsl:otherwise>
                    </xsl:choose>
                </xsl:variable>
                
                <xsl:attribute name="style">color:<xsl:value-of select="$cor_capacidade"/></xsl:attribute>

                
                <xsl:value-of select="$capacidad"/>
            </td>
            
            
        </tr>
    </xsl:template>
    

</xsl:stylesheet>
