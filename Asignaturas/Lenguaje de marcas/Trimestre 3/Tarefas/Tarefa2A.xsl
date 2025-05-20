<?xml version="1.0"?>

<!--
    Document   : Tarefa2A.xsl
    Created on : 12 de mayo de 2025, 15:15
    Author     : yotermart
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="xml"/>


    <xsl:template match="/cliente">
        <html>
            <head>
                <title>Tarefa2A.xsl</title>
            </head>
            <body>
                <xsl:element name="{name()}"/>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
