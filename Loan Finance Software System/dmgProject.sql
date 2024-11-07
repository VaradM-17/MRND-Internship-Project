-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.15


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema financedb
--

CREATE DATABASE IF NOT EXISTS financedb;
USE financedb;

--
-- Definition of table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `CustomerId` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `CustomerName` varchar(45) NOT NULL,
  `MobileNo` varchar(45) NOT NULL,
  `EmailId` varchar(45) NOT NULL,
  `Address` varchar(45) NOT NULL,
  `CBName` varchar(45) NOT NULL,
  `AnnualIncome` varchar(45) NOT NULL,
  `PanCardNo` varchar(45) NOT NULL,
  `Service` varchar(45) NOT NULL,
  `PastLoan` varchar(45) NOT NULL,
  PRIMARY KEY (`CustomerId`)
) ENGINE=InnoDB AUTO_INCREMENT=564655 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`CustomerId`,`CustomerName`,`MobileNo`,`EmailId`,`Address`,`CBName`,`AnnualIncome`,`PanCardNo`,`Service`,`PastLoan`) VALUES 
 (123456,'varad','1234567897','varad','kjegckue3gucg','egeglcuglug','123456789','564654878977','Self Employee','  No'),
 (464646,'skxkqg','','','','','','','',''),
 (564654,'kwbxbwjkxb','5464665466','varad','wjxbjkwqbxjkqwkjx','qwhxkhqvwkx','354545','648668468','Self Employee',' Yes');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
