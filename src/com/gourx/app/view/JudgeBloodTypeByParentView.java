package com.gourx.app.view;

import com.gourx.app.model.JudgeBloodTypeByParentModel;
import com.gourx.app.util.ConsoleUtil;


public class JudgeBloodTypeByParentView {
	public static void run() {
		//1 欢迎语
		System.out.println("欢迎使用血型判断器！");
		//2 获取用户输入
		int fatherBT=getFatherBloodType();
		int motherBT=getMotherrBloodType();
		//3调用业务模型获得业务结果
		try {
		   JudgeBloodTypeByParentModel.JudgeBloodType(fatherBT, motherBT);
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("欢迎下次使用！");
		}
		
	}
	/**
	 * 从控制台读取用户输入的父亲的血型
	 * @return 父亲的血型
	 * 0=O型 1=A型 2=B型 3=AB型
	 * */
	private static int getFatherBloodType() {
		System.out.println("请从下面选择父亲的血型：");
		System.out.println("0：O型");
		System.out.println("1：A型");
		System.out.println("2：B型");
		System.out.println("3：AB型");
		int bloodType=ConsoleUtil.readInt("您的选择:0>", 0);
		switch (bloodType) {
		case 0:
		case 1:
		case 2:
		case 3:
			return bloodType;
		default:
			System.out.println("您的选择有误，请重新选择。");
			return getFatherBloodType();
		}
	}
	/**
	 * 从控制台读取用户输入的母亲的血型
	 * @return 母亲的血型
	 * 0=O型 1=A型 2=B型 3=AB型
	 * */
	private static int getMotherrBloodType() {
		System.out.println("请从下面选择母亲的血型：");
		System.out.println("0：O型");
		System.out.println("1：A型");
		System.out.println("2：B型");
		System.out.println("3：AB型");
		int bloodType=ConsoleUtil.readInt("您的选择:0>", 0);
		switch (bloodType) {
		case 0:
		case 1:
		case 2:
		case 3:
			return bloodType;
		default:
			System.out.println("您的选择有误，请重新选择。");
			return getMotherrBloodType() ;
		}
	}
      
}
