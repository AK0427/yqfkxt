package com.ak.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author 锴锴
 * @since 2022-10-30
 */
@NoArgsConstructor
@AllArgsConstructor
@lombok.Data
public class Declares implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 姓名
     */
      private String name;

      /**
     * 联系方式
     */
      private String phone;

      /**
     * 性别
     */
      private String sex;

      /**
     * 健康状态
     */
      private String state;

      /**
     * 上报时间
     */
      @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
      private Date date;

      /**
     * 籍贯
     */
      private String nativePlace;

      /**
     * 地址
     */
      private String address;

    

}
