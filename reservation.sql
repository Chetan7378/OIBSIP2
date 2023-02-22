-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 22, 2023 at 06:02 PM
-- Server version: 5.5.39
-- PHP Version: 5.4.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `reservation`
--

-- --------------------------------------------------------

--
-- Table structure for table `fetchname`
--

CREATE TABLE IF NOT EXISTS `fetchname` (
`tid` int(100) NOT NULL,
  `trainnum` bigint(100) NOT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `fetchname`
--

INSERT INTO `fetchname` (`tid`, `trainnum`, `name`) VALUES
(1, 12345, 'rajdaniexpress\r\n');

-- --------------------------------------------------------

--
-- Table structure for table `reser`
--

CREATE TABLE IF NOT EXISTS `reser` (
`rid` int(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `trainnum` bigint(100) NOT NULL,
  `trainname` varchar(100) NOT NULL,
  `mobile` bigint(110) NOT NULL,
  `from` varchar(100) NOT NULL,
  `to` varchar(100) NOT NULL,
  `reservation` varchar(100) NOT NULL,
  `berth` varchar(100) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `pnr` bigint(100) NOT NULL,
  `date` varchar(110) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `reser`
--

INSERT INTO `reser` (`rid`, `name`, `email`, `trainnum`, `trainname`, `mobile`, `from`, `to`, `reservation`, `berth`, `gender`, `pnr`, `date`) VALUES
(1, 'Chetan Shivade', 'chetanshivade34@gmail.com', 12345, 'rajdaniexpress\r\n', 7378518714, 'mumbai', 'pune', 'fs', 'lower', 'male', 9909460, '2023-02-24'),
(2, 'mr vishal', 'chetan@6', 12345, 'rajdaniexpress\r\n', 467445, 'mumbai', 'delhi', 'first class', 'sidelower', 'male', 2889294, '2023-02-23'),
(3, 'Chetan Shivade', 'chetan@6', 12345, 'rajdaniexpress\r\n', 467445, 'mumbai', 'delhi', 'first class', 'sidelower', 'male', 7194938, '2023-02-24');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
`uid` int(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `pwd` varchar(100) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`uid`, `email`, `pwd`) VALUES
(1, '0', '6565'),
(2, 'chetan@6', '6565');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `fetchname`
--
ALTER TABLE `fetchname`
 ADD PRIMARY KEY (`tid`);

--
-- Indexes for table `reser`
--
ALTER TABLE `reser`
 ADD PRIMARY KEY (`rid`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
 ADD PRIMARY KEY (`uid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `fetchname`
--
ALTER TABLE `fetchname`
MODIFY `tid` int(100) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `reser`
--
ALTER TABLE `reser`
MODIFY `rid` int(100) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
MODIFY `uid` int(100) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
