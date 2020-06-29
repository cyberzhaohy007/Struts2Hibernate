package com.xdy.JWTTutorial;

import java.util.Date;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 生成令牌,主要是用它生成载荷
		JwtBuilder builder = Jwts.builder()
		        // 设置头部,使用hs256加密, + key,也就是盐
		        .signWith(SignatureAlgorithm.HS256,"changwu")
		        // 添加载荷
		        .setId("666") // 用户id
		        .setSubject("张三") // 用户名
		        .setExpiration(new Date(new Date().getTime()+60*1000)) // 过期时间
		        .setIssuedAt(new Date())// 登录时间
		        // 添加自定义的键值对
		        .claim("role","admin"); 
		System.out.println(builder.compact());
	}

}
