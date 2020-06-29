package com.xdy.JWTTutorial;

import java.util.Date;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��������,��Ҫ�����������غ�
		JwtBuilder builder = Jwts.builder()
		        // ����ͷ��,ʹ��hs256����, + key,Ҳ������
		        .signWith(SignatureAlgorithm.HS256,"changwu")
		        // ����غ�
		        .setId("666") // �û�id
		        .setSubject("����") // �û���
		        .setExpiration(new Date(new Date().getTime()+60*1000)) // ����ʱ��
		        .setIssuedAt(new Date())// ��¼ʱ��
		        // ����Զ���ļ�ֵ��
		        .claim("role","admin"); 
		System.out.println(builder.compact());
	}

}
