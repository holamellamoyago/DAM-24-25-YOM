<?xml version="1.0"?>

<!--
    Document   : UD5A3_T1_tarefa1B_yagootero.xsl
    Created on : 24 de mayo de 2025, 23:17
    Author     : yago8
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="polizas">
        <html>
            <head>
                <title>UD5A3_T1_tarefa1B_yagootero.xsl</title>
            </head>
            <body>
                <h1>Clientes y tipos de polizas</h1>
                <xsl:apply-templates select=""/>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="poliza">
        <p>
            <xsl:value-of select="cliente"/>
            <xsl:text>. Tipo de poliza: </xsl:text>
            <xsl:value-of select="@tipo"/>
        </p>
        
    </xsl:template>

</xsl:stylesheet>
