-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 07, 2022 at 04:36 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sale`
--

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `CateID` int(11) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Description` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`CateID`, `Name`, `Description`) VALUES
(1, 'Gọng kính cận vuông', '...'),
(2, 'Gọng kính cận trong suốt', '...'),
(6, 'Gọng kính kim loại', '...'),
(7, 'Gọng kính tròn', '...');

-- --------------------------------------------------------

--
-- Table structure for table `order_detail`
--

CREATE TABLE `order_detail` (
  `OrderID` int(11) NOT NULL,
  `ProductID` int(11) NOT NULL,
  `Price` double NOT NULL,
  `Qty` int(11) NOT NULL,
  `Subtotal` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `order_detail`
--

INSERT INTO `order_detail` (`OrderID`, `ProductID`, `Price`, `Qty`, `Subtotal`) VALUES
(45, 13, 120000, 1, 120000),
(45, 15, 100000, 2, 200000),
(46, 13, 120000, 2, 240000),
(46, 15, 100000, 1, 100000),
(48, 15, 100000, 2, 200000),
(48, 16, 100000, 5, 500000),
(49, 13, 120000, 3, 360000),
(49, 15, 100000, 2, 200000),
(51, 16, 100000, 2, 200000),
(51, 17, 150000, 2, 300000);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `ProductID` int(11) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Stock` int(6) NOT NULL DEFAULT 0,
  `Price` double NOT NULL DEFAULT 0,
  `Description` text NOT NULL,
  `Image` varchar(100) DEFAULT NULL,
  `CateID` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`ProductID`, `Name`, `Stock`, `Price`, `Description`, `Image`, `CateID`) VALUES
(13, 'Kính mắt mèo EyeCenter ', 10, 120000, '...', NULL, 6),
(15, 'Kính kim loai Zac C01', 18, 100000, '...', NULL, 6),
(16, 'Kính nhựa dẻo Zac C50', 18, 100000, '...', NULL, 6),
(17, 'Gong kình tròn nữ EyeCenter K22', 28, 150000, '...', NULL, 7);

-- --------------------------------------------------------

--
-- Table structure for table `purchase_order`
--

CREATE TABLE `purchase_order` (
  `OrderID` int(11) NOT NULL,
  `Date` datetime NOT NULL,
  `Address` text NOT NULL,
  `City` varchar(100) NOT NULL,
  `TotalPrice` double NOT NULL,
  `TotalQty` int(11) NOT NULL,
  `CusID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `purchase_order`
--

INSERT INTO `purchase_order` (`OrderID`, `Date`, `Address`, `City`, `TotalPrice`, `TotalQty`, `CusID`) VALUES
(45, '2022-11-01 07:49:35', '124 Hong Bang', 'Tp.HCM', 320000, 3, 2),
(46, '2022-11-07 09:46:16', '144 Tan Da', 'Tp.HCM', 340000, 3, 3),
(48, '2022-11-07 10:17:22', '155 Cong Quynh', 'Ha Noi', 700000, 7, 2),
(49, '2022-11-07 10:18:16', '155 Ly Kiet', 'Tp.HCM', 560000, 5, 3),
(51, '2022-11-07 10:33:01', '433 Chieu Hoang', 'Tp.HCM', 500000, 4, 3);

-- --------------------------------------------------------

--
-- Table structure for table `received`
--

CREATE TABLE `received` (
  `RecID` int(11) NOT NULL,
  `Date` date NOT NULL,
  `TotalPrice` double NOT NULL,
  `TotalQty` int(6) NOT NULL,
  `EmpID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `received_detail`
--

CREATE TABLE `received_detail` (
  `RecID` int(11) NOT NULL,
  `ProductID` int(11) NOT NULL,
  `Price` double NOT NULL,
  `Qty` int(6) NOT NULL,
  `Subtotal` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `UserID` int(11) NOT NULL,
  `FirstName` varchar(100) NOT NULL,
  `LastName` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Phone` varchar(15) NOT NULL,
  `IsEmployee` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`UserID`, `FirstName`, `LastName`, `Email`, `Password`, `Phone`, `IsEmployee`) VALUES
(2, 'Alice', 'Jayson', 'alice@gmail.com', '123', '0877653322', 0),
(3, 'John', 'Ryan', 'john@gmail.com', '123', '0965433212', 0),
(5, 'Tom', 'Phill', 'phill@gmail.com', '123', '0965433212', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`CateID`);

--
-- Indexes for table `order_detail`
--
ALTER TABLE `order_detail`
  ADD PRIMARY KEY (`OrderID`,`ProductID`) USING BTREE,
  ADD KEY `OrderID` (`OrderID`,`ProductID`) USING BTREE,
  ADD KEY `ProductID` (`ProductID`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`ProductID`),
  ADD UNIQUE KEY `Name` (`Name`),
  ADD KEY `CateID` (`CateID`);

--
-- Indexes for table `purchase_order`
--
ALTER TABLE `purchase_order`
  ADD PRIMARY KEY (`OrderID`),
  ADD KEY `CustomerID` (`CusID`);

--
-- Indexes for table `received`
--
ALTER TABLE `received`
  ADD PRIMARY KEY (`RecID`),
  ADD KEY `EmpID` (`EmpID`);

--
-- Indexes for table `received_detail`
--
ALTER TABLE `received_detail`
  ADD PRIMARY KEY (`RecID`,`ProductID`) USING BTREE,
  ADD KEY `RecID` (`RecID`,`ProductID`) USING BTREE,
  ADD KEY `ProductID` (`ProductID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`UserID`),
  ADD UNIQUE KEY `Email` (`Email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `CateID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `order_detail`
--
ALTER TABLE `order_detail`
  MODIFY `OrderID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `ProductID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `purchase_order`
--
ALTER TABLE `purchase_order`
  MODIFY `OrderID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- AUTO_INCREMENT for table `received`
--
ALTER TABLE `received`
  MODIFY `RecID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `order_detail`
--
ALTER TABLE `order_detail`
  ADD CONSTRAINT `order_detail_ibfk_3` FOREIGN KEY (`OrderID`) REFERENCES `purchase_order` (`OrderID`),
  ADD CONSTRAINT `order_detail_ibfk_4` FOREIGN KEY (`ProductID`) REFERENCES `product` (`ProductID`);

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `product_ibfk_1` FOREIGN KEY (`CateID`) REFERENCES `category` (`CateID`);

--
-- Constraints for table `purchase_order`
--
ALTER TABLE `purchase_order`
  ADD CONSTRAINT `purchase_order_ibfk_1` FOREIGN KEY (`CusID`) REFERENCES `user` (`UserID`);

--
-- Constraints for table `received`
--
ALTER TABLE `received`
  ADD CONSTRAINT `received_ibfk_1` FOREIGN KEY (`EmpID`) REFERENCES `user` (`UserID`);

--
-- Constraints for table `received_detail`
--
ALTER TABLE `received_detail`
  ADD CONSTRAINT `received_detail_ibfk_2` FOREIGN KEY (`RecID`) REFERENCES `received` (`RecID`),
  ADD CONSTRAINT `received_detail_ibfk_3` FOREIGN KEY (`ProductID`) REFERENCES `product` (`ProductID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
