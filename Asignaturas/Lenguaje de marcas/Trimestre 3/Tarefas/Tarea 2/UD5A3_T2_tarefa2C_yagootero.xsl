<?xml version="1.0"?>

<!--
    Document   : UD5A3_T2_tarefa2C_yagootero.xsl
    Created on : 25 de mayo de 2025, 19:40
    Author     : yago8
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
                <title>UD5A3_T2_tarefa2C_yagootero.xsl</title>
            </head>
            <body>
                <table border="1px solid black">
                    <tr font-weight="bold">
                        <td><b>Máquina</b></td>
                        <td><b>Tipo</b></td>
                        <td><b>OS</b></td>
                        <td><b>Capacidade HD</b></td>
                    </tr>
                    <xsl:apply-templates select="máquina[config/OS]">
                        <xsl:sort select="sum(hardware/disco/@capacidade)" order="descending" data-type="number"/>
                    </xsl:apply-templates>
                    
                </table>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="máquina[config/OS]">

        
        <xsl:for-each select=".">
            <xsl:if test="starts-with(config/OS, 'Windows')">

            </xsl:if>
            
            <xsl:choose>
                <xsl:when test="starts-with(config/OS, 'Windows')">
                    <tr bgcolor="yellow">
                        <td><xsl:value-of select="@nome"/></td>
                        <td><xsl:value-of select="hardware/tipo"/></td>
                        <td><xsl:value-of select="config/OS"/></td>
                            <xsl:choose>
                                <xsl:when test="hardware/disco/@capacidade &gt;= 1000">
                                    <td style="color:#FF0000">
                                        <xsl:value-of select="hardware/disco/@capacidade"/>
                                        <xsl:text> GB</xsl:text>
                                    </td>
                                </xsl:when>
                                <xsl:when  test="hardware/disco/@capacidad &lt;1000 and hardware/disco/@capacidad &gt; 499">
                                    <td style="color:#FF4500">
                                        <xsl:value-of select="hardware/disco/@capacidade"/>
                                        <xsl:text> GB</xsl:text>
                                    </td>
                                </xsl:when>
                                <xsl:otherwise>
                                    <td style="color:#FFA500">
                                        <xsl:value-of select="hardware/disco/@capacidade"/>
                                        <xsl:text> GB</xsl:text>
                                    </td>
                                </xsl:otherwise>
                        </xsl:choose>
                    </tr>
                </xsl:when>
                <xsl:otherwise>
                   <tr>
                        <td><xsl:value-of select="@nome"/></td>
                        <td><xsl:value-of select="hardware/tipo"/></td>
                        <td><xsl:value-of select="config/OS"/></td>
                        <td>
                            <xsl:value-of select="hardware/disco/@capacidade"/>
                            <xsl:text> GB</xsl:text>
                        </td>
                    </tr>
                </xsl:otherwise>
            </xsl:choose>

        </xsl:for-each>
        
    </xsl:template>

</xsl:stylesheet>
