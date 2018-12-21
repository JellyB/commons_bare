package com.huatu.common.consts;

/**
 * 神策事件
 * 
 * @author zhangchong
 *
 */
public enum SensorsEventEnum {
	LOGIN_SUCCEED("HuaTuOnline_app_HuaTuOnline_LoginSucceed", "登录成功"),
	MOKAO_SIGNUP("HuaTuOnline_app_pc_HuaTuOnline_SimulatedSignUp", "模考大赛我要报名"),
	MOKAO_SURESIGNUP("HuaTuOnline_app_pc_HuaTuOnline_SimulatedSureSignUp", "模考大赛确认报名"),
	MOKAO_STARTANSWER("HuaTuOnline_app_pc_HuaTuOnline_SimulatedStartAnswer", "模考大赛开始答题"),
	MOKAO_ENDANSWER("HuaTuOnline_app_pc_HuaTuOnline_SimulatedEndAnswer", "模考大赛结束答题");

	private String code;
	private String desc;

	SensorsEventEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

}
