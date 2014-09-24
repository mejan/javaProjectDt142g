-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Värd: localhost
-- Tid vid skapande: 24 sep 2014 kl 17:30
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

-- --------------------------------------------------------

--
-- Tabellstruktur `Consultation`
--

CREATE TABLE IF NOT EXISTS `Consultation` (
  `cID` varchar(10) NOT NULL,
  `cuID` varchar(10) NOT NULL,
  `date` date NOT NULL,
  `description` varchar(100) NOT NULL,
  `accepted` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumpning av Data i tabell `Consultation`
--

INSERT INTO `Consultation` (`cID`, `cuID`, `date`, `description`, `accepted`) VALUES
('1', '2', '2014-09-23', 'Strängarna smalt i solen!', 0);

-- --------------------------------------------------------

--
-- Tabellstruktur `Customer`
--

CREATE TABLE IF NOT EXISTS `Customer` (
  `cuID` varchar(10) NOT NULL,
  `name` varchar(15) NOT NULL,
  `lastName` varchar(15) NOT NULL,
  `email` varchar(15) NOT NULL,
  `phoneNumber` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumpning av Data i tabell `Customer`
--

INSERT INTO `Customer` (`cuID`, `name`, `lastName`, `email`, `phoneNumber`) VALUES
('1', 'Anton', 'Dahlin', 'anton.dahlin@ou', '0738187707'),
('2', 'Christoffer', 'Telin', 'rapemyass@xxx.c', '0701234567');

-- --------------------------------------------------------

--
-- Tabellstruktur `Guitars`
--

CREATE TABLE IF NOT EXISTS `Guitars` (
  `guitarrID` varchar(10) NOT NULL,
  `name` varchar(15) NOT NULL,
  `price` int(10) NOT NULL,
  `description` varchar(100) NOT NULL,
  `sold` tinyint(1) NOT NULL,
  `imagePath` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellstruktur `Reparations`
--

CREATE TABLE IF NOT EXISTS `Reparations` (
  `repairID` varchar(10) NOT NULL,
  `cuID` varchar(10) NOT NULL,
  `hoursWorked` int(11) NOT NULL,
  `recieved` date NOT NULL,
  `done` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Tabellstruktur `SpareParts`
--

CREATE TABLE IF NOT EXISTS `SpareParts` (
  `spareID` varchar(10) NOT NULL,
  `name` varchar(20) NOT NULL,
  `price` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumpning av Data i tabell `SpareParts`
--

INSERT INTO `SpareParts` (`spareID`, `name`, `price`) VALUES
('1', 'Stings', 10);

--
-- Index för dumpade tabeller
--

--
-- Index för tabell `Consultation`
--
ALTER TABLE `Consultation`
 ADD PRIMARY KEY (`cID`), ADD KEY `cuID` (`cuID`);

--
-- Index för tabell `Customer`
--
ALTER TABLE `Customer`
 ADD PRIMARY KEY (`cuID`);

--
-- Index för tabell `Guitars`
--
ALTER TABLE `Guitars`
 ADD PRIMARY KEY (`guitarrID`);

--
-- Index för tabell `Reparations`
--
ALTER TABLE `Reparations`
 ADD PRIMARY KEY (`repairID`), ADD KEY `cuID` (`cuID`);

--
-- Index för tabell `SpareParts`
--
ALTER TABLE `SpareParts`
 ADD PRIMARY KEY (`spareID`);

--
-- Restriktioner för dumpade tabeller
--

--
-- Restriktioner för tabell `Consultation`
--
ALTER TABLE `Consultation`
ADD CONSTRAINT `Consultation_ibfk_1` FOREIGN KEY (`cuID`) REFERENCES `projectjava`.`Customer` (`cuID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Restriktioner för tabell `Reparations`
--
ALTER TABLE `Reparations`
ADD CONSTRAINT `Reparations_ibfk_1` FOREIGN KEY (`cuID`) REFERENCES `projectjava`.`Customer` (`cuID`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
