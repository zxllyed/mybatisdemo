/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : hibernate_day02

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2019-05-24 15:59:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `cts_customer`
-- ----------------------------
DROP TABLE IF EXISTS `cts_customer`;
CREATE TABLE `cts_customer` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cts_customer
-- ----------------------------
INSERT INTO `cts_customer` VALUES ('1', 'zxllyed', 'baidu');
INSERT INTO `cts_customer` VALUES ('2', 'zxlala', 'qq');
INSERT INTO `cts_customer` VALUES ('3', 'zx', '163');
INSERT INTO `cts_customer` VALUES ('4', 'lk is a dog', 'zxalalalala@qq.com');
INSERT INTO `cts_customer` VALUES ('6', 'zxlalababaaba1123123', 'zxalalalala11231231@qq.com');
INSERT INTO `cts_customer` VALUES ('7', 'zxlalababaaba1123123', 'zxalalalala11231231@qq.com');
INSERT INTO `cts_customer` VALUES ('8', 'zxhaha', 'zxhaha@qq.com');

-- ----------------------------
-- Table structure for `cts_linkman`
-- ----------------------------
DROP TABLE IF EXISTS `cts_linkman`;
CREATE TABLE `cts_linkman` (
  `link_id` int(11) NOT NULL AUTO_INCREMENT,
  `link_name` varchar(255) DEFAULT NULL,
  `link_age` varchar(255) DEFAULT NULL,
  `lkm_cid` int(11) DEFAULT NULL,
  PRIMARY KEY (`link_id`),
  KEY `FKi7s116v4nhr03ekjndmjyk2pj` (`lkm_cid`),
  CONSTRAINT `FKi7s116v4nhr03ekjndmjyk2pj` FOREIGN KEY (`lkm_cid`) REFERENCES `cts_customer` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cts_linkman
-- ----------------------------
INSERT INTO `cts_linkman` VALUES ('1', 'TK0', '11', '1');
INSERT INTO `cts_linkman` VALUES ('2', 'TK1', '11', '1');
INSERT INTO `cts_linkman` VALUES ('3', 'TK2', '11', '1');
INSERT INTO `cts_linkman` VALUES ('4', 'TK3', '11', '1');
INSERT INTO `cts_linkman` VALUES ('5', 'TK4', '11', '1');
INSERT INTO `cts_linkman` VALUES ('6', 'TK5', '11', '1');
INSERT INTO `cts_linkman` VALUES ('7', 'TK6', '21', '1');
INSERT INTO `cts_linkman` VALUES ('8', 'TK7', '31', '1');
INSERT INTO `cts_linkman` VALUES ('9', 'TK8', '42', '1');
INSERT INTO `cts_linkman` VALUES ('10', 'TK9', '23', '1');
INSERT INTO `cts_linkman` VALUES ('11', 'TK10', '24', '1');
INSERT INTO `cts_linkman` VALUES ('12', 'DK0', '45', '2');
INSERT INTO `cts_linkman` VALUES ('13', 'DK1', '24', '2');
INSERT INTO `cts_linkman` VALUES ('14', 'DK2', '32', '2');
INSERT INTO `cts_linkman` VALUES ('15', 'DK3', '41', '2');
INSERT INTO `cts_linkman` VALUES ('16', 'DK4', '12', '2');
INSERT INTO `cts_linkman` VALUES ('17', 'DK5', '23', '2');
INSERT INTO `cts_linkman` VALUES ('18', 'DK6', '32', '2');
INSERT INTO `cts_linkman` VALUES ('19', 'DK7', '34', '2');
INSERT INTO `cts_linkman` VALUES ('20', 'DK8', '43', '2');
INSERT INTO `cts_linkman` VALUES ('21', 'DK9', '12', '2');
INSERT INTO `cts_linkman` VALUES ('22', 'DK10', '21', '2');
INSERT INTO `cts_linkman` VALUES ('23', 'BM0', '21', '3');
INSERT INTO `cts_linkman` VALUES ('24', 'BM1', '43', '3');
INSERT INTO `cts_linkman` VALUES ('25', 'BM2', '12', '3');
INSERT INTO `cts_linkman` VALUES ('26', 'BM3', '32', '3');
INSERT INTO `cts_linkman` VALUES ('27', 'BM4', '12', '3');
INSERT INTO `cts_linkman` VALUES ('28', 'BM5', '42', '3');
INSERT INTO `cts_linkman` VALUES ('29', 'BM6', '23', '3');
INSERT INTO `cts_linkman` VALUES ('30', 'BM7', '56', '3');
INSERT INTO `cts_linkman` VALUES ('31', 'BM8', '76', '3');
INSERT INTO `cts_linkman` VALUES ('32', 'BM9', '86', '3');
INSERT INTO `cts_linkman` VALUES ('33', 'BM10', '54', '3');
