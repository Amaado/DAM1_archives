<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html"></xsl:output>
    <xsl:template match="/">
        <html>
            <style type="text/css">
                table,th,td {
                border: 2px solid blue;
                border-collapse:collapse;
                align-items: left;
                text-align: left;
                }
            </style>
            <head>
                <title>Edificios</title>
            </head>
            <body>
                <xsl:for-each select="distinct-values(//@edificio)">
                <xsl:choose>

                    <xsl:when test="//producto[lugar/@edificio='A']/lugar/@edificio/string() ='A'">
                        <h1>Edificio <xsl:value-of
                                select="//producto[@edificio='A']/lugar/@edificio" /></h1>
                        <!--
                        <table>
                            <tr>
                                <td>
                                    <xsl:value-of select="//producto [@codigo='P1']/nombre" />
                                </td>
                                <td><xsl:value-of select="//producto [@codigo='P1']/peso" /> kg</td>
                                <td>
                                    <xsl:value-of select="//producto [@codigo='P1']/peso" />
                                </td>
                            </tr>
                            <xsl:apply-templates select="//disco" />
                        </table>-->
                    </xsl:when>

                    <xsl:when test="//producto[lugar/@edificio='B']/lugar/@edificio/string() ='B'">
                        <h1>Edificio <xsl:value-of
                                select="//producto[@edificio='A']/lugar/@edificio" /></h1>
                    </xsl:when>

                </xsl:choose>
            </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>