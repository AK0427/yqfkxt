/*
 Navicat Premium Data Transfer

 Source Server         : MYSQQL
 Source Server Type    : MySQL
 Source Server Version : 80030
 Source Host           : localhost:3306
 Source Schema         : campus

 Target Server Type    : MySQL
 Target Server Version : 80030
 File Encoding         : 65001

 Date: 05/12/2022 17:31:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for declares
-- ----------------------------
DROP TABLE IF EXISTS `declares`;
CREATE TABLE `declares`  (
  `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '姓名',
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '联系方式',
  `sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '性别',
  `state` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '健康状态',
  `date` datetime(0) NOT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '上报时间',
  `native_place` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '籍贯',
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of declares
-- ----------------------------
INSERT INTO `declares` VALUES (1, '锴锴', '13622585794', '男', '绿码', '2022-01-30 10:50:57', '广东汕头', '广东省汕头市潮南区');
INSERT INTO `declares` VALUES (2, '妹妹', '12321312323', '女', '绿码', '2022-11-14 22:15:20', '广东佛山', '广东省佛山市顺德区');
INSERT INTO `declares` VALUES (3, '七七', '12312312311', '女', '绿码', '2022-11-14 22:16:03', '广东汕头', '广东省汕头市普宁市');
INSERT INTO `declares` VALUES (4, '叭叭', '23232323234', '男', '绿码', '2022-11-14 22:16:32', '广东茂名', '广东省茂名市茂南区');
INSERT INTO `declares` VALUES (5, '啾啾', '23451651534', '女', '绿码', '2022-11-14 22:17:06', '广东茂名', '广东省茂名市电白区');
INSERT INTO `declares` VALUES (6, '灵灵', '12526548515', '男', '绿码', '2022-11-14 22:17:40', '广东广州', '广东省广州市天河区');

-- ----------------------------
-- Table structure for other
-- ----------------------------
DROP TABLE IF EXISTS `other`;
CREATE TABLE `other`  (
  `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '手机',
  `state` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '健康状态',
  `date` datetime(0) NOT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '时间',
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '住址',
  `thing` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '进校事由',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 71 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of other
-- ----------------------------
INSERT INTO `other` VALUES (1, '李佳', '13622585794', '绿码', '2022-02-14 22:18:03', '广东茂名', '食堂送货');
INSERT INTO `other` VALUES (2, '李佳', '13622585794', '绿码', '2022-02-14 22:18:10', '广东茂名', '食堂送货');
INSERT INTO `other` VALUES (4, '胡桃', '13622585794', '绿码', '2022-06-14 22:33:06', '广东茂名', '快递送货');
INSERT INTO `other` VALUES (5, '李佳', '13622585794', '绿码', '2022-06-14 22:18:13', '广东茂名', '食堂送货');
INSERT INTO `other` VALUES (6, '李佳', '13622585794', '绿码', '2022-06-14 22:18:13', '广东茂名', '食堂送货');
INSERT INTO `other` VALUES (7, '李佳', '13622585794', '绿码', '2022-08-14 22:18:14', '广东茂名', '食堂送货');
INSERT INTO `other` VALUES (8, '李佳', '13622585794', '绿码', '2022-08-14 22:18:15', '广东茂名', '食堂送货');
INSERT INTO `other` VALUES (9, '李佳', '13622585794', '绿码', '2022-11-14 22:18:16', '广东茂名', '食堂送货');
INSERT INTO `other` VALUES (10, '李佳', '13622585794', '绿码', '2022-11-14 22:18:16', '广东茂名', '食堂送货');
INSERT INTO `other` VALUES (11, '李佳', '13622585794', '绿码', '2022-11-14 22:18:17', '广东茂名', '食堂送货');
INSERT INTO `other` VALUES (12, '李佳', '13622585794', '绿码', '2022-11-14 22:18:17', '广东茂名', '食堂送货');
INSERT INTO `other` VALUES (13, '胡桃', '13622585794', '绿码', '2022-11-14 22:32:26', '广东茂名', '快递送货');

-- ----------------------------
-- Table structure for places
-- ----------------------------
DROP TABLE IF EXISTS `places`;
CREATE TABLE `places`  (
  `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '手机',
  `place` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '地点',
  `state` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '健康状态',
  `date` datetime(6) NOT NULL ON UPDATE CURRENT_TIMESTAMP(6) COMMENT '时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `state`(`state`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of places
-- ----------------------------
INSERT INTO `places` VALUES (1, '锴锴', '13622585794', '二饭食堂', '绿码', '2022-11-11 10:18:24.554225');
INSERT INTO `places` VALUES (2, '妹妹', '23435332453', '图书馆', '绿码', '2022-11-14 22:19:28.915174');
INSERT INTO `places` VALUES (3, '陈晨', '41245363634', '图书馆', '绿码', '2022-11-14 22:20:52.940213');
INSERT INTO `places` VALUES (4, '李天德', '13525466443', '图书馆', '绿码', '2022-11-14 22:20:59.533165');
INSERT INTO `places` VALUES (5, '陈阳', '15223253645', '二饭食堂', '绿码', '2022-11-14 22:21:08.343224');
INSERT INTO `places` VALUES (6, '杨其', '13235657684', '图书馆', '绿码', '2022-11-14 22:20:37.838046');

-- ----------------------------
-- Table structure for teacherstudent
-- ----------------------------
DROP TABLE IF EXISTS `teacherstudent`;
CREATE TABLE `teacherstudent`  (
  `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '姓名',
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '手机',
  `age` int(0) NOT NULL COMMENT '年龄',
  `classs` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '班级',
  `dormitory` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '宿舍',
  `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '身份（1：老师，2：学生，3：外来人员）',
  `department` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '系部',
  `state` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '健康状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 39 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacherstudent
-- ----------------------------
INSERT INTO `teacherstudent` VALUES (1, '谢锴斌', '13622585794', 21, '20软件4班', '2-503', '学生', '计算机工程系', '绿码');
INSERT INTO `teacherstudent` VALUES (2, '沈大旺', '13564575654', 31, '', '1-101', '教师', '计算机工程系', '绿码');
INSERT INTO `teacherstudent` VALUES (3, '凌宇杰', '12312412525', 21, '20软件4班', '2-508', '学生', '计算机工程系', '黄码');
INSERT INTO `teacherstudent` VALUES (4, '王颜', '14513534636', 21, '20软件4班', '10-210', '学生', '计算机工程系', '绿码');
INSERT INTO `teacherstudent` VALUES (5, '陈胜弟', '13145665776', 29, '', '1-102', '教师', '计算机工程系', '绿码');
INSERT INTO `teacherstudent` VALUES (37, '陈晨', '13545247852', 23, '20软件3班', '2-201', '学生', '计算机工程系', '绿码');

-- ----------------------------
-- Table structure for total
-- ----------------------------
DROP TABLE IF EXISTS `total`;
CREATE TABLE `total`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `place` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '地点',
  `statistics` int(0) NULL DEFAULT NULL COMMENT '统计',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of total
-- ----------------------------
INSERT INTO `total` VALUES (1, '二饭食堂', 6);
INSERT INTO `total` VALUES (2, '一饭食堂', 1);
INSERT INTO `total` VALUES (3, '图书馆', 0);

-- ----------------------------
-- Table structure for trip
-- ----------------------------
DROP TABLE IF EXISTS `trip`;
CREATE TABLE `trip`  (
  `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '身份（1：老师，2：学生，3：外来人员）',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '姓名',
  `department` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '系部',
  `dormitory` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '宿舍',
  `state` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '健康码状态',
  `date` datetime(0) NOT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '进入时间',
  `start` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '出发地点',
  `end` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '到达地点',
  `after` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '经过区域',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 39 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of trip
-- ----------------------------
INSERT INTO `trip` VALUES (1, '教师', '李大钊', '计算机工程系', '1-101', '绿码', '2022-11-14 22:27:47', '佛山', '茂名', '广州');
INSERT INTO `trip` VALUES (2, '学生', '谢锴斌', '计算机工程系', '2-503', '绿码', '2022-11-14 22:28:16', '汕头', '茂名', '广州');
INSERT INTO `trip` VALUES (3, '学生', '王颜', '计算机工程系', '10-210', '绿码', '2022-11-14 22:28:54', '深圳', '茂名', '阳江');
INSERT INTO `trip` VALUES (4, '教师', '沈大旺', '计算机工程系', '1-101', '绿码', '2022-11-14 22:29:17', '湛江', '茂名', '茂名');
INSERT INTO `trip` VALUES (5, '学生', '凌宇杰', '计算机工程系', '2-508', '绿码', '2022-11-14 22:29:44', '湛江', '茂名', '茂名');
INSERT INTO `trip` VALUES (6, '教师', '陈胜弟', '计算机工程系', '1-302', '绿码', '2022-11-14 22:30:56', '广州', '茂名', '阳江');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '账号',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '密码',
  `status` int(0) NULL DEFAULT NULL COMMENT '身份',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', 'admin', 1);
INSERT INTO `user` VALUES (2, 'a', 'a', 1);
INSERT INTO `user` VALUES (3, 'b', 'b', 0);
INSERT INTO `user` VALUES (11, 'aa', 'aa', 1);

SET FOREIGN_KEY_CHECKS = 1;
