<?xml version="1.0"?>

<!--
    Document   : UD5A3_T1_tarefa1A_yagootero.xsl
    Created on : 19 de mayo de 2025, 14:11
    Author     : yotermart
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    
    <xsl:template match="/">
        <html>
            <head>
                <title>aaUD5A3_T1_tarefa1A_yagootero.xsl</title>
            </head>
            <body>
                <main>
                    <p><xsl:value-of select="/@nombre"/> A</p>
                </main>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
