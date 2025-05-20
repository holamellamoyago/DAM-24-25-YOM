<?xml version="1.0"?>

<!--
    Document   : UD5A2_T3_tarefa3A_yagootero.xsl
    Created on : 18 de mayo de 2025, 22:41
    Author     : yago8
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="xml"/>

    <xsl:template match="/equipos">
        <discos>
            <xsl:apply-templates select="máquina/hardware/disco"/>
        </discos>
    </xsl:template>
    
    <xsl:template match="disco">
        <disco tecnoloxía="{@tecnoloxía}"/>
    </xsl:template>

</xsl:stylesheet>
