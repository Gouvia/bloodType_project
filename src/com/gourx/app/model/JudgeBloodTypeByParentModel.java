package com.gourx.app.model;

public class JudgeBloodTypeByParentModel {

    /**
     * 根据父母的血型判断孩子的血型
     * @param pa 父亲的血型 
     * @param mo 母亲的血型
     * @return 孩子可能的血型
     * 血型规则如下:0=O型 1=A型 2=B型 3=AB型
     * @throws IllegalArgumentException pa 和  mo 不能为负数并且要小于4
     * */
	public static void JudgeBloodType(int pa,int mo) {
	//1 验证清理参数
    if(pa<0 || pa>3) {
    	throw new IllegalArgumentException("父亲的血型范围不能为负数并且要小于4");
    	}
    if(mo<0 || mo>3) {
    	throw new IllegalArgumentException("母亲的血型范围不能为负数并且要小于4");
    	}
	//2 执行业务逻辑
    getBloodType(pa,mo);
	//3组装业务并返回结果
    }
	  /**
     * 根据父母的血型判断孩子可能和不可能的血型
     * @param pa 父亲的血型 
     * @param mo 母亲的血型
     * 血型规则如下:0=O型 1=A型 2=B型 3=AB型
     * */
	private static void  getBloodType(int pa,int mo) {
		if(pa==0 && mo==0) {
			System.out.println("这对父母的孩子的血型只能为O型，不可能为A、B、AB型");
		}else if((pa==0 && mo==1)||(pa==1 && mo==0)) {
			System.out.println("这对父母的孩子的血型可能为O型和A型，不可能为B、AB型");
		}else if(pa==1 && mo==1) {
			System.out.println("这对父母的孩子的血型可能为O型和A型，不可能为B、AB型");
		}else if((pa==2 && mo==1)||(pa==1 && mo==2)) {
			System.out.println("这对父母的孩子的血型可能为O型、A型、B型、AB型");
		}else if((pa==3 && mo==1)||(pa==1 && mo==3)) {
			System.out.println("这对父母的孩子的血型可能为A型、B型、AB型，不可能为O型");
		}else if((pa==0 && mo==2)||(pa==2 && mo==0)) {
			System.out.println("这对父母的孩子的血型可能为O型和	B型，不可能为A、AB型");
		}else if(pa==2 && mo==2) {
			System.out.println("这对父母的孩子的血型可能为O型和B型，不可能为A、AB型");
		}else if((pa==2 && mo==3)||(pa==3 && mo==2)) {
			System.out.println("这对父母的孩子的血型可能为A型、B型、AB型，不可能为O型");
		}else if((pa==0 && mo==3)||(pa==3 && mo==0)) {
			System.out.println("这对父母的孩子的血型可能为B型和A型，不可能为O、AB型");
		}else{
			System.out.println("这对父母的孩子的血型可能为A型、B型、AB型，不可能为O型");
		}
	}
}
