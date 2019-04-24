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
	MOKAO_ENDANSWER("HuaTuOnline_app_pc_HuaTuOnline_SimulatedEndAnswer", "模考大赛结束答题"),
	SIGNUP_SUCCEED("HuaTuOnline_pc_HuaTuOnline_SignUpSucceed", "注册成功"),
	LOGIN_NAME("HuaTuOnline_user_name", "华图在线_登录用户名"),
	REGISTER_TIME("HuaTuOnline_signup_time", "华图在线_注册时间"),
	PC_LOGIN_SUCCEED("HuaTuOnline_pc_HuaTuOnline_PlaceLoginMessage","PC登录成功"),
	M_LOGIN_SUCCEED("HuaTuOnline_M_HuaTuOnline_PlaceLoginMessage","M站登录成功"),
	/**
	 * 申论交卷成功
	 */
	ESSAY_COMMIT_SUCCEED("HuaTuOnline_app_HuaTuOnline_ApplicationSubmitSucceed", "申论交卷成功"),
	
	COURSE_PRACTICE_COMMIT_ANSWER_SUCCEED("HuaTuOnline_app_pc_HuaTuOnline_LiveAnswerSubmitSucceed", "直播随堂练提交答案成功"),
	/**
	 * 报考城市 (北京)
	 */
	EXAM_AREA("HuaTuOnline_examination_city", "华图在线_报考城市"),
	/**
	 * 考试类型(公务员北京)
	 */
	EXAM_CATEGORY_AREA("HuaTuOnline_examination_type", "华图在线_考试类型");

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
