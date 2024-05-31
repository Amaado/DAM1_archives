-- MariaDB dump 10.19  Distrib 10.11.6-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: biblioteca
-- ------------------------------------------------------
-- Server version	10.11.6-MariaDB-0+deb12u1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `biblioteca`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `biblioteca` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `biblioteca`;

--
-- Table structure for table `Anonimo`
--

DROP TABLE IF EXISTS `Anonimo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Anonimo` (
  `ID_Creador` int(11) NOT NULL AUTO_INCREMENT,
  `Nacionalidad` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ID_Creador`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Anonimo`
--

LOCK TABLES `Anonimo` WRITE;
/*!40000 ALTER TABLE `Anonimo` DISABLE KEYS */;
INSERT INTO `Anonimo` VALUES
(1,'Desconocida'),
(2,'Española'),
(3,'Rusa'),
(4,'Japonesa'),
(5,'Alemana'),
(6,'Canadiense'),
(7,'Brasileña');
/*!40000 ALTER TABLE `Anonimo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Autor`
--

DROP TABLE IF EXISTS `Autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Autor` (
  `ID_Autor` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido` varchar(50) DEFAULT NULL,
  `Nacionalidad` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ID_Autor`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Autor`
--

LOCK TABLES `Autor` WRITE;
/*!40000 ALTER TABLE `Autor` DISABLE KEYS */;
INSERT INTO `Autor` VALUES
(1,'Carlos','Ruiz Zafón','Española'),
(2,'Isaac','Asimov','Estadounidense'),
(3,'Stephen','King','Estadounidense'),
(4,'Gabriel','García Márquez','Colombiana'),
(5,'Jorge Luis','Borges','Argentina'),
(6,'Frida','Kahlo','Mexicana'),
(7,'Neil','deGrasse Tyson','Estadounidense'),
(8,'Leonardo','da Vinci','Italiano');
/*!40000 ALTER TABLE `Autor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Categoria`
--

DROP TABLE IF EXISTS `Categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Categoria` (
  `ID_Categoria` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_Categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Categoria`
--

LOCK TABLES `Categoria` WRITE;
/*!40000 ALTER TABLE `Categoria` DISABLE KEYS */;
INSERT INTO `Categoria` VALUES
(1,'Novela histórica'),
(2,'Ciencia ficción'),
(3,'Terror'),
(4,'Biografía'),
(5,'Ensayo'),
(6,'Poesía'),
(7,'Ciencia'),
(8,'Arte');
/*!40000 ALTER TABLE `Categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Editorial`
--

DROP TABLE IF EXISTS `Editorial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Editorial` (
  `ID_Editorial` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) DEFAULT NULL,
  `Direccion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_Editorial`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Editorial`
--

LOCK TABLES `Editorial` WRITE;
/*!40000 ALTER TABLE `Editorial` DISABLE KEYS */;
INSERT INTO `Editorial` VALUES
(1,'Editorial Planeta','Calle de la Industria, 123, Madrid'),
(2,'Ediciones B','Avenida del Libertador, 1000, Barcelona'),
(3,'Galaxia Gutenberg','Calle del Poeta, 22, Valencia'),
(4,'Anagrama','Paseo de Gracia, 78, Barcelona'),
(5,'Ediciones Destino','Calle Miraflores, 15, Sevilla'),
(6,'Penguin Random House','Avenida Siempre Viva, 742, Madrid'),
(7,'Sigma Press','Avenida de la Constitución, 44, Granada'),
(8,'Moonlight Publishing','Calle Sol, 29, Málaga');
/*!40000 ALTER TABLE `Editorial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Escribe`
--

DROP TABLE IF EXISTS `Escribe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Escribe` (
  `ID_Creador` int(11) NOT NULL,
  `ID_Libro` int(11) NOT NULL,
  PRIMARY KEY (`ID_Creador`,`ID_Libro`),
  KEY `ID_Libro` (`ID_Libro`),
  CONSTRAINT `Escribe_ibfk_1` FOREIGN KEY (`ID_Creador`) REFERENCES `Autor` (`ID_Autor`),
  CONSTRAINT `Escribe_ibfk_2` FOREIGN KEY (`ID_Libro`) REFERENCES `Libro` (`ID_Libro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Escribe`
--

LOCK TABLES `Escribe` WRITE;
/*!40000 ALTER TABLE `Escribe` DISABLE KEYS */;
INSERT INTO `Escribe` VALUES
(1,1),
(2,2),
(3,3),
(4,4),
(5,5),
(6,6),
(7,7),
(8,8);
/*!40000 ALTER TABLE `Escribe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Libro`
--

DROP TABLE IF EXISTS `Libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Libro` (
  `ID_Libro` int(11) NOT NULL AUTO_INCREMENT,
  `Titulo` varchar(255) DEFAULT NULL,
  `Año` int(11) DEFAULT NULL,
  `ISBN` varchar(20) DEFAULT NULL,
  `Edicion` int(11) DEFAULT NULL,
  `ID_Editorial` int(11) DEFAULT NULL,
  `ID_Categoria` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID_Libro`),
  KEY `ID_Editorial` (`ID_Editorial`),
  KEY `ID_Categoria` (`ID_Categoria`),
  CONSTRAINT `Libro_ibfk_1` FOREIGN KEY (`ID_Editorial`) REFERENCES `Editorial` (`ID_Editorial`),
  CONSTRAINT `Libro_ibfk_2` FOREIGN KEY (`ID_Categoria`) REFERENCES `Categoria` (`ID_Categoria`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Libro`
--

LOCK TABLES `Libro` WRITE;
/*!40000 ALTER TABLE `Libro` DISABLE KEYS */;
INSERT INTO `Libro` VALUES
(1,'La sombra del viento',2001,'9788408065773',1,1,1),
(2,'Fundación',1951,'9788408004413',1,2,2),
(3,'It',1986,'9781501142970',1,1,3),
(4,'Vivir para contarla',2002,'9781400034536',1,2,4),
(5,'Ficciones',1944,'9789875666461',1,3,5),
(6,'El libro de los abrazos',1989,'9788490628775',1,4,6),
(7,'Astrophysics for People in a Hurry',2017,'9780393609394',1,5,7),
(8,'The Lives of the Artists',1550,'9780199537198',1,6,8);
/*!40000 ALTER TABLE `Libro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Prestamo`
--

DROP TABLE IF EXISTS `Prestamo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Prestamo` (
  `ID_Prestamo` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Usuario` int(11) DEFAULT NULL,
  `ID_Libro` int(11) DEFAULT NULL,
  `Fecha_Prestamo` date DEFAULT NULL,
  `Fecha_Devolucion` date DEFAULT NULL,
  PRIMARY KEY (`ID_Prestamo`),
  KEY `ID_Usuario` (`ID_Usuario`),
  KEY `ID_Libro` (`ID_Libro`),
  CONSTRAINT `Prestamo_ibfk_1` FOREIGN KEY (`ID_Usuario`) REFERENCES `Usuario` (`ID_Usuario`),
  CONSTRAINT `Prestamo_ibfk_2` FOREIGN KEY (`ID_Libro`) REFERENCES `Libro` (`ID_Libro`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Prestamo`
--

LOCK TABLES `Prestamo` WRITE;
/*!40000 ALTER TABLE `Prestamo` DISABLE KEYS */;
INSERT INTO `Prestamo` VALUES
(1,1,1,'2023-05-01','2023-05-15'),
(2,2,2,'2023-05-02',NULL),
(3,3,3,'2024-01-01','2024-01-15'),
(4,4,4,'2024-01-02',NULL),
(5,5,5,'2024-02-10','2024-02-24'),
(6,6,6,'2024-02-11',NULL),
(7,7,7,'2024-03-01','2024-03-15'),
(8,8,8,'2024-03-02',NULL),
(9,9,1,'2024-04-01','2024-04-15'),
(10,9,2,'2024-04-16','2024-04-30'),
(11,9,3,'2024-05-01','2024-05-15'),
(12,9,4,'2024-05-16',NULL);
/*!40000 ALTER TABLE `Prestamo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Usuario`
--

DROP TABLE IF EXISTS `Usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Usuario` (
  `ID_Usuario` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido` varchar(50) DEFAULT NULL,
  `Telefono` varchar(20) DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`ID_Usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Usuario`
--

LOCK TABLES `Usuario` WRITE;
/*!40000 ALTER TABLE `Usuario` DISABLE KEYS */;
INSERT INTO `Usuario` VALUES
(1,'Ana','Martínez','678123456','ana.martinez@example.com'),
(2,'Juan','García','679234567','juan.garcia@example.com'),
(3,'Sofía','López','680123456','sofia.lopez@example.com'),
(4,'Luis','Fernández','681234567','luis.fernandez@example.com'),
(5,'Clara','Gutierrez','699876543','clara.gutierrez@example.com'),
(6,'Roberto','Sanchez','600123987','roberto.sanchez@example.com'),
(7,'Marta','Navarro','662154879','marta.navarro@example.com'),
(8,'Oscar','Morales','650987654','oscar.morales@example.com'),
(9,'Elena','Gómez','612345678','elena.gomez@example.com');
/*!40000 ALTER TABLE `Usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary table structure for view `VistaLibrosCiencia`
--

DROP TABLE IF EXISTS `VistaLibrosCiencia`;
/*!50001 DROP VIEW IF EXISTS `VistaLibrosCiencia`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `VistaLibrosCiencia` AS SELECT
 1 AS `Titulo`,
  1 AS `Año`,
  1 AS `ISBN` */;
SET character_set_client = @saved_cs_client;

--
-- Current Database: `biblioteca`
--

USE `biblioteca`;

--
-- Final view structure for view `VistaLibrosCiencia`
--

/*!50001 DROP VIEW IF EXISTS `VistaLibrosCiencia`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb3 */;
/*!50001 SET character_set_results     = utf8mb3 */;
/*!50001 SET collation_connection      = utf8mb3_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `VistaLibrosCiencia` AS select `L`.`Titulo` AS `Titulo`,`L`.`Año` AS `Año`,`L`.`ISBN` AS `ISBN` from (`Libro` `L` join `Categoria` `C` on(`L`.`ID_Categoria` = `C`.`ID_Categoria`)) where `C`.`Descripcion` = 'Ciencia' */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-31 20:57:08
