<?xml version="1.0"?>

<!--
    Document   : UD5A2_T2_tarefa2C_yagootero.xsl
    Created on : 12 de mayo de 2025, 21:23
    Author     : yago8
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="venda">
        <html>
            <head>
                <title>UD5A2_T2_tarefa2C_yagootero.xsl</title>
            </head>
            <body>
                <p>Cliente: <xsl:value-of select="cliente/@cod"/></p>
                <p>Numero de produtos: <xsl:value-of select="count(produtos/produto)"/></p>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
