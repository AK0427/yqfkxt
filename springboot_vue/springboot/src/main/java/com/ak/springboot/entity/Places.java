package com.ak.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author 锴锴
 * @since 2022-11-11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Places implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private String name;

    private String phone;
      /**
     * 地点
     */
      private String place;

      /**
     * 健康状态
     */
      private String state;

      /**
     * 时间
     */
      @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
      private LocalDateTime date;



}
