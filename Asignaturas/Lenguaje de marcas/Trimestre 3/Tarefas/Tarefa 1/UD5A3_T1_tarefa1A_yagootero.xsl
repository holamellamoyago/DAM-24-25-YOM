<?xml version="1.0"?>

<!--
    Document   : UD5A3_T1_tarefa1A_yagootero.xsl
    Created on : 19 de mayo de 2025, 14:44
    Author     : yotermart
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="xml"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <almacenamento>
            <discos>
                <xsl:apply-templates select="equipos/máquina/hardware/disco"/>
            </discos>
            <memorias>
                <xsl:apply-templates select="equipos/máquina/hardware"/>
            </memorias>
        </almacenamento>
    </xsl:template>
    
    
    <xsl:template match="disco">
        <disco tecnoloxía="{@tecnoloxía}" capacidade="{@capacidade}"></disco>
    </xsl:template>
    
    <xsl:template match="hardware">
        <memoria tecnoloxía="{memoria/@tecnoloxía}"><xsl:value-of select="memoria"/></memoria>
    </xsl:template>

</xsl:stylesheet>
