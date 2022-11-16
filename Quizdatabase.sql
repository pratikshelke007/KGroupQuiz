-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: quizdatabase
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `marks`
--

DROP TABLE IF EXISTS `marks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marks` (
  `stud_id` int DEFAULT NULL,
  `marks` int DEFAULT NULL,
  `grade` varchar(255) DEFAULT NULL,
  UNIQUE KEY `stud_id` (`stud_id`),
  CONSTRAINT `marks_ibfk_1` FOREIGN KEY (`stud_id`) REFERENCES `student` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marks`
--

LOCK TABLES `marks` WRITE;
/*!40000 ALTER TABLE `marks` DISABLE KEYS */;
INSERT INTO `marks` VALUES (1,7,'Class B'),(5,10,'Class A'),(3,1,'Class D'),(4,7,'Class B'),(10,3,'Class D'),(12,9,'Class A'),(13,6,'Class B');
/*!40000 ALTER TABLE `marks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `questionset`
--

DROP TABLE IF EXISTS `questionset`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `questionset` (
  `qid` int NOT NULL,
  `questions` varchar(255) DEFAULT NULL,
  `answer` int DEFAULT NULL,
  PRIMARY KEY (`qid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questionset`
--

LOCK TABLES `questionset` WRITE;
/*!40000 ALTER TABLE `questionset` DISABLE KEYS */;
INSERT INTO `questionset` VALUES (1,'Number of primitive data types in java are?,1)6,2)7,3)8,4)9',3),(2,'What is size of float and double in java?,1)32 and 64,2)32 and 32,3)64 and 64,4)64 and 32',1),(3,'Arrays in java are?,1)object references,2)objects,3)primitive data types,4)None',2),(4,'When is the object created with new keyword ?,1)At runtime,2)At compile time,3)Depends on the code,4)None',1),(5,'What is package? ,1)Collection of editing tools ,2)Collection of classes ,3)Collection of Classes and interfaces ,4)Collection of  interfaces',3),(6,'Which keyword belong to to a class, rather than being defined for each instance of class ?,1)final,2)static,3)volatile,4)abstract',2),(7,'toString()method defined in which pacakge ?,1)java.lang.Object,2)java.lang.String,3)java.lang.util,4)none',1),(8,'Identify Output: String str=\"abcde\"; Sytem.out.println(str.substring(1,3)); ?,1)abc,2)bc,3)bcd,4)cd',2),(9,'Identify modifier which cannot be used for constructor ?,1)public,2)protected,3)private,4)static',4),(10,'What is Runnable ?,1)Abstract class,2)interface,3)class,4)method',2);
/*!40000 ALTER TABLE `questionset` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `id` int NOT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'Prasad','Deore'),(3,'Ram','Patil'),(4,'Bhavesh','Bhosale'),(5,'Pratik','Shelke'),(10,'shyam','abc'),(12,'rohan','more'),(13,'Krishna','Abc');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-16 18:53:27
