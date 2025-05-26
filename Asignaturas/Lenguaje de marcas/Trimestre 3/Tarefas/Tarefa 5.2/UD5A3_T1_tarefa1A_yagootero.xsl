<?xml version="1.0"?>

<!--
    Document   : UD5A3_T1_tarefa1A_yagootero.xsl
    Created on : 24 de mayo de 2025, 23:09
    Author     : yago8
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="grupo">
        <html>
            <head>
                <title>UD5A3_T1_tarefa1A_yagootero.xsl</title>
            </head>
            <body>
                <h1>U2</h1>
                
                <ul>
                    <xsl:apply-templates select="integrante"/>
                </ul>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="integrante">
        <li>
            <xsl:value-of select="nombre"/>
            <xsl:text> </xsl:text>  
            <xsl:value-of select="apellidos"/>
            <xsl:text> - </xsl:text>
            <xsl:value-of select="funcion"/>
        </li>
    </xsl:template>

</xsl:stylesheet>
