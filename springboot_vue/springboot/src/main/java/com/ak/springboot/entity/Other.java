package com.ak.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author 锴锴
 * @since 2022-11-01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Other implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private String name;

      /**
     * 手机
     */
      private String phone;

      /**
     * 住址
     */
      private String address;

      /**
     * 进校事由
     */
      private String thing;

      /**
     * 时间
     */
      @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
      private Date date;

      /**
       * 健康状态
       */
      private String state;


    

}
