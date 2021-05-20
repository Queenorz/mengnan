/*
SQLyog Professional v12.08 (64 bit)
MySQL - 5.7.26 : Database - din_sys
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`din_sys` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `din_sys`;

/*Table structure for table `food` */

DROP TABLE IF EXISTS `food`;

CREATE TABLE `food` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NAME` varchar(20) NOT NULL,
  `PRICE` varchar(20) NOT NULL,
  `INFO` varchar(20) NOT NULL,
  `TYPE` varchar(20) NOT NULL,
  `ADDRESS` varchar(20) NOT NULL,
  `NUM` int(10) unsigned NOT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `food` */

insert  into `food`(`ID`,`NAME`,`PRICE`,`INFO`,`TYPE`,`ADDRESS`,`NUM`) values (1,'麻辣香锅','12.7','wdnmd','nanjing','/23食堂/3楼',15),(2,'黄焖鸡','13','delicious','chuan','user/food2',121),(3,'黄焖鸡','13','delicious','chuan','user/food3',1671),(5,'88','98','98','44','98',98);

/*Table structure for table `order_s` */

DROP TABLE IF EXISTS `order_s`;

CREATE TABLE `order_s` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `UNAME` varchar(20) NOT NULL,
  `STATE` varchar(30) NOT NULL,
  `DATE` datetime NOT NULL,
  `REMARKS` varchar(50) NOT NULL,
  `FOOD` varchar(20) NOT NULL,
  `zt` varchar(10) DEFAULT '0',
  `num` varchar(10) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `order_s` */

insert  into `order_s`(`ID`,`UNAME`,`STATE`,`DATE`,`REMARKS`,`FOOD`,`zt`,`num`,`price`) values (1,'abc','unhanded','2020-07-28 00:00:00','多家点辣椒','黄焖鸡','0',NULL,NULL),(2,'abc','handled','2020-09-28 00:00:00','不要香菜','铁板麻辣烫','0',NULL,NULL),(3,'abc','handled_need_cancle','2020-09-28 00:00:00','不要香菜','铁板麻辣烫','0',NULL,NULL),(8,'asd','handled','2020-09-28 00:00:00','不要香菜','铁板麻辣烫','1','1','13 '),(9,'asd','handled','2020-09-28 00:00:00','不要香菜','铁板麻辣烫','1','1','13 '),(10,'asd','unhandle','2020-09-20 12:00:51','不要香菜,铁板麻辣烫','铁板麻辣烫','1','1','13 '),(11,'asd','unhandle','2020-09-20 12:12:08','不要香菜,铁板麻辣烫','铁板麻辣烫','1','1','13 '),(12,'asd','unhandle','2020-09-20 12:14:13','不要香菜,铁板麻辣烫','铁板麻辣烫','1','1','13 '),(16,'asd','unhandle','2020-09-24 14:32:21','','黄焖鸡 ','1','1','13 '),(17,'asd','unhandle','2020-09-24 14:48:26','','麻辣香锅 ','1','1','13 '),(18,'asd','unhandle','2020-09-24 14:49:03','','黄焖鸡 ','1','1','13 '),(19,'asd','asd','2020-10-08 20:59:46','ii','i','1','1','1'),(20,'asd','asd','2020-10-08 21:00:07','asd','asd','1','1','1'),(21,'asd','asd','2020-10-08 21:00:21','asd','asd','1','1','1'),(22,'asd','asd','2020-10-08 21:00:27','asd','asd','1','1','1'),(23,'asd','asd','2020-10-08 21:00:35','asd','asd','1','1','1'),(24,'asd','unhandle','2020-12-21 18:17:02','','麻辣香锅 ','0','1','12.7 ');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `NAME` varchar(20) NOT NULL,
  `UNAME` varchar(20) NOT NULL,
  `UPASS` varchar(20) NOT NULL,
  `STATUS` varchar(10) NOT NULL,
  `LOVE` varchar(20) NOT NULL,
  `PHONE` varchar(20) NOT NULL,
  PRIMARY KEY (`UNAME`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `user` */

insert  into `user`(`NAME`,`UNAME`,`UPASS`,`STATUS`,`LOVE`,`PHONE`) values ('abc','abc','abc','staff','Hatsune Miku','15730789695'),('ssd','asd','asd','diner','asd','12321');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
