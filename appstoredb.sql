/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : appstoredb

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-03-30 21:50:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `ams_app`
-- ----------------------------
DROP TABLE IF EXISTS `ams_app`;
CREATE TABLE `ams_app` (
  `id` bigint(11) NOT NULL,
  `name` varchar(64) NOT NULL COMMENT '软件名称',
  `size` varchar(64) DEFAULT NULL COMMENT '软件大小',
  `apk_name` varchar(64) DEFAULT NULL COMMENT 'apk名称',
  `language` varchar(32) DEFAULT NULL COMMENT '语言',
  `screen_size` varchar(32) DEFAULT NULL COMMENT '支持屏幕大小',
  `expenses` varchar(32) DEFAULT NULL COMMENT '资费',
  `price` decimal(10,2) DEFAULT NULL COMMENT '价格',
  `score` decimal(5,1) DEFAULT NULL COMMENT '评分',
  `advertisement` varchar(64) DEFAULT NULL COMMENT '广告语',
  `detail_desc` text COMMENT '详细信息',
  `pulish_status` int(1) DEFAULT NULL COMMENT '上架状态：0->下架；1->上架',
  `verify_status` int(1) DEFAULT NULL COMMENT '审核状态：0->未审核；1->审核通过；2->审核未通过',
  `downloads` varchar(64) DEFAULT '0' COMMENT '下载量',
  `logo` varchar(255) DEFAULT NULL COMMENT 'logo图标',
  `video` varchar(255) DEFAULT NULL COMMENT '介绍视频',
  `pics` varchar(255) DEFAULT NULL COMMENT '软件截图，2-5张，以逗号分割',
  `copyright` varchar(255) DEFAULT NULL COMMENT '版权证明图片，逗号分隔',
  `label` varchar(64) DEFAULT NULL COMMENT '标签，最多5个，以逗号分割',
  `remarks` varchar(255) DEFAULT NULL COMMENT '上架申请时的备注',
  `add_time` datetime DEFAULT NULL COMMENT '申请审核时间',
  `update_date` datetime DEFAULT NULL COMMENT '更新日期',
  `on_sale_date` datetime DEFAULT NULL COMMENT '上架时间',
  `off_sale_date` datetime DEFAULT NULL COMMENT '下架时间',
  `category_level1` int(2) DEFAULT NULL COMMENT '一级分类',
  `category_level2` int(2) DEFAULT NULL COMMENT '二级分类',
  `category_level3` int(2) DEFAULT NULL COMMENT '三级分类',
  `now_version` bigint(20) DEFAULT NULL COMMENT '版本id',
  `apply_record_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='App应用信息';

-- ----------------------------
-- Records of ams_app
-- ----------------------------

-- ----------------------------
-- Table structure for `ams_app_apply_record`
-- ----------------------------
DROP TABLE IF EXISTS `ams_app_apply_record`;
CREATE TABLE `ams_app_apply_record` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `app_id` bigint(11) DEFAULT NULL,
  `dev_id` bigint(11) DEFAULT NULL,
  `apply_date` datetime DEFAULT NULL COMMENT '申请时间',
  `audit_user` bigint(11) DEFAULT NULL COMMENT '审核员',
  `audit_date` datetime DEFAULT NULL COMMENT '审核时间',
  `result` int(1) DEFAULT NULL COMMENT '结果',
  `description` varchar(255) DEFAULT NULL COMMENT '审核描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='App应用上架申请/审核记录';

-- ----------------------------
-- Records of ams_app_apply_record
-- ----------------------------

-- ----------------------------
-- Table structure for `ams_app_category`
-- ----------------------------
DROP TABLE IF EXISTS `ams_app_category`;
CREATE TABLE `ams_app_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `category_id` bigint(20) DEFAULT NULL,
  `category_name` varchar(50) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  `create_date` datetime DEFAULT '2019-03-11 15:43:12',
  `modify_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=108 DEFAULT CHARSET=utf8 COMMENT='App应用分类';

-- ----------------------------
-- Records of ams_app_category
-- ----------------------------
INSERT INTO `ams_app_category` VALUES ('1', '1', '全部应用', '0', '2019-03-11 15:38:19', null);
INSERT INTO `ams_app_category` VALUES ('2', '2', '游戏', '0', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('3', '3', '实用工具', '1', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('4', '4', '影音视听', '1', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('5', '5', '聊天社交', '1', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('6', '6', '新闻阅读', '1', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('7', '7', '学习教育', '1', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('8', '8', '时尚购物', '1', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('9', '9', '旅行交通', '1', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('10', '10', '便捷生活', '1', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('11', '11', '拍摄美化', '1', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('12', '12', '运动健康', '1', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('13', '13', '外卖美食', '1', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('14', '14', '休闲益智', '2', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('15', '15', '经营策略', '2', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('16', '16', '体育竞速', '2', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('17', '17', '棋牌桌游', '2', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('18', '18', '动作射击', '2', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('19', '19', '角色扮演', '2', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('20', '20', '电视', '4', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('21', '21', '视频', '4', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('22', '22', '音乐', '4', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('23', '23', 'K歌', '4', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('24', '24', '直播', '4', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('25', '25', '电台', '4', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('26', '26', '输入法', '3', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('27', '27', '浏览器', '3', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('28', '28', '安全性能', '3', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('29', '29', '工具', '3', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('30', '30', '闹钟', '3', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('31', '31', '古代战争', '15', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('32', '32', '现代军事', '15', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('33', '33', '养成', '15', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('34', '34', '塔防', '15', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('35', '35', '经营', '15', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('36', '36', 'MOBA', '15', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('37', '37', '多人在线', '19', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('38', '38', '卡牌', '19', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('39', '39', '动作', '19', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('40', '40', '冒险', '19', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('41', '41', '回合制', '19', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('42', '42', '生存', '19', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('43', '43', '社区', '5', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('44', '44', '聊天', '5', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('45', '45', '婚恋', '5', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('46', '46', '通讯', '5', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('47', '47', '电子书', '6', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('48', '48', '新闻', '6', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('49', '49', '动漫', '6', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('50', '50', '有声读物', '6', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('51', '51', '杂志', '6', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('52', '52', '体育', '6', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('53', '53', '跑酷', '18', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('54', '54', '射击', '18', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('55', '55', '格斗', '18', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('56', '56', '休闲', '14', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('57', '57', '英文', '7', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('58', '58', '学习', '7', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('59', '59', '翻译', '7', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('60', '60', '备考', '7', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('61', '61', '优惠', '8', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('62', '62', '商城', '8', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('63', '63', '团购', '8', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('64', '64', '淘淘', '8', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('65', '65', '导购', '8', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('66', '66', '快递', '8', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('67', '67', '导航地图', '9', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('68', '68', '用车', '9', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('69', '69', '交通票务', '9', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('70', '70', '公交地铁', '9', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('71', '71', '住宿', '9', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('72', '72', '旅游', '9', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('73', '73', '行程助手', '9', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('74', '74', '家政', '10', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('75', '75', '本地生活', '10', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('76', '76', '租房买房', '10', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('77', '77', '家居维修', '10', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('78', '78', '电影购票', '10', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('79', '79', '天气日历', '10', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('80', '80', '拍照', '11', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('81', '81', '图像美化', '11', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('82', '82', '相册图库', '11', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('83', '83', '短视频', '11', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('84', '84', '影音编辑', '11', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('85', '85', '养生', '12', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('86', '86', '运动', '12', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('87', '87', '医疗', '12', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('88', '88', '健康', '12', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('89', '89', '菜谱', '13', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('90', '90', '生鲜', '13', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('91', '91', '外卖', '13', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('92', '92', '餐饮', '13', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('93', '93', 'IO', '14', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('94', '94', '音乐节奏', '14', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('95', '95', '消除', '14', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('96', '96', '捕鱼', '14', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('97', '97', '解谜', '14', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('98', '98', '益智', '14', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('99', '99', '打飞机', '18', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('100', '100', '赛车', '16', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('101', '101', '运动', '16', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('102', '102', '篮球', '16', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('103', '103', '足球', '16', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('104', '104', '斗地主', '17', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('105', '105', '麻将', '17', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('106', '106', '桌游', '17', '2019-03-11 15:43:12', null);
INSERT INTO `ams_app_category` VALUES ('107', '107', '纸牌', '17', '2019-03-11 15:43:12', null);

-- ----------------------------
-- Table structure for `ams_app_version`
-- ----------------------------
DROP TABLE IF EXISTS `ams_app_version`;
CREATE TABLE `ams_app_version` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `app_id` bigint(11) DEFAULT NULL COMMENT 'app',
  `name` varchar(64) DEFAULT NULL COMMENT '应用名',
  `apk_name` varchar(64) DEFAULT NULL COMMENT 'APK名称',
  `apk_size` varchar(64) DEFAULT NULL COMMENT 'APK大小',
  `package_name` varchar(64) DEFAULT NULL COMMENT '包名',
  `version_name` varchar(64) DEFAULT NULL COMMENT '版本名',
  `version_number` varchar(64) DEFAULT NULL COMMENT '版本号',
  `sdk_version` varchar(64) DEFAULT NULL COMMENT '最低兼容安卓版本',
  `target_sdk_version` varchar(64) DEFAULT NULL COMMENT '最优兼容安卓版本',
  `language` varchar(32) DEFAULT NULL COMMENT '语言',
  `screen_size` varchar(32) DEFAULT NULL COMMENT '支持屏幕大小',
  `expenses` varchar(32) DEFAULT NULL COMMENT '资费',
  `price` decimal(10,2) DEFAULT '0.00' COMMENT '价格',
  `logo` varchar(255) DEFAULT NULL COMMENT 'logo',
  `video` varchar(255) DEFAULT NULL COMMENT '介绍视频',
  `pics` varchar(255) DEFAULT NULL COMMENT '软件截图，2-5张，以逗号分割',
  `copyright` varchar(255) DEFAULT NULL COMMENT '版权证明图片，逗号分隔',
  `online_date` datetime DEFAULT NULL COMMENT '上线时间',
  `offline_date` datetime DEFAULT NULL COMMENT '下线时间',
  `apply_user` bigint(11) DEFAULT NULL COMMENT '申请者/开发者',
  `apply_time` datetime DEFAULT NULL COMMENT '申请更新时间',
  `apply_record_id` bigint(11) DEFAULT NULL COMMENT '申请/审核记录id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='App版本信息';

-- ----------------------------
-- Records of ams_app_version
-- ----------------------------

-- ----------------------------
-- Table structure for `ams_version_apply_record`
-- ----------------------------
DROP TABLE IF EXISTS `ams_version_apply_record`;
CREATE TABLE `ams_version_apply_record` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `app_id` bigint(11) DEFAULT NULL,
  `version_id` bigint(11) DEFAULT NULL,
  `dev_id` bigint(11) DEFAULT NULL,
  `apply_date` datetime DEFAULT NULL COMMENT '申请时间',
  `audit_user` bigint(11) DEFAULT NULL COMMENT '审核员',
  `audit_date` datetime DEFAULT NULL COMMENT '审核时间',
  `result` int(2) DEFAULT NULL COMMENT '结果',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='App版本更新申请/审核表记录';

-- ----------------------------
-- Records of ams_version_apply_record
-- ----------------------------

-- ----------------------------
-- Table structure for `ums_admin`
-- ----------------------------
DROP TABLE IF EXISTS `ums_admin`;
CREATE TABLE `ums_admin` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL COMMENT '账号',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `icon` varchar(100) DEFAULT NULL COMMENT '头像',
  `phone` varchar(32) NOT NULL COMMENT '手机号',
  `email` varchar(32) NOT NULL COMMENT '邮箱',
  `nickname` varchar(100) NOT NULL COMMENT '昵称',
  `note` varchar(500) DEFAULT NULL COMMENT '个人描述笔记',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `login_time` datetime NOT NULL COMMENT '登录时间',
  `status` int(1) NOT NULL DEFAULT '1' COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='平台管理员';

-- ----------------------------
-- Records of ums_admin
-- ----------------------------
INSERT INTO `ums_admin` VALUES ('1', 'money', '$2a$10$xSPdVm0CAEabjuia4DEur.O7GQyk2GEKOs1fa6p5mWIn2udq4B7g2', null, '18120803975', '374648769@qq.com', '麦尼', null, '2019-12-13 14:52:02', null, '2019-12-13 14:52:02', '1');
INSERT INTO `ums_admin` VALUES ('2', '111', '$2a$10$K.wyA0HzB6UL.K8JirRq5eRG5ZrgXNCj9UCFGiWPhP/5WAU2JiCVy', null, '123456789', '111@qq.com', 'test1', null, '2019-12-13 14:53:08', null, '2019-12-13 14:53:08', '1');

-- ----------------------------
-- Table structure for `ums_admin_login_log`
-- ----------------------------
DROP TABLE IF EXISTS `ums_admin_login_log`;
CREATE TABLE `ums_admin_login_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `admin_id` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `ip` varchar(64) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `user_agent` varchar(100) DEFAULT NULL COMMENT '浏览器登录类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员登录日志';

-- ----------------------------
-- Records of ums_admin_login_log
-- ----------------------------

-- ----------------------------
-- Table structure for `ums_admin_permission_relation`
-- ----------------------------
DROP TABLE IF EXISTS `ums_admin_permission_relation`;
CREATE TABLE `ums_admin_permission_relation` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `admin_id` bigint(11) NOT NULL,
  `permission_id` bigint(11) NOT NULL,
  `type` int(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `admin_permission_fk1` (`admin_id`),
  KEY `admin_permission_fk2` (`permission_id`),
  CONSTRAINT `admin_permission_fk1` FOREIGN KEY (`admin_id`) REFERENCES `ums_admin` (`id`),
  CONSTRAINT `admin_permission_fk2` FOREIGN KEY (`permission_id`) REFERENCES `ums_permission` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ums_admin_permission_relation
-- ----------------------------

-- ----------------------------
-- Table structure for `ums_admin_role_relation`
-- ----------------------------
DROP TABLE IF EXISTS `ums_admin_role_relation`;
CREATE TABLE `ums_admin_role_relation` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `admin_id` bigint(11) NOT NULL,
  `role_id` bigint(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `admin_fk` (`admin_id`),
  KEY `role_fk` (`role_id`),
  CONSTRAINT `admin_fk` FOREIGN KEY (`admin_id`) REFERENCES `ums_admin` (`id`),
  CONSTRAINT `role_fk` FOREIGN KEY (`role_id`) REFERENCES `ums_role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='后台用户和角色关系表，用户与角色是多对多关系';

-- ----------------------------
-- Records of ums_admin_role_relation
-- ----------------------------
INSERT INTO `ums_admin_role_relation` VALUES ('1', '1', '2');
INSERT INTO `ums_admin_role_relation` VALUES ('2', '2', '3');

-- ----------------------------
-- Table structure for `ums_company_dev`
-- ----------------------------
DROP TABLE IF EXISTS `ums_company_dev`;
CREATE TABLE `ums_company_dev` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `app_id` varchar(64) DEFAULT NULL COMMENT '专用APPID',
  `app_key` varchar(64) DEFAULT NULL COMMENT '专用APPKEY',
  `company_name` varchar(32) DEFAULT NULL COMMENT '公司全称',
  `business_license_reg_number` varchar(32) DEFAULT NULL COMMENT '营业执照注册号',
  `business_license` varchar(255) DEFAULT NULL COMMENT '营业执照照片',
  `cardholder` varchar(32) DEFAULT NULL COMMENT '持卡人',
  `bank_card_type` varchar(32) DEFAULT NULL COMMENT '银行卡类型',
  `bank_card_number` varchar(32) DEFAULT NULL COMMENT '银行卡号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='公司类型开发者';

-- ----------------------------
-- Records of ums_company_dev
-- ----------------------------
INSERT INTO `ums_company_dev` VALUES ('1', '3', '79939087', '5e81a5a01b2a6085f1b96931', '深圳市腾讯计算机系统有限公司', '440301103448669', 'businessLicense/1585554848732.jpg', null, null, null);

-- ----------------------------
-- Table structure for `ums_permission`
-- ----------------------------
DROP TABLE IF EXISTS `ums_permission`;
CREATE TABLE `ums_permission` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `pid` bigint(11) DEFAULT NULL COMMENT '父级权限id',
  `name` varchar(32) NOT NULL COMMENT '名称',
  `value` varchar(100) DEFAULT NULL COMMENT '权限值',
  `icon` varchar(100) DEFAULT NULL COMMENT '图标',
  `type` int(1) NOT NULL COMMENT '权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）',
  `uri` varchar(200) DEFAULT NULL COMMENT '前端资源路径',
  `status` int(1) NOT NULL DEFAULT '1' COMMENT '启用状态；0->禁用；1->启用',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `sort` int(11) NOT NULL DEFAULT '0' COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ums_permission
-- ----------------------------
INSERT INTO `ums_permission` VALUES ('1', '0', 'App应用', null, null, '0', null, '1', '2019-12-13 16:28:34', null, '0');
INSERT INTO `ums_permission` VALUES ('2', '1', '审核App', 'ams:app:audit', null, '1', '/ams/app/audit', '1', '2019-12-13 16:34:02', null, '0');
INSERT INTO `ums_permission` VALUES ('3', '1', 'App列表', 'ams:app:read', null, '1', '/ams/app/index', '1', '2019-12-13 16:36:24', null, '0');

-- ----------------------------
-- Table structure for `ums_person_dev`
-- ----------------------------
DROP TABLE IF EXISTS `ums_person_dev`;
CREATE TABLE `ums_person_dev` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `app_id` varchar(32) DEFAULT NULL COMMENT '专用APPID',
  `app_key` varchar(64) DEFAULT NULL COMMENT '专用APPKEY',
  `real_name` varchar(32) DEFAULT NULL COMMENT '真实姓名',
  `id_card` varchar(32) DEFAULT NULL COMMENT '18位身份证',
  `id_card_pic` varchar(255) DEFAULT NULL COMMENT '手持身份证照片',
  `cardholder` varchar(32) DEFAULT NULL COMMENT '持卡人',
  `bank_card_type` varchar(32) DEFAULT NULL COMMENT '银行卡类型',
  `bank_card_number` varchar(32) DEFAULT NULL COMMENT '银行卡号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='个人类型开发者';

-- ----------------------------
-- Records of ums_person_dev
-- ----------------------------
INSERT INTO `ums_person_dev` VALUES ('1', '1', '81671402', '5e819d281b2a6085f1b9692e', '麦尼', '350520199807091314', 'idCard/1585552679779.jpg', null, null, null);
INSERT INTO `ums_person_dev` VALUES ('2', '2', '88811190', '5e81a36d1b2a6085f1b9692f', '麦尼', '666666199807091314', 'idCard/1585554285442.jpg', null, null, null);
INSERT INTO `ums_person_dev` VALUES ('3', '2', '58595832', '5e81a4211b2a6085f1b96930', '麦尼', '666666199807091314', 'idCard/1585554465449.jpg', null, null, null);

-- ----------------------------
-- Table structure for `ums_role`
-- ----------------------------
DROP TABLE IF EXISTS `ums_role`;
CREATE TABLE `ums_role` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL COMMENT '角色名',
  `description` varchar(500) NOT NULL COMMENT '角色描述',
  `admin_count` int(11) NOT NULL DEFAULT '0' COMMENT '此角色管理员人数',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  `status` int(1) NOT NULL DEFAULT '1' COMMENT '启用状态；0->禁用；1->启用',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='平台管理员角色';

-- ----------------------------
-- Records of ums_role
-- ----------------------------
INSERT INTO `ums_role` VALUES ('1', 'ROLE_NORMAL_ADMIN', '普通管理员', '0', '2019-12-12 16:12:54', null, '1', null);
INSERT INTO `ums_role` VALUES ('2', 'ROLE_SUPER_ADMIN', '超级管理员', '0', '2019-12-12 16:17:19', null, '1', null);
INSERT INTO `ums_role` VALUES ('3', 'ROLE_AUDITOR', '审核员', '0', '2019-12-13 16:11:15', null, '1', null);
INSERT INTO `ums_role` VALUES ('4', 'ROLE_STORE_USER', '商店用户', '0', '2019-12-13 16:11:51', null, '1', null);
INSERT INTO `ums_role` VALUES ('5', 'ROLE_DEV_USER', '开发者', '0', '2019-12-13 16:12:26', null, '1', null);

-- ----------------------------
-- Table structure for `ums_role_permission_relation`
-- ----------------------------
DROP TABLE IF EXISTS `ums_role_permission_relation`;
CREATE TABLE `ums_role_permission_relation` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(11) NOT NULL,
  `permission_id` bigint(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `role_permission_fk1` (`role_id`),
  KEY `role_permission_fk2` (`permission_id`),
  CONSTRAINT `role_permission_fk1` FOREIGN KEY (`role_id`) REFERENCES `ums_role` (`id`),
  CONSTRAINT `role_permission_fk2` FOREIGN KEY (`permission_id`) REFERENCES `ums_permission` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ums_role_permission_relation
-- ----------------------------
INSERT INTO `ums_role_permission_relation` VALUES ('1', '2', '1');
INSERT INTO `ums_role_permission_relation` VALUES ('2', '2', '2');
INSERT INTO `ums_role_permission_relation` VALUES ('3', '2', '3');
INSERT INTO `ums_role_permission_relation` VALUES ('4', '3', '2');

-- ----------------------------
-- Table structure for `ums_user`
-- ----------------------------
DROP TABLE IF EXISTS `ums_user`;
CREATE TABLE `ums_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(64) DEFAULT NULL COMMENT '账号',
  `password` varchar(64) DEFAULT NULL COMMENT '密码',
  `nickname` varchar(64) DEFAULT NULL COMMENT '昵称',
  `contact` varchar(64) DEFAULT NULL COMMENT '联系人',
  `phone` varchar(64) DEFAULT NULL COMMENT '手机号',
  `email` varchar(64) DEFAULT NULL COMMENT '邮箱',
  `status` int(1) DEFAULT NULL COMMENT '帐号启用状态:0->禁用；1->启用；',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `icon` varchar(500) DEFAULT NULL COMMENT '头像',
  `gender` int(1) DEFAULT '0' COMMENT '性别：0->未知；1->男；2->女',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `province` varchar(64) DEFAULT NULL COMMENT '省',
  `city` varchar(64) DEFAULT NULL COMMENT '城市',
  `address` varchar(64) DEFAULT NULL COMMENT '详细地址',
  `info` varchar(500) DEFAULT NULL COMMENT '个人信息',
  `attend_count` int(11) DEFAULT '0' COMMENT '关注量',
  `fans_count` int(11) DEFAULT '0' COMMENT '粉丝量',
  `activation` int(1) DEFAULT NULL COMMENT '是否激活开发者资质：0->未激活；1->已激活',
  `type` int(1) unsigned zerofill DEFAULT NULL COMMENT '用户类型：0->商店用户；1->个人；2->公司',
  `upgrade_time` datetime DEFAULT NULL COMMENT '用户类型升级时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='基础用户';

-- ----------------------------
-- Records of ums_user
-- ----------------------------
INSERT INTO `ums_user` VALUES ('1', 'p123456', '$2a$10$QwMJhJgpBzb17HbXdeg6/uhuntQBofEYCZxGq8ELrawDk9lxdVD/q', 'Money Y', null, '18120803970', '374648761@qq.com', '1', '2020-03-30 15:18:00', 'icon/1585552679744.jpg', '1', '1998-07-09', '福建省', '泉州市', '福建省泉州市的一户人家', '我就是开发者，怎样！', '0', '0', '0', '1', null);
INSERT INTO `ums_user` VALUES ('2', '13345678910', '$2a$10$NwzreX5sQkVXB5JlL/1rQ.wlDlwC4Rbrq1FAUUUPUhmF1dx/JBqTW', 'Money', null, '13345678910', '374648762@qq.com', '1', '2020-03-30 15:44:45', 'person.jpg', '1', '1998-07-09', '北京市', '朝阳区', '北京市朝阳区一环内大户人家', '我就是开发者，是要怎样！', '0', '0', '1', '1', '2020-03-30 15:47:45');
INSERT INTO `ums_user` VALUES ('3', 'c123456', '$2a$10$CTJ3SXPP/jbzYeufdLI8WO/CnWKowb6YBxlzLFW0uwFwMcg1CzHEa', '深圳市腾讯计算机系统有限公司', '小马', '18120803971', '374648763@qq.com', '1', '2020-03-30 15:54:09', 'company.jpg', '0', '2020-03-30', '广东省', '深圳市', '深圳市南山区高新区高新南一路飞亚达大厦5-10楼', '加入我们！', '0', '0', '0', '2', null);

-- ----------------------------
-- Table structure for `ums_user_login_log`
-- ----------------------------
DROP TABLE IF EXISTS `ums_user_login_log`;
CREATE TABLE `ums_user_login_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `ip` varchar(64) DEFAULT NULL,
  `address` varchar(64) DEFAULT NULL COMMENT '登录地址',
  `login_type` int(1) DEFAULT NULL COMMENT '登录类型：0->PC；1->android;2->ios;3->小程序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户登录日志';

-- ----------------------------
-- Records of ums_user_login_log
-- ----------------------------
INSERT INTO `ums_user_login_log` VALUES ('1', '3', '2020-03-30 15:55:04', '127.0.0.1', '内网IP', null);
INSERT INTO `ums_user_login_log` VALUES ('2', '1', '2020-03-30 16:03:36', '127.0.0.1', '内网IP', null);
INSERT INTO `ums_user_login_log` VALUES ('3', '1', '2020-03-30 16:06:37', '127.0.0.1', '内网IP', null);

-- ----------------------------
-- Table structure for `ums_user_statistics_info`
-- ----------------------------
DROP TABLE IF EXISTS `ums_user_statistics_info`;
CREATE TABLE `ums_user_statistics_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `download_amount` varchar(64) DEFAULT NULL COMMENT '下载量',
  `consume_amount` decimal(10,2) DEFAULT NULL COMMENT '累计消费金额',
  `order_count` int(11) DEFAULT NULL COMMENT '订单总量',
  `comment_count` int(11) DEFAULT NULL COMMENT '评论量',
  `login_count` int(11) DEFAULT NULL COMMENT '登录次数',
  `attend_count` int(11) DEFAULT NULL COMMENT '关注量',
  `fans_count` int(11) DEFAULT NULL COMMENT '粉丝量',
  `collect_app_count` int(11) DEFAULT NULL COMMENT '收藏App数量',
  `collect_topic_count` int(11) DEFAULT NULL COMMENT '收藏专题数量',
  `recent_download_time` datetime DEFAULT NULL COMMENT '最后一次下载时间',
  `app_count` int(11) DEFAULT NULL COMMENT '发布的App总量（包括下架）',
  `on_sale_app_count` int(11) DEFAULT NULL COMMENT '发售中的App总量',
  `dev_downloaded_count` int(11) DEFAULT NULL COMMENT '被下载量',
  `dev_login_count` int(11) DEFAULT NULL COMMENT '开发平台登录次数',
  `recent_publish_time` datetime DEFAULT NULL COMMENT '最后申请上架时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户统计信息';

-- ----------------------------
-- Records of ums_user_statistics_info
-- ----------------------------
