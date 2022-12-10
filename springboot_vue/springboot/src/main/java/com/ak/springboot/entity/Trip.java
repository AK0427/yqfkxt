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
 * @since 2022-10-29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trip implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 身份（1：老师，2：学生，3：外来人员）
     */
      private String status;

      /**
     * 姓名
     */
      private String name;

      /**
     * 系部
     */
      private String department;

      /**
     * 宿舍
     */
      private String dormitory;

      /**
     * 健康码状态
     */
      private String state;

      /**
     * 进入时间
     */
      @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
      private LocalDateTime date;

      /**
     * 出发地点
     */
      private String start;

      /**
     * 到达地点
     */
      private String end;

      /**
     * 经过区域
     */
      private String after;


}
