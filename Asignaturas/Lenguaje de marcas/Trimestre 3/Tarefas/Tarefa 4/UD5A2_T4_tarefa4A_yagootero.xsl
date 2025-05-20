<?xml version="1.0"?>

<!--
    Document   : UD5A2_T4_tarefa4A_yagootero.xsl
    Created on : 18 de mayo de 2025, 19:45
    Author     : yago8
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/horario/horas">
        <html>
            <head>
                <title>UD5A2_T4_tarefa4A_yagootero.xsl</title>
            </head>
            <body>
                <main>
                    <h1>Horarios ASIR ordinario, ano 2013</h1>
                    <table border="1px solid black">
                        <tr>
                            <td/>
                            <td>Inicio</td>
                            <td>Fin</td>
                        </tr>
                        <xsl:apply-templates select="hora"/>
                    </table>
                </main>
            </body>
        </html>
    </xsl:template>
    
    <xsl:template match="hora">
        <tr>
            <td>
                <xsl:value-of select="concat(@id, ' Hora')"/>
            </td>
            <td>
                <xsl:value-of select="inicio"/>
            </td>
            <td>
                <xsl:value-of select="fin"/>
            </td>
        </tr>
    </xsl:template>

</xsl:stylesheet>
