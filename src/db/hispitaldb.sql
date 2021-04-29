/*
Navicat MySQL Data Transfer

Source Server         : mysql5.6
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : hispitaldb

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2021-04-28 16:56:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(34) NOT NULL AUTO_INCREMENT COMMENT '管理员id',
  `admin_name` varchar(23) NOT NULL COMMENT '管理员姓名',
  `admin_password` varchar(45) NOT NULL COMMENT '管理员密码',
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'admin ', '1111111');
INSERT INTO `admin` VALUES ('2', 'admin2', '123456');

-- ----------------------------
-- Table structure for doctor
-- ----------------------------
DROP TABLE IF EXISTS `doctor`;
CREATE TABLE `doctor` (
  `doctor_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '医生id',
  `doctor_name` varchar(13) NOT NULL COMMENT '医生姓名',
  `doctor_tel` varchar(20) NOT NULL COMMENT '医生电话',
  `doctor_hospital` varchar(25) NOT NULL COMMENT '医生所属医院',
  `doctor_keshi` varchar(50) NOT NULL COMMENT '医生科室',
  `doctor_zhiceng` varchar(20) NOT NULL COMMENT '医生职称',
  `doctor_addtime` varchar(23) NOT NULL COMMENT '医生添加时间',
  `doctor_status` varchar(10) NOT NULL COMMENT '审核通过与否',
  `doctor_service_status` varchar(20) NOT NULL COMMENT '服务审核通过与否',
  `doctor_fansNumber` int(11) NOT NULL COMMENT '医生拥有的粉丝数量',
  `doctor_password` varchar(52) NOT NULL,
  PRIMARY KEY (`doctor_id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='医生表';

-- ----------------------------
-- Records of doctor
-- ----------------------------
INSERT INTO `doctor` VALUES ('1', '李四', '13213553321', '中医大省医院', '内分泌科', '主任医师', '2021-03-12', '审核通过', '审核通过', '90', '');
INSERT INTO `doctor` VALUES ('3', '张三', '13545453453', '华西医院', '儿科', '副主任医师', '2021-03-13', '审核通过', '审核未通过', '100', '');
INSERT INTO `doctor` VALUES ('4', '高候', '13213553321', '中医大省医院', '内分泌科', '主任医师', '2021-03-12', '审核通过', '审核通过', '90', '');
INSERT INTO `doctor` VALUES ('5', '黄亚', '13213553321', '中医大省医院', '内分泌科', '住院医师', '2021-03-12', '审核通过', '审核通过', '90', '');
INSERT INTO `doctor` VALUES ('6', '小小', '13213553321', '中医大省医院', '内分泌科', '药剂师', '2021-03-12', '审核通过', '审核通过', '90', '');
INSERT INTO `doctor` VALUES ('7', '可可', '13213553321', '中医大省医院', '内分泌科', '护师', '2021-03-12', '审核通过', '审核通过', '90', '');
INSERT INTO `doctor` VALUES ('8', '欣欣', '13213553321', '中医大省医院', '内分泌科', '住院医师', '2021-03-12', '审核通过', '审核通过', '90', '');
INSERT INTO `doctor` VALUES ('9', '可可儿', '13213553321', '中医大省医院', '内分泌科', '住院医师', '2021-03-12', '审核通过', '审核通过', '90', '');
INSERT INTO `doctor` VALUES ('10', '粒儿呀', '13213553321', '中医大省医院', '内分泌科', '住院医师', '2021-03-12', '审核通过', '审核通过', '90', '');
INSERT INTO `doctor` VALUES ('14', '姚明', '13213553321', '中医大省医院', '内分泌科', '住院医师', '2021-03-12', '审核通过', '审核通过', '90', '');
INSERT INTO `doctor` VALUES ('15', '迈克尔', '13213553321', '中医大省医院', '内分泌科', '住院医师', '2021-03-12', '审核通过', '审核通过', '90', '');
INSERT INTO `doctor` VALUES ('16', '詹姆斯', '13213553321', '中医大省医院', '内分泌科', '住院医师', '2021-03-12', '审核通过', '审核通过', '90', '');
INSERT INTO `doctor` VALUES ('17', '乔丹', '13213553321', '中医大省医院', '内分泌科', '住院医师', '2021-03-12', '审核通过', '审核通过', '90', '');
INSERT INTO `doctor` VALUES ('18', '科比', '13213553321', '中医大省医院', '内分泌科', '住院医师', '2021-03-12', '审核通过', '审核通过', '90', '');
INSERT INTO `doctor` VALUES ('19', '陈飞侠', '13213553321', '中医大省医院', '内分泌科', '住院医师', '2021-03-12', '审核通过', '审核通过', '90', '');
INSERT INTO `doctor` VALUES ('20', '王二丫', '13213553321', '中医大省医院', '内分泌科', '住院医师', '2021-03-12', '审核通过', '审核通过', '90', '');
INSERT INTO `doctor` VALUES ('22', '王三丫', '13213553321', '中医大省医院', '内分泌科', '住院医师', '2021-03-12', '审核通过', '审核通过', '90', '');
INSERT INTO `doctor` VALUES ('23', '丽萨', '13213553321', '中医大省医院', '内分泌科', '住院医师', '2021-03-12', '审核通过', '审核通过', '90', '');
INSERT INTO `doctor` VALUES ('24', '帕莎', '13213553321', '中医大省医院', '内分泌科', '住院医师', '2021-03-12', '审核通过', '审核通过', '90', '');
INSERT INTO `doctor` VALUES ('25', '托尼', '13213553321', '中医大省医院', '内分泌科', '住院医师', '2021-03-12', '审核通过', '审核通过', '90', '');
INSERT INTO `doctor` VALUES ('26', '波波', '13213553321', '中医大省医院', '内分泌科', '住院医师', '2021-03-12', '审核通过', '审核通过', '90', '');
INSERT INTO `doctor` VALUES ('27', '黄瑞', '18381911292', '广东医科大学', '儿科', '住院医师', '2021-03-12', '审核通过', '审核通过', '30', 'Chen513002199');
INSERT INTO `doctor` VALUES ('28', '苏尔哈', '18381911292', '广东医科大学', '儿科', '住院医师', '2021-03-12', '审核通过', '审核通过', '30', '111111');

-- ----------------------------
-- Table structure for jiaoyi
-- ----------------------------
DROP TABLE IF EXISTS `jiaoyi`;
CREATE TABLE `jiaoyi` (
  `jiaoyi_id` int(55) NOT NULL,
  `jiaoyi_number` int(67) NOT NULL COMMENT '交易流水号',
  `jiaoyi_username` varchar(45) NOT NULL COMMENT '用户',
  `jiaoyi_price` decimal(10,0) NOT NULL COMMENT '交易金额',
  `jiaoyi_source` varchar(255) NOT NULL COMMENT '支付来源',
  `jiaoyi_payway` varchar(45) NOT NULL COMMENT '支付方式',
  `jiaoyi_state` varchar(66) NOT NULL COMMENT '交易状态',
  `jiaoyi_time` datetime NOT NULL COMMENT '交易时间',
  PRIMARY KEY (`jiaoyi_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jiaoyi
-- ----------------------------
INSERT INTO `jiaoyi` VALUES ('122', '2334', '18882d3454', '200', '挂号预约', '微信', '成功', '2021-03-18 23:42:14');
INSERT INTO `jiaoyi` VALUES ('123', '2334', '18882d3454', '200', '挂号预约', '微信', '成功', '2021-03-18 23:42:14');
INSERT INTO `jiaoyi` VALUES ('124', '2334', '18882d3454', '200', '挂号预约', '微信', '成功', '2021-03-18 23:42:14');
INSERT INTO `jiaoyi` VALUES ('125', '2334', '18882d3454', '200', '挂号预约', '微信', '成功', '2021-03-18 23:42:14');
INSERT INTO `jiaoyi` VALUES ('126', '2334', '18882d3454', '200', '挂号预约', '微信', '成功', '2021-03-18 23:42:14');
INSERT INTO `jiaoyi` VALUES ('127', '2334', '18882d3454', '200', '挂号预约', '微信', '成功', '2021-03-18 23:42:14');

-- ----------------------------
-- Table structure for jiesuan
-- ----------------------------
DROP TABLE IF EXISTS `jiesuan`;
CREATE TABLE `jiesuan` (
  `jiesuan_id` int(44) NOT NULL AUTO_INCREMENT COMMENT '结算id',
  `jiesuan_doctor` varchar(255) NOT NULL COMMENT '结算医生',
  `jiesuan_price` decimal(10,0) NOT NULL COMMENT '结算金额',
  `jiesuan_card` varchar(255) NOT NULL COMMENT '银行卡号',
  `jiesuan_state` varchar(255) NOT NULL COMMENT '结算状态',
  `jiesuan_date` date NOT NULL COMMENT '结算时间',
  PRIMARY KEY (`jiesuan_id`)
) ENGINE=InnoDB AUTO_INCREMENT=248 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of jiesuan
-- ----------------------------
INSERT INTO `jiesuan` VALUES ('242', '钟南山', '34', '5103324243', '成功', '2021-03-25');
INSERT INTO `jiesuan` VALUES ('243', '钟南山', '34', '5103324243', '成功', '2021-03-25');
INSERT INTO `jiesuan` VALUES ('244', '小绿', '34', '5103324243', '成功', '2021-03-25');
INSERT INTO `jiesuan` VALUES ('245', '小红', '34', '5103324243', '成功', '2021-03-25');
INSERT INTO `jiesuan` VALUES ('246', '小兰', '34', '5103324243', '成功', '2021-03-25');
INSERT INTO `jiesuan` VALUES ('247', '小明', '34', '5103324243', '成功', '2021-03-25');

-- ----------------------------
-- Table structure for medecine
-- ----------------------------
DROP TABLE IF EXISTS `medecine`;
CREATE TABLE `medecine` (
  `medecine_id` int(33) NOT NULL,
  `medecine_name` varchar(255) NOT NULL,
  `medecine_picture` varchar(255) NOT NULL,
  `medecine_price` decimal(10,0) NOT NULL,
  `medecine_shangjia` tinyint(255) NOT NULL,
  `medecine_state` varchar(255) NOT NULL,
  `medecine_time` date NOT NULL,
  `medecine_size` double NOT NULL,
  PRIMARY KEY (`medecine_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of medecine
-- ----------------------------
INSERT INTO `medecine` VALUES ('1', '络活喜苯磺酸安陆的平片', '无', '13', '0', '审核通过', '2021-03-18', '100');
INSERT INTO `medecine` VALUES ('3', '布洛芬缓释胶囊', '无', '13', '0', '审核通过', '2021-03-18', '100');
INSERT INTO `medecine` VALUES ('5', '安洛分缓释胶囊', '无', '13', '0', '审核通过', '2021-03-18', '100');
INSERT INTO `medecine` VALUES ('6', '布洛芬颗粒', '无', '13', '0', '审核通过', '2021-03-18', '100');

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `member_id` int(34) NOT NULL,
  `member_name` varchar(255) NOT NULL,
  `member_phone` varchar(255) NOT NULL,
  `member_role` varchar(255) NOT NULL,
  `member_state` tinyint(255) NOT NULL,
  `member_time` date NOT NULL,
  PRIMARY KEY (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES ('1224', '赵霞', '18284323804', '管理员', '1', '2021-03-25');
INSERT INTO `member` VALUES ('1225', '赵霞', '18284323804', '管理员', '1', '2021-03-25');
INSERT INTO `member` VALUES ('1226', '赵霞', '18284323804', '管理员', '1', '2021-03-25');
INSERT INTO `member` VALUES ('1227', '赵霞', '18284323804', '管理员', '1', '2021-03-25');
INSERT INTO `member` VALUES ('1228', '赵霞', '18284323804', '管理员', '1', '2021-03-25');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `order_id` int(21) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `order_time` date NOT NULL COMMENT '订单提交时间',
  `order_username` varchar(255) NOT NULL COMMENT '订单用户名',
  `order_getname` varchar(255) NOT NULL COMMENT '订单收货人',
  `order_price` decimal(10,0) NOT NULL COMMENT '订金价格',
  `order_state` varchar(255) NOT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('1', '2021-02-18', '二雷', '张三', '200', '待发货');
INSERT INTO `orders` VALUES ('2', '2021-02-18', '小田', '张三', '200', '待发货');
INSERT INTO `orders` VALUES ('3', '2021-04-15', '小田', '张三', '200', '待发货');
INSERT INTO `orders` VALUES ('4', '2021-02-18', '小田', '张三', '200', '已发货');
INSERT INTO `orders` VALUES ('5', '2021-02-26', '小田', '张三', '200', '已发货');
INSERT INTO `orders` VALUES ('6', '2021-02-18', '小田', '张三', '200', '待发货');
INSERT INTO `orders` VALUES ('7', '2021-02-18', '小田', '张三', '200', '待发货');

-- ----------------------------
-- Table structure for patient
-- ----------------------------
DROP TABLE IF EXISTS `patient`;
CREATE TABLE `patient` (
  `patient_id` int(12) NOT NULL AUTO_INCREMENT COMMENT '患者ID',
  `patient_name` varchar(12) DEFAULT NULL COMMENT '患者姓名',
  `patient_keshi` varchar(12) DEFAULT NULL COMMENT '患者科室',
  `patient_doctor` varchar(24) DEFAULT NULL COMMENT '患者所属医生',
  `patient_price` decimal(10,0) DEFAULT NULL COMMENT '所用费用价格',
  `patient_state` varchar(12) DEFAULT NULL COMMENT '审核是否通过',
  `patient_time` date DEFAULT NULL COMMENT '就诊时间',
  `patient_password` varchar(42) DEFAULT NULL COMMENT '病人密码',
  PRIMARY KEY (`patient_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COMMENT='患者表';

-- ----------------------------
-- Records of patient
-- ----------------------------
INSERT INTO `patient` VALUES ('2', '库里', '儿科', '小刚', '200', '审核通过', '2021-03-17', '');
INSERT INTO `patient` VALUES ('3', '欧文', '儿科', '小刚', '200', '审核通过', '2021-03-01', '');
INSERT INTO `patient` VALUES ('4', '拉文', '儿科', '小刚', '200', '审核通过', '2021-03-16', '');
INSERT INTO `patient` VALUES ('5', '哈登', '儿科', '小刚', '200', '审核通过', '2021-03-01', '');
INSERT INTO `patient` VALUES ('7', '扎克伯格', '儿科', '小刚', '200', '审核通过', '2021-03-01', '');
INSERT INTO `patient` VALUES ('8', '韦德', '儿科', '小刚', '200', '审核通过', '2021-03-01', '');
INSERT INTO `patient` VALUES ('9', '韦少', '儿科', '小刚', '200', '审核通过', '2021-03-10', '');
INSERT INTO `patient` VALUES ('10', '汤普森', '儿科', '小刚', '200', '审核通过', '2021-03-03', '');
INSERT INTO `patient` VALUES ('11', '扎克伯格', '儿科', '小刚', '200', '审核通过', '2021-03-01', '');
INSERT INTO `patient` VALUES ('12', '扎克伯格', '儿科', '小刚', '200', '审核通过', '2021-03-01', '');
INSERT INTO `patient` VALUES ('13', 'sharp', '儿科', '小刚', '200', '审核通过', '2021-03-11', '');
INSERT INTO `patient` VALUES ('14', '普金', '儿科', '小刚', '200', '审核通过', '2021-03-01', '');
INSERT INTO `patient` VALUES ('15', '扎克伯格', '儿科', '小刚', '200', '审核通过', '2021-03-01', '');
INSERT INTO `patient` VALUES ('16', '威尔逊', '儿科', '小刚', '200', '审核通过', '2021-03-01', '');
INSERT INTO `patient` VALUES ('17', '大鲨鱼', '儿科', '小刚', '200', '审核通过', '2021-03-01', '');
INSERT INTO `patient` VALUES ('18', '扎克伯格', '儿科', '小刚', '200', '审核通过', '2021-03-01', '');
INSERT INTO `patient` VALUES ('19', '扎克伯格', '儿科', '小刚', '200', '审核通过', '2021-03-01', '');
INSERT INTO `patient` VALUES ('20', '姚明', '儿科', '小刚', '200', '审核通过', '2021-03-01', '');
INSERT INTO `patient` VALUES ('21', '扎克伯格', '儿科', '小刚', '200', '审核通过', '2021-02-22', '');

-- ----------------------------
-- Table structure for precription_reverse
-- ----------------------------
DROP TABLE IF EXISTS `precription_reverse`;
CREATE TABLE `precription_reverse` (
  `reverse_id` int(13) NOT NULL AUTO_INCREMENT COMMENT '扭转订单id',
  `reverse_number` int(14) NOT NULL COMMENT '订单编号',
  `prescription_number` int(15) NOT NULL COMMENT '处方编号',
  `patient` varchar(34) NOT NULL COMMENT '患者',
  `keshi` varchar(14) NOT NULL COMMENT '科室',
  `doctor` varchar(78) NOT NULL COMMENT '医生',
  `price` decimal(10,0) NOT NULL COMMENT '费用',
  `order_state` varchar(14) NOT NULL COMMENT '订单状态',
  `chufang_state` varchar(89) NOT NULL COMMENT '处方单状态',
  `pay_way` varchar(25) NOT NULL COMMENT '购药方式',
  `fayao_state` varchar(45) NOT NULL COMMENT '发药状态',
  PRIMARY KEY (`reverse_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of precription_reverse
-- ----------------------------
INSERT INTO `precription_reverse` VALUES ('1', '12', '33', '田田', '儿科', '钟南山', '13', '审核通过', '易购就买', '133', '3313');
INSERT INTO `precription_reverse` VALUES ('2', '12', '33', '田田', '儿科', '钟南山', '13', '审核通过', '易购就买', '133', '3313');
INSERT INTO `precription_reverse` VALUES ('3', '12', '33', '田田', '儿科', '钟南山', '13', '审核通过', '易购就买', '133', '3313');
INSERT INTO `precription_reverse` VALUES ('4', '12', '33', '田田', '儿科', '钟南山', '13', '审核通过', '易购就买', '133', '3313');
INSERT INTO `precription_reverse` VALUES ('5', '12', '33', '田田', '儿科', '钟南山', '13', '审核通过', '易购就买', '133', '3313');
INSERT INTO `precription_reverse` VALUES ('6', '12', '33', '田田', '儿科', '钟南山', '13', '审核通过', '易购就买', '133', '3313');
INSERT INTO `precription_reverse` VALUES ('7', '12', '33', '田田', '儿科', '钟南山', '13', '审核通过', '易购就买', '133', '3313');
INSERT INTO `precription_reverse` VALUES ('8', '12', '33', '田田', '儿科', '钟南山', '13', '审核通过', '易购就买', '133', '3313');
INSERT INTO `precription_reverse` VALUES ('9', '12', '33', '田田', '儿科', '钟南山', '13', '审核通过', '易购就买', '133', '3313');
INSERT INTO `precription_reverse` VALUES ('10', '12', '33', '田田', '儿科', '钟南山', '13', '审核通过', '易购就买', '133', '3313');
INSERT INTO `precription_reverse` VALUES ('11', '12', '33', '田田', '儿科', '钟南山', '13', '审核通过', '易购就买', '133', '3313');

-- ----------------------------
-- Table structure for questionnaire
-- ----------------------------
DROP TABLE IF EXISTS `questionnaire`;
CREATE TABLE `questionnaire` (
  `questionnaire_id` int(25) NOT NULL AUTO_INCREMENT COMMENT '问诊单ID',
  `questionnaire_time` date NOT NULL COMMENT '问诊时间',
  `questionnaire_patient` varchar(255) NOT NULL COMMENT '问诊单的名字',
  `questionnaire_keshi` varchar(255) NOT NULL COMMENT '科室',
  `questionnaire_doctor` varchar(13) NOT NULL DEFAULT '' COMMENT '医生',
  `questionnaire_way` varchar(255) NOT NULL COMMENT '问诊方式',
  `questionnaire_source` varchar(255) NOT NULL COMMENT '问诊来源',
  `questionnaire_cost` decimal(10,0) NOT NULL COMMENT '花费费用',
  `questionnaire_state` varchar(255) NOT NULL COMMENT '订单状态',
  PRIMARY KEY (`questionnaire_id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of questionnaire
-- ----------------------------
INSERT INTO `questionnaire` VALUES ('14', '2021-02-19', '田田', '儿科', '钟南山', '图文问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('15', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('16', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('17', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('18', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('19', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('20', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('21', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('22', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('23', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('24', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('25', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('26', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('27', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('28', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('29', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('30', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('31', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('32', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('33', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('34', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('35', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');
INSERT INTO `questionnaire` VALUES ('36', '2021-02-19', '田田', '儿科', '钟南山', '视频问诊', '视频问诊', '46', '审核通过');

-- ----------------------------
-- Table structure for received
-- ----------------------------
DROP TABLE IF EXISTS `received`;
CREATE TABLE `received` (
  `received_id` int(32) NOT NULL COMMENT '接受id',
  `received_price` decimal(10,0) NOT NULL COMMENT '转账金额（税后）',
  `received_card` varchar(255) NOT NULL COMMENT '银行卡号',
  `received_state` varchar(255) NOT NULL COMMENT '状态',
  `received_desc` varchar(255) NOT NULL COMMENT '说明',
  `received_startman` varchar(255) NOT NULL COMMENT '发起人',
  `received_time` date NOT NULL COMMENT '转账时间',
  `received_name` varchar(255) NOT NULL COMMENT '接受者',
  PRIMARY KEY (`received_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of received
-- ----------------------------
INSERT INTO `received` VALUES ('1', '244', '23314433', '成功', '服务费', '李四', '2021-03-25', '钟南山');
INSERT INTO `received` VALUES ('2', '244', '23314433', '成功', '服务费', '李四', '2021-03-25', '钟南山');
INSERT INTO `received` VALUES ('3', '244', '23314433', '成功', '服务费', '李四', '2021-03-25', '钟南山');
INSERT INTO `received` VALUES ('4', '244', '23314433', '成功', '服务费', '李四', '2021-03-25', '钟南山');
INSERT INTO `received` VALUES ('5', '244', '23314433', '成功', '服务费', '李四', '2021-03-25', '钟南山');
INSERT INTO `received` VALUES ('6', '244', '23314433', '成功', '服务费', '李四', '2021-03-25', '钟南山');

-- ----------------------------
-- Table structure for refund
-- ----------------------------
DROP TABLE IF EXISTS `refund`;
CREATE TABLE `refund` (
  `refund_id` int(23) NOT NULL AUTO_INCREMENT COMMENT '退款Id',
  `refund_number` int(78) NOT NULL COMMENT '服务编号',
  `refund_date` date NOT NULL COMMENT '申请时间',
  `refund_username` varchar(255) NOT NULL COMMENT '用户',
  `refund_price` decimal(10,0) NOT NULL COMMENT '退款价格',
  `refund_source` varchar(34) NOT NULL COMMENT '来源',
  `refund_state` varchar(255) NOT NULL COMMENT '状态',
  `refund_time` date NOT NULL COMMENT '处理时间',
  PRIMARY KEY (`refund_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of refund
-- ----------------------------
INSERT INTO `refund` VALUES ('1', '20020212', '2021-03-04', '18812341243', '200', '挂号预约', '待处理', '2021-03-19');
INSERT INTO `refund` VALUES ('2', '20020212', '2021-03-04', '18812341243', '200', '挂号预约', '待处理', '2021-03-19');
INSERT INTO `refund` VALUES ('3', '20020212', '2021-03-04', '18812341243', '200', '挂号预约', '待处理', '2021-03-19');
INSERT INTO `refund` VALUES ('4', '20020212', '2021-03-04', '18812341243', '200', '挂号预约', '待处理', '2021-03-19');
INSERT INTO `refund` VALUES ('5', '20020212', '2021-03-04', '18812341243', '200', '挂号预约', '待处理', '2021-03-19');
INSERT INTO `refund` VALUES ('6', '20020212', '2021-03-25', '18812341243', '200', '挂号预约', '待处理', '2021-03-19');
INSERT INTO `refund` VALUES ('7', '20020212', '2021-03-04', '18812341243', '200', '挂号预约', '待处理', '2021-03-19');
INSERT INTO `refund` VALUES ('8', '20020212', '2021-03-04', '18812341243', '200', '挂号预约', '待处理', '2021-03-19');
INSERT INTO `refund` VALUES ('9', '20020212', '2021-03-04', '18812341243', '200', '挂号预约', '待处理', '2021-03-19');
INSERT INTO `refund` VALUES ('10', '20020212', '2021-03-04', '18812341243', '200', '挂号预约', '待处理', '2021-03-19');
INSERT INTO `refund` VALUES ('11', '20020212', '2021-03-04', '18812341243', '200', '挂号预约', '待处理', '2021-03-19');
INSERT INTO `refund` VALUES ('12', '20020212', '2021-03-04', '18812341243', '200', '挂号预约', '待处理', '2021-03-19');
INSERT INTO `refund` VALUES ('13', '2020212', '2021-03-10', '18289122392', '0', '', '', '0000-00-00');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` int(24) NOT NULL,
  `role_name` varchar(255) NOT NULL,
  `role_desc` varchar(255) NOT NULL,
  `role_state` varchar(255) NOT NULL,
  `role_time` date NOT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '管理员', '具备所有权限', '是', '2021-03-19');
INSERT INTO `role` VALUES ('2', '管理员', '具备所有权限', '是', '2021-03-19');
INSERT INTO `role` VALUES ('3', '管理员', '具备所有权限', '是', '2021-03-19');
INSERT INTO `role` VALUES ('5', '管理员', '具备所有权限', '是', '2021-03-19');
INSERT INTO `role` VALUES ('23424', '管理员', '具备所有权限', '是', '2021-03-19');

-- ----------------------------
-- Table structure for shenhe
-- ----------------------------
DROP TABLE IF EXISTS `shenhe`;
CREATE TABLE `shenhe` (
  `shenhe_id` int(90) NOT NULL,
  `shenhe_name` varchar(255) NOT NULL,
  `shenhe_picture` varchar(255) NOT NULL,
  `shenhe_price` decimal(10,0) NOT NULL,
  `shenhe_state` varchar(255) NOT NULL,
  `shenhe_zhuangtai` varchar(255) NOT NULL,
  `shenhe_kucun` varchar(255) NOT NULL,
  `shenhe_time` date NOT NULL,
  PRIMARY KEY (`shenhe_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shenhe
-- ----------------------------
INSERT INTO `shenhe` VALUES ('1', '络活喜苯磺酸氨氯地平片', '无', '25', '未上架', '待审核', '100', '2021-03-18');
INSERT INTO `shenhe` VALUES ('2', '络活喜苯磺酸氨氯地平片', '无', '25', '未上架', '待审核', '100', '2021-03-18');
INSERT INTO `shenhe` VALUES ('3', '络活喜苯磺酸氨氯地平片', '无', '25', '未上架', '待审核', '100', '2021-03-18');
INSERT INTO `shenhe` VALUES ('4', '络活喜苯磺酸氨氯地平片', '无', '25', '未上架', '待审核', '100', '2021-03-18');
INSERT INTO `shenhe` VALUES ('5', '络活喜苯磺酸氨氯地平片', '无', '25', '未上架', '待审核', '100', '2021-03-18');
INSERT INTO `shenhe` VALUES ('22323', '络活喜苯磺酸氨氯地平片', '无', '25', '未上架', '待审核', '100', '2021-03-18');

-- ----------------------------
-- Table structure for suggestion
-- ----------------------------
DROP TABLE IF EXISTS `suggestion`;
CREATE TABLE `suggestion` (
  `suggestion_id` int(45) NOT NULL,
  `suggestion_type` varchar(255) NOT NULL,
  `suggestion_content` varchar(255) NOT NULL,
  `suggestion_commit` varchar(255) NOT NULL,
  `suggestion_time` date NOT NULL,
  `suggestion_delete` tinyint(255) NOT NULL,
  PRIMARY KEY (`suggestion_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of suggestion
-- ----------------------------
INSERT INTO `suggestion` VALUES ('133', '产品体验', '希望产品体验更人性化一些', '18812341234', '2021-03-23', '1');
INSERT INTO `suggestion` VALUES ('134', '产品体验', '希望产品体验更人性化一些', '18812341234', '2021-03-23', '1');
INSERT INTO `suggestion` VALUES ('135', '产品体验', '希望产品体验更人性化一些', '18812341234', '2021-03-23', '1');
INSERT INTO `suggestion` VALUES ('136', '产品体验', '希望产品体验更人性化一些', '18812341234', '2021-03-23', '1');
INSERT INTO `suggestion` VALUES ('137', '产品体验', '希望产品体验更人性化一些', '18812341234', '2021-03-23', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(55) NOT NULL AUTO_INCREMENT,
  `date` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `time` varchar(55) NOT NULL,
  `value` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `password` varchar(45) NOT NULL COMMENT '用户密码',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '2021-04-21', '小名', '2021-04-12', '1', '1371759032', '43422');
INSERT INTO `user` VALUES ('2', '2020-01-22', '小刚', '2021-02-11', '0', '45128467845', 'chen343');
INSERT INTO `user` VALUES ('3', '2021-02-1', '小红', '2021-02-02', '0', '14523564152', '23131');
INSERT INTO `user` VALUES ('4', '2021-03-4', '小蓝', '2021-01-12', '0', '12546354875', '555454');
INSERT INTO `user` VALUES ('5', '2021-04-13', '小绿', '2021-03-01', '0', '18381911292', '65565');
INSERT INTO `user` VALUES ('6', '2021-05-11', '小奥', '2021-05-01', '0', '15128881371', '656342');
INSERT INTO `user` VALUES ('7', '2021-05-11', '小奥', '2021-05-01', '0', '15128881371', '23342342');
INSERT INTO `user` VALUES ('8', '2021-05-11', '小奥', '2021-05-01', '0', '15128881371', '');
INSERT INTO `user` VALUES ('9', '2021-05-11', '小奥', '2021-05-01', '0', '15128881371', '');
INSERT INTO `user` VALUES ('10', '2021-05-11', '小奥', '2021-05-01', '0', '15128881371', '');
INSERT INTO `user` VALUES ('11', '2021-05-11', '小奥', '2021-05-01', '0', '15128881371', '');
INSERT INTO `user` VALUES ('12', '2021-05-11', '小奥', '2021-05-01', '0', '15128881371', '');
INSERT INTO `user` VALUES ('13', '2021-05-11', '小奥', '2021-05-01', '0', '15128881371', '');
INSERT INTO `user` VALUES ('14', '2021-05-11', '小奥', '2021-05-01', '0', '15128881371', '');
INSERT INTO `user` VALUES ('15', '2021-05-11', '小奥', '2021-05-01', '0', '15128881371', '');
INSERT INTO `user` VALUES ('16', '2021-05-11', '小奥', '2021-05-01', '0', '15128881371', '');
INSERT INTO `user` VALUES ('17', '2021-05-11', '小奥', '2021-05-01', '0', '15128881371', '');
INSERT INTO `user` VALUES ('18', '2021-05-11', '小奥', '2021-05-01', '0', '15128881371', '');
INSERT INTO `user` VALUES ('19', '2021-05-11', '小奥', '2021-05-01', '0', '15128881371', '');
INSERT INTO `user` VALUES ('20', '2021-05-11', '小奥', '2021-05-01', '0', '15128881371', '');
INSERT INTO `user` VALUES ('27', '2020-01-22', '小刚', '2021-02-11', '1', '45128467845', '');
INSERT INTO `user` VALUES ('29', '2020-01-22', '小刚', '2021-02-11', '0', '45128467845', '');
INSERT INTO `user` VALUES ('30', '2020-01-22', '小刚', '2021-02-11', '0', '45128467845', '');
INSERT INTO `user` VALUES ('31', '2021-03-12', '小蔡', '2021-03-12', '0', '1371769065', '');
INSERT INTO `user` VALUES ('32', '2021-04-30', '小刚', '2021-01-23', '1', '12390124565', '');
INSERT INTO `user` VALUES ('33', '2021-09-12', '小云', '2021-05-12', '1', '13244442144', '');
INSERT INTO `user` VALUES ('34', '2021-05-12', '小狗', '2021-05-12', '1', '13812341234', 'Chen513002199');
INSERT INTO `user` VALUES ('35', '2021-05-12', '小狗', '2021-05-12', '1', '12355461345', 'Chen513002199');
INSERT INTO `user` VALUES ('36', '2021-05-11', '迪丽热巴', '2021-01-12', '1', '15678321892', '13446');

-- ----------------------------
-- Table structure for wenzhen
-- ----------------------------
DROP TABLE IF EXISTS `wenzhen`;
CREATE TABLE `wenzhen` (
  `wenzhen_id` int(12) NOT NULL COMMENT '问诊ID',
  `wenzhen_time` date NOT NULL COMMENT '问诊时间',
  `wenzhen_username` varchar(12) NOT NULL COMMENT '问诊人',
  `wenzhen_doctor` varchar(48) NOT NULL COMMENT '问诊医生',
  `wenzhen_keshi` varchar(25) NOT NULL COMMENT '问诊科室',
  `wenzhen_price` decimal(10,0) NOT NULL COMMENT '问诊价格',
  `wenzhen_state` varchar(25) NOT NULL COMMENT '问诊状态',
  PRIMARY KEY (`wenzhen_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wenzhen
-- ----------------------------
INSERT INTO `wenzhen` VALUES ('1', '2021-02-26', '田田', '李文亮', '儿科', '54', '待支付');
INSERT INTO `wenzhen` VALUES ('2', '2021-02-26', '田田', '李文亮', '儿科', '54', '待支付');
INSERT INTO `wenzhen` VALUES ('3', '2021-02-26', '田田', '李文亮', '儿科', '54', '待支付');
INSERT INTO `wenzhen` VALUES ('4', '2021-02-26', '田田', '李文亮', '儿科', '54', '待支付');
INSERT INTO `wenzhen` VALUES ('5', '2021-02-26', '田田', '李文亮', '儿科', '54', '待支付');
INSERT INTO `wenzhen` VALUES ('6', '2021-02-26', '田田', '李文亮', '儿科', '54', '待支付');
INSERT INTO `wenzhen` VALUES ('7', '2021-02-26', '田田', '李文亮', '儿科', '54', '待支付');

-- ----------------------------
-- Table structure for yaopin
-- ----------------------------
DROP TABLE IF EXISTS `yaopin`;
CREATE TABLE `yaopin` (
  `yaopin_id` int(55) NOT NULL,
  `yaopin_name` varchar(255) NOT NULL,
  `yaopin_jibie` varchar(255) NOT NULL,
  `yaopin_state` varchar(255) NOT NULL,
  `yaopin_beizhu` varchar(255) NOT NULL,
  `yaopin_shangchuan` varchar(255) NOT NULL,
  `yaopin_date` date NOT NULL,
  PRIMARY KEY (`yaopin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of yaopin
-- ----------------------------
INSERT INTO `yaopin` VALUES ('1', '呼吸系统用药', '一级', '显示', '备注内容', 'admin', '2021-03-18');
INSERT INTO `yaopin` VALUES ('2', '呼吸系统用药', '一级', '显示', '备注内容', 'admin', '2021-03-18');
INSERT INTO `yaopin` VALUES ('3', '呼吸系统用药', '一级', '显示', '备注内容', 'admin', '2021-03-18');
INSERT INTO `yaopin` VALUES ('4', '呼吸系统用药', '一级', '显示', '备注内容', 'admin', '2021-03-18');
INSERT INTO `yaopin` VALUES ('5', '呼吸系统用药', '一级', '显示', '备注内容', 'admin', '2021-03-18');
