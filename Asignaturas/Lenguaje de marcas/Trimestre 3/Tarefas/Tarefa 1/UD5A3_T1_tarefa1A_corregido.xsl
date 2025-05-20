<?xml version="1.0"?>

<!--
    Document   : UD5A3_T1_tarefa1A_corregido.xsl
    Created on : 20 de mayo de 2025, 8:23
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
        <almacenamiento>
            <discos num="{count(//disco)}">
                <xsl:copy-of select="equipos/máquina/hardware/disco" />
            </discos>
            <memorias num="{count(//memoria)}">
                <xsl:copy-of select="equipos/máquina/hardware/memoria" />
            </memorias>
        </almacenamiento>
    </xsl:template>

</xsl:stylesheet>
