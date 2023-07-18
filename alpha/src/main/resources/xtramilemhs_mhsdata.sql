-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: xtramilemhs
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
-- Table structure for table `mhsdata`
--

DROP TABLE IF EXISTS `mhsdata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mhsdata` (
  `id` varchar(20) NOT NULL,
  `ndepan` varchar(45) NOT NULL,
  `nbelakang` varchar(45) DEFAULT NULL,
  `tlahir` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mhsdata`
--

LOCK TABLES `mhsdata` WRITE;
/*!40000 ALTER TABLE `mhsdata` DISABLE KEYS */;
INSERT INTO `mhsdata` VALUES ('00/31435/yd/39572','Stacy','Ramalhete','2000-11-02'),('01/24021/zb/35276','Kennie','Tuminelli','2000-10-28'),('05/07552/qh/09200','Arlan','','2001-04-09'),('05/08368/ia/61434','Selma','Andryszczak','2002-08-14'),('08/19090/oq/54862','Timoteo','','2000-09-21'),('10/85719/xg/28579','Libbey','','2001-02-17'),('11/06822/yw/64831','Geordie','Toffoloni','2002-05-30'),('12/13738/sg/58756','Shirley','','2001-03-15'),('12/56502/ma/53033','Morse','Gilstoun','2003-11-12'),('17/98716/vz/43333','Elysha','Allcoat','2000-09-29'),('19/43991/vy/80433','Devina','Devlin','2001-01-23'),('19/87394/ov/70279','Ethelyn','Krolik','2000-10-10'),('20/74005/cg/77051','Tobey','','2004-07-14'),('21/47523/pr/23454','test','testins','2024-09-22'),('26/05770/ef/83549','Lowell','Gillbey','2000-08-11'),('27/29316/hs/09803','Emmalynn','Wych','2004-04-24'),('30/39811/vz/80649','Gustave','Tubridy','2001-11-21'),('32/43006/jl/58464','Melisse','','2001-01-07'),('32/56149/ws/69478','Oralle','','2004-01-08'),('35/68720/jp/52677','Elvera','Gibbon','2004-05-25'),('35/70995/tx/16599','Mylo','','2001-07-15'),('38/08031/pz/28680','Shelby','','2003-10-02'),('41/55481/lv/73490','Byrann','Hamly','2004-07-05'),('41/58402/ng/14925','Kip','Physic','2000-10-31'),('43/25735/jv/22569','Christabel','Plimmer','2001-11-05'),('44/76374/uo/36216','Wilhelmine','Dronsfield','2004-04-04'),('45/01581/yc/05323','Celle','Wildman','2003-07-10'),('45/14567/gc/91569','Ceil','','2002-12-08'),('47/72921/kr/97471','Rolando','','2000-10-05'),('50/31565/tv/37614','Giacobo','Lemasney','2001-06-02'),('51/05070/jy/33589','Hagan','','2003-12-10'),('51/27790/nx/54922','Candis','Marcoolyn','2003-01-26'),('54/51885/ap/97347','Miltie','','2002-10-24'),('62/77575/zv/24148','Wenonah','Matantsev','2003-05-04'),('66/42532/tk/84454','Danica','','2000-08-14'),('67/61563/af/10516','Sarine','Momery','2001-10-14'),('69/89819/cf/79845','Joshia','Blundin','2004-03-23'),('80/96582/hq/21266','Chicky','','2002-01-04'),('82/41893/sz/18617','Errick','Emor','2002-12-16'),('82/81793/wd/60113','Geralda','Ferschke','2000-11-28'),('85/29492/tf/78276','Freddie','','2002-04-07'),('86/71879/hk/33041','Gene','','2004-07-01'),('89/52662/lt/23862','Remy','','2002-01-25'),('93/57802/gt/20054','Davide','','2004-02-09'),('94/55627/al/68144','Lisa','Cuolahan','2002-07-10'),('94/67317/rt/11141','Stormie','Gotliffe','2001-10-14'),('96/35984/cg/62811','Yale','Brindley','2002-05-13'),('96/96265/kp/49659','Gayelord','','2002-01-10'),('98/13989/gz/03862','Bradly','Capp','2002-03-03'),('98/74845/cy/56974','Vally','Nisen','2000-07-25');
/*!40000 ALTER TABLE `mhsdata` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-19  2:32:37
