package com.liulei.cloud.consumer.liuleispringcloudconsumer.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.format.NumberFormat;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liulei
 * @date 2019/9/24 16:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ContentRowHeight(20)
@HeadRowHeight(40)
@ColumnWidth(25)
public class UserModel{
    @ExcelProperty(value = "id",index = 0)
    private Long id;
    @ExcelProperty(value = "姓名",index = 1)
    private String name;
    @ExcelProperty(value = "年龄",index = 2)
    private Integer age;

//    @NumberFormat("#.##%")
//    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    @ColumnWidth(50)//列宽、行高
    @ExcelProperty(value = "描述",index = 3)
    private String desci;

}
