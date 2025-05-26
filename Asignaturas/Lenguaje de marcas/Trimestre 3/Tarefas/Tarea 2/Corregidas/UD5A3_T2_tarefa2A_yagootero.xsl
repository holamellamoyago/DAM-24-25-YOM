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
                    <tr>
                        <th>Máquina</th>
                        <th>Tipo</th>
                    </tr>
                    <xsl:apply-templates select="máquina[not(starts-with(hardware/tipo,'Impresora'))]">
                        <xsl:sort select="hardware/tipo"/>
                        <xsl:sort select="@nome"/>
                    </xsl:apply-templates>
                </table>
                
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="máquina">
        <tr>
            <xsl:if test="hardware/tipo='Semitorre' or hardware/tipo='PC Sobremesa'">
                <xsl:attribute name="style">background-color:yellow;</xsl:attribute>
            </xsl:if>
            
            <td><xsl:value-of select="@nome"/></td>
            <td><xsl:value-of select="hardware/tipo"/></td>
            
            
        </tr>
    </xsl:template>
    

</xsl:stylesheet>
