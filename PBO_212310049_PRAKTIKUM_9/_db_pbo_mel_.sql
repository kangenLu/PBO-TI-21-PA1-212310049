-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jan 11, 2023 at 06:15 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_pbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(10) NOT NULL,
  `fullname` varchar(30) NOT NULL,
  `phone` varchar(13) NOT NULL,
  `gender` varchar(1) NOT NULL,
  `citizenship` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `email`, `password`, `fullname`, `phone`, `gender`, `citizenship`) VALUES
(1, 'adrianadhari@protonmail.com', 'pekacu663', 'Admin', '0000000000', 'M', 'Indonesia'),
(2, '212310035@student.ibik.ac.id', '212310035', 'Adrian Adhari', '083819601297', 'M', 'Indonesia'),
(3, 'test@mail.com', 'test', 'testuser', '000', 'F', 'Indonesia'),
(4, 'melani250402@gmail.com', '123', 'melani alexandria', '0895375675969', 'F', 'New Zealand');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `id` int(11) NOT NULL,
  `npm` varchar(15) NOT NULL,
  `fullname` varchar(30) NOT NULL,
  `score` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`id`, `npm`, `fullname`, `score`) VALUES
(1, '212310049', 'Melani', 'A'),
(2, '212310034', 'Raden Rayyan Pratama Rakhmadie', 'A'),
(3, '212310017', 'Muhammad Alfan', 'A'),
(4, '212310006', 'Mahesa Alghifari', 'A'),
(5, '212310035', 'Adrian Adhari', 'A'),
(7, '212310023', 'Muhamad Yanuar Maulana', 'A'),
(8, '212310004', 'Muhamad Agus', 'A'),
(10, '212310005', 'rahmat', 'A'),
(11, '212310019', 'rayan', 'A'),
(12, '212310019', 'rayan', 'A');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
