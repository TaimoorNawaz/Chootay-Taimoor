-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: chootaybikesshop
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `user_person`
--

DROP TABLE IF EXISTS `user_person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_person` (
  `user_type` varchar(31) NOT NULL,
  `user_id` int NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `member_number` int DEFAULT NULL,
  `member_status` bit(1) DEFAULT NULL,
  `manager_type` varchar(255) DEFAULT NULL,
  `salary` int DEFAULT NULL,
  `date_hired` varchar(255) DEFAULT NULL,
  `ntn` varchar(255) DEFAULT NULL,
  `percentage` float DEFAULT NULL,
  `user_login_id` int DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `FK175mcbdtvb3ixjt7mt1iyo8xs` (`user_login_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_person`
--

LOCK TABLES `user_person` WRITE;
/*!40000 ALTER TABLE `user_person` DISABLE KEYS */;
INSERT INTO `user_person` VALUES ('OWNER',1,'bilal@gmail','bilal','hmed','0221',NULL,NULL,NULL,NULL,NULL,'033333',NULL,1),('MANAGER',2,'ahmed','ahmed','nawaz','0331',NULL,NULL,'Account',100,'101020',NULL,NULL,2),('SALESPERSON',3,'zeeshan','zeeshan','zia','0432',NULL,NULL,NULL,10000,'101020','',5,3),('MECHANIC',4,'zohaib','zohaib','akhtart','0442',NULL,NULL,NULL,123123,'101012',NULL,NULL,4),('CUSTOMER',5,'ahmed','ahmed','nadeem','0333',11,_binary '',NULL,NULL,NULL,NULL,NULL,5);
/*!40000 ALTER TABLE `user_person` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-06 17:54:42
