<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" />
    <xsl:template match="/">
        <html>
            <head>
                <style type="text/css">
                    table,th,td {
                        border: 1px solid black;
                        align-items: left;
                        text-align: left;
                    }
                </style>
                <title>Edificios</title>
            </head>
            <body>
                <xsl:for-each select="//producto[lugar[@edificio='A']]">
                    <h1>
                        Edificio
                        <xsl:value-of select="//producto[lugar[@edificio='A']]/lugar/@edificio" />
                    </h1>

                    <table>
                        <tr>
                            <td align="center">
                                <xsl:value-of select="nombre" />
                            </td>
                            <td>
                                <xsl:value-of select="peso" />
                                kg
                            </td>
                            <td align="center">
                                <xsl:value-of select="lugar/@edificio" />
                                <xsl:value-of select="lugar/aula" />
                            </td>
                        </tr>
                    </table>
                </xsl:for-each>
                
            
                <xsl:for-each select="//producto[lugar[@edificio='B']][1]">
                <h1>
                    Edificio
                    <xsl:value-of select="//producto[lugar[@edificio='B']]/lugar/@edificio" />
                </h1>
                
                <xsl:for-each select="//producto[lugar[@edificio='B']]">
                <table>
                    <tr>
                        <td align="center">
                            <xsl:value-of select="nombre" />
                        </td>
                        <td align="center">
                            <xsl:choose>
                                <xsl:when test="peso[@unidad='g']">
                                    <xsl:value-of select="(peso*0.001)" />
                                </xsl:when>
                                <xsl:otherwise>
                                    <xsl:value-of select="peso" />
                                </xsl:otherwise>
                            </xsl:choose>
                            kg
                        </td>
                        <td align="center">
                            <xsl:value-of select="lugar/@edificio" />
                            <xsl:value-of select="lugar/aula" />
                        </td>
                    </tr>
                </table>
                </xsl:for-each>


                </xsl:for-each>
                
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>