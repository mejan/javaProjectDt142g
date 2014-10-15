-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Värd: localhost
-- Tid vid skapande: 15 okt 2014 kl 14:14
-- Serverversion: 5.6.20
-- PHP-version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Databas: `ProjectJavaDB`
--
CREATE DATABASE IF NOT EXISTS `ProjectJavaDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `ProjectJavaDB`;

-- --------------------------------------------------------

--
-- Tabellstruktur `Consultation`
--

CREATE TABLE IF NOT EXISTS `Consultation` (
`consultationID` int(10) NOT NULL,
  `customerID` int(10) NOT NULL,
  `date` date NOT NULL,
  `time` time NOT NULL,
  `description` varchar(100) COLLATE utf8_bin NOT NULL,
  `accepted` tinyint(1) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=14 ;

--
-- Dumpning av Data i tabell `Consultation`
--

INSERT INTO `Consultation` (`consultationID`, `customerID`, `date`, `time`, `description`, `accepted`) VALUES
(1, 7, '2014-10-02', '09:00:34', 'keso', 1),
(4, 12, '2014-10-02', '09:08:24', 'Jag är troende', 0),
(7, 20, '2014-10-02', '09:57:11', 'Jag luktar jude', 0),
(8, 19, '2014-10-02', '09:58:25', 'dgfhsdgfhsdg', 0),
(9, 21, '2014-10-02', '14:10:19', 'Min gitarr spricker nÃ¤r jag smeker den med min penis.', 0),
(10, 21, '2014-10-02', '14:14:59', 'Min gitarr spricker nÃ¤r jag smeker den med min penis.', 0),
(11, 21, '2014-10-02', '14:15:35', 'regeN baklänges?', 0),
(12, 22, '2014-10-02', '17:19:46', 'helangÃ¥Ã¥r', 0),
(13, 23, '2014-10-09', '11:23:29', 'fghjh', 0);

-- --------------------------------------------------------

--
-- Tabellstruktur `Customer`
--

CREATE TABLE IF NOT EXISTS `Customer` (
`customerID` int(10) NOT NULL,
  `name` varchar(15) COLLATE utf8_bin NOT NULL,
  `lastName` varchar(15) COLLATE utf8_bin NOT NULL,
  `email` varchar(35) COLLATE utf8_bin NOT NULL,
  `phoneNumber` varchar(15) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=24 ;

--
-- Dumpning av Data i tabell `Customer`
--

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
(22, 'Keso', 'Balle', 'jesus@lever.se', 'r2435646'),
(23, 'Kajsa', 'bergkvist', '@kes.com', '456378436');

-- --------------------------------------------------------

--
-- Tabellstruktur `Guitars`
--

CREATE TABLE IF NOT EXISTS `Guitars` (
`guitarrID` int(10) NOT NULL,
  `name` varchar(15) COLLATE utf8_bin NOT NULL,
  `price` int(10) NOT NULL,
  `description` varchar(100) COLLATE utf8_bin NOT NULL,
  `sold` tinyint(1) NOT NULL,
  `imagePath` varchar(100) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=3 ;

--
-- Dumpning av Data i tabell `Guitars`
--

INSERT INTO `Guitars` (`guitarrID`, `name`, `price`, `description`, `sold`, `imagePath`) VALUES
(2, 'Gibson 1337', 4000, 'Jesus lever', 0, 'resources/image/gibson1.png');

-- --------------------------------------------------------

--
-- Tabellstruktur `News`
--

CREATE TABLE IF NOT EXISTS `News` (
`newsID` int(11) NOT NULL,
  `newsText` varchar(150) COLLATE utf8_bin NOT NULL,
  `newsImage` varchar(250) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=5 ;

--
-- Dumpning av Data i tabell `News`
--

INSERT INTO `News` (`newsID`, `newsText`, `newsImage`) VALUES
(1, 'brandeby', 'resources/image/small1.png'),
(2, 'Kvarg', 'resources/image/small1.png'),
(3, 'kajsa', 'resources/image/small1.png'),
(4, 'legolas', 'resources/image/small1.png');

-- --------------------------------------------------------

--
-- Tabellstruktur `ReparationPictures`
--

CREATE TABLE IF NOT EXISTS `ReparationPictures` (
`pictureID` int(10) NOT NULL,
  `repairID` int(10) NOT NULL,
  `imagePath` varchar(30) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=4 ;

--
-- Dumpning av Data i tabell `ReparationPictures`
--

INSERT INTO `ReparationPictures` (`pictureID`, `repairID`, `imagePath`) VALUES
(2, 1, '/source/image'),
(3, 1, '/source/image2');

-- --------------------------------------------------------

--
-- Tabellstruktur `Reparations`
--

CREATE TABLE IF NOT EXISTS `Reparations` (
`repairID` int(10) NOT NULL,
  `customerID` int(10) NOT NULL,
  `hoursWorked` int(11) NOT NULL,
  `imagePath` varchar(60) COLLATE utf8_bin NOT NULL,
  `recieved` date NOT NULL,
  `done` date NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=21 ;

--
-- Dumpning av Data i tabell `Reparations`
--

INSERT INTO `Reparations` (`repairID`, `customerID`, `hoursWorked`, `imagePath`, `recieved`, `done`) VALUES
(1, 3, -4003, '/src/keso', '2014-10-08', '2014-10-31'),
(19, 20, 4, 'resources/image/regeN.png', '2014-10-14', '2014-10-14'),
(20, 20, 4, 'resources/image/regeN.png', '2014-10-14', '2014-10-14');

-- --------------------------------------------------------

--
-- Tabellstruktur `SoldItems`
--

CREATE TABLE IF NOT EXISTS `SoldItems` (
`soldID` int(11) NOT NULL,
  `itemName` varchar(40) COLLATE utf8_bin NOT NULL,
  `dateOfSale` date NOT NULL,
  `price` double NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=39 ;

--
-- Dumpning av Data i tabell `SoldItems`
--

INSERT INTO `SoldItems` (`soldID`, `itemName`, `dateOfSale`, `price`) VALUES
(1, 'Strängar', '2014-10-12', 100.5),
(30, 'kräfts', '1987-12-28', 3456);

-- --------------------------------------------------------

--
-- Tabellstruktur `SpareParts`
--

CREATE TABLE IF NOT EXISTS `SpareParts` (
  `spareID` varchar(10) COLLATE utf8_bin NOT NULL,
  `name` varchar(20) COLLATE utf8_bin NOT NULL,
  `price` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Index för dumpade tabeller
--

--
-- Index för tabell `Consultation`
--
ALTER TABLE `Consultation`
 ADD PRIMARY KEY (`consultationID`), ADD KEY `FK_consultation` (`customerID`);

--
-- Index för tabell `Customer`
--
ALTER TABLE `Customer`
 ADD PRIMARY KEY (`customerID`);

--
-- Index för tabell `Guitars`
--
ALTER TABLE `Guitars`
 ADD PRIMARY KEY (`guitarrID`);

--
-- Index för tabell `News`
--
ALTER TABLE `News`
 ADD PRIMARY KEY (`newsID`);

--
-- Index för tabell `ReparationPictures`
--
ALTER TABLE `ReparationPictures`
 ADD PRIMARY KEY (`pictureID`), ADD KEY `FK_reparationPictures` (`repairID`);

--
-- Index för tabell `Reparations`
--
ALTER TABLE `Reparations`
 ADD PRIMARY KEY (`repairID`), ADD KEY `FK_reparations` (`customerID`);

--
-- Index för tabell `SoldItems`
--
ALTER TABLE `SoldItems`
 ADD PRIMARY KEY (`soldID`);

--
-- Index för tabell `SpareParts`
--
ALTER TABLE `SpareParts`
 ADD PRIMARY KEY (`spareID`);

--
-- AUTO_INCREMENT för dumpade tabeller
--

--
-- AUTO_INCREMENT för tabell `Consultation`
--
ALTER TABLE `Consultation`
MODIFY `consultationID` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT för tabell `Customer`
--
ALTER TABLE `Customer`
MODIFY `customerID` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=24;
--
-- AUTO_INCREMENT för tabell `Guitars`
--
ALTER TABLE `Guitars`
MODIFY `guitarrID` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT för tabell `News`
--
ALTER TABLE `News`
MODIFY `newsID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT för tabell `ReparationPictures`
--
ALTER TABLE `ReparationPictures`
MODIFY `pictureID` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT för tabell `Reparations`
--
ALTER TABLE `Reparations`
MODIFY `repairID` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT för tabell `SoldItems`
--
ALTER TABLE `SoldItems`
MODIFY `soldID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=39;
--
-- Restriktioner för dumpade tabeller
--

--
-- Restriktioner för tabell `Consultation`
--
ALTER TABLE `Consultation`
ADD CONSTRAINT `FK_consultation` FOREIGN KEY (`customerID`) REFERENCES `Customer` (`customerID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Restriktioner för tabell `ReparationPictures`
--
ALTER TABLE `ReparationPictures`
ADD CONSTRAINT `FK_reparationPictures` FOREIGN KEY (`repairID`) REFERENCES `Reparations` (`repairID`);

--
-- Restriktioner för tabell `Reparations`
--
ALTER TABLE `Reparations`
ADD CONSTRAINT `FK_reparations` FOREIGN KEY (`customerID`) REFERENCES `Customer` (`customerID`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
