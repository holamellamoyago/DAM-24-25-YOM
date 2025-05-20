<?xml version="1.0"?>

<!--
    Document   : UD5A2_T3_tarefa3B_yagootero.xsl
    Created on : 18 de mayo de 2025, 22:59
    Author     : yago8
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/equipos">
        <html>
            <head>
                <title>UD5A2_T3_tarefa3B_yagootero.xsl</title>
            </head>
            <body>
                <h1>Táboa das máquinas</h1>
                <table border="1px solid black">
                    <tr>
                        <td>Máquina</td>
                        <td>Procesador</td>
                        <td>Memoria</td>
                    </tr>
                    <xsl:apply-templates select="máquina"/>
                </table>
                
            </body>
        </html>
    </xsl:template>
    
    
    <xsl:template match="máquina">
        <tr>
            <td><xsl:value-of select="@nome"/></td>
            <td>
                <xsl:value-of select="hardware/procesador/@marca"/>
                <xsl:value-of select="hardware/procesador"/>
            </td>
            <td><xsl:value-of select="hardware/memoria"/></td>
        </tr>
    </xsl:template>

</xsl:stylesheet>
