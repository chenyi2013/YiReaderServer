CREATE DATABASE `yireader` /*!40100 DEFAULT CHARACTER SET utf8 */;

CREATE TABLE `articleinfo` (
  `itemID` varchar(45) NOT NULL,
  `type` int(10) unsigned NOT NULL,
  `source` text NOT NULL,
  `title` text NOT NULL,
  `sourceID` text NOT NULL,
  `time` int(10) unsigned NOT NULL,
  `commentCount` int(10) unsigned NOT NULL,
  `praiseCount` int(10) unsigned NOT NULL,
  `template` text NOT NULL,
  `summary` text NOT NULL,
  `imagesArray` text NOT NULL,
  `statusType` int(10) unsigned NOT NULL,
  `style` text NOT NULL,
  `url` text NOT NULL,
  `coverW` int(10) unsigned NOT NULL,
  `coverH` int(10) unsigned NOT NULL,
  `articletype` int(10) unsigned NOT NULL,
  PRIMARY KEY (`itemID`),
  KEY `id` (`articletype`),
  CONSTRAINT `id` FOREIGN KEY (`articletype`) REFERENCES `articletype` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `articletype` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `articletype` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


CREATE TABLE `user_table` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `sex` tinyint(1) NOT NULL,
  `email` varchar(45) NOT NULL,
  `qq` varchar(45) NOT NULL,
  `age` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
