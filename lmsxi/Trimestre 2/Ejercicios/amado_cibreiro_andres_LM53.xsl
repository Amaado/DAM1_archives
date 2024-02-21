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
        <title>Discografía de Daft Punk</title>
      </head>
      <body>
        <h1>Discografía de Daft Punk</h1>
        <table>
          <tr>
            <th>Título</th>
            <th>Ventas</th>
            <th>Fecha salida</th>
          </tr>
          <xsl:apply-templates select="//disco"/>
        </table>
      </body>
    </html>
  </xsl:template>

  <xsl:template match="disco">
    <tr>
      <td><xsl:value-of select="titulo"/></td>
      <td><xsl:value-of select="ventas"/></td>
      <td>
        <xsl:value-of select="lanzamiento/dia"/>-<xsl:value-of select="lanzamiento/mes"/>-<xsl:value-of select="lanzamiento/anho"/>
      </td>
    </tr>
  </xsl:template>

</xsl:stylesheet>