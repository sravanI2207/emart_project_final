-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 13, 2020 at 05:49 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `emart`
--

-- --------------------------------------------------------

--
-- Table structure for table `bill_details_table`
--

CREATE TABLE `bill_details_table` (
  `bill_details_id` int(20) NOT NULL,
  `bill_id` int(20) NOT NULL,
  `item_id` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bill_details_table`
--

INSERT INTO `bill_details_table` (`bill_details_id`, `bill_id`, `item_id`) VALUES
(701, 601, 301),
(704, 607, 301),
(705, 608, 303),
(706, 609, 303),
(707, 610, 303),
(708, 611, 303),
(709, 612, 303),
(710, 613, 302),
(711, 614, 301),
(712, 615, 302),
(713, 615, 301),
(714, 616, 302),
(716, 618, 303),
(717, 619, 302),
(718, 619, 303),
(719, 620, 303),
(720, 621, 301),
(721, 622, 303),
(722, 623, 302),
(723, 623, 303),
(724, 624, 302),
(725, 624, 302),
(726, 625, 303),
(727, 625, 303),
(728, 626, 302),
(729, 627, 302),
(730, 628, 302),
(731, 628, 304),
(732, 629, 303),
(733, 629, 302),
(734, 630, 306),
(735, 631, 305),
(736, 632, 307),
(737, 633, 307),
(738, 633, 302),
(739, 634, 304),
(740, 634, 306);

-- --------------------------------------------------------

--
-- Table structure for table `bill_table`
--

CREATE TABLE `bill_table` (
  `bill_id` int(20) NOT NULL,
  `buyer_id` int(20) NOT NULL,
  `bill_type` varchar(20) NOT NULL,
  `bill_date` date NOT NULL,
  `bill_remarks` varchar(20) NOT NULL,
  `bill_amount` int(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bill_table`
--

INSERT INTO `bill_table` (`bill_id`, `buyer_id`, `bill_type`, `bill_date`, `bill_remarks`, `bill_amount`) VALUES
(601, 501, 'cash', '2020-02-27', 'good', 5000),
(607, 501, 'cash', '2020-02-26', 'good', 5000),
(608, 501, 'Debit', '2020-03-05', 'paid', 90000),
(609, 501, 'Debit', '2020-03-05', 'paid', 90000),
(610, 501, 'Debit', '2020-03-05', 'paid', 90000),
(611, 501, 'Debit', '2020-03-05', 'paid', 90000),
(612, 501, 'Debit', '2020-03-05', 'paid', 90000),
(613, 501, 'Debit', '2020-03-05', 'paid', 130000),
(614, 501, 'Debit', '2020-03-05', 'paid', 120000),
(615, 501, 'Debit', '2020-03-05', 'paid', 250000),
(616, 501, 'Debit', '2020-03-05', 'paid', 130000),
(618, 501, 'Debit', '2020-03-05', 'paid', 90000),
(619, 501, 'Debit', '2020-03-05', 'paid', 220000),
(620, 501, 'Debit', '2020-03-05', 'paid', 90000),
(621, 501, 'Debit', '2020-03-05', 'paid', 120000),
(622, 503, 'Debit', '2020-03-07', 'paid', 90000),
(623, 503, 'Debit', '2020-03-07', 'paid', 220000),
(624, 503, 'Debit', '2020-03-07', 'paid', 260000),
(625, 503, 'Debit', '2020-03-07', 'paid', 180000),
(626, 503, 'Debit', '2020-03-07', 'paid', 130000),
(627, 503, 'Debit', '2020-03-10', 'paid', 130000),
(628, 505, 'Debit', '2020-03-10', 'paid', 145000),
(629, 521, 'Debit', '2020-03-10', 'paid', 220000),
(630, 503, 'Debit', '2020-03-11', 'paid', 3500),
(631, 503, 'Debit', '2020-03-11', 'paid', 1500),
(632, 503, 'Debit', '2020-03-11', 'paid', 800),
(633, 522, 'Debit', '2020-03-11', 'paid', 45800),
(634, 522, 'Debit', '2020-03-11', 'paid', 18500);

-- --------------------------------------------------------

--
-- Table structure for table `buyer_signup_table`
--

CREATE TABLE `buyer_signup_table` (
  `buyer_id` int(20) NOT NULL,
  `buyer_username` varchar(20) NOT NULL,
  `buyer_password` varchar(20) NOT NULL,
  `buyer_email` varchar(200) NOT NULL,
  `buyer_mobile` int(200) NOT NULL,
  `buyer_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `buyer_signup_table`
--

INSERT INTO `buyer_signup_table` (`buyer_id`, `buyer_username`, `buyer_password`, `buyer_email`, `buyer_mobile`, `buyer_date`) VALUES
(501, 'kalpana', 'kalpana', 'kalpana@gmail.com', 2000, '2020-02-27'),
(502, 'pooja', 'pooja', 'pooja@gmail.com', 3000, '2020-02-27'),
(503, 'sravani', 'sravani', 'sravani@gmail.com', 4000, '2020-02-28'),
(505, 'sravss', 'sravss', 'sravss@gmail.com', 123, '2020-03-10'),
(521, 'sravan', 'sravan', 'sravan@gmail.com', 2207, '2020-03-10'),
(522, 'abc', 'abc', 'abc@gmail.com', 2345, '2020-03-11');

-- --------------------------------------------------------

--
-- Table structure for table `category_table`
--

CREATE TABLE `category_table` (
  `category_id` int(150) NOT NULL,
  `category_name` varchar(20) NOT NULL,
  `category_brief` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category_table`
--

INSERT INTO `category_table` (`category_id`, `category_name`, `category_brief`) VALUES
(101, 'Electronics', 'electronics like mob'),
(102, 'Footwear', 'footwear like slippe'),
(103, 'Clothes', 'clothes like jeans,d');

-- --------------------------------------------------------

--
-- Table structure for table `item_table`
--

CREATE TABLE `item_table` (
  `item_id` int(20) NOT NULL,
  `item_name` varchar(20) NOT NULL,
  `item_image` varchar(500) NOT NULL,
  `item_price` int(20) NOT NULL,
  `item_stock` int(20) NOT NULL,
  `item_description` varchar(200) NOT NULL,
  `subcategory_id` int(20) NOT NULL,
  `item_remarks` varchar(200) NOT NULL,
  `seller_id` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `item_table`
--

INSERT INTO `item_table` (`item_id`, `item_name`, `item_image`, `item_price`, `item_stock`, `item_description`, `subcategory_id`, `item_remarks`, `seller_id`) VALUES
(301, 'LG TV', 'https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6211/6211112_rd.jpg', 120000, 300, 'LG tv 46 inches', 201, 'good', 401),
(302, 'Samsung ', 'https://images.unsplash.com/photo-1567690187548-f07b1d7bf5a9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60', 45000, 300, 'Samsung 55Inch ', 201, 'good', 401),
(303, 'iphone11', 'https://images.unsplash.com/photo-1528254609158-ae7dfaa48ab3?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1650&q=80', 90000, 300, 'iphone11', 202, 'best', 401),
(304, 'redmi 6pro', 'https://images.unsplash.com/photo-1558885544-2defc62e2e2b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=675&q=80', 15000, 250, 'black color ', 202, 'good', 401),
(305, 'jeans', 'https://images.unsplash.com/photo-1541085388148-a30647cab28f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=800&q=80', 1500, 600, 'denim jean', 205, 'good', 401),
(306, 'saree', 'https://images.unsplash.com/photo-1578681140818-d89e3f986631?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80', 3500, 850, 'silk pattu', 206, 'best', 401),
(307, 'saree', 'https://images.unsplash.com/photo-1559548160-398909dbf24d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1834&q=80', 800, 600, 'cotton saree', 206, 'good', 401),
(308, 'hoodies', 'https://images.unsplash.com/photo-1484329081568-bed9ba42793d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1052&q=80', 2500, 450, 'winter', 205, 'best', 401);

-- --------------------------------------------------------

--
-- Table structure for table `seller_signup_table`
--

CREATE TABLE `seller_signup_table` (
  `seller_id` int(20) NOT NULL,
  `seller_username` varchar(20) NOT NULL,
  `seller_password` varchar(20) NOT NULL,
  `seller_company` varchar(20) NOT NULL,
  `seller_brief` varchar(200) NOT NULL,
  `seller_gst` int(20) NOT NULL,
  `seller_address` varchar(200) NOT NULL,
  `seller_email` varchar(20) NOT NULL,
  `seller_contact` int(50) NOT NULL,
  `seller_website` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `seller_signup_table`
--

INSERT INTO `seller_signup_table` (`seller_id`, `seller_username`, `seller_password`, `seller_company`, `seller_brief`, `seller_gst`, `seller_address`, `seller_email`, `seller_contact`, `seller_website`) VALUES
(401, 'sindhu', 'sindhu', 'reddy', 'seller', 5, 'perungudi', 'sindhu@gmail.com', 1111, 'www.sindhu.com'),
(403, 'sravs', 'sravs', 'emart', 'seller', 4, 'hyderabad', 'sravs@gmail.com', 7799, 'www.emart.com'),
(404, 'a', 'a', 'a', 'a', 2, 'a', 'a', 34, 'a'),
(406, 'b', 'b', 'b', 'b', 5, 'b', 'b@gmail.com', 3456, 'www.amazon.com');

-- --------------------------------------------------------

--
-- Table structure for table `subcategory_table`
--

CREATE TABLE `subcategory_table` (
  `subcategory_id` int(11) NOT NULL,
  `subcategory_name` varchar(11) NOT NULL,
  `category_id` int(11) NOT NULL,
  `subcategory_brief` varchar(300) NOT NULL,
  `subcategory_gst` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `subcategory_table`
--

INSERT INTO `subcategory_table` (`subcategory_id`, `subcategory_name`, `category_id`, `subcategory_brief`, `subcategory_gst`) VALUES
(201, 'TV', 101, 'TV', 5),
(202, 'Mobile', 101, 'mobile', 5),
(203, 'shoes', 102, 'footwear', 5),
(204, 'slippers', 102, 'footwear', 5),
(205, 'Winterwear', 103, 'winterwear', 5),
(206, 'sarees', 103, 'sarees', 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bill_details_table`
--
ALTER TABLE `bill_details_table`
  ADD PRIMARY KEY (`bill_details_id`),
  ADD KEY `bill_id` (`bill_id`),
  ADD KEY `item_id` (`item_id`);

--
-- Indexes for table `bill_table`
--
ALTER TABLE `bill_table`
  ADD PRIMARY KEY (`bill_id`),
  ADD KEY `buyer_id` (`buyer_id`);

--
-- Indexes for table `buyer_signup_table`
--
ALTER TABLE `buyer_signup_table`
  ADD PRIMARY KEY (`buyer_id`);

--
-- Indexes for table `category_table`
--
ALTER TABLE `category_table`
  ADD PRIMARY KEY (`category_id`);

--
-- Indexes for table `item_table`
--
ALTER TABLE `item_table`
  ADD PRIMARY KEY (`item_id`),
  ADD KEY `item_table_ibfk_2` (`seller_id`),
  ADD KEY `subcategory_id` (`subcategory_id`);

--
-- Indexes for table `seller_signup_table`
--
ALTER TABLE `seller_signup_table`
  ADD PRIMARY KEY (`seller_id`);

--
-- Indexes for table `subcategory_table`
--
ALTER TABLE `subcategory_table`
  ADD PRIMARY KEY (`subcategory_id`),
  ADD KEY `category_id` (`category_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bill_details_table`
--
ALTER TABLE `bill_details_table`
  MODIFY `bill_details_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=741;

--
-- AUTO_INCREMENT for table `bill_table`
--
ALTER TABLE `bill_table`
  MODIFY `bill_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=635;

--
-- AUTO_INCREMENT for table `buyer_signup_table`
--
ALTER TABLE `buyer_signup_table`
  MODIFY `buyer_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=524;

--
-- AUTO_INCREMENT for table `category_table`
--
ALTER TABLE `category_table`
  MODIFY `category_id` int(150) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=104;

--
-- AUTO_INCREMENT for table `item_table`
--
ALTER TABLE `item_table`
  MODIFY `item_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=309;

--
-- AUTO_INCREMENT for table `seller_signup_table`
--
ALTER TABLE `seller_signup_table`
  MODIFY `seller_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=407;

--
-- AUTO_INCREMENT for table `subcategory_table`
--
ALTER TABLE `subcategory_table`
  MODIFY `subcategory_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=207;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bill_details_table`
--
ALTER TABLE `bill_details_table`
  ADD CONSTRAINT `bill_details_table_ibfk_3` FOREIGN KEY (`bill_id`) REFERENCES `bill_table` (`bill_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `bill_details_table_ibfk_4` FOREIGN KEY (`item_id`) REFERENCES `item_table` (`item_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `bill_table`
--
ALTER TABLE `bill_table`
  ADD CONSTRAINT `bill_table_ibfk_1` FOREIGN KEY (`buyer_id`) REFERENCES `buyer_signup_table` (`buyer_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `item_table`
--
ALTER TABLE `item_table`
  ADD CONSTRAINT `item_table_ibfk_2` FOREIGN KEY (`seller_id`) REFERENCES `seller_signup_table` (`seller_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `item_table_ibfk_3` FOREIGN KEY (`subcategory_id`) REFERENCES `subcategory_table` (`subcategory_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `subcategory_table`
--
ALTER TABLE `subcategory_table`
  ADD CONSTRAINT `subcategory_table_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `category_table` (`category_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
