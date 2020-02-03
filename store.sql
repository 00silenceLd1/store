/*
Navicat MySQL Data Transfer

Source Server         : admin
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : store

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2020-02-03 14:53:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dealgoodsinfo
-- ----------------------------
DROP TABLE IF EXISTS `dealgoodsinfo`;
CREATE TABLE `dealgoodsinfo` (
  `dealGoodsInfoId` varchar(255) DEFAULT NULL,
  `dealNo` varchar(255) DEFAULT NULL,
  `sampleGoodsId` varchar(255) DEFAULT NULL,
  `goodsName` varchar(255) DEFAULT NULL,
  `goodsFirstQty` float DEFAULT NULL,
  `goodsFirstUnit` varchar(255) DEFAULT NULL,
  `goodsModel` varchar(255) DEFAULT NULL,
  `dealStatus` tinyint(4) DEFAULT NULL,
  `enabled` tinyint(4) DEFAULT NULL,
  `goodsPosition` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dealgoodsinfo
-- ----------------------------

-- ----------------------------
-- Table structure for dealinfo
-- ----------------------------
DROP TABLE IF EXISTS `dealinfo`;
CREATE TABLE `dealinfo` (
  `dealInfoId` varchar(255) DEFAULT NULL,
  `dealNo` varchar(255) DEFAULT NULL,
  `dealPerson` varchar(255) DEFAULT NULL,
  `dealTime` bigint(20) DEFAULT NULL,
  `goodsDesc` varchar(255) DEFAULT NULL,
  `enabled` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dealinfo
-- ----------------------------

-- ----------------------------
-- Table structure for insotreinfo
-- ----------------------------
DROP TABLE IF EXISTS `insotreinfo`;
CREATE TABLE `insotreinfo` (
  `instoreInfoId` varchar(255) DEFAULT NULL,
  `instoreNo` varchar(255) DEFAULT NULL,
  `goodsDesc` varchar(255) DEFAULT NULL,
  `instoreTime` bigint(20) DEFAULT NULL,
  `inventory` varchar(255) DEFAULT NULL,
  `scenePeople` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `enabled` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of insotreinfo
-- ----------------------------
INSERT INTO `insotreinfo` VALUES ('121', '1', '水果', '1576216442000', '1', '刘东', '无', '0');
INSERT INTO `insotreinfo` VALUES ('122', '2', '纸巾', '1576216442000', '1', '李四', '一等品', '0');

-- ----------------------------
-- Table structure for instoregoodsinfo
-- ----------------------------
DROP TABLE IF EXISTS `instoregoodsinfo`;
CREATE TABLE `instoregoodsinfo` (
  `instoreGoodsInfoId` varchar(255) DEFAULT NULL,
  `goodsNo` varchar(255) DEFAULT NULL,
  `instoreInfoId` varchar(255) DEFAULT NULL,
  `instoreNo` varchar(255) DEFAULT NULL,
  `goodsName` varchar(255) DEFAULT NULL,
  `goodsModel` varchar(255) DEFAULT NULL,
  `goodsType` varchar(255) DEFAULT NULL,
  `goodsDueDate` bigint(20) DEFAULT NULL,
  `goodsFirstQty` float DEFAULT NULL,
  `goodsFirstUnit` varchar(255) DEFAULT NULL,
  `outGoodsFirstQty` int(11) DEFAULT NULL,
  `enabled` tinyint(4) DEFAULT NULL,
  `goodsPosition` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of instoregoodsinfo
-- ----------------------------
INSERT INTO `instoregoodsinfo` VALUES ('121', '1', '121', '1', '脐橙', '', '水果', '1577685242000', '20', '千克', '0', '0', 'A区01货架');
INSERT INTO `instoregoodsinfo` VALUES ('121', '1', '121', '1', '苹果', null, '水果', '1577685242000', '20', '千克', '0', '0', 'A区02货架');
INSERT INTO `instoregoodsinfo` VALUES ('122', '2', '122', '2', '维达纸巾', '50*20', '纸巾', '1687685242000', '10', '千克', '0', '0', 'A区03货架');

-- ----------------------------
-- Table structure for outstoregoodsinfo
-- ----------------------------
DROP TABLE IF EXISTS `outstoregoodsinfo`;
CREATE TABLE `outstoregoodsinfo` (
  `outStoreDealFormsId` varchar(255) DEFAULT NULL,
  `outStoreInfoId` varchar(255) DEFAULT NULL,
  `outStoreNo` varchar(255) DEFAULT NULL,
  `instoreNo` varchar(255) DEFAULT NULL,
  `goodsName` varchar(255) DEFAULT NULL,
  `goodsFirstQty` float DEFAULT NULL,
  `goodsFirstUnit` varchar(255) DEFAULT NULL,
  `goodsModel` varchar(255) DEFAULT NULL,
  `consignee` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `enabled` tinyint(4) DEFAULT NULL,
  `goodsPosition` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of outstoregoodsinfo
-- ----------------------------

-- ----------------------------
-- Table structure for outstoreinfo
-- ----------------------------
DROP TABLE IF EXISTS `outstoreinfo`;
CREATE TABLE `outstoreinfo` (
  `outStoreInfoId` varchar(255) DEFAULT NULL,
  `outStoreNo` varchar(255) DEFAULT NULL,
  `makingTime` bigint(20) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `goodsDesc` varchar(255) DEFAULT NULL,
  `approveUserId` varchar(255) DEFAULT NULL,
  `approveUserName` varchar(255) DEFAULT NULL,
  `outStoreStatus` tinyint(4) DEFAULT NULL,
  `enabled` tinyint(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of outstoreinfo
-- ----------------------------

-- ----------------------------
-- Table structure for samplegooodsinfo
-- ----------------------------
DROP TABLE IF EXISTS `samplegooodsinfo`;
CREATE TABLE `samplegooodsinfo` (
  `sampleGoodsId` varchar(255) DEFAULT NULL,
  `sampleNo` varchar(255) DEFAULT NULL,
  `instoreNo` varchar(255) DEFAULT NULL,
  `goodsName` varchar(255) DEFAULT NULL,
  `goodsFirstQty` float DEFAULT NULL,
  `goodsFirstUnit` varchar(255) DEFAULT NULL,
  `goodsModel` varchar(255) DEFAULT NULL,
  `goodsDetailI` varchar(255) DEFAULT NULL,
  `sampleReturnPerson` varchar(255) DEFAULT NULL,
  `sampleReturnTime` bigint(20) DEFAULT NULL,
  `goodsHandleFirstQty` float DEFAULT NULL,
  `goodsHandleFirstUnit` varchar(255) DEFAULT NULL,
  `returnStatus` tinyint(4) DEFAULT NULL,
  `enabled` tinyint(4) DEFAULT NULL,
  `goodsPosition` tinyint(4) DEFAULT NULL,
  `goodsEvaluation` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of samplegooodsinfo
-- ----------------------------

-- ----------------------------
-- Table structure for sampleinfo
-- ----------------------------
DROP TABLE IF EXISTS `sampleinfo`;
CREATE TABLE `sampleinfo` (
  `sampleInfoId` varchar(255) DEFAULT NULL,
  `instoreNo` varchar(255) DEFAULT NULL,
  `sampleStatus` tinyint(4) DEFAULT NULL,
  `sampleTime` bigint(20) DEFAULT NULL,
  `samplePerson` varchar(255) DEFAULT NULL,
  `sampleNo` varchar(255) DEFAULT NULL,
  `instoreAdmin` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `goodsDesc` varchar(255) DEFAULT NULL,
  `enabled` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sampleinfo
-- ----------------------------
INSERT INTO `sampleinfo` VALUES ('111', '1', '1', '1', '1', '1', '1', '1', '1', '0');

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `userId` varchar(255) DEFAULT NULL COMMENT '用户主键',
  `userName` varchar(255) DEFAULT NULL COMMENT '用户名字',
  `userPassword` varchar(255) DEFAULT NULL COMMENT '用户密码',
  `userPression` tinyint(4) DEFAULT NULL COMMENT '用户权限（1、普通仓库管理人员2超级管理员）',
  `creatTime` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `enabled` tinyint(4) DEFAULT NULL COMMENT '是否删除（0未删除，-1删除）'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('1001', '刘东', '123', '2', '1', '0');
INSERT INTO `userinfo` VALUES ('1002', '李四', '123', '2', '2', '0');
INSERT INTO `userinfo` VALUES ('1003', '王五', '123', '1', '1', '0');
INSERT INTO `userinfo` VALUES ('1004', '柳青', '123', '1', '1', '0');
INSERT INTO `userinfo` VALUES ('1005', '胡月', '123', '1', '1', '0');
INSERT INTO `userinfo` VALUES ('1006', '拉拉', '123', '1', '1', '0');
INSERT INTO `userinfo` VALUES ('1007', '蒙多', '123', '1', '1', '0');
INSERT INTO `userinfo` VALUES ('1008', '李白', '123', '1', '1', '0');
INSERT INTO `userinfo` VALUES ('1009', '韩信', '123', '1', '1', '0');
INSERT INTO `userinfo` VALUES ('1010', '杨铠', '123', '1', '1', '0');
INSERT INTO `userinfo` VALUES ('1011', '1', '123', '1', '1', '0');
