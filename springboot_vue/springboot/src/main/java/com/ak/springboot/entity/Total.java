package com.ak.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 锴锴
 * @since 2022-11-12
 */
public class Total implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

    private String place;

      /**
     * 统计
     */
      private Integer statistics;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public String getPlace() {
        return place;
    }

      public void setPlace(String place) {
          this.place = place;
      }
    
    public Integer getStatistics() {
        return statistics;
    }

      public void setStatistics(Integer statistics) {
          this.statistics = statistics;
      }

    @Override
    public String toString() {
        return "Total{" +
              "id=" + id +
                  ", place=" + place +
                  ", statistics=" + statistics +
              "}";
    }
}
