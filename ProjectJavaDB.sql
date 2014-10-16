-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 15, 2014 at 02:37 PM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `projectjavadb`
--
CREATE DATABASE IF NOT EXISTS `projectjavadb` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `projectjavadb`;

-- --------------------------------------------------------

--
-- Table structure for table `about`
--

CREATE TABLE IF NOT EXISTS `about` (
`id` int(11) NOT NULL,
  `about` text NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `about`
--

INSERT INTO `about` (`id`, `about`) VALUES
(1, 'Det här är en kort beskrivning av företaget: Anton''s gitarrverkstad!\r\n\r\nGitarrer\r\nTrök\r\nHejs');

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE IF NOT EXISTS `company` (
  `name` varchar(250) NOT NULL,
  `city` varchar(250) NOT NULL,
  `street` varchar(250) NOT NULL,
  `areaCode` int(10) NOT NULL,
  `phone` int(25) NOT NULL,
  `email` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `company`
--

INSERT INTO `company` (`name`, `city`, `street`, `areaCode`, `phone`, `email`) VALUES
('Anton''s gitarrverkstad', 'Sundsvall', 'Bergsgatan 14', 85352, 123456, 'anton@gitarrverkstad.com');

-- --------------------------------------------------------

--
-- Table structure for table `consultation`
--

CREATE TABLE IF NOT EXISTS `consultation` (
`consultationID` int(10) NOT NULL,
  `customerID` int(10) NOT NULL,
  `date` date NOT NULL,
  `time` time NOT NULL,
  `description` varchar(100) COLLATE utf8_bin NOT NULL,
  `accepted` tinyint(1) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=30 ;

--
-- Dumping data for table `consultation`
--

INSERT INTO `consultation` (`consultationID`, `customerID`, `date`, `time`, `description`, `accepted`) VALUES
(20, 27, '2014-10-05', '16:18:50', 'Robin1', 0),
(21, 28, '2014-10-05', '16:19:19', 'Max1', 0),
(22, 27, '2014-10-05', '16:19:51', 'Robin2', 0),
(23, 29, '2014-10-05', '16:22:37', 'lol', 0),
(24, 31, '2014-10-05', '16:23:57', 'henke1', 0),
(25, 31, '2014-10-05', '16:25:18', 'henke2', 0),
(26, 32, '2014-10-05', '16:27:47', 'asdasd', 0),
(27, 33, '2014-10-07', '21:29:30', 'd', 0),
(28, 33, '2014-10-13', '19:57:04', 'd', 0),
(29, 33, '2014-10-13', '19:58:04', 'd', 0);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE IF NOT EXISTS `customer` (
`customerID` int(10) NOT NULL,
  `name` varchar(15) COLLATE utf8_bin NOT NULL,
  `lastName` varchar(15) COLLATE utf8_bin NOT NULL,
  `email` varchar(35) COLLATE utf8_bin NOT NULL,
  `phoneNumber` varchar(15) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_bin AUTO_INCREMENT=34 ;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customerID`, `name`, `lastName`, `email`, `phoneNumber`) VALUES
(27, 'Robin', 'Jansson', 'RobinJansson@hotmail.com', '123'),
(28, 'Max', 'Alenius', 'MaxAlenius@hotmail.com', '456'),
(29, 'a', 'b', 'ad@aasd.se', 'c'),
(31, 'asd', 'asd', 'henke', 'asd'),
(32, 'l', 'l', 'lolasdsadsad', 'l'),
(33, 'a', 'a', 'c', 'b');

-- --------------------------------------------------------

--
-- Table structure for table `guitars`
--

CREATE TABLE IF NOT EXISTS `guitars` (
  `guitarrID` int(10) NOT NULL,
  `name` varchar(15) COLLATE utf8_bin NOT NULL,
  `price` int(10) NOT NULL,
  `description` varchar(100) COLLATE utf8_bin NOT NULL,
  `sold` tinyint(1) NOT NULL,
  `imagePath` varchar(100) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `news`
--

CREATE TABLE IF NOT EXISTS `news` (
`newsID` int(11) NOT NULL,
  `newsText` varchar(250) NOT NULL,
  `newsImage` varchar(250) NOT NULL,
  `newsName` varchar(250) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `news`
--

INSERT INTO `news` (`newsID`, `newsText`, `newsImage`, `newsName`) VALUES
(1, 'Det här är artikel nummer ett, LOREM IPSUM DELOOOOORORERER', 'resources/image/small1.png', 'Iphone 6 review'),
(2, 'This is article nr 2', 'resources/image/small1.png', 'Article nr 2'),
(3, 'Haha this is so cool', 'resources/image/small1.png', 'NO not again'),
(4, 'sadsadsad', 'resources/image/small1.png', 'asdadsadad');

-- --------------------------------------------------------

--
-- Table structure for table `reparations`
--

CREATE TABLE IF NOT EXISTS `reparations` (
  `repairID` int(10) NOT NULL,
  `customerID` int(10) NOT NULL,
  `hoursWorked` int(11) NOT NULL,
  `imagePath` varchar(60) COLLATE utf8_bin NOT NULL,
  `recieved` date NOT NULL,
  `done` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Table structure for table `spareparts`
--

CREATE TABLE IF NOT EXISTS `spareparts` (
  `spareID` varchar(10) COLLATE utf8_bin NOT NULL,
  `name` varchar(20) COLLATE utf8_bin NOT NULL,
  `price` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `about`
--
ALTER TABLE `about`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `company`
--
ALTER TABLE `company`
 ADD PRIMARY KEY (`name`);

--
-- Indexes for table `consultation`
--
ALTER TABLE `consultation`
 ADD PRIMARY KEY (`consultationID`), ADD KEY `FK_consultation` (`customerID`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
 ADD PRIMARY KEY (`customerID`);

--
-- Indexes for table `guitars`
--
ALTER TABLE `guitars`
 ADD PRIMARY KEY (`guitarrID`);

--
-- Indexes for table `news`
--
ALTER TABLE `news`
 ADD PRIMARY KEY (`newsID`);

--
-- Indexes for table `reparations`
--
ALTER TABLE `reparations`
 ADD PRIMARY KEY (`repairID`), ADD KEY `FK_reparations` (`customerID`);

--
-- Indexes for table `spareparts`
--
ALTER TABLE `spareparts`
 ADD PRIMARY KEY (`spareID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `about`
--
ALTER TABLE `about`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `consultation`
--
ALTER TABLE `consultation`
MODIFY `consultationID` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=30;
--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
MODIFY `customerID` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=34;
--
-- AUTO_INCREMENT for table `news`
--
ALTER TABLE `news`
MODIFY `newsID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `consultation`
--
ALTER TABLE `consultation`
ADD CONSTRAINT `FK_consultation` FOREIGN KEY (`customerID`) REFERENCES `customer` (`customerID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `reparations`
--
ALTER TABLE `reparations`
ADD CONSTRAINT `FK_reparations` FOREIGN KEY (`customerID`) REFERENCES `customer` (`customerID`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
