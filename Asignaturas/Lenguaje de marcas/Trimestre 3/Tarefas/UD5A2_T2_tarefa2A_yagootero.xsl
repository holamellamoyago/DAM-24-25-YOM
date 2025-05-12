<?xml version="1.0"?>

<!--
    Document   : UD5A2_T2_tarefa2A_yagootero.xsl
    Created on : 12 de mayo de 2025, 20:54
    Author     : yago8
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="xml"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="venda">
        <xsl:element name="{cliente/@cod}">
            <xsl:attribute name="num_productos">
                <xsl:value-of select="count(produtos/produto)"/>
            </xsl:attribute>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>
