package com.ak.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 锴锴
 * @since 2022-10-30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacherstudent implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 姓名
     */
      private String name;

      /**
     * 手机
     */
      private String phone;


      /**
     * 年龄
     */
      private Integer age;

      /**
     * 班级
     */
      private String classs;

      /**
     * 宿舍
     */
      private String dormitory;

      /**
     * 身份（1：老师，2：学生，3：外来人员）
     */
      private String status;

      /**
     * 系部
     */
      private String department;

      /**
       * 健康状态
       */
      private String state;


}
