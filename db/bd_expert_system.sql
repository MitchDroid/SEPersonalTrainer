CREATE DATABASE  IF NOT EXISTS `db_expert_systems` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `db_expert_systems`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win64 (x86_64)
--
-- Host: localhost    Database: db_expert_systems
-- ------------------------------------------------------
-- Server version	5.6.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_base_facts`
--

DROP TABLE IF EXISTS `tb_base_facts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_base_facts` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `fecha_nacimiento` varchar(45) DEFAULT NULL,
  `edad` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `sexo` varchar(45) DEFAULT NULL,
  `peso_kg` varchar(45) DEFAULT NULL,
  `estatura_cm` varchar(45) DEFAULT NULL,
  `enfermedades` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Todos los datos ingresados por el usuario para su respectiva validación ante la base de conocimientos';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_base_facts`
--

LOCK TABLES `tb_base_facts` WRITE;
/*!40000 ALTER TABLE `tb_base_facts` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_base_facts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_bk_goal_weight_gain_muscle`
--

DROP TABLE IF EXISTS `tb_bk_goal_weight_gain_muscle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_bk_goal_weight_gain_muscle` (
  `part_of_body` varchar(45) DEFAULT NULL,
  `serie` varchar(45) DEFAULT NULL,
  `repetitions` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Base de Conocmiento --> Peso ideal ---> sacar musculp';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_bk_goal_weight_gain_muscle`
--

LOCK TABLES `tb_bk_goal_weight_gain_muscle` WRITE;
/*!40000 ALTER TABLE `tb_bk_goal_weight_gain_muscle` DISABLE KEYS */;
INSERT INTO `tb_bk_goal_weight_gain_muscle` VALUES ('Pecho y Triceps','8','15'),('Espalda y Biceps','8','15'),('Antebrazos y Hombros','8','15'),('Piernas','8','15');
/*!40000 ALTER TABLE `tb_bk_goal_weight_gain_muscle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_bk_goal_weight_maintenance`
--

DROP TABLE IF EXISTS `tb_bk_goal_weight_maintenance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_bk_goal_weight_maintenance` (
  `part_of_body` varchar(50) DEFAULT NULL,
  `type_exercise` varchar(45) DEFAULT NULL,
  `serie` varchar(45) DEFAULT NULL,
  `repetitions` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Tabla  Peso Ideal – Mantenerse\nSemana 1-3';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_bk_goal_weight_maintenance`
--

LOCK TABLES `tb_bk_goal_weight_maintenance` WRITE;
/*!40000 ALTER TABLE `tb_bk_goal_weight_maintenance` DISABLE KEYS */;
INSERT INTO `tb_bk_goal_weight_maintenance` VALUES ('Quadriceps/Gluteos','Leg Press (Prensa)','3','5'),('Biceps Femoral','Maquina de Biceps Femoral','3','5'),('Espalda Superior','Remo con Cable Sentado','3','5'),('Pecho','Pecho en Banco Plano','3','5'),('Hombros','Hombro con Mancuernas','3','5'),('Trapecios','Encogimiento con Mancuerna','3','5'),('Triceps','Triceps con Cable (Pushdown)','3','5'),('Biceps','Biceps con Barra','3','5'),('Espalda Baja','Extensiones de Espalda','3','5'),('Pantorillas','Pantorrillas Parado','3','5'),('Ante Brazo','Encogimiento de muñeca con Barra','3','5'),('Abdominales','Encogimientos','3','5');
/*!40000 ALTER TABLE `tb_bk_goal_weight_maintenance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_bk_loose_weight`
--

DROP TABLE IF EXISTS `tb_bk_loose_weight`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_bk_loose_weight` (
  `part_of_body` varchar(50) DEFAULT NULL,
  `type_exercise` varchar(45) DEFAULT NULL,
  `serie` varchar(45) DEFAULT NULL,
  `repetitions` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Base de conocimiento - Sobre peso --> bajar';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_bk_loose_weight`
--

LOCK TABLES `tb_bk_loose_weight` WRITE;
/*!40000 ALTER TABLE `tb_bk_loose_weight` DISABLE KEYS */;
INSERT INTO `tb_bk_loose_weight` VALUES ('Quadriceps/Gluteos','Leg Press (Prensa)','4','7'),('Biceps Femoral','Maquina de Biceps Femoral','4','7'),('Espalda Superior','Remo con Cable Sentado','4','7'),('Pecho','Pecho en Banco Plano','4','7'),('Hombros','Hombro con Mancuernas','4','7'),('Trapecios','Encogimiento con Mancuerna','4','7'),('Triceps','Triceps con Cable (Pushdown)','4','7'),('Biceps','Biceps con Barra','4','7'),('Espalda Baja','Extensiones de Espalda','4','7'),('Pantorillas','Pantorrillas Parado','4','7'),('Ante Brazo','Encogimiento de muñeca con Barra','4','7'),('Abdominales','Encogimientos','4','7');
/*!40000 ALTER TABLE `tb_bk_loose_weight` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_routines`
--

DROP TABLE IF EXISTS `tb_routines`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tb_routines` (
  `id_routine` varchar(3) DEFAULT NULL,
  `name_routine` varchar(45) DEFAULT NULL,
  `explain_mode` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_routines`
--

LOCK TABLES `tb_routines` WRITE;
/*!40000 ALTER TABLE `tb_routines` DISABLE KEYS */;
INSERT INTO `tb_routines` VALUES ('PI','Mantener Peso','Nuestro Sistemas sugiere esta Rutina según datos validados en nuestro motor de inferencia'),('BP','Bajar de Peso','Nuestro Sistemas sugiere esta Rutina según datos validados en nuestro motor de inferencia'),('GM','Ganar músculo','Nuestro Sistemas sugiere esta Rutina según datos validados en nuestro motor de inferencia');
/*!40000 ALTER TABLE `tb_routines` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-11-25 16:31:20
