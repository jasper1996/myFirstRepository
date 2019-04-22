package com.etoak.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * java对象必须实现序列化接口（此处使用jdk的序列化方式）
 * @author Jasper
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private Integer age;
	
}
