package com.liulei.cloud.consumer.liuleispringcloudconsumer.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Vanessa
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    //@ExcelProperty(value = "id",index = 0)
    private Long id;
    //@ExcelProperty(value = "姓名",index = 1)
    private String name;
    //@ExcelProperty(value = "年龄",index = 2)
    private Integer age;
    //@ExcelProperty(value = "描述",index = 3)
    private String desci;
}
