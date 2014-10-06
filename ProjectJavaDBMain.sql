

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;


CREATE DATABASE IF NOT EXISTS `ProjectJavaDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `ProjectJavaDB`;

CREATE TABLE IF NOT EXISTS `Consultation` (
`consultationID` int(10) NOT NULL,
  `customerID` int(10) NOT NULL,
  `date` date NOT NULL,
  `time` time NOT NULL,
  `description` varchar(100) COLLATE utf8_bin NOT NULL,
  `accepted` tinyint(1) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=13 ;


INSERT INTO `Consultation` (`consultationID`, `customerID`, `date`, `time`, `description`, `accepted`) VALUES
(1, 7, '2014-10-02', '09:00:34', 'keso', 1),
(2, 9, '2014-10-02', '09:05:06', 'JAG VILL HA HJLÄP MED ATT TA MITT LIV', 0),
(3, 11, '2014-10-02', '09:06:30', 'efdhtfyjguftrttkjhgfdtrasf', 0),
(4, 12, '2014-10-02', '09:08:24', 'Jag är troende', 0),
(5, 18, '2014-10-02', '09:26:21', 'hihi levand', 0),
(6, 19, '2014-10-02', '09:54:37', 'ertyfjuydfghsgh', 0),
(7, 20, '2014-10-02', '09:57:11', 'dfgjdhgfjdhjd', 0),
(8, 19, '2014-10-02', '09:58:25', 'dgfhsdgfhsdg', 0),
(9, 21, '2014-10-02', '14:10:19', 'Min gitarr spricker nÃ¤r jag smeker den med min penis.', 0),
(10, 21, '2014-10-02', '14:14:59', 'Min gitarr spricker nÃ¤r jag smeker den med min penis.', 0),
(11, 21, '2014-10-02', '14:15:35', 'regeN baklänges?', 0),
(12, 22, '2014-10-02', '17:19:46', 'helangÃ¥Ã¥r', 0);

CREATE TABLE IF NOT EXISTS `Customer` (
`customerID` int(10) NOT NULL,
  `name` varchar(15) COLLATE utf8_bin NOT NULL,
  `lastName` varchar(15) COLLATE utf8_bin NOT NULL,
  `email` varchar(35) COLLATE utf8_bin NOT NULL,
  `phoneNumber` varchar(15) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=23 ;


INSERT INTO `Customer` (`customerID`, `name`, `lastName`, `email`, `phoneNumber`) VALUES
(3, 'Anton', 'Dahlin', 'anton.dahlin@outlook.com', '0738187707'),
(7, 'keso', 'keso', 'keso', 'keso'),
(9, 'Christoffer', 'KUKEN', 'kuken@keso.com', '3245678'),
(11, 'Pontus', 'Gårdinger', 'gårdi@negress.com', '32453678'),
(12, 'Pontus', 'Ekholm', 'poek1101@student.miun.se', '324564756432'),
(18, 'hihi', 'hihi', 'hihi', 'hihi'),
(19, 'Fnissah', 'Skratt', '@.com', '3245678'),
(20, 'dfgh', 'dsfghj', 'gfdshjuiyurtjh', 'fdghjkfgjhjd'),
(21, 'Robin', 'Jansson', 'robin.jansson@hotmale.com', '0702190262'),
(22, 'Keso', 'Balle', 'jesus@lever.se', 'r2435646');



CREATE TABLE IF NOT EXISTS `Guitars` (
  `guitarrID` int(10) NOT NULL,
  `name` varchar(15) COLLATE utf8_bin NOT NULL,
  `price` int(10) NOT NULL,
  `description` varchar(100) COLLATE utf8_bin NOT NULL,
  `sold` tinyint(1) NOT NULL,
  `imagePath` varchar(100) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


CREATE TABLE IF NOT EXISTS `Reparations` (
  `repairID` int(10) NOT NULL,
  `customerID` int(10) NOT NULL,
  `hoursWorked` int(11) NOT NULL,
  `imagePath` varchar(60) COLLATE utf8_bin NOT NULL,
  `recieved` date NOT NULL,
  `done` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE IF NOT EXISTS `SpareParts` (
  `spareID` varchar(10) COLLATE utf8_bin NOT NULL,
  `name` varchar(20) COLLATE utf8_bin NOT NULL,
  `price` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


ALTER TABLE `Consultation`
 ADD PRIMARY KEY (`consultationID`), ADD KEY `FK_consultation` (`customerID`);

ALTER TABLE `Customer`
 ADD PRIMARY KEY (`customerID`);

ALTER TABLE `Guitars`
 ADD PRIMARY KEY (`guitarrID`);


ALTER TABLE `Reparations`
 ADD PRIMARY KEY (`repairID`), ADD KEY `FK_reparations` (`customerID`);

ALTER TABLE `SpareParts`
 ADD PRIMARY KEY (`spareID`);


ALTER TABLE `Consultation`
MODIFY `consultationID` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=13;

ALTER TABLE `Customer`
MODIFY `customerID` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=23;

ALTER TABLE `Consultation`
ADD CONSTRAINT `FK_consultation` FOREIGN KEY (`customerID`) REFERENCES `Customer` (`customerID`) ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE `Reparations`
ADD CONSTRAINT `FK_reparations` FOREIGN KEY (`customerID`) REFERENCES `Customer` (`customerID`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
