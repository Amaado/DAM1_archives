<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" />
    <xsl:template match="/">
        <html>
            <head>
                <style type="text/css">
                    table{
                       margin-left: 40px;
                        border: 2px solid black;
                        border-style: outset;
                    }
                    th,td {
                        border: 0.5px solid black;
                        border-style: inset;
                        align-items: center;
                        text-align: center;
                    }
                </style>
                <title>Notas</title>
            </head>
            <body>
                <xsl:if test="//alumno[@convocatoria = 'Junio']">
                    <h1 style="color:red;">Calificaciones de la convocatoria de 
                        <xsl:value-of select="//alumno[@convocatoria = 'Junio']/@convocatoria" />
                    </h1>
                    <table>
                        <tr style="background-color:#336699;">
                            <th colspan="3">Datos</th>
                            
                            <th colspan="3">Notas</th>
                        </tr>
                        <tr style="background-color:#6699CC;">

                            <!-- Con este choose evalúo si hay más de un alumno y si es así saldrá 'Nombres' en vez de 'Nombre' -->
                            <xsl:choose>
                                <xsl:when test="count(//alumno[@convocatoria = 'Junio']/nombre) > 1">
                                    <th><xsl:value-of select="concat(upper-case(substring(distinct-values(//nombre/name()), 1, 1)), substring(distinct-values(//nombre/name()), 2), 's')" /></th>
                                </xsl:when>
                                <xsl:otherwise>
                                    <th><xsl:value-of select="concat(upper-case(substring(distinct-values(//nombre/name()), 1, 1)), substring(distinct-values(//nombre/name()), 2))" /></th>
                                </xsl:otherwise>
                            </xsl:choose>

                            <th>Apellidos</th>
                            <th>Tareas</th>
                            <th>Cuestionarios</th>
                            <th>Examen</th>
                            <th>Final</th>
                        </tr>

                        <xsl:for-each select="//alumno[@convocatoria = 'Junio']">
                            <tr style="background-color:#E0FFFF;">
                                <td><xsl:value-of select="nombre"/></td>
                                <td><xsl:value-of select="apellidos"/></td>
                                <td><xsl:value-of select="tareas"/></td>
                                <td><xsl:value-of select="cuestionarios"/></td> 
                                <td><xsl:value-of select="examen"/></td>
                                <xsl:choose>
                                    <xsl:when test="final >= 9">
                                        <td style="color:#6A9EA0;">Sobresaliente</td>
                                    </xsl:when>
                                    <xsl:when test="final >= 7">
                                        <td style="color:#6A9EA0;">Notable</td>
                                    </xsl:when>
                                    <xsl:when test="final >= 6">
                                        <td style="color:#6A9EA0;">Bien</td>
                                    </xsl:when>
                                    <xsl:when test="final >= 5">
                                        <td style="color:#E0FFFF;">Suficiente</td>
                                    </xsl:when>
                                    <xsl:when test="4 > final">
                                        <td style="color:red;">Suspenso</td>
                                    </xsl:when>
                                    
                                </xsl:choose>
                            </tr>
                        </xsl:for-each>
                    </table>
                </xsl:if>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>